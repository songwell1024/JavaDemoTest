package mouse;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class MouseCompent extends JComponent {
	private static final int DEFAULT_WIDTH = 680;
	private static final int DEFAULT_HEIGHT = 320;
	
	private static final int SIDELENGTH = 10;
	private ArrayList<Rectangle2D> squares;
	private Rectangle2D current;
	
	public MouseCompent() {
		squares = new ArrayList<>();
		current = null;
		
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
	
	public void paintComponent(Graphics2D g) {
		Graphics2D g2 = (Graphics2D) g;
		
		for(Rectangle2D r :squares) {
			g2.draw(r);
		}
	}
	
	public Rectangle2D find(Point2D p) {        //Point2D������еĵ�
		for(Rectangle2D r : squares) {
			if(r.contains(p)) {
				return r;
			}
		}
		return null;
	}
	
	public void add(Point2D p) {
		double x = p.getX();
		double y = p.getY();
		
		current = new Rectangle2D.Double(x - SIDELENGTH/2, y-SIDELENGTH/2, SIDELENGTH, SIDELENGTH);
		squares.add(current);
		repaint();
	}
	
	public void remove(Rectangle2D s) {
		if(s == null) return;
		if(s == current) current = null;
		squares.remove(s);
		repaint();
	}

	private class MouseHandler extends MouseAdapter{
		public void mousePressed(MouseEvent event) {
			current = find(event.getPoint());
			if(current == null) {
				add(event.getPoint());
			}
		}
	
		public void mouseClicked(MouseEvent event) {
			current = find(event.getPoint());
			if(current != null && event.getClickCount() >= 2)
				remove(current);
		}
	}

	private class MouseMotionHandler implements MouseMotionListener{
		public void mouseMoved(MouseEvent event) {
			if(find(event.getPoint()) == null)
				setCursor(Cursor.getDefaultCursor());
			else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		}
		
		public void mouseDragged(MouseEvent event) {
			if(current != null) {
				int x = event.getX();
				int y = event.getY();
				
				current = new Rectangle2D.Double(x - SIDELENGTH/2, y-SIDELENGTH/2, SIDELENGTH, SIDELENGTH);
				repaint();
			}
		}
	}

}