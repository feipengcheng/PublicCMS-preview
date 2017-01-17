package com.publiccms.entities.sys;
// Generated 2016-7-16 11:17:19 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * SysCluster generated by hbm2java
 */
@Entity
@Table(name = "sys_cluster")
public class SysCluster implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private String uuid;
    @GeneratorColumn(title = "启动时间", order = true)
    private Date createDate;
    @GeneratorColumn(title = "心跳时间", condition = true, order = true)
    private Date heartbeatDate;
    @GeneratorColumn(title = "管理节点", condition = true)
    private boolean master;
    @GeneratorColumn(title = "版本", condition = true)
    private String cmsVersion;

    public SysCluster() {
    }

    public SysCluster(String uuid, Date createDate, Date heartbeatDate, boolean master) {
        this.uuid = uuid;
        this.createDate = createDate;
        this.heartbeatDate = heartbeatDate;
        this.master = master;
    }

    public SysCluster(String uuid, Date createDate, Date heartbeatDate, boolean master, String cmsVersion) {
        this.uuid = uuid;
        this.createDate = createDate;
        this.heartbeatDate = heartbeatDate;
        this.master = master;
        this.cmsVersion = cmsVersion;
    }

    @Id
    @Column(name = "uuid", unique = true, nullable = false, length = 40)
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "heartbeat_date", nullable = false, length = 19)
    public Date getHeartbeatDate() {
        return this.heartbeatDate;
    }

    public void setHeartbeatDate(Date heartbeatDate) {
        this.heartbeatDate = heartbeatDate;
    }

    @Column(name = "master", nullable = false)
    public boolean isMaster() {
        return this.master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    @Column(name = "cms_version", length = 20)
    public String getCmsVersion() {
        return this.cmsVersion;
    }

    public void setCmsVersion(String cmsVersion) {
        this.cmsVersion = cmsVersion;
    }

}
