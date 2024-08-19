package com.github.wucoding.forum.api.model.exception;

import com.github.wucoding.forum.api.model.vo.constants.StatusEnum;

/**
 * @author RaySL
 *    2022/9/2
 */
public class ExceptionUtil {

    public static ForumException of(StatusEnum status, Object... args) {
        return new ForumException(status, args);
    }

}
