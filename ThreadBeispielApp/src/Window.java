import javax.swing.*;
import java.awt.*;

public class Window {

	
	private JFrame f;
	private JTextArea t;
	private JScrollPane s;
	
	public Window (String string){
		
		gui(string);
	}
	
	public void gui(String string){
		
		f = new JFrame("Rennverlauf");
		f.setVisible(true);
		//f.setSize(400, 1040);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		
		
		t = new JTextArea(60,30);
		t.setText(string);
		s = new JScrollPane(t);
		f.getContentPane().add(s);
		f.pack();
	}
	
}
