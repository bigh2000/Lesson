//자바 스윙 9강: J버튼에 이미지 넣기

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Lesson10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson10 window = new Lesson10();
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
	public Lesson10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 807, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 789, 434);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("");
		String usr = "dkkim";
		ImageIcon btnIcon = new ImageIcon("/Users/" + usr + "/eclipse-workspace/Lesson/img/btn.jpg");
		btnNewButton.setIcon(btnIcon);
		btnNewButton.setSelectedIcon(btnIcon);
		btnNewButton.setBounds(222, 188, btnIcon.getIconWidth(), btnIcon.getIconHeight());
		btnNewButton.setPressedIcon(new ImageIcon("./img/btnClicked.jpg"));
		panel.add(btnNewButton);
	}

}
