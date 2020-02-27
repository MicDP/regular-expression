package com.moqi.tool;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.moqi.constant.Constant.EMPTY_STRING;

/**
 * @author moqi
 * On 2/27/20 09:51
 */
@Slf4j
public class Tool {

    private static final String DATA_PREFIX = "src/main/resources/data/";

    /**
     * 正则匹配字符串
     */
    public static List<String> patternString(String regex, String sourceString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sourceString);

        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group());
        }

        return list;
    }

    /**
     * 将整个文件读取为一个字符串
     */
    public static String getStringFromFile(String filePath) {

        try {
            return new String(Files.readAllBytes(Paths.get(DATA_PREFIX + filePath)));
        } catch (IOException e) {
            log.error("文件读取异常");
        }

        return EMPTY_STRING;
    }

}