package com.company;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class Drawing extends Canvas {
    private Circle C;
    private Rect R;
    private Frame f;
    Point p=new Point(200,200);
    Point pr=new Point(100,100);

    Color c=new Color(0x990D7A);
    Color cr=new Color(0x991B0C);

    public Drawing() {
        C = new Circle(p,c,60);
        R = new Rect(pr,cr,20,20);

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {

        C.draw(g);
        R.draw(g);
    }
}
