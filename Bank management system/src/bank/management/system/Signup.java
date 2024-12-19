package bank.management.system;


import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.RandomAccess;

import java.text.SimpleDateFormat;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCy, textState, textPin;
    JDateChooser dataChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon( ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(390,90,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Detials");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(340,120,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(100,180,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,180,400,30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel domLabel = new JLabel("Date of Birth :");
        domLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        domLabel.setBounds(100, 340, 200, 30); // Position of the label
        add(domLabel);

        dataChooser = new JDateChooser();
        dataChooser.setForeground(new Color(105, 105, 105));
        dataChooser.setBounds(300, 340, 400, 30); // Position of the date chooser
        add(dataChooser);


        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("raleway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("raleway", Font.BOLD, 14));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("raleway", Font.BOLD, 14));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(450,290,100,30);
        add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField("");
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);


        m1 = new JRadioButton("Married");
        m1.setFont(new Font("raleway", Font.BOLD, 14));
        m1.setBackground(new Color(215,252,252));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("raleway", Font.BOLD, 14));
        m2.setBackground(new Color(215,252,252));
        m2.setBounds(410,440,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("raleway", Font.BOLD, 14));
        m3.setBackground(new Color(215,252,252));
        m3.setBounds(540,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);



        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,490,200,30);
        add( labelAdd);

        textAdd = new JTextField("");
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCy = new JLabel("City :");
        labelCy.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCy.setBounds(100,540,200,30);
        add(labelCy);

        textCy = new JTextField("");
        textCy.setFont(new Font("Raleway", Font.BOLD, 14));
        textCy.setBounds(300, 540, 400, 30);
        add(textCy);


        JLabel labelPin = new JLabel("Pin code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(300, 700, 400, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);
        setSize(850, 800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();

        Date selectedDate = dataChooser.getDate();
        String dob = null;
        if (selectedDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dob = dateFormat.format(selectedDate);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid Date of Birth.");
            return;
        }
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Fmale";
        }

        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCy.getText();
        String pincode = textPin.getText();
        String state = textState.getText();


        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Cone con1 = new Cone();  // Connecting to the database
                String q = "insert into signup values('" + formno + "', '" + name + "','" + fname + "','"+dob+"','" + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + pincode + "','" + state + "' )";
                con1.statement.executeUpdate(q);

                // Proceed to next page (Signup2)
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}
