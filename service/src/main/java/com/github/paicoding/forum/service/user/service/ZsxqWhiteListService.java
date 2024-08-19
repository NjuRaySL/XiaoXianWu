package com.github.wucoding.forum.service.user.service;

import com.github.wucoding.forum.api.model.enums.user.UserAIStatEnum;
import com.github.wucoding.forum.api.model.vo.PageVo;
import com.github.wucoding.forum.api.model.vo.user.SearchZsxqUserReq;
import com.github.wucoding.forum.api.model.vo.user.ZsxqUserPostReq;
import com.github.wucoding.forum.api.model.vo.user.dto.ZsxqUserInfoDTO;

import java.util.List;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    6/29/23
 */
public interface ZsxqWhiteListService {
    PageVo<ZsxqUserInfoDTO> getList(SearchZsxqUserReq req);

    void operate(Long id, UserAIStatEnum operate);

    void update(ZsxqUserPostReq req);

    void batchOperate(List<Long> ids, UserAIStatEnum operate);

    void reset(Integer authorId);
}
