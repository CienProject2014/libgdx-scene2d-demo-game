package com.minimaldevelop.libgdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Cien";
		cfg.useGL20 = true;
<<<<<<< HEAD
		cfg.width = 460;
		cfg.height = 790;
=======
		cfg.width = 470;
		cfg.height = 800;
>>>>>>> master
		
		new LwjglApplication(new LibGdxGame(), cfg);
	}
}
