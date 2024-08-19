package com.github.wucoding.forum.service.article.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专栏查询
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchColumnArticleParams extends PageParam {

    /**
     * 专栏名称
     */
    private String column;

    /**
     * 专栏id
     */
    private Long columnId;

    /**
     * 帖子标题
     */
    private String articleTitle;
}
