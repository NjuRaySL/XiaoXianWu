package com.github.wucoding.forum.test.proxy;

import org.junit.Test;

/**
 * @author RaySL
 *       2/28
 */
public class DemoService {

    public String showHello(String arg) {
        System.out.println("in function!");
        System.out.println("before return:" + arg);
        return "prefix_" + arg;
    }
}
