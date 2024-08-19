package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.enums.HomeSelectEnum;
import com.github.wucoding.forum.api.model.vo.PageListVo;
import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.article.dto.ArticleDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.SimpleArticleDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.TagDTO;
import com.github.wucoding.forum.service.article.repository.entity.ArticleDO;

import java.util.List;
import java.util.Map;

public interface ArticleReadService {

    /**
     * 查询基础的帖子信息
     *
     * @param articleId
     * @return
     */
    ArticleDO queryBasicArticle(Long articleId);

    /**
     * 提前帖子摘要
     *
     * @param content
     * @return
     */
    String generateSummary(String content);

    /**
     * 查询帖子标签列表
     *
     * @param articleId
     * @return
     */
    PageVo<TagDTO> queryTagsByArticleId(Long articleId);

    /**
     * 查询帖子详情，包括正文内容，分类、标签等信息
     *
     * @param articleId
     * @return
     */
    ArticleDTO queryDetailArticleInfo(Long articleId);

    /**
     * 查询帖子所有的关联信息，正文，分类，标签，阅读计数+1，当前登录用户是否点赞、评论过
     *
     * @param articleId   帖子id
     * @param currentUser 当前查看的用户ID
     * @return
     */
    ArticleDTO queryFullArticleInfo(Long articleId, Long currentUser);

    /**
     * 查询某个分类下的帖子，支持翻页
     *
     * @param categoryId
     * @param page
     * @return
     */
    PageListVo<ArticleDTO> queryArticlesByCategory(Long categoryId, PageParam page);


    /**
     * 获取 Top 帖子
     *
     * @param categoryId
     * @return
     */
    List<ArticleDTO> queryTopArticlesByCategory(Long categoryId);


    /**
     * 获取分类帖子数
     *
     * @param categoryId
     * @return
     */
    Long queryArticleCountByCategory(Long categoryId);

    /**
     * 根据分类统计帖子计数
     *
     * @return
     */
    Map<Long, Long> queryArticleCountsByCategory();

    /**
     * 查询某个标签下的帖子，支持翻页
     *
     * @param tagId
     * @param page
     * @return
     */
    PageListVo<ArticleDTO> queryArticlesByTag(Long tagId, PageParam page);

    /**
     * 根据关键词匹配标题，查询用于推荐的帖子列表，只返回 articleId + title
     *
     * @param key
     * @return
     */
    List<SimpleArticleDTO> querySimpleArticleBySearchKey(String key);

    /**
     * 根据查询条件查询帖子列表，支持翻页
     *
     * @param key
     * @param page
     * @return
     */
    PageListVo<ArticleDTO> queryArticlesBySearchKey(String key, PageParam page);

    /**
     * 查询用户的帖子列表
     *
     * @param userId
     * @param pageParam
     * @param select
     * @return
     */
    PageListVo<ArticleDTO> queryArticlesByUserAndType(Long userId, PageParam pageParam, HomeSelectEnum select);

    /**
     * 帖子实体补齐统计、作者、分类标签等信息
     *
     * @param records
     * @param pageSize
     * @return
     */
    PageListVo<ArticleDTO> buildArticleListVo(List<ArticleDO> records, long pageSize);

    /**
     * 查询热门帖子
     *
     * @param pageParam
     * @return
     */
    PageListVo<SimpleArticleDTO> queryHotArticlesForRecommend(PageParam pageParam);

    /**
     * 查询作者的帖子数
     *
     * @param authorId
     * @return
     */
    int queryArticleCount(long authorId);

    /**
     * 返回总的帖子计数
     *
     * @return
     */
    Long getArticleCount();
}
