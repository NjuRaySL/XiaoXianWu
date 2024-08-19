package com.github.wucoding.forum.service.user.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.wucoding.forum.api.model.vo.PageParam;
import com.github.wucoding.forum.api.model.vo.user.dto.ZsxqUserInfoDTO;
import com.github.wucoding.forum.service.user.repository.entity.UserAiDO;
import com.github.wucoding.forum.service.user.repository.params.SearchZsxqWhiteParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ai用户登录mapper接口
 *
 * @author ygl
 *    07-18
 */
public interface UserAiMapper extends BaseMapper<UserAiDO> {

    Long countZsxqUsersByParams(@Param("searchParams") SearchZsxqWhiteParams params);

    List<ZsxqUserInfoDTO> listZsxqUsersByParams(@Param("searchParams") SearchZsxqWhiteParams params,
                                                @Param("pageParam") PageParam newPageInstance);
}
