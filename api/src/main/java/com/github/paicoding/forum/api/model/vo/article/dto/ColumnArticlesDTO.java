package com.github.wucoding.forum.api.model.vo.article.dto;

import com.github.wucoding.forum.api.model.enums.column.ColumnTypeEnum;
import com.github.wucoding.forum.api.model.vo.comment.dto.TopCommentDTO;
import lombok.Data;

import java.util.List;

/**
 * @author RaySL
 *    2022/9/14
 */
@Data
public class ColumnArticlesDTO {
    /**
     * 专栏详情
     */
    private Long column;

    /**
     * 当前查看的帖子
     */
    private Integer section;

    /**
     * 帖子详情
     */
    private ArticleDTO article;

    /**
     * 0 免费阅读
     * 1 要求登录阅读
     * 2 限时免费，若当前时间超过限时免费期，则调整为登录阅读
     *
     * @see ColumnTypeEnum#getType()
     */
    private Integer readType;

    /**
     * 帖子评论
     */
    private List<TopCommentDTO> comments;

    /**
     * 热门评论
     */
    private TopCommentDTO hotComment;

    /**
     * 帖子目录列表
     */
    private List<SimpleArticleDTO> articleList;

    // 翻页
    private ArticleOtherDTO other;
}
