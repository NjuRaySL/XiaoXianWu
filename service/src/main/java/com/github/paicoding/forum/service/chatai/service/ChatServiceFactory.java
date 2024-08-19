package com.github.wucoding.forum.service.chatai.service;

import com.github.wucoding.forum.api.model.enums.ai.AISourceEnum;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author RaySL
 *       7/2
 */
@Component
public class ChatServiceFactory {
    private final Map<AISourceEnum, ChatService> chatServiceMap;


    public ChatServiceFactory(List<ChatService> chatServiceList) {
        chatServiceMap = Maps.newHashMapWithExpectedSize(chatServiceList.size());
        for (ChatService chatService : chatServiceList) {
            chatServiceMap.put(chatService.source(), chatService);
        }
    }

    public ChatService getChatService(AISourceEnum aiSource) {
        return chatServiceMap.get(aiSource);
    }
}
