package com.github.wucoding.forum.service.article.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *  5/27/23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchCategoryParams extends PageParam {
    // 类目名称
    private String category;
}
