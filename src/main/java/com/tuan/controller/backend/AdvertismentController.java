package com.tuan.controller.backend;

import com.google.common.collect.Lists;
import com.tuan.dto.AdvertisementDTO;
import com.tuan.query.AdvertisementQuery;
import com.tuan.response.Response;
import com.tuan.response.ResponseCode;
import com.tuan.service.IAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by buzheng on 17/8/1.
 */
@RequestMapping("/ad/")
@Controller
public class AdvertismentController {

    @Autowired
    private IAdvertisementService iAdvertisementService;

    @RequestMapping(value = "save.do")
    @ResponseBody
    public Response<Long> save(AdvertisementDTO advertisementDTO) {
        Long result = 0L;
        if (advertisementDTO == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        result = iAdvertisementService.addAdvertisement(advertisementDTO).getData();
        if (result > 0) {
            return Response.success(result);
        }
        return Response.errorByFailed(result);
    }

    @RequestMapping("list.do")
    @ResponseBody
    public Response<List<AdvertisementDTO>> list(AdvertisementQuery advertisementQuery) {
        List<AdvertisementDTO> result = Lists.newArrayList();
        if (advertisementQuery == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        result = iAdvertisementService.selectListByQuery(advertisementQuery).getData();
        return Response.success(result);
    }
}
