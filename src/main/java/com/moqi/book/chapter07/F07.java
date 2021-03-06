package com.moqi.book.chapter07;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_26_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class F07 {

    /**
     * 2020-03-07 11:46:38 INFO  F07:23 - list:[12.159.46.20]
     */
    public static void main(String[] args) {
        String regex = "(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
        List<String> list = Tool.patternString(regex, TEXT_26_TXT);
        log.info("list:{}", list);
    }

}
