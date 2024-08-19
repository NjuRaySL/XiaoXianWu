package com.github.wucoding.forum.service.article.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;

/**
 * 专栏查询
 */
@Data
public class SearchColumnParams extends PageParam {

    /**
     * 专栏名称
     */
    private String column;
}
