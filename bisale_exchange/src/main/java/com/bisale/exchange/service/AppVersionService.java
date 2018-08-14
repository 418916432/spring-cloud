package com.bisale.exchange.service;

import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.enums.exchange.AppVersionStatusEnum;
import com.bisale.exchange.dao.AppVersionDao;
import com.bisale.exchange.po.AppVersionPo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppVersionService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppVersionDao appVersionDao;

    public List<AppVersionDto> getAppVersionBy(String version, String status) throws Exception {
        Map<String, Object> params = parseBaseParamMap(version, status);
        params.put("startPage", 0 * 20);
        params.put("pageSize", 20);

        List<AppVersionPo> list = appVersionDao.selectAppVersionBy(params);
        List<AppVersionDto> result = new ArrayList<>();

        for (AppVersionPo item : list) {
            result.add(AppVersionPo.to(item));
        }

        return result;
    }

    private Map<String, Object> parseBaseParamMap(String version, String status) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("version", version);

        if (!StringUtils.isEmpty(status)) {
            int s = AppVersionStatusEnum.getValueByName(status);
            if (s < 0) {
                throw new Exception("状态类型不合法");
            }
            params.put("status", s);
        }
        return params;
    }
}
