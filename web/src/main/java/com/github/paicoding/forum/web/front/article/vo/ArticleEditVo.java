package com.github.wucoding.forum.web.front.article.vo;

import com.github.wucoding.forum.api.model.vo.article.dto.ArticleDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.CategoryDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.TagDTO;
import lombok.Data;

import java.util.List;

/**
 * @author RaySL
 *    2022/9/2
 */
@Data
public class ArticleEditVo {

    private ArticleDTO article;

    private List<CategoryDTO> categories;

    private List<TagDTO> tags;

}
