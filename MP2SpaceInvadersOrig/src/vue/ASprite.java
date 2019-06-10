package vue;

import processing.core.PApplet;
import modele.IMobile;

public abstract class ASprite implements IVue {
	protected IMobile mobile;
	protected PApplet fenetre;
	
	public ASprite(PApplet fenetre, IMobile mobile){
		this.fenetre=fenetre;
		this.mobile=mobile;
	}
	
}
