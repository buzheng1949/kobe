package com.tuan.service.impl;

import com.tuan.dao.AdvertisementMapper;
import com.tuan.dto.AdvertisementDTO;
import com.tuan.response.Response;
import com.tuan.response.ResponseCode;
import com.tuan.service.IAdvertisementService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by buzheng on 17/7/31.
 * 服务实现类
 */
@Service("iAdvertisementService")
public class AdvertisementImpl implements IAdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Override
    public Response<Long> addAdvertisement(AdvertisementDTO advertisementDTO) {
        long result = 0L;
        if (advertisementDTO == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        if (StringUtils.isBlank(advertisementDTO.getLink())) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), "link cannot be empty", result);
        }
        if (StringUtils.isBlank(advertisementDTO.getTitle())) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), "title cannot be empty", result);
        }
        if (StringUtils.isBlank(advertisementDTO.getImgFileName())) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), "image file name cannot be empty", result);
        }
        if (advertisementDTO.getWeight() == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), "weight cannot be empty", result);
        }
        result = advertisementMapper.insert(advertisementDTO);
        if (result > 0) {
            return Response.success(result);
        }
        return Response.errorByFailed(result);
    }
}
