//자바 스윙5: WIndows Builder 사용 과 크기 조정. (스윙을 더 쉽게)

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Lesson06 {

	private JFrame frame;
	private JTextField textfieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson06 window = new Lesson06();
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
	public Lesson06() {
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

		JButton buttonLogin = new JButton("Login");
		buttonLogin.setBounds(276, 95, 117, 74);
		frame.getContentPane().add(buttonLogin);

		JLabel labelLogin = new JLabel("Login Form");
		labelLogin.setHorizontalAlignment(SwingConstants.CENTER);
		labelLogin.setBounds(63, 20, 175, 36);
		frame.getContentPane().add(labelLogin);

		textfieldName = new JTextField();
		textfieldName.setBounds(108, 84, 130, 26);
		frame.getContentPane().add(textfieldName);
		textfieldName.setColumns(10);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(35, 89, 61, 16);
		frame.getContentPane().add(labelName);
	}
}
