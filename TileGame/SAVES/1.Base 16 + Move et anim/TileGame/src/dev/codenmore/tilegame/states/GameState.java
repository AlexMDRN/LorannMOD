package dev.codenmore.tilegame.states;

import java.awt.Graphics;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.entities.creatures.Player;
import dev.codenmore.tilegame.worlds.World;

public class GameState extends State {
	
	private Player player;
	private World world;
	
	
	public GameState(Handler handler){
		super(handler);
//	public GameState(Game game){
//		super(game);
//		player = new Player(game, 100, 100);
//		world = new World("res/worlds/world1.txt");
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

}
