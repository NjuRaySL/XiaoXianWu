package com.github.wucoding.forum.api.model.vo.article.dto;

import lombok.Data;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    12/8/23
 */
@Data
public class ArticleOtherDTO {
    // 帖子的阅读类型
    private Integer readType;
    // 教程的翻页
    private ColumnArticleFlipDTO flip;
}
