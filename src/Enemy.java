import java.awt.Graphics;
import java.awt.Rectangle;


public class Enemy {

	protected int xPos;
	protected int yPos;
	protected static int xSize;
	protected static int ySize;
	protected Rectangle overworldCollision;
	protected boolean inCombat = false;
	protected static int maxhp;
	protected int hp;
	protected boolean dead = false;
	protected int exp;
	
	public Enemy(int x, int y) {
	}
	
	public Rectangle hitbox(){
		return overworldCollision;
	}

	public void drawEnemy(Graphics g){
	}
	
	//Overworld
	public void combatChange(boolean b){
		inCombat = b;
	}
	
	public void battleBegin(int x, int y){
		xPos = x-xSize/2;
		yPos = y-ySize/2;
	}
	
	public boolean getActivity(){
		return inCombat;
	}
	
	//Battle
	public int getHealth(int x){
		hp -= x;
		if (hp > maxhp)
			hp = maxhp;
		else if (hp <= 0)
			death();
		return hp;
	}
	
	public void death(){
		dead = true;
	}
	
	public boolean getDeath(){
		return dead;
	}
	
	public int getEXP(){
		return exp;
	}
	
	public int centerX(){
		return xPos + xSize/2;
	}

	public int centerY(){
		return yPos +ySize/2;
	}
}
