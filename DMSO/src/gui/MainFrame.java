package gui;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * 
 * 
 * @author gotre
 * @version 0.1
 * */

@SuppressWarnings("serial")
public class MainFrame extends MyJFrame implements Listeneable{
	private JButton getBestiary, organize;
	private JLabel bestiaryLabel;
	private JTextField bestiaryPath;
	
	 public MainFrame() {
		super("Manual de monstruos D&D 5");
		
		bestiaryLabel = new JLabel("Bestiario: ");
		add(bestiaryLabel);
		
		bestiaryPath = new JTextField("", 50);
		bestiaryPath.setEditable(false);
		add(bestiaryPath);
		
		
		getBestiary = new JButton("Selecciona colección");
		add(getBestiary);
		getBestiary.addActionListener(this);		
		
		organize = new JButton("Organizar colección");
		add(organize);
		organize.addActionListener(this);
		
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flow);
		setLookAndFeel();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	 
	
	@Override
	@SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getBestiary){
			this.setVisible(false);
			System.out.println("caca");
			this.setVisible(true);
		}
		if (e.getSource() == organize){
			System.out.println("pedo");;
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String []args){
		MainFrame app = new MainFrame();
	}
	
}
