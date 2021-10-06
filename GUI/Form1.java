import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b2;
    JPanel p1,p2,p3;

    public Form1()
    {
        super(" Page-1 ");
        this.setSize(550,540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(15,90,500,380);
        p1.setBackground(Color.black);
        p1.setLayout(null);

        l2 = new JLabel("Username :");
        l2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        l2.setForeground(Color.blue);
        l2.setBounds(110,100,150,20);
        p1.add(l2);

        l3 = new JLabel("Password :");
        l3.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        l3.setForeground(Color.blue);
        l3.setBounds(110,150,150,20);
        p1.add(l3);

        t1 = new JTextField();
        t1.setBounds(230,100,140,25);
        p1.add(t1);

        t2 = new JTextField();
        t2.setBounds(230,150,140,25);
        p1.add(t2);

        p2 = new JPanel();
        p2.setSize(new Dimension(600,90));
        p2.setBackground(Color.white);
        p2.setLayout(null);

        l1 = new JLabel(" LogIn ");
        l1.setFont(new Font("Serif",Font.BOLD,32));
        l1.setForeground(Color.green);
        l1.setBounds(210,24,190,37);
        p2.add(l1);

        l4 = new JLabel();
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        l4.setForeground(Color.white);
        l4.setBounds(390,300,150,20);
        p2.add(l4);

        b2 = new JButton("Login");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.black);
        b2.setBackground(Color.yellow);
        b2.setBounds(190,235,115,40);
        b2.addActionListener(this);
        p1.add(b2);

        p3 = new JPanel();
        p3.setSize(new Dimension(500,380));
        p3.setBackground(Color.blue);
        p3.setLayout(null);

        this.add(p1);
        this.add(p2);
        this.add(p3);
    }

    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource()==b2)
        {

                Form2 f = new Form2();
                this.setVisible(false);
                f.setVisible(true);
        }
    }

}