import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel p1,p2;

    public Form2()
    {
        super(" Page-2 ");
        this.setSize(550,540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,330));
        p1.setBackground(Color.black);
        p1.setLayout(null);


        b1 = new JButton("About Doctor");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.blue);
        b1.setBounds(200,60,200,25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("About Patient");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.blue);
        b2.setBounds(200,100,200,25);
        b2.addActionListener(this);
        p1.add(b2);

        b5 = new JButton("About Medicines");
        b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b5.setForeground(Color.blue);
        b5.setBounds(200,140,200,25);
        b5.addActionListener(this);
        p1.add(b5);

        b6 = new JButton("About Laboratories");
        b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b6.setForeground(Color.blue);
        b6.setBounds(200,180,200,25);
        b6.addActionListener(this);
        p1.add(b6);

        b7 = new JButton("About Facilities");
        b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b7.setForeground(Color.blue);
        b7.setBounds(200,220,200,25);
        b7.addActionListener(this);
        p1.add(b7);

        b8 = new JButton("About Staffs");
        b8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b8.setForeground(Color.blue);
        b8.setBounds(200,260,200,25);
        b8.addActionListener(this);
        p1.add(b8);
		
		p2 = new JPanel();
        p2.setSize(new Dimension(450,100));
        p2.setBackground(Color.gray);
        p2.setLayout(null);
		
		
		l4=new JLabel();
	    l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		p2.add(l4);


        b3 = new JButton("Exit");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.white);
        b3.setBackground(Color.green);
        b3.setBounds(360,345,80,30);
        b3.addActionListener(this);
        p2.add(b3);
		
		

        b4 = new JButton("Back");
        b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b4.setForeground(Color.white);
        b4.setBackground(Color.green);
        b4.setBounds(120,345,80,30);
        b4.addActionListener(this);
        p2.add(b4);


        this.add(p1);
        this.add(p2);
    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b1)
        {
           Form3 f = new Form3();
           this.setVisible(false);
           f.setVisible(true);
        }

        else if(ae.getSource()==b2)
        {
            Form5 f = new Form5();
            this.setVisible(false);
            f.setVisible(true);
        }
        else if(ae.getSource()==b5)
        {
            Form7 f = new Form7();
            this.setVisible(false);
            f.setVisible(true);
        }

        else if(ae.getSource()==b6)
        {
            Form9 f = new Form9();
            this.setVisible(false);
            f.setVisible(true);
        }

        else if(ae.getSource()==b7)
        {
            Form11 f = new Form11();
            this.setVisible(false);
            f.setVisible(true);
        }
        else if(ae.getSource()==b8)
        {
            Form13 f = new Form13();
            this.setVisible(false);
            f.setVisible(true);
        }
        else if(ae.getSource()==b4)
        {
            Form1 f = new Form1();
            this.setVisible(false);
            f.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
    }
}
