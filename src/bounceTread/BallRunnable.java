package bounceTread;

import java.awt.Component;

public class BallRunnable implements Runnable {
	private Ball ball;
	private Component component;
	public static final int STEPS=1000;
	public static final int DELAY=5;
	
	
	public BallRunnable(Ball aBall,Component aComponent){
		this.ball=aBall;
		this.component=aComponent;
	}
	public void run(){
		
	for(int i=1;i<=STEPS;i++){
		ball.move(component.getBounds());
		component.repaint();
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	}


