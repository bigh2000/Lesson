package AccountingApp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Lesson29 {
	private final String ID = "Danny";
	private final String PASS = "abc";
	private JFrame frame;
	private JTextField idField;
	private JPasswordField passField;
	private JPanel currPanel;
	private JTextField nameInput;
	private JTextField amountInput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson29 window = new Lesson29();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson29() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		String usr = "dkkim";
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel loginPanel = new ImagePanel(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/theme.jpg").getImage());
		currPanel = loginPanel;
		
		frame.setSize(loginPanel.getDim());
		frame.setPreferredSize(loginPanel.getDim());
		ImagePanel tranPanel = new ImagePanel(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/Activation.jpg").getImage());
		frame.getContentPane().add(tranPanel);
		
		
		tranPanel.setVisible(false);
		ImagePanel sumPanel = new ImagePanel(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/Activation.jpg").getImage());
		frame.getContentPane().add(sumPanel);
		
		
		sumPanel.setVisible(false);
		frame.getContentPane().add(loginPanel);
		
		idField = new JTextField();
		idField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		idField.setBounds(1223, 311, 296, 43);
		loginPanel.add(idField);
		idField.setColumns(10);
		idField.setBorder(null);
		
		passField = new JPasswordField();
		passField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		passField.setBounds(1223, 391, 296, 43);
		passField.setBorder(null);
		loginPanel.add(passField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(1184, 440, 25, 25);
		loginPanel.add(chckbxNewCheckBox);
		
		JButton logInBtn = new JButton("");
		logInBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ID.equals(idField.getText()) && PASS.equals(new String(passField.getPassword()))){
					currPanel.setVisible(false);
					sumPanel.setVisible(true);
					currPanel = sumPanel;
				}else{
					JOptionPane.showMessageDialog(null,"You Failed to Log In");
				}
			}
		});
		logInBtn.setBorder(null);
		logInBtn.setBounds(1183, 467, 338, 38);
		loginPanel.add(logInBtn);
		logInBtn.setIcon(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/btn.jpg"));
		logInBtn.setPressedIcon(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/btnClicked.jpg"));
		
		// Summary 
		
		JButton tranBtn = new JButton("");
		tranBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				tranPanel.setVisible(true);
				currPanel = tranPanel;
			}
		});
		tranBtn.setIcon(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/transaction.jpg"));
		tranBtn.setBounds(29, 182, 259, 40);
		tranBtn.setBorder(null);
		sumPanel.add(tranBtn);
		
		// Transaction
		
		JButton sumBtn = new JButton("");
		sumBtn.setIcon(new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/summary.jpg"));
		sumBtn.setBorder(null);
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				sumPanel.setVisible(true);
				currPanel = sumPanel;
			}
		});
		sumBtn.setBounds(29, 123, 259, 40);
		tranPanel.add(sumBtn);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblName.setBounds(378, 123, 139, 49);
		tranPanel.add(lblName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblType.setBounds(378, 203, 139, 49);
		tranPanel.add(lblType);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblAmount.setBounds(378, 284, 139, 49);
		tranPanel.add(lblAmount);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNote.setBounds(378, 370, 139, 49);
		tranPanel.add(lblNote);
		
		nameInput = new JTextField();
		nameInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		nameInput.setBounds(527, 123, 935, 49);
		tranPanel.add(nameInput);
		nameInput.setColumns(10);
		
		String[] typeArr = new String[]{"Deposit", "Withdraw"};
		@SuppressWarnings("unchecked")
		JComboBox typeInput = new JComboBox(typeArr);
		typeInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		typeInput.setBounds(527, 203, 935, 49);
		tranPanel.add(typeInput);
		typeInput.setBackground(Color.WHITE);
		
		amountInput = new JTextField();
		amountInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		amountInput.setColumns(10);
		amountInput.setBounds(527, 284, 935, 49);
		tranPanel.add(amountInput);
		
		JTextArea noteInput = new JTextArea();
		noteInput.setFont(new Font("Courier New", Font.PLAIN, 33));
		noteInput.setBounds(527, 370, 935, 161);
		tranPanel.add(noteInput);
		noteInput.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{					
					boolean fileExists = new File("./data.csv").exists();
					FileWriter fw = new FileWriter("./data.csv", true);
					if(!fileExists){
						fw.append("Name, Type, Amount, Note\n");
					}
					String name = nameInput.getText();
					String type = (String) typeInput.getSelectedItem();
					String amount = amountInput.getText();
					String note = noteInput.getText();
					fw.append(name + "," + type + "," + amount + "," + note + "\n");
					nameInput.setText("");
					amountInput.setText("");
					typeInput.setSelectedIndex(0);
					noteInput.setText("");
					JOptionPane.showMessageDialog(null, "Data Saved Successfully");
					fw.close();
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "There was an error while writing the data");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton.setBounds(880, 554, 228, 49);
		tranPanel.add(btnNewButton);
		
		frame.pack();
	}
}
