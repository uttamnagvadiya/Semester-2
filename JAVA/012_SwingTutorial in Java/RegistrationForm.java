
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel label1, label2, label3, label4, label5, label6, msg;
    JTextField t1, t2, t3;
    JRadioButton male, female;
    JTextArea area, screen;
    JComboBox day, month, year;
    JCheckBox terms;
    JButton submit;
    
    MyFrame(){
        setTitle("Registration Form");
        setBounds(300, 100, 900, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(null);


        Border BevelRaised = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        Border SoftBevelLowered = BorderFactory.createSoftBevelBorder(SoftBevelBorder.LOWERED);
        Border EtchedBorder = BorderFactory.createEtchedBorder();
        Border LineBorder = BorderFactory.createLineBorder(Color.BLACK);

        label1 = new JLabel();
        t1 = new JTextField();
        label1.setText("UserName :");
        label1.setBounds(50, 50, 100, 30);
        label1.setBorder(SoftBevelLowered);
        t1.setBounds(200, 50, 250, 30);
        t1.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        c.add(label1);
        c.add(t1);

        label2 = new JLabel();
        t2 = new JTextField();
        label2.setText("Age :");
        label2.setBounds(50, 100, 100, 30);
        label2.setBorder(SoftBevelLowered);
        t2.setBounds(200, 100, 50, 30);
        t2.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        c.add(label2);
        c.add(t2);

        label3 = new JLabel();
        t3 = new JTextField();
        label3.setText("Mobile No :");
        label3.setBounds(50, 150, 100, 30);
        label3.setBorder(SoftBevelLowered);
        t3.setBounds(200, 150, 250, 30);
        t3.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        c.add(label3);
        c.add(t3);
        
        label4 = new JLabel();
        label4.setText("Gender :");
        label4.setBounds(50, 200, 100, 30);
        label4.setBorder(SoftBevelLowered);
        male = new JRadioButton();
        female = new JRadioButton();
        male.setText("Male");
        male.setBounds(200, 200, 80, 30);
        male.setSelected(true);
        female.setText("Female");
        female.setBounds(300, 200, 80, 30);
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);
        c.add(label4);
        c.add(male);
        c.add(female);

        label5 = new JLabel();
        label5.setText("Date of Birth :");
        label5.setBounds(50, 250, 100, 30);
        label5.setBorder(SoftBevelLowered);
        String [] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String [] months = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        String [] years = {"1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);
        day.setBounds(200, 250, 50, 30);
        month.setBounds(280, 250, 50, 30);
        year.setBounds(360, 250, 60, 30);
        c.add(label5);
        c.add(day);
        c.add(month);
        c.add(year);

        label6 = new JLabel();
        label6.setText("Address :");
        label6.setBounds(50, 325, 100, 30);
        label6.setBorder(SoftBevelLowered);
        area = new JTextArea();
        area.setBounds(200, 300, 250, 80);
        area.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        c.add(label6);
        c.add(area);

        terms = new JCheckBox();
        terms.setText("Please Accept Terms & Conditions.");
        terms.setBounds(75, 425, 250, 30);
        c.add(terms);
        
        submit = new JButton();
        submit.setText("Submit");
        submit.setBounds(75, 475, 80, 30);
        submit.addActionListener(this);
        c.add(submit);


        screen = new JTextArea();
        screen.setBounds(470, 60, 400, 420);
        screen.setFont(new Font("Arial", Font.CENTER_BASELINE, 13));
        c.add(screen);

        msg = new JLabel();
        msg.setBounds(250, 525, 400, 30);
        c.add(msg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(terms.isSelected()){
            msg.setText("Registration is Successfully!");

            String name = t1.getText();
            String age = t2.getText();
            String mobileNo = t3.getText();
            String gender = "Male";
            if(female.isSelected()){
                gender = "Female";
            }
            String dob = day.getSelectedItem()+"  "+month.getSelectedItem()+", "+year.getSelectedItem();
            String address = area.getText();

            screen.setText("UserName : "+name+"\n"+"Age : "+age+"\n"+"Mobile No : "+mobileNo+"\n"+"Gender : "+gender+"\n"+"Birth Date : "+dob+"\n"+"Address : "+address);

        }
        else{
            msg.setText("Please Accept the Terms & Conditions.");
        }
        
    }


}




public class RegistrationForm {
    public static void main(String[] args) {
        MyFrame frm = new MyFrame();
        
    }
}
        

       