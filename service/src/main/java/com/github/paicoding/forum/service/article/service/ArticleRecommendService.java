package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.vo.PageListVo;
import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.article.dto.ArticleDTO;

/**
 * @author RaySL
 *  2022/9/26
 */
public interface ArticleRecommendService {
    /**
     * 帖子关联推荐
     *
     * @param article
     * @param pageParam
     * @return
     */
    PageListVo<ArticleDTO> relatedRecommend(Long article, PageParam pageParam);
}
