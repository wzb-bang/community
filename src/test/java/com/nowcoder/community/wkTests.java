package com.nowcoder.community;

import java.io.IOException;

/**
 * @author bo
 * @date Created in 16:49 2020/3/9
 * @description
 **/
public class wkTests {
    public static void main(String[] args) {
        String cmd="D:/BaiduNetdiskDownload/data/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com D:/BaiduNetdiskDownload/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
