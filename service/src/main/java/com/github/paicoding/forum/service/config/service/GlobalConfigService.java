package com.github.wucoding.forum.service.config.service;

import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.config.GlobalConfigReq;
import com.github.wucoding.forum.api.model.vo.config.SearchGlobalConfigReq;
import com.github.wucoding.forum.api.model.vo.config.dto.GlobalConfigDTO;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    6/30/23
 */
public interface GlobalConfigService {
    PageVo<GlobalConfigDTO> getList(SearchGlobalConfigReq req);

    void save(GlobalConfigReq req);

    void delete(Long id);

    /**
     * 添加敏感词白名单
     *
     * @param word
     */
    void addSensitiveWhiteWord(String word);
}
