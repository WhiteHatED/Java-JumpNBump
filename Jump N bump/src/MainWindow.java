import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	MainWindow ex = new MainWindow();
                ex.setVisible(true);
            }
        });
    }
}


/*
import java.awt.EventQueue;
import javax.swing.JFrame;


public class MainWindow extends JFrame{

	//static JFrame window = new JFrame();
	private static void gameLoop(){
		//Network code
		//rabbit.move();
		//rabbit.collide()
		//rabbit.playerCollide();
	}
	private static void engineLoop(){
		
	}
	private static void drawLoop(){
		
	}
	
	
	
	private void initUI(){
    	System.out.println("Starting up...");
        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(800, 512);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MainWindow(){
		initUI();
		boolean active = true;
		while(active){
			gameLoop();
			
		}
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run(){
				MainWindow main = new MainWindow();
			}
		});
	}
}*/

//package AuPhish.com;


