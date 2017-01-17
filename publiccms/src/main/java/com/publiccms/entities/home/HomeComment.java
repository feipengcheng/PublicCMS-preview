package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * HomeComment generated by hbm2java
 */
@Entity
@Table(name = "home_comment")
public class HomeComment implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "项目类型", condition = true)
    private String itemType;
    @GeneratorColumn(title = "项目ID", condition = true)
    private long itemId;
    @GeneratorColumn(title = "分数")
    private int scores;
    @GeneratorColumn(title = "日期", order = true)
    private Date createDate;
    @GeneratorColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public HomeComment() {
    }

    public HomeComment(int siteId, long userId, String itemType, long itemId, int scores, Date createDate, boolean disabled) {
        this.siteId = siteId;
        this.userId = userId;
        this.itemType = itemType;
        this.itemId = itemId;
        this.scores = scores;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "item_type", nullable = false, length = 20)
    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Column(name = "item_id", nullable = false)
    public long getItemId() {
        return this.itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Column(name = "scores", nullable = false)
    public int getScores() {
        return this.scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
