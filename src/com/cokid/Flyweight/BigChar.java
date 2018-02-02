package com.cokid.Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;// 字符名字
    private String fontdata; // 大型字符对应的字符串(由'#' '.' '\n'组成)

    public BigChar(char charname) {// 构造函数
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() { // 显示大型字符
        System.out.print(fontdata);
    }
}
