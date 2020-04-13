
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Activity9 extends Panel implements KeyListener {

    Color human = new Color(234, 192, 134);
    static String name = "";
    static Color col = Color.WHITE;
    static Color pent = Color.CYAN;
    static JTextField test;
    static int x = 0, y;
    static boolean flag = true;

    public Activity9() {
        this.setBackground(Color.gray);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Forte", Font.PLAIN, 30));
        g.drawString(name, 330, getWidth() / 2 + 150);

        //colors
        g.setColor(col);
        for (int i = 500; i > 481; i--) {
            g.drawLine(334 + x, i, 370 + x, i);
        }
        for (int i = 500; i > 481; i--) {
            g.drawLine(390 + x, i, 430 + x, i);
        }
        for (int i = 378; i > 270; i--) {
            g.drawLine(282 + x, i, 450 + x, i);
        }
        for (int i = 350; i > 270; i--) {
            g.drawLine(300 + x, i, 503 + x, i);
        }

        //top head
        for (int i = 190; i < 196; i++) {
            g.fillArc(280 + x, i, 230, 230, 0, 180);
        }
        //body
        for (int i = 381; i < 450; i++) {
            g.drawLine(333 + x, i, 430 + x, i);
        }
        //this will start here
        if (flag == true) {
            g.setColor(col);
            g.fillOval(290 + x, 416, 20, 20);
            g.fillOval(297 + x, 410, 30, 30);
            g.fillOval(304 + x, 415, 30, 30);
            g.fillOval(315 + x, 396, 30, 30);
            g.fillOval(318 + x, 385, 30, 30);
            g.fillOval(323 + x, 440, 10, 10);
            g.setColor(Color.black);
        }
        // it wil end here
        g.setColor(Color.black);
        //faceshape
        //bottom
        for (int i = 350; i < 356; i++) {
            g.drawArc(210 + x, i, 300, 25, 0, -120);
        }
        //left
        for (int i = 280; i < 286; i++) {
            g.drawLine(i + x, 375, 280 + x, 290);
        }
        //right
        for (int i = 510; i < 516; i++) {
            g.drawLine(i + x, 365, 510 + x, 290);
        }
        //top
        for (int i = 190; i < 196; i++) {
            g.drawArc(280 + x, i, 230, 200, 0, 180);
        }
        for (int i = 342; i < 345; i++) {
            g.drawLine(i + x, 318, i + x, 375);
        }
        //pants color
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 426; i < 445; i++) {
            g.drawArc(333 + x, i, 98, 20, 0, -190);
        }

        //leftpants
        for (int i = 445; i < 478; i++) {
            g.drawArc(330 + x, i, 40, 5, 0, -180);
        }

        //rightpants
        for (int i = 445; i < 478; i++) {
            g.drawArc(390 + x, i, 40, 5, 0, -180);
        }
        g.setColor(Color.black);
        //belt
        for (int i = 401; i < 405; i++) {
            g.drawArc(330 + x, i, 100, 25, 0, -190);
        }
        //body
        for (int i = 330; i < 333; i++) {
            g.drawLine(i + x, 375, i + x, 500);
        }
        for (int i = 441; i < 444; i++) {
            g.drawArc(330 + x, i, 100, 25, 0, -190);
        }
        for (int i = 430; i < 433; i++) {
            g.drawLine(i + x, 375, i + x, 498);
        }

        //pants
        for (int i = 421; i < 424; i++) {
            g.drawArc(330 + x, i, 100, 25, 0, -190);
        }

        //legs
        //left
        for (int i = 330; i < 333; i++) {
            g.drawLine(i + x, 460, i + x, 500);
        }
        for (int i = 495; i < 498; i++) {
            g.drawArc(330 + x, i, 40, 5, 0, -180);
        }
        for (int i = 370; i < 373; i++) {
            g.drawLine(i + x, 465, i + x, 500);
        }

        //right
        for (int i = 390; i < 393; i++) {
            g.drawLine(i + x, 465, i + x, 500);
        }
        for (int i = 495; i < 498; i++) {
            g.drawArc(390 + x, i, 40, 5, 0, -180);
        }
        for (int i = 430; i < 433; i++) {
            g.drawLine(i + x, 460, i + x, 500);
        }

        g.setColor(Color.black);

        //armor
        for (int i = 275; i < 279; i++) {
            g.drawLine(i + x, 340, i + x, 378);
        }
        for (int i = 295; i < 299; i++) {
            g.drawLine(i + x, 344, i + x, 384);
        }

        for (int i = 340, k = 344; i < 380; i++, k++) {
            if (i < 345 || i > 375) {
                g.setColor(Color.black);
            } else {
                g.setColor(col);
            }
            g.drawLine(279 + x, i, 294 + x, k);
        }

        //0
        g.setColor(col);
        for (int i = 385, j = 364; i > 348; i--, j--) {
            g.drawLine(394 + x, i, 509 + x, j);
        }

        for (int i = 348, j = 327, k = 395; i > 325; i--, j--, k += 4) {
            g.drawLine(k + x, i, 509 + x, j);
        }

        g.setColor(Color.black);
        //circle

        for (int i = 30; i < 32; i++) {
            g.fillOval(420 + x, 280, i, i);
        }

        g.setColor(col);
        for (int i = 299; i < 302; i++) {
            g.drawLine(432 + x, 292, 439 + x, i);
            g.drawLine(439 + x, 292, 432 + x, i);
        }

        g.setColor(Color.black);
        //1
        for (int i = 390; i < 394; i++) {
            g.drawLine(i + x, 347, i + x, 387);
        }
        //2
        for (int i = 347, j = 337; i < 351; i++, j++) {
            g.drawLine(390 + x, i, 420 + x, j);
        }

        //3
        for (int i = 420; i < 424; i++) {
            g.drawLine(i + x, 307, i + x, 339);
        }
        //4
        for (int i = 387, j = 365; i < 391; i++, j++) {
            g.drawLine(390 + x, i, 518 + x, j);
        }

        //5
        for (int i = 279, j = 340; i < 285; i++, j++) {
            g.drawLine(i + x, 295, j + x, 270);
        }
        for (int i = 279, j = 340; i < 285; i++, j++) {
            g.drawLine(i + x, 305, j + x, 320);
        }

        for (int i = 341, j = 420; i < 347; i++, j++) {
            g.drawLine(i + x, 270, j + x, 290);
        }
        for (int i = 340, j = 422; i < 347; i++, j++) {
            g.drawLine(i + x, 320, j + x, 303);
        }

        //eyes armor lines
        for (int i = 290; i < 305; i++) {
            g.drawLine(310 + x, i, 380 + x, i);
        }

        g.setColor(Color.black);
        //belt button
        g.setColor(Color.white);
        g.drawOval(353 + x, 427, 20, 20);
        g.setColor(Color.darkGray);
        g.fillOval(354 + x, 428, 18, 18);
        g.setColor(Color.BLACK);

        g.setColor(col);
        for (int i = 384; i < 390; i++) {
            g.fillArc(419 + x, i, 25, 25, 10, 200);
        }
        g.setColor(Color.black);

        //shield-arm
        //left
        for (int i = 429, j = 444; i < 434; i++, j++) {
            g.drawLine(i + x, 384, j + x, 397);
        }
        for (int i = 384; i < 390; i++) {
            g.drawArc(419 + x, i, 25, 25, 10, 200);
        }

        //sword-arm
        //fingers
        //start here animate
        if (flag == true) {
            g.setColor(col);
            g.fillArc(305 + x, 427, 15, 30, 0, 150);
            g.setColor(Color.black);
            for (int i = 427; i < 432; i++) {
                g.drawArc(305 + x, i, 15, 30, 0, 150);
            }
            //others
            for (int i = 330, j = 310; i < 335; i++, j++) {
                g.drawLine(i + x, 375, j + x, 410);
            }
            for (int i = 330, j = 305; i < 335; i++, j++) {
                g.drawLine(i + x, 420, j + x, 410);
            }
            g.setColor(col);
            g.fillArc(295 + x, 408, 25, 15, 10, 300);
            g.setColor(Color.black);
            for (int i = 408; i < 412; i++) {
                g.drawArc(295 + x, i, 25, 15, 10, 300);
            }
            for (int i = 313, j = 330; i < 318; i++, j++) {
                g.drawLine(i + x, 421, j + x, 430);
            }
            for (int i = 330, j = 320; i < 333; i++, j++) {
                g.drawLine(i + x, 435, j + x, 450);
            }
            for (int i = 288, j = 330; i < 293; i++, j++) {
                g.drawLine(i + x, 432, j + x, 450);
            }
            for (int i = 325, j = 330; i < 326; i++, j++) {
                g.drawLine(i + x, 445, j + x, 450);
            }
        }
        //end here animate
        if (flag == true) {
            g.setColor(Color.WHITE);
            for (int i = 198; i < 285; i++) {
                g.drawLine(i + x, 403, 222 + x, 356);
            }
            for (int i = 433; i > 380; i--) {
                g.drawLine(261 + x, i, 272 + x, i);
            }
            g.fillRect(230 + x, 380, 40, 40);
            g.fillOval(185 + x, 361, 25, 25);
            g.fillOval(188 + x, 363, 40, 40);
            g.fillOval(195 + x, 356, 40, 40);
            g.fillOval(225 + x, 370, 40, 40);
            g.fillOval(228 + x, 369, 40, 40);
            g.fillOval(212 + x, 361, 40, 40);
            g.fillOval(253 + x, 381, 40, 40);
            g.fillOval(199 + x, 374, 40, 40);
            g.fillOval(210 + x, 380, 40, 40);
            g.fillOval(231 + x, 390, 40, 40);
            g.fillOval(248 + x, 397, 40, 40);
            g.setColor(Color.BLACK);
            for (int i = 265, j = 290; i < 282; i++, j++) {
                g.drawLine(i + x, 446, j + x, 388);
            }
            for (int i = 265, j = 295; i < 282; i++, j++) {
                g.drawLine(i + x, 448, 300 + x, 389);
            }
            g.setColor(Color.BLACK);
        }
        //sword
        if (flag == true) {
            for (int i = 305, j = 275; i < 310; i++, j++) {
                g.drawLine(i + x, 390, j + x, 450);
            }
            for (int i = 306, j = 295; i < 310; i++, j++) {
                g.drawLine(i + x, 390, j + x, 385);
            }
            for (int i = 275, j = 265; i < 280; i++, j++) {
                g.drawLine(i + x, 450, j + x, 445);
            }
            for (int i = 265, j = 295; i < 270; i++, j++) {
                g.drawLine(i + x, 446, j + x, 385);
            }

            //sword-blade
            for (int i = 291, j = 220; i < 296; i++, j++) {
                g.drawLine(i + x, 390, j + x, 355);
            }
            for (int i = 270, j = 195; i < 275; i++, j++) {
                g.drawLine(i + x, 440, j + x, 405);
            }

            for (int i = 195, j = 180; i < 200; i++, j++) {
                g.drawLine(i + x, 405, j + x, 365);
            }
            for (int i = 220, j = 180; i < 225; i++, j++) {
                g.drawLine(i + x, 355, j + x, 365);
            }
        }

        //shield
        //top
        g.setColor(col);
        for (int i = 420, j = 390; i < 450; i++, j++) {
            g.drawLine(390 + x, i, 469 + x, j);
        }
        g.setColor(Color.black);

        for (int i = 390, j = 460; i < 395; i++, j++) {
            g.drawLine(i + x, 420, j + x, 390);
        }

        //right
        g.setColor(col);
        for (int j = 490; j > 440; j--) {
            g.drawLine(465 + x, 390, j + x, 410);
        }
        g.fillRect(465 + x, 411, 23, 25);
        g.fillRect(447 + x, 460, 30, 25);

        g.fillOval(415 + x, 405, 70, 70);
        g.fillOval(390 + x, 420, 40, 40);
        for (int i = 392, j = 500; i < 440; i++, j--) {
            g.drawLine(i + x, 449, 472 + x, j);
        }

        g.setColor(Color.black);

        for (int i = 465, j = 490; i < 470; i++, j++) {
            g.drawLine(i + x, 390, j + x, 410);
        }
        for (int i = 490, j = 470; i < 493; i++, j++) {
            g.drawLine(i + x, 410, j + x, 500);
        }
        //left
        for (int i = 390, j = 388; i < 393; i++, j++) {
            g.drawLine(i + x, 420, j + x, 450);
        }

        for (int i = 388, j = 470; i < 393; i++, j++) {
            g.drawLine(i + x, 450, j + x, 500);
        }

        //polygon
        g.setColor(pent);
        Polygon p = new Polygon();
        for (int i = 0; i < 5; i++) {
            p.addPoint((int) (445 + 20 * Math.cos(i * 2 * Math.PI / 5) + x),
                    (int) (437 + 20 * Math.sin(i * 2 * Math.PI / 5)));
        }
        g.fillPolygon(p);

        if (flag == false) {
            g.setColor(col);
            g.fillOval(220 + x, 400, 40, 40);
            g.fillOval(215 + x, 410, 20, 20);
            g.fillOval(210 + x, 413, 20, 20);
            g.fillOval(210 + x, 406, 20, 20);
            g.fillOval(205 + x, 408, 20, 20);
            g.fillOval(200 + x, 409, 18, 18);
            g.fillOval(195 + x, 413, 10, 10);
            g.setColor(Color.BLACK);
            for (int i = 408; i < 411; i++) {
                g.drawLine(330 + x, i, 320 + x, i);
            }
            for (int i = 435; i < 438; i++) {
                g.drawLine(330 + x, i, 320 + x, i);
            }
            for (int i = 310; i < 323; i++) {
                g.drawLine(i + x, 397, i + x, 448);
            }
            for (int i = 400; i < 403; i++) {
                g.drawLine(309 + x, i, 240 + x, i);
            }
            for (int i = 443; i < 446; i++) {
                g.drawLine(309 + x, i, 240 + x, i);
            }
            g.setColor(col);
            for (int i = 403; i < 443; i++) {
                g.drawLine(309 + x, i, 240 + x, i);
            }
            g.setColor(Color.BLACK);
            for (int i = 240, j = 185; i < 245; i++, j++) {
                g.drawLine(i + x, 400, j + x, 417);
            }
            for (int i = 240, j = 185; i < 245; i++, j++) {
                g.drawLine(i + x, 444, j + x, 416);
            }

        }

    }

    public static void main(String[] args) {
//        name = JOptionPane.showInputDialog(null, "What is your characters name: ", "Knight", JOptionPane.PLAIN_MESSAGE);
//        String[] col1 = new String[5];
//        col1[0] = "Red";
//        col1[1] = "Magenta";
//        col1[2] = "Green";
//        col1[3] = "Yellow";
//        col1[4] = "White";
//        Object col = JOptionPane.showInputDialog(null, "Choose color", "Color Selection", JOptionPane.QUESTION_MESSAGE, null, col1, "Red");
//        if (col.equals("Red")) {
//            Activity.col = Color.RED;
//        } else if (col.equals("Magenta")) {
//            Activity.col = Color.magenta;
//        } else if (col.equals("Green")) {
//            Activity.col = Color.GREEN;
//        } else if (col.equals("Yellow")) {
//            Activity.col = Color.YELLOW;
//        } else if (col.equals("White")) {
//            Activity.col = Color.WHITE;
//        }
        JFrame frame = new JFrame("Activity 9");
        Activity9 panel = new Activity9();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        if (i == KeyEvent.VK_UP) {
            this.y--;
        }
        if (i == KeyEvent.VK_LEFT) {
            this.x -= 5;
        }
        if (i == KeyEvent.VK_RIGHT) {
            this.x += 5;
        }
        if (i == KeyEvent.VK_SPACE) {
            if (flag == true) {
                flag = false;
                pent = Color.red;
            } else {
                flag = true;
                pent = Color.cyan;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
