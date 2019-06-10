package modele;

public class MobileA implements IMobile {
	Position position;
	
	public MobileA(Position position){
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
