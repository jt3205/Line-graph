package Graph;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SetBackground extends JFrame {
	Container contentPane = getContentPane();
	JButton bt_paint = new JButton("Paint");
	JTextField tf_point[] = new JTextField[4];
	{
		for (int i = 0; i < tf_point.length; i++) {
			tf_point[i] = new JTextField();
			tf_point[i].setSize(30, 30);
			tf_point[i].setLocation(10 + i * 32, 10);
			contentPane.add(tf_point[i]);
		}
	}
	Point p1 = new Point(100, 100);
	Point p2 = new Point(300, 500);
	Point p3 = new Point(500, 100);
	int a1, b1, a2, b2;

	int dist1x_2x;
	int dist1y_2y;
	int dist2x_3x;
	int dist2y_3y;

	SetBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setBackground(Color.white);
		setLayout(null);

		if (p1.getX() < p2.getX()) {
			dist1x_2x = (int) (p2.getX() - p1.getX());
		} else {
			dist1x_2x = (int) (p1.getX() - p2.getX());
		}
		if (p1.getY() < p2.getY()) {
			dist1y_2y = (int) (p2.getY() - p1.getY());
		} else {
			dist1y_2y = (int) (p1.getY() - p2.getY());
		}

		if (p2.getX() < p3.getX()) {
			dist2x_3x = (int) (p3.getX() - p2.getX());
		} else {
			dist2x_3x = (int) (p2.getX() - p3.getX());
		}
		if (p2.getY() < p3.getY()) {
			dist2y_3y = (int) (p3.getY() - p2.getY());
		} else {
			dist2y_3y = (int) (p2.getY() - p3.getY());
		}
		System.out.println(dist1x_2x);
		System.out.println(dist1y_2y);
		System.out.println(dist2x_3x);
		System.out.println(dist2y_3y);
		setVisible(true);
	}

	public void paint(Graphics g) {
		int j = 100;
		for (int i = 1; i <= 100; i++) {
			g.drawLine(dist1x_2x / 100 * i, dist1y_2y / 100 * i, dist2x_3x / 100 * j, dist2y_3y / 100 * j);
			j--;
		}

	}

	class ActionListen implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 두 점사이 거리

			for (int i = 1; i < 10; i++) {

				repaint();
			}

		}

	}
}
