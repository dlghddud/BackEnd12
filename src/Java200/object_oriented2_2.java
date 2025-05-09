package Java200;

import java.awt.*;
import java.awt.event.*;

public class object_oriented2_2 extends Frame{
    public int oldx = 0;
    public int oldy = 0;
    public int newx = 0;
    public int newy = 0;
    public int count = 0;
    public String message = null;

    public static void main(String[ ] args) {
        object_oriented2_2 window = new object_oriented2_2();
        window.setVisible(true);
    }

    public object_oriented2_2() {
        setSize(600, 500);
        setTitle("Pen 응용");
        MouseKeeper mouse = new MouseKeeper();
        addMouseListener(mouse);
    }

    private class MouseKeeper extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            newx = e.getX();
            newy = e.getY();
            count++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawLine(oldx, oldy, newx, newy);
        g.drawString(message = count+"번째 선" , newx, newy);
        oldx = newx;
        oldy = newy;
    }
}


