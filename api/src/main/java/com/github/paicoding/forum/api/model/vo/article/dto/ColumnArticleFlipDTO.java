package com.github.wucoding.forum.api.model.vo.article.dto;

import lombok.Data;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    12/8/23
 */
@Data
public class ColumnArticleFlipDTO {
    String prevHref;
    Boolean prevShow;
    String nextHref;
    Boolean nextShow;
}
