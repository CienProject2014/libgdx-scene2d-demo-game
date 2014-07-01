package com.minimaldevelop.libgdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Libgdx-Scene2d-Game";
		cfg.useGL20 = true;
		cfg.width = 460;
		cfg.height = 790;
		
		new LwjglApplication(new LibGdxGame(), cfg);
	}
}
