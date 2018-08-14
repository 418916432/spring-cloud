package com.bisale.oss.service;

import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.entity.ResponseModel;
import com.bisale.exchange.feign.AppVersionFeignService;
import com.bisale.oss.vo.AppVersionVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppVersionService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppVersionFeignService appVersionFeignService;

    public List<AppVersionVo> getAppVersionBy(String version, String status) throws Exception {
        ResponseModel<List<AppVersionDto>> responseModel = appVersionFeignService.getAppVersions(version, status);
        List<AppVersionDto> list = responseModel.getBody();

        List<AppVersionVo> result = new ArrayList<>();

        for (AppVersionDto item : list) {
            result.add(AppVersionVo.from(item));
        }

        return result;
    }
}
