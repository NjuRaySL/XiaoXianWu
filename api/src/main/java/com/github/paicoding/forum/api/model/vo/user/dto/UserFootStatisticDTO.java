package com.github.wucoding.forum.api.model.vo.user.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 用户主页信息
 *
 * @author 小闲屋
 * @since 2023年05月25日
 */
@Data
@ToString(callSuper = true)
public class UserFootStatisticDTO {

    /**
     * 帖子点赞数
     */
    private Long praiseCount;

    /**
     * 帖子被阅读数
     */
    private Long readCount;

    /**
     * 帖子被收藏数
     */
    private Long collectionCount;

    /**
     * 帖子被评论数
     */
    private Long commentCount;

    public UserFootStatisticDTO() {
        praiseCount = 0L;
        readCount = 0L;
        collectionCount = 0L;
        commentCount = 0L;
    }
}
