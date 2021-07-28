package com.gmail.cyrusmahle24;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
/**@author           :Nyakama Mahle
 * @Date             :Created 25/July/2021
 * @Git_Hub          :Cyrus-mahle
 * @code_Description :Class that Creates  frame  with text Fields ,buttons and labels and that results
 *                    to a calculator that let the user(4th grades or below) to do addition of integers 
 *
 */
public class Calculator extends JFrame implements ActionListener{
	
	
	ImageIcon image = new ImageIcon("PLUS.png");
		
	private JLabel lblnum1 = new JLabel("Enter number1");
	private JLabel lblnum2 = new JLabel("Enter number2");
	private JLabel lblAns = new JLabel("Number1 + number2 =");
	
	private JTextField textNO1 = new JTextField(10);
	private JTextField textNO2 = new JTextField(10);
	private JTextField textANS = new JTextField(10);
	
	private JButton btnPlus = new JButton(" + ");
	private JButton btnClear = new JButton(" Clear ");
	private JButton btnExit = new JButton("Exit");
	
	public Calculator() {
		
		super("Addition Calculator(Positive numbers Only):Created By Nyakama Mahle");
	    setLayout(new GridLayout(5,2,5,5));
        setIconImage(image.getImage());
        add(image.getImage());
        
	    add(lblnum1);
	    add(textNO1);
	    
	    add(lblnum2);
	    add(textNO2);
	                      
	    add(lblAns);
	    add(textANS);
	    textANS.setEditable(false);
	    
	    
	    add(btnPlus);
	    add(btnClear);
	    add(btnExit);
	    pack();
	    btnPlus.addActionListener(this);
	    btnClear.addActionListener(this);
	    btnExit.addActionListener(this);
	    setBackground(Color.CYAN);
	    getContentPane().setBackground(getBackground());
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	
		
	}

	private void add(Image image2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
    Object source = e.getSource();
    
    if(source==btnPlus) {
    	try {
    		
    		int number1 = Integer.parseInt(textNO1.getText());
    		int number2 = Integer.parseInt(textNO2.getText());
    		
    		PositiveInteger pnummber1 = new PositiveInteger(number1);
    		PositiveInteger pnummber2 = new PositiveInteger(number2);
    		
    		Integer sum = new Integer(number1 + number2);
    		textANS.setText(sum.toString());
    	} 
    	

    	catch(NumberFormatException nf) {
    		JOptionPane.showMessageDialog(null,"Invalid number");
    	}
    	
    	catch(NegativeNumberException nne) {
    		JOptionPane.showMessageDialog(null,nne.getMessage());
    	}
    	if(source==btnExit) {
    		
    		System.exit(0);
    		
    	}
    	else if(source ==btnClear) {
    		textNO1.setText("");
    		textNO2.setText("");
    		textANS.setText("");
    		
    	}
    }
		
	}
	

}
