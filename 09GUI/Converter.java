import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener{
private Container pane;
private JButton b0 , b1;
private JTextField t;
private JCheckBox c;

public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	if(s.equals("Convert")){
	    try{
	    t.setText("" +( ((Double.parseDouble(t.getText()) - 32)* 5)/9));
	    }
	    catch(NumberFormatException f){
		t.setText("Enter another number");
	    }
	}
	else{
	    try{
		t.setText(""+ (Double.parseDouble(t.getText())*9 / 5 + 32));
	    }
	    catch(NumberFormatException f){
		t.setText(" Enter another number");
	    }
	}
    }
	

  public Converter() {
     this.setTitle("My first GUI");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout()); 
    
     b0 = new JButton("Convert");
     b1 = new JButton("Clear");
     t = new JTextField(15);
     c = new JCheckBox("Please check if it is currently in Celsius");
     pane.add(b0);
     pane.add(b1);
     pane.add(t);
     pane.add(c);
     
     b0.addActionListener(this);
     b1.addActionListener(this);
     t.addActionListener(this);
     c.addActionListener(this);
 }
  


  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Converter g = new Converter();
     g.setVisible(true);
  }
}