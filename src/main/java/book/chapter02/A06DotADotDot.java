package book.chapter02;

import lombok.extern.slf4j.Slf4j;
import tool.Tool;

import java.util.List;

import static book.chapter02.A00Data.FILE_NAME_LIST_1;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A06DotADotDot {

    /**
     * 2020-02-27 10:11:14 INFO  A06DotADotDot:22 - list:[sale, sale, sale, pac1, na1., na2., sa2.]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternList(".a..", FILE_NAME_LIST_1);
        log.info("list:{}", list);
    }

}
