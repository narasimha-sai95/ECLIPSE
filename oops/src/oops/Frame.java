package oops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.lang.*;
class Frame
{
  public static void main(String[] args)throws Exception
  {
    JFrame f = new JFrame("Login Page");
    JPanel p=new JPanel();
    JTextField tf=new JTextField ();
    JPasswordField passwordtextfield = new JPasswordField();
    passwordtextfield.setBounds(100,150, 200,30);
    JLabel passwordlabel = new JLabel("Password:");
    passwordlabel.setBounds(20,150,80,30);
    JLabel usernamelabel = new JLabel("Username:");
    usernamelabel.setBounds(20,100,80,30);
    JTextField usernametextfield =new JTextField();
    usernametextfield.setBounds(100,100, 200,30);
    JButton b=new JButton("SUBMIT");
    b.setBounds(100,190,100,30);
    JLabel l1=new JLabel("SUBJECTS =");
    l1.setBounds(100,100,80,20);
    JLabel l2=new JLabel("FACULTY  =");
    l2.setBounds(310,100,80,20);
    JLabel l3=new JLabel("SECTIONS =");
    l3.setBounds(540,100,80,20);
    JLabel l4=new JLabel(" (1) How is the teacher interacting with students");
    l4.setBounds(200,200,400,20);
    JLabel l5=new JLabel(" (2) Is the teacher able to teach concepts clearly");
    l5.setBounds(200,300,400,20);
    JLabel l6=new JLabel(" (3) How would you rate your interaction with the teacher");
    l6.setBounds(200,400,400,20);
    JLabel l7=new JLabel(" (4) How well is the teacher prepared for the class");
    l7.setBounds(200,500,400,20);
    JButton b1=new JButton("Click me");
    b1.setBounds(200,600,100,20);
    String arr1[]={"SCIENCE","MATHS","BIOLOGY","SOCIAL","TELUGU","HINDHI"};
    String arr2[]={"KRISHNA","SREE HARSHA","GOWTHAM","HARSHA","AKHIL"};
    String arr3[]={"ALPHA","BETA","GAMMA","DELTA","EPSILON","ZETA"};
    JComboBox jc1=new JComboBox(arr1);
    jc1.setBounds(200,100,90,20);
    JComboBox jc2=new JComboBox(arr2);
    jc2.setBounds(420,100,110,20);
    JComboBox jc3=new JComboBox(arr3);
    jc3.setBounds(640,100,120,20);
    JRadioButton jb1=new JRadioButton("excellent");
    jb1.setBounds(210,240,90,20);
    JRadioButton jb2=new JRadioButton("good");
    jb2.setBounds(310,240,90,20);
    JRadioButton jb3=new JRadioButton("average");
    jb3.setBounds(410,240,90,20);
    JRadioButton jb4=new JRadioButton("excellent");
    jb4.setBounds(210,340,90,20);
    JRadioButton jb5=new JRadioButton("good");
    jb5.setBounds(310,340,90,20);
    JRadioButton jb6=new JRadioButton("average");
    jb6.setBounds(410,340,90,20);
    JRadioButton jb7=new JRadioButton("excellent");
    jb7.setBounds(210,440,90,20);
    JRadioButton jb8=new JRadioButton("good");
    jb8.setBounds(310,440,90,20);
    JRadioButton jb9=new JRadioButton("average");
    jb9.setBounds(410,440,90,20);
    JRadioButton jb10=new JRadioButton("excellent");
    jb10.setBounds(210,530,90,20);
    JRadioButton jb11=new JRadioButton("good");
    jb11.setBounds(310,530,90,20);
    JRadioButton jb12=new JRadioButton("average");
    jb12.setBounds(410,530,90,20);
    JLabel finallabel = new JLabel("Your feedback has been completed!");
    finallabel.setBounds(100,100,400,100);
    p.add(usernametextfield);
    p.add(passwordtextfield);
    p.add(usernamelabel);
    p.add(passwordlabel);
    p.add(b);
    f.add(p);
    f.setSize(700,700);
    p.setLayout(null);
    f.setVisible(true);

   //......................OPTION ACTION.....................

   b.addActionListener(new ActionListener()
   {
       public void actionPerformed(ActionEvent e)
       {
          JFrame f = new JFrame("OPTION");
          JPanel p = new JPanel();
          p.add(l1);
          p.add(l2);
          p.add(l3);
          p.add(l4);
          p.add(l5);
          p.add(l6);
          p.add(l7);
          p.add(jc1);
          p.add(jc2);
          p.add(jc3);
          p.add(jb1);
          p.add(jb2);
          p.add(jb3);
          p.add(jb4);
          p.add(jb5);
          p.add(jb6);
          p.add(jb7);
          p.add(jb8);
          p.add(jb9);
          p.add(jb10);
          p.add(jb11);
          p.add(jb12);
          p.add(b1);
          f.add(p);


       f.setSize(700,700);
       p.setLayout(null);
       f.setVisible(true);

    }
  });
  b1.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
         JFrame f = new JFrame();
         JPanel p = new JPanel();
         p.add(finallabel);
         f.add(p);
      f.setSize(700,700);
      p.setLayout(null);
      f.setVisible(true);

   }
 });


  }
}

