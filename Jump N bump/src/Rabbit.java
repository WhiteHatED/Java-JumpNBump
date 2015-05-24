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
	public int maximum = 2;
	public static int[] spawnLocX = {0, 10, 20};
	public static int[] spawnLocY = {0, 10, 20};
	
	int x,y,xVelocity,yVelocity;
	public Rabbit(){
		respawn();
	}
	
	public int randInt(){
		Random rn = new Random();
		int i = rn.nextInt() % maximum;
		int randomNum = i;
		return randomNum;
	}
	
	public void respawn(){
		x = spawnLocX[randInt()];
		y = spawnLocY[randInt()];
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
