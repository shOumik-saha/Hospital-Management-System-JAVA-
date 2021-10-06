import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form10 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    //JTextField t1,t2;
    JButton b3,b4,b5;
    JPanel p1,p2;

    public Form10()
    {
        super(" Page-2 ");
        this.setSize(2700,2300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(2700,2300));
        p1.setBackground(Color.black);
        p1.setLayout(null);


        l1 = new JLabel("LABORATORY SECTION");
        l1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.setForeground(Color.blue);
        l1.setBounds(200,60,200,25);
        //l1.addActionListener(this);
        p1.add(l1);

        l2 = new JLabel("Fecilities              Cost");
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l2.setForeground(Color.blue);
        l2.setBounds(200,100,800,30);
        //l2.addActionListener(this);
        p1.add(l2);

        l3 = new JLabel("---------------------------------------------------");
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l3.setForeground(Color.blue);
        l3.setBounds(200,140,800,30);
        //l3.addActionListener(this);
        p1.add(l3);

        l4 = new JLabel("X-ray                   800");
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l4.setForeground(Color.blue);
        l4.setBounds(200,180,800,30);
        //l4.addActionListener(this);
        p1.add(l4);

        l5 = new JLabel("CT Scan                 1200");
        l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l5.setForeground(Color.blue);
        l5.setBounds(200,220,800,30);
        //l5.addActionListener(this);
        p1.add(l5);

        l6 = new JLabel("OR Scan                 500");
        l6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l6.setForeground(Color.blue);
        l6.setBounds(200,260,800,30);
        //l6.addActionListener(this);
        p1.add(l6);
		
	    l7 = new JLabel("Blood Bank              50");
        l7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l7.setForeground(Color.blue);
        l7.setBounds(200,300,800,30);
        p1.add(l7);
		
		p2 = new JPanel();
        p2.setSize(new Dimension(450,100));
        p2.setBackground(Color.gray);
        p2.setLayout(null);
		
		
		l8=new JLabel();
	    l8.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l8.setForeground(Color.white);
		l8.setBounds(180,300,150,20);
		p2.add(l8);


        b3 = new JButton("Exit");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.white);
        b3.setBackground(Color.green);
        b3.setBounds(400,445,80,50);
        b3.addActionListener(this);
        p2.add(b3);
		
		

        b4 = new JButton("Back");
        b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b4.setForeground(Color.white);
        b4.setBackground(Color.green);
        b4.setBounds(100,445,80,50);
        b4.addActionListener(this);
        p2.add(b4);
		
        b5 = new JButton("Main Menu");
        b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b5.setForeground(Color.white);
        b5.setBackground(Color.green);
        b5.setBounds(700,445,120,50);
        b5.addActionListener(this);
        p2.add(b5);		


        this.add(p1);
        this.add(p2);
    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b4)
        {
           Form9 f = new Form9();
           this.setVisible(false);
           f.setVisible(true);
        }

        else if(ae.getSource()==b5)
        {
            Form2 f = new Form2();
            this.setVisible(false);
            f.setVisible(true);
        }

        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
    }
}
