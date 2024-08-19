package com.github.wucoding.forum.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author RaySL
 *    2022/7/6
 */
@Configuration
@ComponentScan("com.github.wucoding.forum.service")
@MapperScan(basePackages = {
        "com.github.wucoding.forum.service.article.repository.mapper",
        "com.github.wucoding.forum.service.user.repository.mapper",
        "com.github.wucoding.forum.service.comment.repository.mapper",
        "com.github.wucoding.forum.service.config.repository.mapper",
        "com.github.wucoding.forum.service.statistics.repository.mapper",
        "com.github.wucoding.forum.service.notify.repository.mapper",})
public class ServiceAutoConfig {
}
