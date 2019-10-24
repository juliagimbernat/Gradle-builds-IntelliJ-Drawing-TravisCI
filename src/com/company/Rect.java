package com.company;

import java.awt.*;

public class Rect {
    private int w;
    private int h;
    private Point pos;
    private Color col;

    public Rect(Point initPos, Color initCol, int width, int height){
        w = width;
        h = height;
        pos = initPos;
        col = initCol;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}
