import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form11 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel p1,p2;

    public Form11()
    {
        super(" Page-3 ");
        this.setSize(650,430);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,330));
        p1.setBackground(Color.black);
        p1.setLayout(null);

        l1 = new JLabel("About Facilities");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.BLUE);
		l1.setBounds(225,30,190,50);
		p1.add(l1);

        b1 = new JButton("Add Entry");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.blue);
        b1.setBounds(200,120,200,25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Existing Entry");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.blue);
        b2.setBounds(200,160,200,25);
        b2.addActionListener(this);
        p1.add(b2);
		
		p2 = new JPanel();
        p2.setSize(new Dimension(450,100));
        p2.setBackground(Color.gray);
        p2.setLayout(null);
		
		
		//l4=new JLabel();
	    //l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		//l4.setForeground(Color.white);
		//l4.setBounds(180,300,150,20);
		//p2.add(l4);


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
        if(ae.getSource()==b1)
        {
			String di = JOptionPane.showInputDialog("Enter Facility");

			String num1 = String.valueOf(String.valueOf(di));

            JOptionPane.showMessageDialog(null, "Facility Inserted Successfully");
        }

        else if(ae.getSource()==b2)
        {
            Form12 f = new Form12();
            this.setVisible(false);
            f.setVisible(true);
        }
		 else if(ae.getSource()== b4)
        {
           Form10 f = new Form10();
           this.setVisible(false);
           f.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
    }
}