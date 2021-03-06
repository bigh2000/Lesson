//자바 스윙1: 프레임과 페널 JFrame and JPanel

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lesson02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.add(new JLabel("Welcome this lecture"));

		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840 / 12 * 9));
		frame.setSize(840, 840 / 12 * 9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
