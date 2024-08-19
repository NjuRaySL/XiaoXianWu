package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.vo.PageListVo;
import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.article.dto.ColumnDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.SimpleArticleDTO;
import com.github.wucoding.forum.service.article.repository.entity.ColumnArticleDO;

import java.util.List;

/**
 * @author RaySL
 *  2022/9/14
 */
public interface ColumnService {
    /**
     * 根据帖子id，构建对应的专栏详情地址
     *
     * @param articleId 帖子主键
     * @return 专栏详情页
     */
    ColumnArticleDO getColumnArticleRelation(Long articleId);

    /**
     * 专栏列表
     *
     * @param pageParam
     * @return
     */
    PageListVo<ColumnDTO> listColumn(PageParam pageParam);

    /**
     * 获取专栏中的第N篇帖子
     *
     * @param columnId
     * @param order
     * @return
     */
    ColumnArticleDO queryColumnArticle(long columnId, Integer order);

    /**
     * 只查询基本的专栏信息，不需要统计、作者等信息
     *
     * @param columnId
     * @return
     */
    ColumnDTO queryBasicColumnInfo(Long columnId);

    /**
     * 专栏详情
     *
     * @param columnId
     * @return
     */
    ColumnDTO queryColumnInfo(Long columnId);

    /**
     * 专栏 + 帖子列表详情
     *
     * @param columnId
     * @return
     */
    List<SimpleArticleDTO> queryColumnArticles(long columnId);

    /**
     * 返回教程数量
     *
     * @return
     */
    Long getTutorialCount();
}
