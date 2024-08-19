package com.github.wucoding.forum.service.comment.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.wucoding.forum.service.comment.repository.entity.CommentDO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 评论mapper接口
 *
 *   @author zhangjx
 *    07-18
 */
public interface CommentMapper extends BaseMapper<CommentDO> {
    Map<String, Object> getHotTopCommentId(@Param("articleId") Long articleId);

}
