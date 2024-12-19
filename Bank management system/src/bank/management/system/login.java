package bank.management.system;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon( ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1 = new JLabel("Welcome To ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(250,125,450,40);
        add(label1);


        label2 = new JLabel("Enter Your Card No:");
        label2.setBounds(100, 190, 375, 30);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.lightGray);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(425, 190, 230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);


        label3 = new JLabel("Enter Your Pin:");
        label3.setBounds(100, 250, 375, 30);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.lightGray);
        add(label3);


        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(425, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));

        // Restrict input to 4 characters
        ((AbstractDocument) passwordField3.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if ((fb.getDocument().getLength() + string.length()) <= 4) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if ((fb.getDocument().getLength() + text.length() - length) <= 4) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        add(passwordField3);




        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));;
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(130, 330, 100, 30);
        button1.addActionListener(this);
        add(button1);


        button2 = new JButton("SIGN UP");
        button2.setFont(new Font("Arial", Font.BOLD, 14));;
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(330, 330, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CLEAR");
        button3.setFont(new Font("Arial", Font.BOLD, 14));;
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(530, 330, 100, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon( ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);



        setLayout(null);
        setSize( 850,480);
        setLocation( 450, 200);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1){
                Cone c = new Cone();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null,"INCORRECT CARD NUMBER OR PIN");
                }


            } else if (e.getSource() == button2) {
                new Signup();
                setVisible(false);

            } else if (e.getSource() == button3) {
                textField2.setText("");
                passwordField3.setText("");
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new login();
    }

}




