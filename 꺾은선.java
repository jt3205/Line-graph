package Graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ²ªÀº¼± extends JFrame {
	Container contentPane = getContentPane();
	Vector<Point> p = new Vector<Point>();
	JButton bt_paint = new JButton("Paint");
	JButton bt_clear = new JButton("Clear");
	JTextField tf_point = new JTextField();
	{
		
	}

	²ªÀº¼±() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 700);
		setBackground(Color.white);
		setLayout(null);
		new Window(this).setBackground(Color.CYAN);
		
		p.add(new Point(10, 400));
		tf_point.setSize(70, 30);
		tf_point.setLocation(10, 10);
		contentPane.add(tf_point);

		bt_paint.setSize(100, 30);
		bt_paint.setLocation(90, 10);
		bt_paint.addActionListener(new ActionListen());
		contentPane.add(bt_paint);
		
		bt_clear.setSize(100,30);
		bt_clear.setLocation(200,10);
		bt_clear.addActionListener(new ActionListen());
		contentPane.add(bt_clear);
		
		setVisible(true);
	}

	public void paint(Graphics g) {
		try {
			g.drawLine(p.get(p.size()-2).x, p.get(p.size()-2).y, p.get(p.size()-1).x, p.get(p.size()-1).y);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	class ActionListen implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bt_paint){
				p.add(new Point(p.size() * 100 + 10 , p.get(p.size() - 1).y - Integer.parseInt(tf_point.getText())));
				tf_point.setText("");
				repaint();
			}	
			else if(e.getSource() == bt_clear){
				
			}
		}

	}
}
