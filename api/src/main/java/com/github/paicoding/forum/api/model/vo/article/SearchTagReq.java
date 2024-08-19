package com.github.wucoding.forum.api.model.vo.article;

import lombok.Data;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *      29/23
 */
@Data
public class SearchTagReq {
    // 标签名称
    private String tag;
    // 分页
    private Long pageNumber;
    private Long pageSize;
}
