//자바 스윙7강: JTable 을 사용해 표를 만들기

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table 연습");
		JPanel panel = new JPanel();
		String[] headings = new String[] { "Id", "Name", "Country" };
		Object[][] data = new Object[][] { { "1", "Daniel", "Korea" }, { "2", "Sunny", "France" },
				{ "3", "John", "Japan" } };

		JTable table = new JTable(data, headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		table.setFillsViewportHeight(true);

		panel.add(new JScrollPane(table));

		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
