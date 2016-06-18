package dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player_U, monster_1, monster_2, monster_3, monster_4, purse, v_bone, h_bone, bone, crystal_ball, fireball_1, fireball_2, fireball_3, fireball_4, fireball_5, gate_closed, gate_open;
	public static BufferedImage[] player_D, player_DL, player_DR, player_L, player_R, player_UL, player_UR;
	
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		/*player_D = new BufferedImage[1];
		player_DL = new BufferedImage[1];
		player_DR = new BufferedImage[1];
		player_L = new BufferedImage[1];
		
		player_R = new BufferedImage[1];
		player_U = new BufferedImage[1];
		player_UL = new BufferedImage[1];
		player_UR = new BufferedImage[1];*/
		
		
		
		/*player_D[0] = sheet.crop(0, 0, width, height);
		player_DL[0] = sheet.crop(width, 0, width, height);
		player_DR[0] = sheet.crop(width * 2, 0, width, height);
		player_L[0] = sheet.crop(width * 3, 0, width, height);
		
		player_R[0] = sheet.crop(0, height, width, height);
		
		player_UL[0] = sheet.crop(width * 2, height, width, height);
		player_UR[0] = sheet.crop(width * 3, height, width, height);*/
		player_U = sheet.crop(width, height, width, height);
		
		
		monster_1 = sheet.crop(0, height * 2, width, height);
		monster_2 = sheet.crop(width, height * 2, width, height);
		monster_3 = sheet.crop(width * 2, height * 2, width, height);
		monster_4 = sheet.crop(width * 3, height * 2, width, height);
		
		purse = sheet.crop(0, height * 3, width, height);
		v_bone = sheet.crop(width, height * 3, width, height); // Mur
		h_bone = sheet.crop(width * 2, height * 3, width, height); // Mur
		bone = sheet.crop(width * 3, height * 3, width, height); // Mur
		
		crystal_ball = sheet.crop(0, height * 4, width, height);
		fireball_1 = sheet.crop(width, height * 4, width, height);
		fireball_2 = sheet.crop(width * 2, height * 4, width, height);
		fireball_3 = sheet.crop(width * 3, height * 4, width, height);
		
		fireball_4 = sheet.crop(0, height * 5, width, height);
		fireball_5 = sheet.crop(width, height * 5, width, height);
		gate_closed = sheet.crop(width * 2, height * 5, width, height);
		gate_open = sheet.crop(width * 3, height * 5, width, height);
	}
	
}
