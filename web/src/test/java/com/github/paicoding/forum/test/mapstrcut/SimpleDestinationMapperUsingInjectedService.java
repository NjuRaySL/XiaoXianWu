package com.github.wucoding.forum.test.mapstrcut;

import com.github.wucoding.forum.service.article.service.ArticleReadService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    9/21/23
 */
@Mapper(componentModel = "spring")
public abstract class SimpleDestinationMapperUsingInjectedService {
    @Autowired
    protected ArticleReadService articleReadService;

//    @Mapping(target = "name", expression = "java(articleReadService.generateSummary(source.getName()))")
    public abstract SimpleDestination sourceToDestination(SimpleSource source);
}
