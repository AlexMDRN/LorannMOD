package dev.codenmore.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.gfx.Animation;
import dev.codenmore.tilegame.gfx.Assets;

public class Player extends Creature {
	
	//Animations
	private Animation animDown, animUp, animLeft, animRight, animDownLeft, animDownRight, animUpLeft, animUpRight;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 22;
		bounds.y = 44;
		bounds.width = 19;
		bounds.height = 19;
		
		//Animatons
		/*animDown = new Animation(500, Assets.player_D); // 500 = ms/anim
		animUp = new Animation(500, Assets.player_U);
		animLeft = new Animation(500, Assets.player_L);
		animRight = new Animation(500, Assets.player_R);
		animDownLeft = new Animation(500, Assets.player_DL);
		animDownRight = new Animation(500, Assets.player_DR);
		animUpLeft = new Animation(500, Assets.player_UL);
		animUpRight = new Animation(500, Assets.player_UR);*/
	}

	@Override
	public void tick() {
		//Animations
		/*animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();*/
		//Movement
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), width, height, null);
		
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else if(xMove > 0){
			return animRight.getCurrentFrame();
		}else if(yMove < 0){
			return animUp.getCurrentFrame();
		}else{
			return animDown.getCurrentFrame();
		}
	}

}
