import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class Rabbit{
	public static int[] spawnLocX = {0, 10, 20, 30};
	public static int[] spawnLocY = {0, 10, 20, 30};
	public int maximum = spawnLocX.length-1;
	private String imageSrc = "src/images/WhiteRabbitw.png";
	public static double aspectRatio = 1.5625;
	private BufferedImage bi;
	int cw, ch, winW, winH;
	double w, h;
	
	int x,y,xVelocity,yVelocity;
	public Rabbit(){
		respawn();
	}
	
	public int randInt(){
		Random rn = new Random();
		int i = Math.abs(rn.nextInt() % maximum);
		int randomNum = i;
		return randomNum;
	}
	
	
	public void respawn(){
		if(spawnLocX.length != spawnLocY.length){
			System.out.println("Integer arrays spawnLocX and spawnLocY are not the same length");
			System.exit(1);
		}
		int i = randInt();
		x = spawnLocX[i];
		y = spawnLocY[i];
		System.out.println(x+","+y);
		
	}
	
	
	
	public Rabbit checkPlayerCollision(){
		//Rabbit = Rabbit @ x, y
		//return Rabbit;
		return null;
	}
	
	public boolean checkCollisions(){
		return false;
	}

	public void move(){
		//if key _ move _
		if(checkCollisions()){
			//collide();
			if(checkPlayerCollision() != null){
				respawn();
			}
		}
	}

}
