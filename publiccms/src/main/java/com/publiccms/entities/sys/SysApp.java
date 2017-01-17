package com.publiccms.entities.sys;

// Generated 2016-3-1 14:18:28 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * SysApp generated by hbm2java
 */
@Entity
@Table(name = "sys_app", uniqueConstraints = @UniqueConstraint(columnNames = "app_key"))
public class SysApp implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Integer id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "渠道", condition = true)
    private String channel;
    @GeneratorColumn(title = "授权KEY")
    private String appKey;
    @GeneratorColumn(title = "授权密码")
    private String appSecret;
    @GeneratorColumn(title = "授权接口")
    private String authorizedApis;

    public SysApp() {
    }

    public SysApp(int siteId, String channel, String appKey, String appSecret) {
        this.siteId = siteId;
        this.channel = channel;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public SysApp(int siteId, String channel, String appKey, String appSecret, String authorizedApis) {
        this.siteId = siteId;
        this.channel = channel;
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.authorizedApis = authorizedApis;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "channel", nullable = false, length = 50)
    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Column(name = "app_key", unique = true, nullable = false, length = 50)
    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    @Column(name = "app_secret", nullable = false, length = 50)
    public String getAppSecret() {
        return this.appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Column(name = "authorized_apis", length = 65535)
    public String getAuthorizedApis() {
        return this.authorizedApis;
    }

    public void setAuthorizedApis(String authorizedApis) {
        this.authorizedApis = authorizedApis;
    }

}
