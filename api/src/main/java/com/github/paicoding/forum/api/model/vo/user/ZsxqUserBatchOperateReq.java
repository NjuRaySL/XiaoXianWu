package com.github.wucoding.forum.api.model.vo.user;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    6/29/23
 */
@Data
public class ZsxqUserBatchOperateReq implements Serializable {
    // ids
    private List<Long> ids;
    // 状态
    private Integer status;
}
