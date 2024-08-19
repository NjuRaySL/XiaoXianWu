package com.github.wucoding.forum.api.model.vo.user.dto;

import lombok.Data;

/**
 * 帖子足迹计数
 *
 *   @author zhangjx
 *    07-18
 */
@Data
public class ArticleFootCountDTO {

    /**
     * 帖子点赞数
     */
    private Integer  praiseCount;

    /**
     * 帖子被阅读数
     */
    private Integer  readCount;

    /**
     * 帖子被收藏数
     */
    private Integer  collectionCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    public ArticleFootCountDTO() {
        praiseCount = 0;
        readCount = 0;
        collectionCount = 0;
        commentCount = 0;
    }
}
