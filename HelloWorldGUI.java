import java.awt.*;
import javax.swing.*;

public class HelloWorldGUI {
	public static void main(final String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				String string = "Hello, world!";

				JFrame frame = new JFrame(string);
				JButton button = new JButton(string);
				JTextArea text = new JTextArea(string);

				frame.setLayout(new FlowLayout());
				frame.add(button);
				frame.add(text);
				frame.pack();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}
}
