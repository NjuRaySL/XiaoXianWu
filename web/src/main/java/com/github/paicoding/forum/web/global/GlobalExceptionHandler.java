package com.github.wucoding.forum.web.global;

import com.github.wucoding.forum.api.model.exception.ForumAdviceException;
import com.github.wucoding.forum.api.model.vo.ResVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    4/17/23
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ForumAdviceException.class)
    public ResVo<String> handleForumAdviceException(ForumAdviceException e) {
        return ResVo.fail(e.getStatus());
    }
}
