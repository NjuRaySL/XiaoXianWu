package com.github.wucoding.forum.api.model.vo.article;

import com.github.wucoding.forum.api.model.enums.column.ColumnArticleReadEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 保存Column帖子请求参数
 *
 *   @author zhangjx
 *    2022/9/26
 */
@Data
public class ColumnArticleReq implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 专栏ID
     */
    private Long columnId;

    /**
     * 帖子ID
     */
    private Long articleId;

    /**
     * 帖子排序
     */
    private Integer sort;

    /**
     * 教程标题
     */
    private String shortTitle;

    /**
     * 阅读方式
     */
    private Integer read;
}
