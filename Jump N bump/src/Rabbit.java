
public class Rabbit {
	public Rabbit(){
		int x;
		int y;
		int xVelocity;
		int yVelocity;
	}
	
	public void respawn(){
		
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
