package com.github.wucoding.forum.service.article.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.wucoding.forum.api.model.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * fixme 访问计数，后续改用redis替换
 *
 * @author RaySL
 *  2022/8/25
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("read_count")
public class ReadCountDO extends BaseDO {
    /**
     * 文档ID（帖子/评论）
     */
    private Long documentId;

    /**
     * 文档类型：1-帖子，2-评论
     */
    private Integer documentType;

    /**
     * 计数
     */
    private Integer cnt;

}
