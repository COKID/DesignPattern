package com.cokid.Command.drawer;

import com.cokid.Command.command.Command;

import java.awt.Point;

public class DrawCommand implements Command {
    protected Drawable drawable;// 绘制对象
    private Point position;// 绘制位置
    public DrawCommand(Drawable drawable, Point position) {// 构造函数
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {// 执行
        drawable.draw(position.x, position.y);
    }
}
