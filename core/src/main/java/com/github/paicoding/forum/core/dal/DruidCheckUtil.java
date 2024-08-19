package com.github.wucoding.forum.core.dal;

import com.github.hui.quick.plugin.qrcode.util.ClassUtils;

/**
 * @author RaySL
 *       5/28
 */
public class DruidCheckUtil {

    /**
     * 判断是否包含durid相关的数据包
     *
     * @return
     */
    public static boolean hasDuridPkg() {
        return ClassUtils.isPresent("com.alibaba.druid.pool.DruidDataSource", DataSourceConfig.class.getClassLoader());
    }

}
