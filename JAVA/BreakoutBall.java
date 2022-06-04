import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.KeyListener;
import javax.swing.Timer;
import java.util.concurrent.BlockingQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;


class CreateGame extends JPanel implements KeyListener, ActionListener{

    private boolean play = false;
    private int score = 0;

    private int totalBricks = 40;

    private Timer timer;
    private int delay = 8;

    private int playerX = 310;
    
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    private CreateBricks brick;

    public CreateGame() {
        brick = new CreateBricks(5, 8);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer (delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        //Create Background
        g.setColor(Color.black);
        g.fillRect(1, 1, 880, 800);

        //Create Bricks
        brick.draw((Graphics2D)g);

        //Create Borders
        g.setColor(Color.magenta);
        g.fillRect(0, 0, 4, 800);
        g.fillRect(0, 0, 880, 4);
        g.fillRect(880, 0, 4, 800);

        //Scores
        g.setColor(Color.cyan);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString(""+score, 820, 30);

        //Create Paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 580, 100, 8);

        //Create Ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20);

        if (totalBricks <= 0){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.yellow);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("You Won", 360, 350);
            g.drawString("Scores : "+score, 350, 390);
            g.setColor(Color.yellow);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart the Game", 300, 420);
        }

        if (ballposY > 650){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over, Scores : "+score, 300, 350);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart the Game", 300, 390);   
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
            if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 580, 100, 8))){
                ballYdir = -ballYdir;
            }

            U:  for (int i=0; i<brick.bricks.length; i++){
                    for (int j=0; j<brick.bricks[0].length; j++){
                        if(brick.bricks[i][j] > 0){
                            int brickX = j*brick.brickWidth+80;
                            int brickY = i*brick.brickHeight+50;
                            int brickWidth = brick.brickWidth;
                            int brickHeight = brick.brickHeight;

                            Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                            Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                            Rectangle brickRect = rect;

                            if (ballRect.intersects(brickRect)){
                                brick.setBrickValue(0, i, j);
                                totalBricks--;
                                score += 5;

                                if (ballposX+19 <= brickRect.x || ballposX+1 >= brickRect.x + brickRect.width){
                                    ballXdir = -ballXdir;
                                }
                                else{
                                    ballYdir = -ballYdir;
                                }
                                break U;
                            }
                        }
                    }
                }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if (ballposX < 0) {
                ballXdir = -ballXdir;
            }
            if (ballposY < 0) {
                ballYdir = -ballYdir;
            }
            if (ballposX >= 870) {
                ballXdir = -ballXdir;
            }
        } 
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if (playerX >= 780){
                playerX = 780;
            }
            else{
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if (playerX <= 11){
                playerX = 11;
            }
            else{
                moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if (!play){
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir  = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 60;
                brick = new CreateBricks(5, 8);

                repaint();
            }
        }
    }

    public void moveRight() {
        play = true;
        playerX += 50;
    }
    public void moveLeft() {
        play = true;
        playerX -= 50;
    }
}

class CreateBricks {
    int bricks[][];
    int brickWidth, brickHeight;

    CreateBricks(int row, int col) {
        bricks = new int [row][col];
        for (int i=0; i<bricks.length; i++){
            for(int j=0; j<bricks[0].length; j++){
                bricks[i][j] = 1;
            }
        }
        brickWidth = 720/col;
        brickHeight =  240/row;
    }

    public void draw(Graphics2D g){
        for (int i=0; i<bricks.length; i++){
            for(int j=0; j<bricks[0].length; j++){
                if (bricks[i][j] > 0){
                    g.setColor(Color.white);
                    g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col){
        bricks[row][col] = value;
    }
}


public class BreakoutBall {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        CreateGame gamePlay = new CreateGame();
        obj.setBounds(400, 100, 900, 650);
        obj.setTitle("_Breakout Ball_");
        //obj.setResizable(false);
        obj.setVisible(true);
        //obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}