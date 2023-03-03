//Screen.java
//Represents the screen of the ATM

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Screen extends JFrame
{
    public JFrame Mainframe;
    public static JTextField Inputfield1;
    public static JTextField Inputfield2;
    public static JTextField Inputfield3;
    public static JTextField Inputfield4;

    public JLabel messageJLabel1;
    public JLabel messageJLabel2; // displays message of game status
    public JLabel messageJLabel3;
    public JLabel messageJLabel4;
    public JLabel messageJLabel5;
    public JLabel messageJLabel8;
    public JLabel messageJLabel9;
    public JLabel messageJLabel10;

    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton Exit;
    public int accnum = 0;
    public int PIN = 0;
    public JLabel messageJLabel6;
    public JLabel messageJLabel7;

    //displays a message without a carriage return
    public void displayMessage(String message)
    {
        System.out.print(message);

    }//end method displayMessage

    //display a message with a carriage return
    public void displayMessageLine(String message)
    {
        System.out.println(message);
    }//end method displayMessageLine

    //display a dollar amount
    public void displayDollarAmount(double amount)
    {
        System.out.printf("$%,.2f", amount);
    }//end method displayDollarAmount

    //create the login GUI
    public void createlogin(){

        Mainframe = new JFrame("ATM");
        messageJLabel4 = new JLabel("Insert your credit/debit card then   ");
        messageJLabel = new JLabel("Enter your PIN number: ");

        Inputfield1 = new JTextField(10);

        messageJLabel2 = new JLabel("       ");
        Inputfield2 = new JTextField(10);
        loginbutton = new JButton("Login");
        messageJLabel3 = new JLabel("");
        Mainframe.setLayout(new Flowlayout()); //set layout
        Mainframe.add(messageJLabel4);
        Mainframe.add(messageJLabel);//add first prompt

        Mainframe.add(Inputfield2);
        Mainframe.add(messageJLabel2);
        //Mainframe.add(loginbutton);
        //add message label
        Mainframe.add(messageJLabel3);
        Inputfield2.setEditable(false);
        Mainframe.repaint();
    }

    //create the main menu GUI
    public void createmenu(){
        Mainframe.getContentPane().removeAll();
        messageJLabel = new JLabel("Welcome");
        messageJLabel2 = new JLabel("1 - Balance");
        messageJLabel3 = new JLabel("2 - Withdrawal");
        messageJLabel4 = new JLabel("3 - Deposit");
        messageJLabel5 = new JLabel("4 - Exit");
        Mainframe.setLayout(new FlowLayout()); //set layout
        Mainframe.add(messageJLabel);
        Mainframe.add(messageJLabel2);//add first prompt
        Mainframe.add(messageJLabel3);//add second prompt
        Mainframe.add(messageJLabel4);//add message label
        Mainframe.add(messageJLabel5);
        Mainframe.repaint(); 
    }
    //create the Balance GUI
    public void createBalanceGUI(){
        Mainframe.getContentPane().removeAll();
        messageJLabel = new JLabel("Balance Information: ");
        messageJLabel2 = new JLabel("Available Balance: ");
        messageJLabel3 = new JLabel("Total Balance:");
        Exit = new JButton("Back");
        Mainframe.setLayout(new FlowLayout());
        Mainframe.add(messageJLabel);
        Mainframe.add(messageJLabel2);
        Mainframe.add(messageJLabel3);
        Mainframe.add(Exit);
        Mainframe.repaint();
    }


    




}