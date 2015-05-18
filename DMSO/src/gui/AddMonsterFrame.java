package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

import java.text.Format;

import javax.swing.JTable;
import javax.swing.JList;

import monster.Actions;
import monster.Action;

import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.ListModel;

public class AddMonsterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField typeTextField;
	private JTextField AcType;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMonsterFrame frame = new AddMonsterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddMonsterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(72, 17, 205, 28);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JComboBox sizeOptions = new JComboBox();
		sizeOptions.setModel(new DefaultComboBoxModel(new String[] {"Diminuto", "Peque\u00F1o", "Mediano", "Grande", "Gigante", "Enorme"}));
		sizeOptions.setBounds(345, 18, 102, 27);
		contentPane.add(sizeOptions);
		
		typeTextField = new JTextField();
		typeTextField.setColumns(10);
		typeTextField.setBounds(498, 17, 148, 28);
		contentPane.add(typeTextField);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setBounds(20, 23, 55, 16);
		contentPane.add(lblName);
		
		JLabel lblSize = new JLabel("Tama\u00F1o:");
		lblSize.setBounds(289, 23, 55, 16);
		contentPane.add(lblSize);
		
		JLabel lblType = new JLabel("Tipo:");
		lblType.setBounds(463, 23, 55, 16);
		contentPane.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Legal bueno", "Legal neutral", "Legal maligno", "Neutral bueno", "Neutral", "Neutral maligno", "Ca\u00F3tico bueno", "Ca\u00F3tico neutral", "Ca\u00F3tico maligno"}));
		comboBox.setBounds(741, 18, 125, 26);
		contentPane.add(comboBox);
		
		JLabel lblAlign = new JLabel("Alineamiento:");
		lblAlign.setBounds(658, 23, 92, 16);
		contentPane.add(lblAlign);
		
		JLabel lblCa = new JLabel("CA:");
		lblCa.setBounds(48, 63, 36, 16);
		contentPane.add(lblCa);
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		
		JFormattedTextField aC = new JFormattedTextField(decimalFormat);
		aC.setBounds(72, 57, 36, 28);
		contentPane.add(aC);
		aC.setColumns(2);
		
		AcType = new JTextField();
		AcType.setColumns(10);
		AcType.setBounds(150, 57, 125, 28);
		contentPane.add(AcType);
		
		JLabel lblAcType = new JLabel("Tipo:");
		lblAcType.setBounds(116, 63, 36, 16);
		contentPane.add(lblAcType);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(283, 63, 36, 16);
		contentPane.add(lblHp);
		
		JLabel lblHd = new JLabel("HD:");
		lblHd.setBounds(371, 63, 36, 16);
		contentPane.add(lblHd);
		
		JFormattedTextField hp = new JFormattedTextField(decimalFormat);
		hp.setColumns(3);
		hp.setBounds(310, 57, 55, 28);
		contentPane.add(hp);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(401, 57, 123, 28);
		contentPane.add(textField);
		
		JLabel lblCr = new JLabel("Desafio:");
		lblCr.setBounds(535, 63, 55, 16);
		contentPane.add(lblCr);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(591, 57, 55, 28);
		contentPane.add(textField_1);
		
		JLabel lblXp = new JLabel("XP:");
		lblXp.setBounds(699, 63, 55, 16);
		contentPane.add(lblXp);
		
		JFormattedTextField xP = new JFormattedTextField(decimalFormat);
		xP.setColumns(9);
		xP.setBounds(727, 57, 139, 28);
		contentPane.add(xP);
		
		JFormattedTextField dex = new JFormattedTextField(decimalFormat);
		dex.setColumns(2);
		dex.setBounds(142, 195, 36, 28);
		contentPane.add(dex);
		
		JFormattedTextField con = new JFormattedTextField(decimalFormat);
		con.setColumns(2);
		con.setBounds(142, 233, 36, 28);
		contentPane.add(con);
		
		JFormattedTextField intel = new JFormattedTextField(decimalFormat);
		intel.setColumns(2);
		intel.setBounds(142, 273, 36, 28);
		contentPane.add(intel);
		
		JFormattedTextField cha = new JFormattedTextField(decimalFormat);
		cha.setColumns(2);
		cha.setBounds(142, 353, 36, 28);
		contentPane.add(cha);
		
		JFormattedTextField str = new JFormattedTextField(decimalFormat);
		str.setColumns(2);
		str.setBounds(142, 155, 36, 28);
		contentPane.add(str);
		
		JFormattedTextField wis = new JFormattedTextField(decimalFormat);
		wis.setColumns(2);
		wis.setBounds(142, 313, 36, 28);
		contentPane.add(wis);
		
		JLabel lblStr = new JLabel("Fuerza:");
		lblStr.setBounds(48, 161, 40, 16);
		contentPane.add(lblStr);
		
		JLabel lblDex = new JLabel("Destreza:");
		lblDex.setBounds(48, 201, 55, 16);
		contentPane.add(lblDex);
		
		JLabel lblCon = new JLabel("Constituci\u00F3n:");
		lblCon.setBounds(48, 239, 72, 16);
		contentPane.add(lblCon);
		
		JLabel lblIntel = new JLabel("Inteligencia:");
		lblIntel.setBounds(48, 279, 80, 16);
		contentPane.add(lblIntel);
		
		JLabel lblWis = new JLabel("Sabidur\u00EDa:");
		lblWis.setBounds(48, 319, 72, 16);
		contentPane.add(lblWis);
		
		JLabel lblCha = new JLabel("Carisma:");
		lblCha.setBounds(48, 359, 55, 16);
		contentPane.add(lblCha);
		
		DefaultListModel<Action> actions = new DefaultListModel<Action>();
		Action bite = new Action("mordisco", "Ataque a mele","+4 a golpear, te tira", "7 (2d4 + 2) daño perforante");
		Action claw = new Action("Garrazo","Ataque cuerpo a cuerpo","+4 a golpear te araña hasa la saciedad", "6 (4d3) daño lacerate");
		actions.addElement(claw);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		actions.addElement(bite);
		
		JList actionList = new JList(actions);
		actionList.setValueIsAdjusting(true);
		actionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		actionList.setBounds(221, 157, 175, 224);
		contentPane.add(actionList);
		
		JList list_1 = new JList((ListModel) null);
		list_1.setValueIsAdjusting(true);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(453, 159, 175, 224);
		contentPane.add(list_1);
		
		
		
		
		
	}
}
