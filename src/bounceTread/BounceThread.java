package bounceTread;

import java.awt.EventQueue;

import javax.swing.JFrame;



public class BounceThread  {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable()
		{
			public void run(){
				
			JFrame fram=new BounceFrame();
			fram.setTitle("BounceThread");
			fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fram.setVisible(true);
				
			}		
			
			
		});
}
}
