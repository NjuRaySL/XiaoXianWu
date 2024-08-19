package com.github.wucoding.forum.service.article.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.wucoding.forum.api.model.entity.BaseDO;
import com.github.wucoding.forum.api.model.enums.PushStatusEnum;
import com.github.wucoding.forum.api.model.enums.SourceTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子表
 *
 *   @author zhangjx
 *  07-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("article")
public class ArticleDO extends BaseDO {
    private static final long serialVersionUID = 1L;

    /**
     * 作者
     */
    private Long userId;

    /**
     * 帖子类型：1-博文，2-问答, 3-专栏帖子
     */
    private Integer articleType;

    /**
     * 帖子标题
     */
    private String title;

    /**
     * 短标题
     */
    private String shortTitle;

    /**
     * 帖子头图
     */
    private String picture;

    /**
     * 帖子摘要
     */
    private String summary;

    /**
     * 类目ID
     */
    private Long categoryId;

    /**
     * 来源：1-转载，2-原创，3-翻译
     *
     * @see SourceTypeEnum
     */
    private Integer source;

    /**
     * 原文地址
     */
    private String sourceUrl;

    /**
     * 状态：0-未发布，1-已发布
     *
     * @see PushStatusEnum
     */
    private Integer status;

    /**
     * 是否官方
     */
    private Integer officalStat;

    /**
     * 是否置顶
     */
    private Integer toppingStat;

    /**
     * 是否加精
     */
    private Integer creamStat;

    private Integer deleted;
}
