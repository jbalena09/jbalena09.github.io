import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;

public class Activity10 extends Panel
        implements KeyListener {

    static int y = 90, x = 100, sa = 23, mouth = 315, pacmanSize = 100, score = 0;
    static Color color = Color.YELLOW;
    static int xFood = 300, yFood = 450, foodSize = 25;

    @Override
    public void paint(Graphics g) {
        if (score != 10) {
            g.setFont(new Font("Century Gothic", Font.BOLD, 20));
            g.drawString("Score: " + score, 40, 40);
            g.setColor(color);
            g.fillArc(x, y, pacmanSize, pacmanSize, sa, mouth);
            g.fillOval(x, y, WIDTH, HEIGHT);
            g.fillOval(xFood, yFood, foodSize, foodSize);
        }
        if (score == 10) {
            g.fillRoundRect(200, 200, 400, 200, 40, 40);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Century Gothic", Font.BOLD, 50));
            g.drawString("GAME OVER", 250, 300);
            g.setFont(new Font("Century Gothic", Font.PLAIN, 25));
            g.drawString("Press Enter to Play Again>>", 250, 350);
//            System.exit(0);
        }

    }

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        Activity10 panel = new Activity10();
        panel.addKeyListener(panel);
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (score != 10) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (y <= -100)
                {
                   y = 750;
                } else {
                    y -= 25;
                }

                sa = 113;
                if (y % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (y >= (getHeight()))
                {
                    y = -100;
                } else {
                    y += 25;
                }
                sa = 293;
                if (y % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (x <= -100)
                {
                    x = 800;
                } else {
                    x -= 25;
                }

                sa = 200;
                if (x % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }

            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (x >= (getWidth()))
                {
                    x = -100;
                } else {
                    x += 25;
                }

                sa = 23;
                if (x % 2 == 0) {
                    mouth = 360;
                } else {
                    mouth = 315;
                }

            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            score = 0;
        }

        if (x + pacmanSize - 25 > xFood && y + pacmanSize - 25 > yFood
                && x < xFood + foodSize && y < yFood + foodSize) {
            xFood = new Random().nextInt(getWidth() - 150) + 50;
            yFood = new Random().nextInt(getHeight() - 150) + 50;
            score += 1;

        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
// our activity today is the AVL Tree, we need to create 3 outputs in a one dimensional array..