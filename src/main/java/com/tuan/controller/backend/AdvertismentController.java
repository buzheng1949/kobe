package com.tuan.controller.backend;

import com.google.common.collect.Lists;
import com.tuan.dto.AdvertisementDTO;
import com.tuan.pagehelper.AdvertisementParams;
import com.tuan.query.AdvertisementQuery;
import com.tuan.response.Response;
import com.tuan.response.ResponseCode;
import com.tuan.service.IAdvertisementService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by buzheng on 17/8/1.
 */
@RequestMapping("/ad/")
@Controller
public class AdvertismentController {

    @Autowired
    private IAdvertisementService iAdvertisementService;

    /**
     * 保存操作 更新操作
     * @param advertisementDTO
     * @return
     */
    @RequestMapping(value = "save.do")
    @ResponseBody
    public Response<Long> save(AdvertisementDTO advertisementDTO) {
        Long result = 0L;
        if (advertisementDTO == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        if(advertisementDTO.getId() == null){
            result = iAdvertisementService.addAdvertisement(advertisementDTO).getData();
        }else{
            result = iAdvertisementService.update(advertisementDTO).getData();
        }
        if (result > 0) {
            return Response.success(result);
        }
        return Response.errorByFailed(result);
    }

    /**
     * 查询符合条件的所有值
     * @param advertisementQuery
     * @return
     */
    @RequestMapping("list.do")
    @ResponseBody
    public Response<List<AdvertisementDTO>> list(AdvertisementQuery advertisementQuery) {
        List<AdvertisementDTO> result = Lists.newArrayList();
        String mBook = "";
        Integer page = 1;
        Integer pageSize = 1;
        if (advertisementQuery == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        if (StringUtils.isNotBlank(advertisementQuery.getExtraMessage())) {
            String extraMessage = advertisementQuery.getExtraMessage();
            AdvertisementParams advertisementParams = AdvertisementParams.covertToAdvertisementParams(extraMessage);
            page = advertisementParams.getPage();
            pageSize = advertisementParams.getPageSize();
        }
        advertisementQuery.setPage(page);
        advertisementQuery.setPageSize(pageSize);
        Response<List<AdvertisementDTO>> response = iAdvertisementService.selectListByQuery(advertisementQuery);
        result = response.getData();
        mBook = response.getmBook();
        return Response.success(result, mBook);
    }

    /**
     * 物理删除
     * @param advertisementDTO
     * @return
     */
    @RequestMapping("delete.do")
    @ResponseBody
    public Response<Boolean> delete(AdvertisementDTO advertisementDTO) {
        boolean isSuccess = false;
        if (advertisementDTO == null || advertisementDTO.getId() == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), isSuccess);
        }
        return iAdvertisementService.delete(advertisementDTO);
    }


}
