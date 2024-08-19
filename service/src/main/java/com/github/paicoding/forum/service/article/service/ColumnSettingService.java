package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.article.*;
import com.github.wucoding.forum.api.model.vo.article.dto.ColumnArticleDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.ColumnDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.SimpleColumnDTO;

import java.util.List;

/**
 * 专栏后台接口
 *
 *   @author zhangjx
 *  09-19
 */
public interface ColumnSettingService {

    /**
     * 将帖子保存到对应的专栏中
     *
     * @param articleId
     * @param columnId
     */
    void saveColumnArticle(Long articleId, Long columnId);

    /**
     * 保存专栏
     *
     * @param columnReq
     */
    void saveColumn(ColumnReq columnReq);

    /**
     * 保存专栏帖子
     *
     * @param req
     */
    void saveColumnArticle(ColumnArticleReq req);

    /**
     * 删除专栏
     *
     * @param columnId
     */
    void deleteColumn(Long columnId);

    /**
     * 删除专栏帖子
     *
     * @param id
     */
    void deleteColumnArticle(Long id);

    /**
     * 通过关键词，从标题中找出相似的进行推荐，只返回主键 + 标题
     *
     * @param key
     * @return
     */
    List<SimpleColumnDTO> listSimpleColumnBySearchKey(String key);

    PageVo<ColumnDTO> getColumnList(SearchColumnReq req);

    PageVo<ColumnArticleDTO> getColumnArticleList(SearchColumnArticleReq req);

    void sortColumnArticleApi(SortColumnArticleReq req);

    void sortColumnArticleByIDApi(SortColumnArticleByIDReq req);
}
