package com.github.wucoding.forum.api.model.vo.article.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 创作历程
 *
 *   @author zhangjx
 * @since 2022/7/19
 */
@Data
@ToString(callSuper = true)
public class YearArticleDTO {

    /**
     * 年份
     */
    private String year;

    /**
     * 帖子数量
     */
    private Integer articleCount;
}
