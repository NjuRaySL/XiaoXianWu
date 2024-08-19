package com.github.wucoding.forum.service.article.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.article.dto.ArticleAdminDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.SimpleArticleDTO;
import com.github.wucoding.forum.api.model.vo.article.dto.YearArticleDTO;
import com.github.wucoding.forum.service.article.repository.entity.ArticleDO;
import com.github.wucoding.forum.service.article.repository.entity.ReadCountDO;
import com.github.wucoding.forum.service.article.repository.params.SearchArticleParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 帖子mapper接口
 *
 *   @author zhangjx
 *  07-18
 */
public interface ArticleMapper extends BaseMapper<ArticleDO> {

    /**
     * 通过id遍历帖子, 用于生成sitemap.xml
     *
     * @param lastId
     * @param size
     * @return
     */
    List<SimpleArticleDTO> listArticlesOrderById(@Param("lastId") Long lastId, @Param("size") int size);

    /**
     * 根据阅读次数获取热门帖子
     *
     * @param pageParam
     * @return
     */
    List<SimpleArticleDTO> listArticlesByReadCounts(@Param("pageParam") PageParam pageParam);

    /**
     * 查询作者的热门帖子
     *
     * @param userId
     * @param pageParam
     * @return
     */
    List<SimpleArticleDTO> listArticlesByUserIdOrderByReadCounts(@Param("userId") Long userId, @Param("pageParam") PageParam pageParam);

    /**
     * 根据类目 + 标签查询帖子
     *
     * @param category
     * @param tagIds
     * @param pageParam
     * @return
     */
    List<ReadCountDO> listArticleByCategoryAndTags(@Param("categoryId") Long category,
                                                   @Param("tags") List<Long> tagIds,
                                                   @Param("pageParam") PageParam pageParam);

    /**
     * 根据用户ID获取创作历程
     *
     * @param userId
     * @return
     */
    List<YearArticleDTO> listYearArticleByUserId(@Param("userId") Long userId);

    List<ArticleAdminDTO> listArticlesByParams(@Param("searchParams") SearchArticleParams searchArticleParams,
                                               @Param("pageParam") PageParam pageParam);

    Long countArticlesByParams(@Param("searchParams") SearchArticleParams searchArticleParams);
}
