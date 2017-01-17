package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * HomeCommentContent generated by hbm2java
 */
@Entity
@Table(name = "home_comment_content")
public class HomeCommentContent implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "评论")
    private long commentId;
    @GeneratorColumn(title = "内容")
    private String content;

    public HomeCommentContent() {
    }

    public HomeCommentContent(long commentId) {
        this.commentId = commentId;
    }

    public HomeCommentContent(long commentId, String content) {
        this.commentId = commentId;
        this.content = content;
    }

    @Id

    @Column(name = "comment_id", unique = true, nullable = false)
    public long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Column(name = "content")
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
