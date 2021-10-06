import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form5 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel p1,p2;

    public Form5()
    {
        super(" Page-3 ");
        this.setSize(650,430);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(650,330));
        p1.setBackground(Color.black);
        p1.setLayout(null);

        l1 = new JLabel("About Patient");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.BLUE);
		l1.setBounds(235,30,190,50);
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
		
		b5 = new JButton("Remove Entry");
        b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b5.setForeground(Color.blue);
        b5.setBounds(200,200,200,25);
        b5.addActionListener(this);
        p1.add(b5);
		
		p2 = new JPanel();
        p2.setSize(new Dimension(450,100));
        p2.setBackground(Color.gray);
        p2.setLayout(null);


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
			String di = JOptionPane.showInputDialog("Enter ID");
            String dn = JOptionPane.showInputDialog("Enter Name");
			String ds = JOptionPane.showInputDialog("Enter Diseases");
			String dw = JOptionPane.showInputDialog("Enter Gender");
			String dq = JOptionPane.showInputDialog("Enter Admit Status");
			String dr = JOptionPane.showInputDialog("Enter Age");
			
			String num1 = String.valueOf(String.valueOf(di));
            String num2 = String.valueOf(String.valueOf(dn));
            String num3 = String.valueOf(String.valueOf(ds));
			String num4 = String.valueOf(String.valueOf(dw));
			String num5 = String.valueOf(String.valueOf(dq));
			String num6 = String.valueOf(String.valueOf(dr));
			
            JOptionPane.showMessageDialog(null, "patient Inserted Successfully");
        }

        else if(ae.getSource()==b2)
        {
            Form6 f = new Form6();
            this.setVisible(false);
            f.setVisible(true);
        }
		 else if(ae.getSource()== b4)
        {
           Form4 f = new Form4();
           this.setVisible(false);
           f.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
		else if(ae.getSource()==b5)
        {
			String a = JOptionPane.showInputDialog("Enter ID to remove entry");
			String num1 = String.valueOf(String.valueOf(a));
			JOptionPane.showMessageDialog(null, "Patient removed Successfully");
        }
    }
}