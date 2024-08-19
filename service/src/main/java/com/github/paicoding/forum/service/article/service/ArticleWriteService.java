package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.vo.article.ArticlePostReq;

public interface ArticleWriteService {

    /**
     * 保存or更新帖子
     *
     * @param req    上传的帖子体
     * @param author 作者
     * @return 返回帖子主键
     */
    Long saveArticle(ArticlePostReq req, Long author);

    /**
     * 删除帖子
     *
     * @param articleId   帖子id
     * @param loginUserId 执行操作的用户
     */
    void deleteArticle(Long articleId, Long loginUserId);
}
