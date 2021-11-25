package jeuvideo;

public class Arme {
	private String nom;
	private String type;
	private int puissance;
	
	public Arme(String nom, String type, int puissance) {
		super();
		this.nom = nom;
		this.type = type;
		this.puissance = puissance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	@Override
	public String toString() {
		return "Arme :"+nom + " de type " + type + " et de puissance " + puissance;
		
	}

}
