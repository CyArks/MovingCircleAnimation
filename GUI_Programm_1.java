import java.awt.*;
import javax.swing.*;


//GUI mit Ball der sich bewegt

public class GUI_Programm_1 extends JPanel {
	static ball ball;
	
	public static void main(String[] args) {
			
		int x = 800;
		int y = 800;
			
		
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Circle Motion");
		f.setSize(x, y);
		f.setLocationRelativeTo(null);			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		GUI_Programm_1 field = new GUI_Programm_1();
		ball = new ball(field);
			
		f.add(field);
		f.setVisible(true);
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(ball.pos_x, ball.pos_y, 50, 50);	
	}

	
}
