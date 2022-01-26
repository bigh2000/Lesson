//자바 스윙 : Check Box 사용하기

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lesson23 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson23 window = new Lesson23();
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
	public Lesson23() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JCheckBox chckbxEdit = new JCheckBox("Edit");
		chckbxEdit.setBounds(88, 9, 246, 39);
		panel.add(chckbxEdit);

		JTextField textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(88, 67, 246, 120);
		panel.add(textField);
		textField.setColumns(10);

		chckbxEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isChecked = chckbxEdit.isSelected();
				textField.setEnabled(isChecked);
			}
		});
	}

}
