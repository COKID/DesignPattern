package com.cokid.Adapter.delegateAdapter;

public class Main {
    public static void main(String... args){
     Print p=new PrintBanner("Hello");
     p.printWeak();
     p.printStrong();
    }
}
