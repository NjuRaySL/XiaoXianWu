package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.enums.OperateArticleEnum;
import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.article.ArticlePostReq;
import com.github.wucoding.forum.api.model.vo.article.SearchArticleReq;
import com.github.wucoding.forum.api.model.vo.article.dto.ArticleAdminDTO;

/**
 * 帖子后台接口
 *
 *   @author zhangjx
 *  09-19
 */
public interface ArticleSettingService {

    /**
     * 更新帖子
     *
     * @param req
     */
    void updateArticle(ArticlePostReq req);

    /**
     * 获取帖子列表
     *
     * @param req
     * @return
     */
    PageVo<ArticleAdminDTO> getArticleList(SearchArticleReq req);

    /**
     * 删除帖子
     *
     * @param articleId
     */
    void deleteArticle(Long articleId);

    /**
     * 操作帖子
     *
     * @param articleId
     * @param operate
     */
    void operateArticle(Long articleId, OperateArticleEnum operate);
}
