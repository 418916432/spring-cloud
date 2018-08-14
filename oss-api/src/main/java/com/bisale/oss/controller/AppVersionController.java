package com.bisale.oss.controller;

import com.bisale.common.entity.ResponseModel;
import com.bisale.oss.service.AppVersionService;
import com.bisale.oss.vo.AppVersionVo;
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
    public ResponseModel<List<AppVersionVo>> getAppVersions(@RequestParam String version, @RequestParam String status) throws Exception {
        //Long userId = Long.parseLong(request.getParameter("id"));
        List<AppVersionVo> list = appVersionService.getAppVersionBy(version, status);
        return ResponseModel.success(list);
    }
}
