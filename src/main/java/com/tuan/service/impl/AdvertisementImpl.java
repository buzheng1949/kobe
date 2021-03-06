package com.tuan.service.impl;

import com.google.common.collect.Lists;
import com.tuan.dao.AdvertisementMapper;
import com.tuan.dto.AdvertisementDTO;
import com.tuan.pagehelper.AdvertisementParams;
import com.tuan.pojo.Advertisement;
import com.tuan.query.AdvertisementQuery;
import com.tuan.response.Response;
import com.tuan.response.ResponseCode;
import com.tuan.service.IAdvertisementService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        result = advertisementMapper.insert(AdvertisementDTO.toDO(advertisementDTO));
        if (result > 0) {
            return Response.success(result);
        }
        return Response.errorByFailed(result);
    }

    @Override
    public Response<List<AdvertisementDTO>> selectListByQuery(AdvertisementQuery advertisementQuery) {
        List<AdvertisementDTO> result = Lists.newArrayList();
        if (advertisementQuery == null) {
            return Response.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDes(), result);
        }
        List<Advertisement> advertisements = advertisementMapper.selectByQuery(advertisementQuery);
        if (advertisements != null) {
            for (Advertisement advertisement : advertisements) {
                result.add(Advertisement.toDTO(advertisement));
            }
        }
        String extraMessage = AdvertisementParams.buildMbook(advertisementQuery.getPage() + 1, advertisementQuery.getPageSize());
        return Response.success(result, extraMessage);
    }

    @Override
    public Response<Boolean> delete(AdvertisementDTO advertisementDTO) {
        Integer count = advertisementMapper.deleteByPrimaryKey(advertisementDTO.getId());
        boolean result = count > 0 ? true : false;
        if (result) {
            return Response.success(result);
        }
        return Response.errorByFailed(result);
    }

    @Override
    public Response<Long> update(AdvertisementDTO advertisementDTO) {
        Integer count = advertisementMapper.updateByPrimaryKeySelective(advertisementDTO);
        return Response.success(Long.valueOf(String.valueOf(count)));
    }
}
