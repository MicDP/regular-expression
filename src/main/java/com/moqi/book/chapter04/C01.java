package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_08_TXT;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class C01 {

    /**
     * 2020-02-27 10:38:11 INFO  C01:22 - list:[]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("myArray[0]", TEXT_08_TXT);
        log.info("list:{}", list);
    }

}
