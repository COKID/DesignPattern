package com.cokid.Flyweight;

import java.util.HashMap;

public class BigCharFactory {

    private HashMap pool = new HashMap();// 管理已经生成的BigChar的实例
    private static BigCharFactory singleton = new BigCharFactory();// Singleton模式

    private BigCharFactory() {// 构造函数
    }
    public static BigCharFactory getInstance() {// 获取唯一的实例
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {// 生成（共享）BigChar类的实例
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // 生成BigChar的实例
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
