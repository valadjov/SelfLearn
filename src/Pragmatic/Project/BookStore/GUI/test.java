package Pragmatic.Project.BookStore.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class test extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static final LayoutManager GridLayout = null;
	//LABEL VARS
	private JLabel labelName = new JLabel("Name ");
	private JLabel labelAuthor = new JLabel("Author ");
	private JLabel labelPrice = new JLabel("Price ");
	private JLabel labelPublisher = new JLabel("Publisher ");
	private JLabel labelOrigin = new JLabel("Origin ");
	private JLabel labelStock = new JLabel("Stock Count ");
	// END OF LABEL VARS
	
	
	
	// FIELD VARS
	private JTextField nameField = new JTextField();
	private JTextField authorField = new JTextField();
	private JTextField priceField = new JTextField();
	private JTextField publisherField = new JTextField();
	private JTextField originField = new JTextField();
	private JTextField stockField = new JTextField();

	// END OF FIELD VARS
	
	//button
	private JButton addButton = new JButton("ADD");
	private JButton cancelButton = new JButton("CANCEL");
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private final JSeparator separator_4 = new JSeparator();
	private final JSeparator separator_5 = new JSeparator();
	private final JSeparator separator_6 = new JSeparator();
	private final JSeparator separator_7 = new JSeparator();
	
	
	public test(){
		createUI();
	}
	
	private void createUI(){
		setTitle("Main Menu");
		setSize(433, 400);
	    getContentPane().setLayout(null);
	    
	    //labels setting:
	    labelName.setBounds(20, 20, 200, 30);
	    labelName.setFont(labelName.getFont().deriveFont(20f));
	    getContentPane().add(labelName);	    
	    
	    labelAuthor.setBounds(20, 20, 200, 140);
	    labelAuthor.setFont(labelAuthor.getFont().deriveFont(20f));
	    getContentPane().add(labelAuthor);	    
	    labelPrice.setBounds(20, 20, 200, 240);	   
	    labelPrice.setFont(labelPrice.getFont().deriveFont(20f));
	    getContentPane().add(labelPrice);
	    
	    labelPublisher.setBounds(20, 20, 200, 340);
	    labelPublisher.setFont(labelPublisher.getFont().deriveFont(20f));
	    getContentPane().add(labelPublisher);
	    
	    labelOrigin.setBounds(20, 20, 200, 440);
	    labelOrigin.setFont(labelOrigin.getFont().deriveFont(20f));
	    getContentPane().add(labelOrigin);
	    
	    labelStock.setBounds(20, 20, 200, 540);
	    labelStock.setFont(labelStock.getFont().deriveFont(20f));
	    getContentPane().add(labelStock);
	    
	    //field setting:
	    nameField.setBounds(100, 20, 150, 30);
	    getContentPane().add(nameField);
	    
	    authorField.setBounds(100, 78, 150, 30);
	    getContentPane().add(authorField);
	    
	    priceField.setBounds(100, 130, 150, 30);
	    getContentPane().add(priceField);
	    
	    publisherField.setBounds(120, 178, 150, 30);
	    getContentPane().add(publisherField);
	    
	    originField.setBounds(100, 230, 150, 30);
	    getContentPane().add(originField);
	    
	    stockField.setBounds(150, 280, 150, 30);
	    getContentPane().add(stockField);
	    addButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	}
	    });
	    
	    // buttons setting
	    addButton.setBounds(306, 20, 100, 100);
	    getContentPane().add(addButton);
	    cancelButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    
	    cancelButton.setBounds(306, 130, 100, 100);
	    getContentPane().add(cancelButton);
	    
	    JSeparator separator = new JSeparator();
	    separator.setBounds(110, 63, 1, 2);
	    getContentPane().add(separator);
	    separator_1.setBounds(12, 63, 289, 2);
	    
	    getContentPane().add(separator_1);
	    separator_2.setBounds(12, 118, 394, 2);
	    
	    getContentPane().add(separator_2);
	    separator_3.setBounds(12, 173, 288, -8);
	    
	    getContentPane().add(separator_3);
	    separator_4.setBounds(7, 178, 293, -8);
	    
	    getContentPane().add(separator_4);
	    separator_5.setBounds(12, 178, 289, 2);
	    
	    getContentPane().add(separator_5);
	    separator_6.setBounds(20, 228, 280, 2);
	    
	    getContentPane().add(separator_6);
	    separator_7.setBounds(7, 280, 399, 2);
	    
	    getContentPane().add(separator_7);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
