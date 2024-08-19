package com.github.wucoding.forum.service.user.repository.params;

import com.github.wucoding.forum.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    6/29/23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchZsxqWhiteParams extends PageParam {

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 星球编号
     */
    private String starNumber;

    /**
     * 登录用户名
     */
    private String name;

    /**
     * 用户编号
     */
    private String userCode;

}