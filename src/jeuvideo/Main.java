package jeuvideo;

import java.util.Scanner;

public class Main extends Joueur {

	public static void main(String[] args) {

		Arme arme[] = new Arme[5];
		arme[0] = new Arme("Epee", "Glaive", 4);
		arme[1] = new Arme("Couteau", "Opinel", 2);
		arme[2] = new Arme("Masse", "Marteau", 3);
		arme[3] = new Arme("Pistolet", "Beretta", 8);
		arme[4] = new Arme("Arc", "Arc recurve", 6);

		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {

				System.out.println("Joueur1" + joueur1);
				System.out.println("Joueur 1 - Choix d'arme: 1. Epée, 2. Couteau, 3. Masse, 4. Pistolet, 5. Arc");
				int choix1 = sc.nextInt();
				System.out.println(arme[choix1 - 1]);
				System.out.println("Joueur2" + joueur2);
				System.out.println("Joueur 2 - Choix d'arme: 1. Epée, 2. Couteau, 3. Masse, 4. Pistolet, 5. Arc");
				int choix2 = sc.nextInt();
				System.out.println(arme[choix2 - 1]);
				int puissanceJoueur1= arme[choix1 - 1].getPuissance();
				int puissanceJoueur2= arme[choix2 - 1].getPuissance();
				System.out.println(joueur1.getNom()+" souhaites-tu lancer une attaque ? 1. Lancer une attaque || 2. Patienter");
				int choix3 = sc.nextInt();
				System.out.println("");
				if (choix3 == 1) {
					if(joueur1.getForce()*joueur1.getSante()*joueur1.getExperience()*puissanceJoueur1>joueur2.getForce()*joueur2.getSante()*joueur2.getExperience()*puissanceJoueur2) {
						joueur1.setForce(joueur1.getForce()+1);
						joueur2.setForce(joueur1.getSante()-1);
					}else {
						joueur1.setForce(joueur1.getSante()-1);
						joueur2.setForce(joueur1.getForce()+1);
					}
					joueur1.setExperience(joueur1.getExperience()+1);
					joueur2.setExperience(joueur1.getExperience()+1);
					if (joueur2.getSante() <= 0) {
						System.out.println(joueur1.getNom() + "est vainqueur, " + joueur2.getNom() + "a perdu la partie");
						break;
					}
				}

				System.out.println(joueur2.getNom()+" souhaites-tu lancer une attaque ? 1. Lancer une attaque || 2. Patienter");
				int choix4 = sc.nextInt();
				System.out.println("");
				if (choix4 == 1) {
					if(joueur1.getForce()*joueur1.getSante()*joueur1.getExperience()*puissanceJoueur1>joueur2.getForce()*joueur2.getSante()*joueur2.getExperience()*puissanceJoueur2) {
						joueur1.setForce(joueur1.getForce()+1);
						joueur2.setForce(joueur1.getSante()-1);
					}else {
						joueur1.setForce(joueur1.getSante()-1);
						joueur2.setForce(joueur1.getForce()+1);
					}
					joueur1.setExperience(joueur1.getExperience()+1);
					joueur2.setExperience(joueur2.getExperience()+1);
					if (joueur1.getSante() <= 0) {
						System.out.println(joueur2.getNom() + "est vainqueur, " + joueur1.getNom() + "a perdu la partie");
						break;
					}
				}
			}
		}
	}

}