package com.cokid.AbstractFactory.tablefactory;


import com.cokid.AbstractFactory.factory.Factory;
import com.cokid.AbstractFactory.factory.Link;
import com.cokid.AbstractFactory.factory.Page;
import com.cokid.AbstractFactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
