package jeuvideo;

import java.util.Random;

public class Joueur {
	private String nom;
	private int sante;
	private int force;
	private int experience;
	
	
	public Joueur() {
		super();
		String tabNom[] = {"Clara","Lea","Axel","Aaron","Gabin","Corentin","Arthur","Evan","Adrien","Antoine"};
		Random random = new Random();
		int index = random.nextInt(10);
		nom = tabNom[index];
		sante = 10;
		force = random.nextInt(5) + 5; // Génère un entier entre 5 et 10
		experience = 1;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "[nom=" + nom + ", sante=" + sante + ", force=" + force + ", experience=" + experience + "]";
	}

}
