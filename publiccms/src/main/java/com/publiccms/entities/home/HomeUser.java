package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * HomeUser generated by hbm2java
 */
@Entity
@Table(name = "home_user")
public class HomeUser implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "用户")
    private long userId;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "签名")
    private String signature;
    @GeneratorColumn(title = "好友数")
    private int friends;
    @GeneratorColumn(title = "消息数")
    private int messages;
    @GeneratorColumn(title = "问题数")
    private int questions;
    @GeneratorColumn(title = "回答数")
    private int answers;
    @GeneratorColumn(title = "文章数")
    private int articles;
    @GeneratorColumn(title = "点击数")
    private int clicks;
    @GeneratorColumn(title = "广播数")
    private int broadcasts;
    @GeneratorColumn(title = "评论数")
    private int comments;
    @GeneratorColumn(title = "关注")
    private String attentionIds;
    @GeneratorColumn(title = "关注数")
    private int attentions;
    @GeneratorColumn(title = "粉丝数")
    private int fans;
    @GeneratorColumn(title = "上次登陆日期", order = true)
    private Date lastLoginDate;
    @GeneratorColumn(title = "创建日期", order = true)
    private Date createDate;
    @GeneratorColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public HomeUser() {
    }

    public HomeUser(long userId, int siteId, int friends, int messages, int questions, int answers, int articles, int clicks,
            int broadcasts, int comments, int attentions, int fans, Date createDate, boolean disabled) {
        this.userId = userId;
        this.siteId = siteId;
        this.friends = friends;
        this.messages = messages;
        this.questions = questions;
        this.answers = answers;
        this.articles = articles;
        this.clicks = clicks;
        this.broadcasts = broadcasts;
        this.comments = comments;
        this.attentions = attentions;
        this.fans = fans;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    public HomeUser(long userId, int siteId, String title, String signature, int friends, int messages, int questions,
            int answers, int articles, int clicks, int broadcasts, int comments, String attentionIds, int attentions, int fans,
            Date lastLoginDate, Date createDate, boolean disabled) {
        this.userId = userId;
        this.siteId = siteId;
        this.title = title;
        this.signature = signature;
        this.friends = friends;
        this.messages = messages;
        this.questions = questions;
        this.answers = answers;
        this.articles = articles;
        this.clicks = clicks;
        this.broadcasts = broadcasts;
        this.comments = comments;
        this.attentionIds = attentionIds;
        this.attentions = attentions;
        this.fans = fans;
        this.lastLoginDate = lastLoginDate;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    @Id

    @Column(name = "user_id", unique = true, nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "signature", length = 300)
    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Column(name = "friends", nullable = false)
    public int getFriends() {
        return this.friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    @Column(name = "messages", nullable = false)
    public int getMessages() {
        return this.messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    @Column(name = "questions", nullable = false)
    public int getQuestions() {
        return this.questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }

    @Column(name = "answers", nullable = false)
    public int getAnswers() {
        return this.answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    @Column(name = "articles", nullable = false)
    public int getArticles() {
        return this.articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return this.clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Column(name = "broadcasts", nullable = false)
    public int getBroadcasts() {
        return this.broadcasts;
    }

    public void setBroadcasts(int broadcasts) {
        this.broadcasts = broadcasts;
    }

    @Column(name = "comments", nullable = false)
    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Column(name = "attention_ids", length = 65535)
    public String getAttentionIds() {
        return this.attentionIds;
    }

    public void setAttentionIds(String attentionIds) {
        this.attentionIds = attentionIds;
    }

    @Column(name = "attentions", nullable = false)
    public int getAttentions() {
        return this.attentions;
    }

    public void setAttentions(int attentions) {
        this.attentions = attentions;
    }

    @Column(name = "fans", nullable = false)
    public int getFans() {
        return this.fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_login_date", length = 19)
    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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
