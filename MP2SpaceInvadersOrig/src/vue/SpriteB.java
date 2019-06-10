package vue;

import modele.IMobile;
import modele.Position;
import processing.core.PApplet;
import processing.core.PImage;

public class SpriteB extends ASprite {
	PImage sprite;

	public SpriteB(PApplet fenetre, IMobile mobile) {
		super(fenetre, mobile);
		sprite = fenetre.loadImage("./images/spaceinvader2.png");
		sprite.resize(90,0);
	}

	@Override
	public void dessiner() {
		// a faire

	}

}
