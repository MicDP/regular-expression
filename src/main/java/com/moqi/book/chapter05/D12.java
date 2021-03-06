package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_18_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class D12 {

    /**
     * 2020-03-06 23:42:22 INFO  D12:22 - list:[<B>AK</B> and <B>HI</B>]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("<[Bb]>.*</[Bb]>", TEXT_18_TXT);
        log.info("list:{}", list);
    }

}
