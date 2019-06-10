package controleur;

import java.util.ArrayList;

import modele.IMobile;
import modele.MobileA;
import modele.MobileB;
import modele.Position;

import processing.core.PApplet;
import processing.core.PImage;
import vaisseauxGraphiques.AVaisseau;
import vaisseauxGraphiques.Vaisseau;
import vue.SpriteA;
import vue.SpriteB;

public class FenetreControleur extends PApplet{
	PImage fond;
	ArrayList<AVaisseau> vaisseaux = new ArrayList<AVaisseau>();

	public void settings(){
		size(1024,768);
	}
	
	public void setup(){
		// fenetre	
		frameRate(60);
		fond=loadImage("./images/universFond.jpg");
		// creation des vaisseaux
		// a faire
	}

	public void draw(){
		// fond
		image(fond,0,0);
		// vaisseaux : deplacement et dessin
		for (AVaisseau v : vaisseaux){
			v.deplacer();
			v.dessiner();
		}
			
	}
	
	public static void main(String[] args){
		PApplet.main("controleur.FenetreControleur");
	}
	
}
