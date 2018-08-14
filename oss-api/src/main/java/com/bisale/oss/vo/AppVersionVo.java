package com.bisale.oss.vo;

import com.bisale.common.dto.exchange.AppVersionDto;
import com.bisale.common.enums.exchange.AppVersionLangEnum;
import com.bisale.common.enums.exchange.AppVersionSourceEnum;

import java.io.Serializable;
import java.util.Date;

public class AppVersionVo implements Serializable {
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

    public AppVersionVo() {}

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

    public static AppVersionVo from(AppVersionDto appVersionDto) {
        return new AppVersionVo();
    }

    public static AppVersionDto to(AppVersionVo appVersionVo) {
        AppVersionDto result = new AppVersionDto();
        result.setId(appVersionVo.getId());
        result.setContent(appVersionVo.getContent());
        result.setCreateTime(appVersionVo.getCreateTime());
        result.setLang(AppVersionLangEnum.getNameByValue(appVersionVo.getLang()));
        result.setSource(AppVersionSourceEnum.getNameByValue(appVersionVo.getSource()));
        result.setStatus(appVersionVo.getStatus());
        result.setTitle(appVersionVo.getTitle());
        result.setUpdateTime(appVersionVo.getUpdateTime());
        result.setUrl(appVersionVo.getUrl());
        result.setVersion(appVersionVo.getVersion());
        return result;
    }
}