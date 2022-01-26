//자바 스윙 6강: Window Builder, 페이지 이동, Absolute Layout사용

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lesson07 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson07 window = new Lesson07();
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
	public Lesson07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel startPage = new JPanel();
		startPage.setBounds(6, 6, 788, 560);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);

		JButton buttonNext = new JButton("Go to Next");
		buttonNext.setBounds(50, 131, 206, 164);
		startPage.add(buttonNext);

		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 794, 572);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);

		JButton buttonPrev = new JButton("Go to Previous");
		buttonPrev.setBounds(473, 183, 117, 208);
		endPage.add(buttonPrev);

		endPage.setVisible(false);

		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
			}
		});

		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(true);
				endPage.setVisible(false);
			}
		});
	}
}
