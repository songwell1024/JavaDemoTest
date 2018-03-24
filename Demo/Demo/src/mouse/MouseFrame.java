package mouse;

import javax.swing.*;

public class MouseFrame extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new MouseFrame();
		frame.setVisible(true);
		//frame.paintComponent(O);
	}
	public MouseFrame() {
		add(new MouseCompent());
		pack();
	}

}
