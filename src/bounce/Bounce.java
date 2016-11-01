package bounce;

import java.awt.EventQueue;

import javax.swing.JFrame;



public class Bounce  {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable()
		{
			public void run(){
				
			JFrame fram=new BounceFrame();
			fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fram.setVisible(true);
				
			}
			
			
			
		});
}
}
