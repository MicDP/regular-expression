package com.moqi.book.chapter08;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_28_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class G02 {

    private static final String REGEX = "<[hH][1-6]>.*</[hH][1-6]>";

    /**
     * 2020-03-07 19:04:44 INFO  G02:24 - list:[<H1>Welcome to my Homepage</H1>, <H2>ColdFusion</H2>, <H2>Wireless</H2>]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_28_TXT);
        log.info("list:{}", list);
    }

}
