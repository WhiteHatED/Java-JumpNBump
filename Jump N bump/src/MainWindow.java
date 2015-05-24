import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private static int NUMBER_OF_PLAYERS = 4;
	private static void gameLoop(){
		
		//Network code
		//rabbit.move();
		//rabbit.collide()
		//rabbit.playerCollide();
	}
	private static void engineLoop(){
		//
	}
	private static void drawLoop(){
		
	}


	
    public MainWindow() {

        initUI();
    }

    private void initUI() {
    	System.out.println("Starting up...");
        add(new Surface());
  
        setTitle("Simple Java 2D example");
        setSize(800, 512);
        setLocationRelativeTo(null);
        Rabbit n[] = new Rabbit[NUMBER_OF_PLAYERS];
        for(int i=0; i<NUMBER_OF_PLAYERS; i++){
        	System.out.println("Added rabbit");
        	n[i] = new Rabbit();
		}
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	run();
    	/*
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	MainWindow ex = new MainWindow();
                ex.setVisible(true);
            }
        });*/
    }
    public static MainWindow ex;
    public static void run(){
    	ex = new MainWindow();
    	ex.setVisible(true);
    	ex.setPreferredSize(new Dimension(800, 512));
    }
}

