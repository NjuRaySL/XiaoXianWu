package com.github.wucoding.forum.core.util.id.snowflake;

/**
 * @author RaySL
 *       10/17
 */
public interface IdGenerator {
    /**
     * 生成分布式id
     *
     * @return
     */
    Long nextId();
}
