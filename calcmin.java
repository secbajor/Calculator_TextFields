import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class calcmin extends JFrame implements ActionListener{
	
	JPanel pane = new JPanel(new GridLayout(5,4));
	JLabel bl1 = new JLabel("num1: "); 
	JLabel bl2 = new JLabel("num2: ");
	JLabel bla = new JLabel("ans: ");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton quit = new JButton("QUIT");
	JButton clear = new JButton("CLEAR");
	
	//add an image 
	//ImageIcon image = new ImageIcon("image/img1.jpg");
	//JLabel imglab = new JLabel("", image, JLabel.CENTER);
	
	JTextField num1 = new JTextField(7); 
	JTextField num2 = new JTextField(7);
	JTextField ans = new JTextField(9);
	
	
	public double add(String num1, String num2)
	{
		double ans = 0; 
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		ans = n1+n2; 
		
		return ans; 
	}

	calcmin() 
	  {
		super("My First GUI"); setBounds(200,200,300,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    
		Container con = this.getContentPane(); 
		con.add(pane);
		//con.setContentPane(bl1); 
		//pane.add(imglab, BorderLayout.CENTER );
		//aesthetics
		//pane.setBackground(Color.GREEN);
		//pane.setBorder(BorderFactory.createTitledBorder("I <3 iD TECH CAMP"));
		
		pane.add(plus); 
		pane.add(minus);
		pane.add(quit);
		pane.add(clear);
		pane.add(bl1);
		pane.add(num1);
		pane.add(bl2); 
		pane.add(num2); 
		pane.add(bla); 
		pane.add(ans); 
		//ans.setEditable(false); 
		//bl1.setFont(new Font("Serif", Font.PLAIN, 14));
		//plus.setForeground(Color.blue); 
		//bl1.setForeground(Color.red); 
		
		setVisible(true); // make frame visible
		
		clear.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		quit.addActionListener(this);
	  }

	public void actionPerformed(ActionEvent event)
	  {
		Object source = event.getSource();
		if (source == quit)
	    {
	      System.exit(0);
	    }
		else if(source==plus)
		{
			ans.setText("");
			double x = Double.parseDouble(num1.getText()); 
			double y = Double.parseDouble(num2.getText());
			ans.setText(ans.getText()+(x+y));
			//ans.setText(ans.getText()+add(num1.getText(), num2.getText())); 
			/**
			ans.setText("");
			String s = num1.getText();
			int n1 = Double.parseDouble(s); 
			//String t = num2.getText(); 
			//int n2 = Double.parseDouble(t); 
			ans.setText(ans.getText()+n1);
			*/ 
			
		}
		else if(source==minus)
		{
			ans.setText("");
			String s = num1.getText();
			double n1 = Double.parseDouble(s); 
			
			String t = num2.getText(); 
			double n2 = Double.parseDouble(t);
			
			
			ans.setText(ans.getText()+(n1-n2)); 
			//.append(ans.getText()+"whee"); 
		}
		else if(source==clear)
		{
			ans.setText("");
			num1.setText("");
			num2.setText("");
		}
	  }
	
	  public static void main(String args[]) 
	  {
		  new calcmin();
	  }

}
