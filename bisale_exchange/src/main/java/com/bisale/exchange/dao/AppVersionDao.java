package com.bisale.exchange.dao;

import com.bisale.exchange.po.AppVersionPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AppVersionDao {
    int insertAppVersion(AppVersionPo appVersionPo);

    int updateAppVersion(AppVersionPo appVersionPo);

    List<AppVersionPo> selectAppVersionBy(Map<String, Object> params);

    int selectAppVersionCountBy(Map<String, Object> params);
}