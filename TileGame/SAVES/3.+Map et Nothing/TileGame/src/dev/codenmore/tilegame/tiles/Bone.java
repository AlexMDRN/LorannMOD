package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class Bone extends Tile {

	public Bone(int id) {
		super(Assets.bone, id);
	}
	
	public boolean isSolid(){
		return true;
	}

}
