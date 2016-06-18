package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class V_bone extends Tile {

	public V_bone(int id) {
		super(Assets.v_bone, id);
	}
	
	public boolean isSolid(){
		return true;
	}

}
