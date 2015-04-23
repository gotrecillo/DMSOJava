package gui;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class MyJDialogChooser extends MyJDialog{
	protected JLabel bestiaryLabel;
	protected JTextField bestiaryPath;
	protected JFileChooser fc;
	protected File bestiaryFile;
	protected int returnVal;
	
	
	public void initiate(){
		fc = new JFileChooser();
		fc.setDialogTitle("Elige un bestiario");
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		super.initiate();
	}
	public MyJDialogChooser(String title, Frame owner) {
		super(title, owner);
	}
	
	public MyJDialogChooser(String title, JDialog owner, boolean b){
		super(title, owner, b);
	}
	
	public MyJDialogChooser(String title, Frame owner, boolean b){
		super(title, owner, b);
	}
		
	//Open a file chooser and pick a bestiary
	public void chooseDirectoryPath(){
		returnVal = fc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION){
			bestiaryFile = fc.getSelectedFile();
			bestiaryPath.setText(bestiaryFile.getAbsolutePath());
		}
	}
}
