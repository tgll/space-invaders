package vue;

import modele.IMobile;
import modele.Position;
import processing.core.PApplet;
import processing.core.PImage;

public class SpriteA extends ASprite {
	PImage sprite;
	public SpriteA(PApplet fenetre, IMobile mobile) {
		super(fenetre, mobile);
		sprite = fenetre.loadImage("./images/spaceinvader.png");
		sprite.resize(70,0);
	}

	@Override
	public void dessiner() {
		// a faire
	}

}
