package com.github.wucoding.forum.service.statistics.service;

import com.github.wucoding.forum.api.model.vo.statistics.dto.StatisticsCountDTO;
import com.github.wucoding.forum.api.model.vo.statistics.dto.StatisticsDayDTO;

import java.util.List;

/**
 * 数据统计后台接口
 *
 *   @author zhangjx
 *    09-19
 */
public interface StatisticsSettingService {

    /**
     * 保存计数
     *
     * @param host
     */
    void saveRequestCount(String host);

    /**
     * 获取总数
     *
     * @return
     */
    StatisticsCountDTO getStatisticsCount();

    /**
     * 获取每天的PV UV统计数据
     *
     * @param day
     * @return
     */
    List<StatisticsDayDTO> getPvUvDayList(Integer day);

}
