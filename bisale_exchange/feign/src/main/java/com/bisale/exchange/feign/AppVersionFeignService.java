package com.bisale.exchange.feign;


import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.entity.ResponseModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name="exchange-service")
public interface AppVersionFeignService {
    @RequestMapping(value="/exchange-service/app-version", method=RequestMethod.GET)
    ResponseModel<List<AppVersionDto>> getAppVersions(@RequestParam("version") String version, @RequestParam("status") String status);
}
