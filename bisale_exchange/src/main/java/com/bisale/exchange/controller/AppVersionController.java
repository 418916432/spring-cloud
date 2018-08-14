package com.bisale.exchange.controller;

import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.entity.ResponseModel;
import com.bisale.exchange.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppVersionController {
    @Autowired
    private AppVersionService appVersionService;

    @GetMapping("/exchange-service/app-version")
    @ResponseBody
    public ResponseModel<List<AppVersionDto>> getAppVersions(@RequestParam String version, @RequestParam String status) throws Exception {
        //Long userId = Long.parseLong(request.getParameter("id"));
        List<AppVersionDto> list = appVersionService.getAppVersionBy(version, status);
        return ResponseModel.success(list);
    }
}
