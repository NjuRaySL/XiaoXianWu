package com.github.wucoding.forum.service.article.service;

import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.article.dto.TagDTO;

/**
 * 标签Service
 *
 *   @author zhangjx
 *  07-20
 */
public interface TagService {

    PageVo<TagDTO> queryTags(String key, PageParam pageParam);

    Long queryTagId(String tag);
}
