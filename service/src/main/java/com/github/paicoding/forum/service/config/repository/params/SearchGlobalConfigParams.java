package com.github.wucoding.forum.service.config.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    6/30/23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchGlobalConfigParams extends PageParam {
    // 配置项名称
    private String key;
    // 配置项值
    private String value;
    // 备注
    private String comment;
}
