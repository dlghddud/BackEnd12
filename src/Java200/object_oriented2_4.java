package Java200;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Pt {
    int x;
    int y;
}

public class object_oriented2_4 extends Frame {
    public Pt startPoint = null;
    public Pt endPoint = null;
    public boolean firstClick = true;

    public static void main(String[] args) {
        object_oriented2_4 window = new object_oriented2_4();
        window.setVisible(true);
    }

    public object_oriented2_4() {
        setSize(600, 500);
        setTitle("Pen 응용");
        MouseKeeper mouse = new MouseKeeper();
        addMouseListener(mouse);

        startPoint = new Pt();
        endPoint = new Pt();
    }

    private class MouseKeeper extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            if(firstClick) {
                startPoint.x = e.getX();
                startPoint.y = e.getY();
                firstClick = false;
            }
            else {
                endPoint.x = e.getX();
                endPoint.y = e.getY();
                firstClick = true;
                repaint();
            }
        }
    }

    public void paint(Graphics g) {
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}