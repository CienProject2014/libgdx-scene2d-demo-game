package com.minimaldevelop.libgdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.minimaldevelop.libgdxgame.actors.FallingMan;

public class InputHandler extends InputListener {
	
	FallingMan piggy; //FallingMan이라는 class 변수 piggy를 선언
	
	public InputHandler(FallingMan piggy) {
		this.piggy = piggy; //생성자
	}
	
	public boolean touchDown(InputEvent event, float x, float y,
			int pointer, int button) {
		System.out.println("down"); //마우스를 터치하면 어떤 반응
		return true;
	}

	public void touchUp(InputEvent event, float x, float y, int pointer,
			int button) {
		System.out.println("up"); //역시 마우스를 터치하면 반응 , touchDown이 true를반환 하거나 False를 반환하느냐에 따라 달라짐.
	}

	@Override
	public boolean keyDown(InputEvent event, int keycode) {
		// TODO Auto-generated method stub

		switch (keycode) {
		case Keys.W:
			Gdx.app.log("", "Usao sam u W down");
			piggy.moveFallingManUpDown(2f);
//			pigModel.setLinearVelocity(0f, 1.0f);
			// felix.getVelocity().y = 1;
			break;
		case Keys.S:
			// felix.getVelocity().y = -4; //내려가는 키는 업음
			
			break;
		case Keys.A:
			// felix.getVelocity().x = -1;
			piggy.moveFallingManLeftRight(-5f); //좌로이동
			break;
		case Keys.D:
			// felix.getVelocity().x = 1;
			piggy.moveFallingManLeftRight(5f); //우로이동
			break;
		default:
			break;
		}
		return true;
	}

	@Override
	public boolean keyUp(InputEvent event, int keycode) {

		switch (keycode) {
		case Keys.W:
			Gdx.app.log("", "Usao sam u W up");
			piggy.moveFallingManUpDown(-2f);
//			pigModel.setLinearVelocity(0f, -2.0f);
			break;
		// case Keys.S:
		// if(felix.getVelocity().y == -1)
		// // felix.getVelocity().y = 0;
		// break;
		// case Keys.A:
		// if(felix.getVelocity().x == -1)
		// felix.getVelocity().x = 0;
		// break;
		// case Keys.D:
		// if(felix.getVelocity().x == 1)
		// felix.getVelocity().x = 0;
		// break;
		default:
			break;
		}

		return true;
	}
	
	public void accelerometerChange(float acc) {
		
		piggy.moveFallingManLeftRight(-acc);
		
//		felix = world.getFelix();
//		felix.getVelocity().x = -acc;
		
	}
}
