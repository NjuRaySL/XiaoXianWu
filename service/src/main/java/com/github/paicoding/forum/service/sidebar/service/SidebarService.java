package com.github.wucoding.forum.service.sidebar.service;

import com.github.wucoding.forum.api.model.vo.recommend.SideBarDTO;

import java.util.List;

/**
 * @author RaySL
 *    2022/9/6
 */
public interface SidebarService {

    /**
     * 查询首页的侧边栏信息
     *
     * @return
     */
    List<SideBarDTO> queryHomeSidebarList();

    /**
     * 查询教程的侧边栏信息
     *
     * @return
     */
    List<SideBarDTO> queryColumnSidebarList();

    /**
     * 查询帖子详情的侧边栏信息
     *
     * @param author    帖子作者id
     * @param articleId 帖子id
     * @return
     */
    List<SideBarDTO> queryArticleDetailSidebarList(Long author, Long articleId);

}
