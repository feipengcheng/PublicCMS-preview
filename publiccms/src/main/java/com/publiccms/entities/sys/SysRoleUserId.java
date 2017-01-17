package com.publiccms.entities.sys;
// Generated 2016-11-19 15:33:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * SysRoleUserId generated by hbm2java
 */
@Embeddable
public class SysRoleUserId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "角色", condition = true)
    private int roleId;
    @GeneratorColumn(title = "用户", condition = true)
    private long userId;

    public SysRoleUserId() {
    }

    public SysRoleUserId(int roleId, long userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysRoleUserId))
            return false;
        SysRoleUserId castOther = (SysRoleUserId) other;

        return (this.getRoleId() == castOther.getRoleId()) && (this.getUserId() == castOther.getUserId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getRoleId();
        result = 37 * result + (int) this.getUserId();
        return result;
    }

}
