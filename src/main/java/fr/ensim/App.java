package fr.ensim;

public class App {

	public static void main(String[] args) {
		

		try {
			
			Zoo monZoo = new Zoo();
			monZoo.ajouterSecteur(TypeAnimal.CHAT);
			monZoo.ajouterSecteur(TypeAnimal.CHIEN);
			
			Chien chien = new Chien("snopy", TypeAnimal.CHIEN);
			Chat chat = new Chat("caty", TypeAnimal.CHAT);
			
			monZoo.nouvelAnimal(chien);
			monZoo.nouvelAnimal(chat);
			
			monZoo.nouveauVisiteur();
			monZoo.nouveauVisiteur();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
