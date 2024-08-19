package com.github.wucoding.forum.api.model.vo.article;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    11/23/23
 */
@Data
@ApiModel("教程排序")
public class SortColumnArticleReq implements Serializable {
    // 排序前的帖子 ID
    @ApiModelProperty("排序前的帖子 ID")
    private Long activeId;

    // 排序后的帖子 ID
    @ApiModelProperty("排序后的帖子 ID")
    private Long overId;

}
