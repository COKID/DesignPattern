package com.cokid.Flyweight;

public class BigString {

    private BigChar[] bigchars;// “大型字符”的数组

    public BigString(String string) {// 构造函数
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {// 显示
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
