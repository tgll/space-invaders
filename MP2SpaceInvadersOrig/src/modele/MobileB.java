package modele;

public class MobileB implements IMobile {
	Position position;
	
	public MobileB(Position position){
		this.position = position;
	}

	@Override
	public void deplacer() {
		// a faire
	}

	
	@Override
	public Position getPosition() {
		return position;
	}

}
