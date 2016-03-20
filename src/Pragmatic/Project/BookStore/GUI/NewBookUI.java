package Pragmatic.Project.BookStore.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewBookUI extends JFrame implements ActionListener{

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
	
	
	
	public NewBookUI(){
		createUI();
	}
	
	private void createUI(){
		setTitle("Main Menu");
		setSize(730, 400);
	    setLayout(null);
	    
	    //labels setting:
	    labelName.setBounds(20, 20, 200, 30);
	    labelName.setFont(labelName.getFont().deriveFont(20f));
	    add(labelName);	    
	    
	    labelAuthor.setBounds(20, 20, 200, 140);
	    labelAuthor.setFont(labelAuthor.getFont().deriveFont(20f));
	    add(labelAuthor);	    
	    labelPrice.setBounds(20, 20, 200, 240);	   
	    labelPrice.setFont(labelPrice.getFont().deriveFont(20f));
	    add(labelPrice);
	    
	    labelPublisher.setBounds(20, 20, 200, 340);
	    labelPublisher.setFont(labelPublisher.getFont().deriveFont(20f));
	    add(labelPublisher);
	    
	    labelOrigin.setBounds(20, 20, 200, 440);
	    labelOrigin.setFont(labelOrigin.getFont().deriveFont(20f));
	    add(labelOrigin);
	    
	    labelStock.setBounds(20, 20, 200, 540);
	    labelStock.setFont(labelStock.getFont().deriveFont(20f));
	    add(labelStock);
	    
	    //field setting:
	    nameField.setBounds(100, 20, 150, 30);
	    add(nameField);
	    
	    authorField.setBounds(100, 78, 150, 30);
	    add(authorField);
	    
	    priceField.setBounds(100, 130, 150, 30);
	    add(priceField);
	    
	    publisherField.setBounds(120, 178, 150, 30);
	    add(publisherField);
	    
	    originField.setBounds(100, 230, 150, 30);
	    add(originField);
	    
	    stockField.setBounds(150, 280, 150, 30);
	    add(stockField);
	    
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
