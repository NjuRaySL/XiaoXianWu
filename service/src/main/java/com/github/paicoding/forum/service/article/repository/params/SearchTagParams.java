package com.github.wucoding.forum.service.article.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    29/23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchTagParams extends PageParam {
    // 标签名称
    private String tag;
}
