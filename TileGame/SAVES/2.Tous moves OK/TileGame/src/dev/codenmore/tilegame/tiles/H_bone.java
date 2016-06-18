package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class H_bone extends Tile {

	public H_bone(int id) {
		super(Assets.h_bone, id);
	}
	
	public boolean isSolid(){
		return true;
	}
}
