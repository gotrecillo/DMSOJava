package gui;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyJDialog extends JDialog{
	
	protected final String os = System.getProperty("os.name").toLowerCase();
	protected FlowLayout flow = new FlowLayout();
	
	public void initiate(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(flow);
		setVisible(true);
		}
	
	public MyJDialog(){
		super();
	}
	
	public MyJDialog(String title, JDialog owner, boolean b){
		super(owner, b);
		setTitle(title);
	}
	
	public MyJDialog(String title, Frame owner, boolean b){
		super(owner, b);
		setTitle(title);
	}
	
	public MyJDialog(String title, Frame owner){
		super(owner);
		setTitle(title);
	}

}
