package event1;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class abc extends JFrame implements ActionListener
{
    JTextField tf=new JTextField();
    abc()
    {
     getContentPane().setBackground(Color.pink); 
     tf.setBounds(115,50,250,40);
     JButton b1=new JButton("RED");
     b1.setBounds(100,150,80,30);
     JButton b2=new JButton("GREEN");
     b2.setBounds(200,150,80,30);
     JButton b3=new JButton("BLUE");
     b3.setBounds(300,150,80,30);
     b1.addActionListener(this);
       b2.addActionListener(this);
         b3.addActionListener(this);
         add(b1);
         add(b2);
         add(b3);
         add(tf);
setSize(600,400);
setLayout(null);
setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="RED")
        {
            tf.setText("you have selected red color");
            getContentPane().setBackground(Color.red);
        }
         if(e.getActionCommand()=="GREEN")
        {
            tf.setText("you have selected green color");
            getContentPane().setBackground(Color.green);
        }
        if(e.getActionCommand()=="BLUE")
        {
            tf.setText("you have selected blue color");
            getContentPane().setBackground(Color.blue);
        }
    }

}
public class Event1 
{
    public static void main(String[] args)
    {
        abc ob=new abc();
    }
    
}
