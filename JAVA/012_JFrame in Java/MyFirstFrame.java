import java.awt.*;

import javax.swing.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame obj = new JFrame();

        obj.setVisible(true);
        // obj.setSize(500, 500);
        // obj.setLocation(500, 200);
        obj.setBounds(500, 200, 666, 555);
        obj.setTitle("My First Frame");
        obj.setResizable(false);

        Container c = obj.getContentPane();
        c.setBackground(Color.cyan);
    }
}
