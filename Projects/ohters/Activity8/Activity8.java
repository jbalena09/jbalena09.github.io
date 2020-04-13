import java.awt.*;
import javax.swing.*;

public class Activity8 extends Panel   {

    Color human = new Color(234, 192, 134);
    static String name = "";
    static Color col = Color.WHITE;
    static JTextField test;

    public Activity8() {
        this.setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Forte", Font.PLAIN, 30));
        g.drawString(name, 330, getWidth() / 2 + 150);

        //colors
        g.setColor(col);
        for (int i = 500; i > 481; i--) {
            g.drawLine(334, i, 370, i);
        }
        for (int i = 500; i > 481; i--) {
            g.drawLine(390, i, 430, i);
        }
        for (int i = 378; i > 270; i--) {
            g.drawLine(282, i, 450, i);
        }
        for (int i = 350; i > 270; i--) {
            g.drawLine(300, i, 503, i);
        }

        //top head
        for (int i = 190; i < 196; i++) {
            g.fillArc(280, i, 230, 230, 0, 180);
        }
        //body
        for (int i = 381; i < 450; i++) {
            g.drawLine(333, i, 430, i);
        }
        g.setColor(col);
        g.fillOval(290, 416, 20, 20);
        g.fillOval(297, 410, 30, 30);
        g.fillOval(304, 415, 30, 30);
        g.fillOval(315, 396, 30, 30);
        g.fillOval(318, 385, 30, 30);
        g.fillOval(323, 440, 10, 10);
        g.setColor(Color.black);
        
        g.setColor(Color.black);
        //faceshape
        //bottom
        for (int i = 350; i < 356; i++) {
            g.drawArc(210, i, 300, 25, 0, -120);
        }
        //left
        for (int i = 280; i < 286; i++) {
            g.drawLine(i, 375, 280, 290);
        }
        //right
        for (int i = 510; i < 516; i++) {
            g.drawLine(i, 365, 510, 290);
        }
        //top
        for (int i = 190; i < 196; i++) {
            g.drawArc(280, i, 230, 200, 0, 180);
        }
        for (int i = 342; i < 345; i++) {
            g.drawLine(i, 318, i, 375);
        }
        //pants color
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 426; i < 445; i++) {
            g.drawArc(333, i, 98, 20, 0, -190);
        }

        //leftpants
        for (int i = 445; i < 478; i++) {
            g.drawArc(330, i, 40, 5, 0, -180);
        }

        //rightpants
        for (int i = 445; i < 478; i++) {
            g.drawArc(390, i, 40, 5, 0, -180);
        }
        g.setColor(Color.black);
        //belt
        for (int i = 401; i < 405; i++) {
            g.drawArc(330, i, 100, 25, 0, -190);
        }
        //body
        for (int i = 330; i < 333; i++) {
            g.drawLine(i, 375, i, 500);
        }
        for (int i = 441; i < 444; i++) {
            g.drawArc(330, i, 100, 25, 0, -190);
        }
        for (int i = 430; i < 433; i++) {
            g.drawLine(i, 375, i, 498);
        }

        //pants
        for (int i = 421; i < 424; i++) {
            g.drawArc(330, i, 100, 25, 0, -190);
        }

        //legs
        //left
        for (int i = 330; i < 333; i++) {
            g.drawLine(i, 460, i, 500);
        }
        for (int i = 495; i < 498; i++) {
            g.drawArc(330, i, 40, 5, 0, -180);
        }
        for (int i = 370; i < 373; i++) {
            g.drawLine(i, 465, i, 500);
        }

        //right
        for (int i = 390; i < 393; i++) {
            g.drawLine(i, 465, i, 500);
        }
        for (int i = 495; i < 498; i++) {
            g.drawArc(390, i, 40, 5, 0, -180);
        }
        for (int i = 430; i < 433; i++) {
            g.drawLine(i, 460, i, 500);
        }

        g.setColor(Color.black);

        //armor
        for (int i = 275; i < 279; i++) {
            g.drawLine(i, 340, i, 378);
        }
        for (int i = 295; i < 299; i++) {
            g.drawLine(i, 344, i, 384);
        }

        for (int i = 340, k = 344; i < 380; i++, k++) {
            if (i < 345 || i > 375) {
                g.setColor(Color.black);
            } else {
                g.setColor(col);
            }
            g.drawLine(279, i, 294, k);
        }

        //0
        g.setColor(col);
        for (int i = 385, j = 364; i > 348; i--, j--) {
            g.drawLine(394, i, 509, j);
        }

        for (int i = 348, j = 327, k = 395; i > 325; i--, j--, k += 4) {
            g.drawLine(k, i, 509, j);
        }

        g.setColor(Color.black);
        //circle

        for (int i = 30; i < 32; i++) {
            g.fillOval(420, 280, i, i);
        }

        g.setColor(col);
        for (int i = 299; i < 302; i++) {
            g.drawLine(432, 292, 439, i);
            g.drawLine(439, 292, 432, i);
        }

        g.setColor(Color.black);
        //1
        for (int i = 390; i < 394; i++) {
            g.drawLine(i, 347, i, 387);
        }
        //2
        for (int i = 347, j = 337; i < 351; i++, j++) {
            g.drawLine(390, i, 420, j);
        }

        //3
        for (int i = 420; i < 424; i++) {
            g.drawLine(i, 307, i, 339);
        }
        //4
        for (int i = 387, j = 365; i < 391; i++, j++) {
            g.drawLine(390, i, 518, j);
        }

        //5
        for (int i = 279, j = 340; i < 285; i++, j++) {
            g.drawLine(i, 295, j, 270);
        }
        for (int i = 279, j = 340; i < 285; i++, j++) {
            g.drawLine(i, 305, j, 320);
        }

        for (int i = 341, j = 420; i < 347; i++, j++) {
            g.drawLine(i, 270, j, 290);
        }
        for (int i = 340, j = 422; i < 347; i++, j++) {
            g.drawLine(i, 320, j, 303);
        }

        //eyes armor lines
        for (int i = 290; i < 305; i++) {
            g.drawLine(310, i, 380, i);
        }

        g.setColor(Color.black);
        //belt button
        g.setColor(Color.white);
        g.drawOval(353, 427, 20, 20);
        g.setColor(Color.darkGray);
        g.fillOval(354, 428, 18, 18);
        g.setColor(Color.BLACK);

        g.setColor(col);
        for (int i = 384; i < 390; i++) {
            g.fillArc(419, i, 25, 25, 10, 200);
        }
        g.setColor(Color.black);

        //shield-arm
        //left
        for (int i = 429, j = 444; i < 434; i++, j++) {
            g.drawLine(i, 384, j, 397);
        }
        for (int i = 384; i < 390; i++) {
            g.drawArc(419, i, 25, 25, 10, 200);
        }

        //sword-arm
        //fingers
        g.setColor(col);
        g.fillArc(305, 427, 15, 30, 0, 150);
        g.setColor(Color.black);
        for (int i = 427; i < 432; i++) {
            g.drawArc(305, i, 15, 30, 0, 150);
        }
        //others
        for (int i = 330, j = 310; i < 335; i++, j++) {
            g.drawLine(i, 375, j, 410);
        }
        for (int i = 330, j = 305; i < 335; i++, j++) {
            g.drawLine(i, 420, j, 410);
        }
        g.setColor(col);
        g.fillArc(295, 408, 25, 15, 10, 300);
        g.setColor(Color.black);
        for (int i = 408; i < 412; i++) {
            g.drawArc(295, i, 25, 15, 10, 300);
        }
        for (int i = 313, j = 330; i < 318; i++, j++) {
            g.drawLine(i, 421, j, 430);
        }
        for (int i = 330, j = 320; i < 333; i++, j++) {
            g.drawLine(i, 435, j, 450);
        }
        for (int i = 288, j = 330; i < 293; i++, j++) {
            g.drawLine(i, 432, j, 450);
        }
        for (int i = 325, j = 330; i < 326; i++, j++) {
            g.drawLine(i, 445, j, 450);
        }

        g.setColor(Color.WHITE);
        for (int i = 198; i < 285; i++) {
            g.drawLine(i, 403, 222, 356);
        }
        for (int i = 433; i > 380; i--) {
            g.drawLine(261, i, 272, i);
        }
        g.fillRect(230, 380, 40, 40);
        g.fillOval(185, 361, 25, 25);
        g.fillOval(188, 363, 40, 40);
        g.fillOval(195, 356, 40, 40);
        g.fillOval(225, 370, 40, 40);
        g.fillOval(228, 369, 40, 40);
        g.fillOval(212, 361, 40, 40);
        g.fillOval(253, 381, 40, 40);
        g.fillOval(199, 374, 40, 40);
        g.fillOval(210, 380, 40, 40);
        g.fillOval(231, 390, 40, 40);
        g.fillOval(248, 397, 40, 40);
        g.setColor(Color.BLACK);
        for (int i = 265, j = 290; i < 282; i++, j++) {
            g.drawLine(i, 446, j, 388);
        }
        for (int i = 265, j = 295; i < 282; i++, j++) {
            g.drawLine(i, 448, 300, 389);
        }
        g.setColor(Color.BLACK);

        //sword
        for (int i = 305, j = 275; i < 310; i++, j++) {
            g.drawLine(i, 390, j, 450);
        }
        for (int i = 306, j = 295; i < 310; i++, j++) {
            g.drawLine(i, 390, j, 385);
        }
        for (int i = 275, j = 265; i < 280; i++, j++) {
            g.drawLine(i, 450, j, 445);
        }
        for (int i = 265, j = 295; i < 270; i++, j++) {
            g.drawLine(i, 446, j, 385);
        }

        //sword-blade
        for (int i = 291, j = 220; i < 296; i++, j++) {
            g.drawLine(i, 390, j, 355);
        }
        for (int i = 270, j = 195; i < 275; i++, j++) {
            g.drawLine(i, 440, j, 405);
        }

        for (int i = 195, j = 180; i < 200; i++, j++) {
            g.drawLine(i, 405, j, 365);
        }
        for (int i = 220, j = 180; i < 225; i++, j++) {
            g.drawLine(i, 355, j, 365);
        }

        //shield
        //top
        g.setColor(col);
        for (int i = 420, j = 390; i < 450; i++, j++) {
            g.drawLine(390, i, 469, j);
        }
        g.setColor(Color.black);

        for (int i = 390, j = 460; i < 395; i++, j++) {
            g.drawLine(i, 420, j, 390);
        }

        //right
        g.setColor(col);
        for (int j = 490; j > 440; j--) {
            g.drawLine(465, 390, j, 410);
        }
        g.fillRect(465, 411, 23, 25);
        g.fillRect(447, 460, 30, 25);

        g.fillOval(415, 405, 70, 70);
        g.fillOval(390, 420, 40, 40);
        for (int i = 392, j = 500; i < 440; i++, j--) {
            g.drawLine(i, 449, 472, j);
        }

        g.setColor(Color.black);

        for (int i = 465, j = 490; i < 470; i++, j++) {
            g.drawLine(i, 390, j, 410);
        }
        for (int i = 490, j = 470; i < 493; i++, j++) {
            g.drawLine(i, 410, j, 500);
        }
        //left
        for (int i = 390, j = 388; i < 393; i++, j++) {
            g.drawLine(i, 420, j, 450);
        }

        for (int i = 388, j = 470; i < 393; i++, j++) {
            g.drawLine(i, 450, j, 500);
        }

        //polygon
        g.setColor(Color.cyan);
        Polygon p = new Polygon();
        for (int i = 0; i < 5; i++) {
            p.addPoint((int) (445 + 20 * Math.cos(i * 2 * Math.PI / 5)),
                    (int) (437 + 20 * Math.sin(i * 2 * Math.PI / 5)));
        }
        g.fillPolygon(p);

    }

    public static void main(String[] args) {
        name = JOptionPane.showInputDialog(null, "What is your characters name: ", "Knight", JOptionPane.PLAIN_MESSAGE);
        String[] col1 = new String[5];
        col1[0] = "Red";
        col1[1] = "Magenta";
        col1[2] = "Green";
        col1[3] = "Yellow";
        col1[4] = "White";
        Object col = JOptionPane.showInputDialog(null, "Choose color", "Color Selection", JOptionPane.QUESTION_MESSAGE, null, col1, "Red");
        if (col.equals("Red")) {
            Activity8.col = Color.RED;
        } else if (col.equals("Magenta")) {
            Activity8.col = Color.magenta;
        } else if (col.equals("Green")) {
            Activity8.col = Color.GREEN;
        } else if (col.equals("Yellow")) {
            Activity8.col = Color.YELLOW;
        } else if (col.equals("White")) {
            Activity8.col = Color.WHITE;
        }
        JFrame frame = new JFrame("Activity 8");
        Activity8 panel = new Activity8();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);

    }
}
