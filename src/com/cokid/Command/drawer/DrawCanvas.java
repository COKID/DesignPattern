package com.cokid.Command.drawer;

import com.cokid.Command.command.MacroCommand;
import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;// 颜色

    private int radius = 6;// 要绘制的圆点的半径

    private MacroCommand history;// 命令的历史记录

    public DrawCanvas(int width, int height, MacroCommand history) {// 构造函数
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    @Override
    public void paint(Graphics g){// 重新全部绘制
        history.execute();
    }
    @Override
    public void draw(int x, int y) {// 绘制
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
