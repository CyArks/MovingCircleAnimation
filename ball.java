public class ball extends Thread {

	int	pos_x = 0;
	int pos_y = 200;
	
	GUI_Programm_1 parent;
	
	ball(GUI_Programm_1 field){
		parent = field;
		this.start();
	}
	
	public void run() {
		while (true){
			pos_x++;
			if (pos_x >= 400) {
				pos_x = 0;
			}
			parent.repaint();
			
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e) {}
		
		}
	}
	
	
	
}
