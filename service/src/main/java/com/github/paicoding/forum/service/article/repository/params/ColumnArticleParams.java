package com.github.wucoding.forum.service.article.repository.params;

import lombok.Data;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *  5/30/23
 */
@Data
public class ColumnArticleParams {
    // 教程 ID
    private Long columnId;
    // 帖子 ID
    private Long articleId;
    // section
    private Integer section;
}
