package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * HomeFriendApply generated by hbm2java
 */
@Entity
@Table(name = "home_friend_apply")
public class HomeFriendApply implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private HomeFriendApplyId id;
    @GeneratorColumn(title = "消息")
    private String message;
    @GeneratorColumn(title = "创建日期")
    private Date createDate;

    public HomeFriendApply() {
    }

    public HomeFriendApply(HomeFriendApplyId id, String message, Date createDate) {
        this.id = id;
        this.message = message;
        this.createDate = createDate;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
            @AttributeOverride(name = "friendId", column = @Column(name = "friend_id", nullable = false)) })
    public HomeFriendApplyId getId() {
        return this.id;
    }

    public void setId(HomeFriendApplyId id) {
        this.id = id;
    }

    @Column(name = "message", nullable = false, length = 300)
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
