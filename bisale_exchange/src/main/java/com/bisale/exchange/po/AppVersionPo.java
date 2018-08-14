package com.bisale.exchange.po;

import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.enums.exchange.AppVersionLangEnum;
import com.bisale.common.enums.exchange.AppVersionSourceEnum;

import java.io.Serializable;
import java.util.Date;

public class AppVersionPo implements Serializable {
    private int id;
    private String lang;
    private String source;
    private String version;
    private Integer status;
    private String title;
    private String content;
    private String url;
    private Date createTime;
    private Date updateTime;

    public AppVersionPo() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AppVersionPo{" +
                "id=" + id +
                ", lang='" + lang + '\'' +
                ", source='" + source + '\'' +
                ", version='" + version + '\'' +
                ", status=" + status +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public static AppVersionPo from(AppVersionDto appVersionDto) {
        return new AppVersionPo();
    }

    public static AppVersionDto to(AppVersionPo appVersionPo) {
        AppVersionDto result = new AppVersionDto();
        result.setId(appVersionPo.getId());
        result.setContent(appVersionPo.getContent());
        result.setCreateTime(appVersionPo.getCreateTime());
        result.setLang(AppVersionLangEnum.getNameByValue(appVersionPo.getLang()));
        result.setSource(AppVersionSourceEnum.getNameByValue(appVersionPo.getSource()));
        result.setStatus(appVersionPo.getStatus());
        result.setTitle(appVersionPo.getTitle());
        result.setUpdateTime(appVersionPo.getUpdateTime());
        result.setUrl(appVersionPo.getUrl());
        result.setVersion(appVersionPo.getVersion());
        return result;
    }
}