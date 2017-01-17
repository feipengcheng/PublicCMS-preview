package com.publiccms.entities.cms;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * CmsCategoryModel generated by hbm2java
 */
@Entity
@Table(name = "cms_category_model")
public class CmsCategoryModel implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private CmsCategoryModelId id;
    @GeneratorColumn(title = "模板路径")
    private String templatePath;

    public CmsCategoryModel() {
    }

    public CmsCategoryModel(CmsCategoryModelId id) {
        this.id = id;
    }

    public CmsCategoryModel(CmsCategoryModelId id, String templatePath) {
        this.id = id;
        this.templatePath = templatePath;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "categoryId", column = @Column(name = "category_id", nullable = false)),
            @AttributeOverride(name = "modelId", column = @Column(name = "model_id", nullable = false)) })
    public CmsCategoryModelId getId() {
        return this.id;
    }

    public void setId(CmsCategoryModelId id) {
        this.id = id;
    }

    @Column(name = "template_path", length = 200)
    public String getTemplatePath() {
        return this.templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

}
