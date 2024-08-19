package com.github.wucoding.forum.api.model.vo.article;

import lombok.Data;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *      27/23
 */
@Data
public class SearchCategoryReq {
    // 类目名称
    private String category;
    // 分页
    private Long pageNumber;
    private Long pageSize;

}
