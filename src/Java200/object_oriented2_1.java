package Java200;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class object_oriented2_1 extends Frame{
    public int oldx = 0;
    public int oldy = 0;
    public int newx = 0;
    public int newy = 0;
    public String message = null;

    public static void main(String[ ] args) {
        object_oriented2_2 window = new object_oriented2_2();
        window.setVisible(true);
    }

    public object_oriented2_1() {
        setSize(600, 500);
        setTitle("Pen 응용");
        MouseKeeper mouse = new MouseKeeper();
        addMouseListener(mouse);

        Scanner s = new Scanner(System.in);
        System.out.print("출력할 메시지를 입력하세요: ");
        message = s.next();
    }

    private class MouseKeeper extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            newx = e.getX();
            newy = e.getY();
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawLine(oldx, oldy, newx, newy);
        g.drawString(message, newx, newy);
        oldx = newx;
        oldy = newy;
    }
}

