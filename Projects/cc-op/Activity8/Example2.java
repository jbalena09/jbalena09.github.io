
import java.awt.*;
import javax.swing.*;

public class Example2 extends JFrame {


    public Example2() {
        super("Ativity");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
        setResizable(false);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        //right arm
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 55; i > 50; i--) {
            g.fillOval(42, 162, i, 55);
        }
        g.setColor(Color.black);
        g.drawOval(42, 162, 55, 55);

        //leftFoot
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(75, 205, 55, 55, 0, 180);
        for (int j = 75; j < 125; j++) {
            g.drawLine(j, 232, 108, 237);
        }
        g.drawLine(108, 237, 129, 233);
        g.setColor(Color.black);

        g.drawArc(75, 205, 55, 55, 0, 180);
        g.drawLine(108, 237, 129, 233);
        g.drawLine(75, 232, 108, 237);
        
        
        //bodyCOLOR
        g.setColor(Color.ORANGE);
        g.fillOval(72, 110, 50, 50);
        g.fillOval(70, 133, 50, 50);
        g.fillOval(135, 94, 80, 80);
        g.fillOval(77, 79, 80, 80);
        g.fillOval(135, 83, 80, 80);
        g.fillOval(140, 84, 70, 80);
        g.fillOval(96, 68, 80, 80);
        g.fillOval(68, 165, 50, 50);
        g.fillOval(79, 90, 40, 40);
        g.fillOval(79, 90, 40, 40);
        g.fillOval(90, 175, 50, 50);
        g.fillOval(90, 106, 123, 126);
        g.setColor(Color.black);

        //body
        for (int i = 77, j = 128; i < 82; i++, j++) {
            g.drawLine(i, 96, j, 66);
        }
        for (int i = 128, j = 212; i < 133; i++, j++) {
            g.drawLine(i, 66, j, 97);
        }
        for (int i = 212, j = 212; i < 217; i++, j++) {
            g.drawLine(i, 97, j, 215);
        }
        for (int i = 212, j = 120; i < 217; i++, j++) {
            g.drawLine(i, 215, j, 229);
        }
        for (int i = 120, j = 67; i < 125; i++, j++) {
            g.drawLine(i, 229, j, 208);
        }
        for (int i = 77, j = 67; i < 82; i++, j++) {
            g.drawLine(i, 96, j, 208);
        }

        //eyes
        for (int k = 140, l = 127; k < 160; k++, l++) {
            g.drawLine(77, k, 124, l);
        }
        for (int j = 127, l = 144; j < 147; j++, l++) {
            g.drawLine(124, j, 178, l);
        }
        //circles
        g.drawOval(86, 94, 8, 8);
        g.drawOval(107, 84, 8, 8);
        g.drawOval(127, 75, 8, 8);
        g.drawOval(149, 84, 8, 8);
        g.drawOval(173, 92, 8, 8);
        g.drawOval(192, 99, 8, 8);

        //sword
        for (int i = 196, j = 245; i < 201; i++, j++) {
            g.drawLine(i, 158, j, 177);
        }
        for (int i = 196, j = 193; i < 201; i++, j++) {
            g.drawLine(i, 158, j, 165);
        }
        for (int i = 243, j = 245; i < 248; i++, j++) {
            g.drawLine(i, 183, j, 177);
        }
        for (int i = 243, j = 193; i < 248; i++, j++) {
            g.drawLine(i, 183, j, 165);
        }
        for (int i = 213, j = 237; i < 218; i++, j++) {
            g.drawLine(i, 164, j, 108);
        }
        for (int i = 228, j = 254; i < 233; i++, j++) {
            g.drawLine(i, 170, j, 115);
        }
        for (int i = 237, j = 251; i < 242; i++, j++) {
            g.drawLine(i, 108, j, 97);
        }
        for (int i = 251, j = 254; i < 256; i++, j++) {
            g.drawLine(i, 97, j, 115);
        }

        //leftarm
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 55; i > 50; i--) {
            g.fillOval(184, 167, i, 55);
        }
        g.setColor(Color.black);
        g.drawOval(184, 167, 55, 55);

        //rightfoot
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(140, 205, 55, 55, 0, 180);

        for (int i = 142; i < 185; i++) {
            g.drawLine(i, 232, 164, 236);
        }
        g.drawLine(164, 236, 194, 232);
        g.setColor(Color.black);

        g.drawArc(140, 205, 55, 55, 0, 180);
        g.drawLine(164, 236, 194, 232);
        g.drawLine(142, 232, 164, 236);
    }

    public static void main(String[] args) {
        new Example2();

    }
}
