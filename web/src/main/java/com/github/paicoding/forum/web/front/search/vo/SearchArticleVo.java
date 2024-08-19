package com.github.wucoding.forum.web.front.search.vo;

import com.github.wucoding.forum.api.model.vo.article.dto.SimpleArticleDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author RaySL
 *    2022/10/28
 */
@Data
@ApiModel(value="帖子信息")
public class SearchArticleVo implements Serializable {
    private static final long serialVersionUID = -2989169905031769195L;

    @ApiModelProperty("搜索的关键词")
    private String key;

    @ApiModelProperty("帖子列表")
    private List<SimpleArticleDTO> items;
}
