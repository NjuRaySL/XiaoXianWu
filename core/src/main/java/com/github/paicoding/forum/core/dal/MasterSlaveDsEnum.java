package com.github.wucoding.forum.core.dal;

/**
 * 主从数据源的枚举
 *
 * @author RaySL
 *       4/30
 */
public enum MasterSlaveDsEnum implements DS {
    /**
     * master主数据源类型
     */
    MASTER,
    /**
     * slave从数据源类型
     */
    SLAVE;
}
