package com.github.wucoding.forum.service.article.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.wucoding.forum.api.model.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子详情
 *
 * DO 对应数据库实体类
 *
 *   @author zhangjx
 *  07-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("article_detail")
public class ArticleDetailDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 帖子ID
     */
    private Long articleId;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 帖子内容
     */
    private String content;

    private Integer deleted;
}
