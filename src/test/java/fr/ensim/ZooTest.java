package fr.ensim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class ZooTest {

	@Test
	public void testNombreMaximumVisiteurs() {

		try {
			Zoo zooDeLaFlech = new Zoo();
			for (int i = 0; i < 16; i++) {
				zooDeLaFlech.nouveauVisiteur();
			}
		} catch (LimiteVisiteurException e) {
			assertTrue("Le nombre maximum de visiteurs atteint".equals(e.getMessage()));
		}
	}

	@Test
	public void testAnimalDansLeBonSecteur() {
		try {

			Zoo zooDeBeauvale = new Zoo();
			zooDeBeauvale.ajouterSecteur(TypeAnimal.CHIEN);
			Chien chien = new Chien("Snoopy", TypeAnimal.CHIEN);
			zooDeBeauvale.nouvelAnimal(chien);
	
			Secteur secteur_chiens =  zooDeBeauvale.getSecteurFromType(TypeAnimal.CHIEN);
			assertNotNull(secteur_chiens.getAnimauxDansSecteur().stream().filter(animal -> animal.equals(chien)).findFirst().orElse(null));			

		} catch (AnimalDansMauvaisSecteurException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testAnimalDansLeMauvaisSecteur() {

		try {
			Secteur SecteurDeschiens = new Secteur(TypeAnimal.CHIEN);
			Chat chat = new Chat("mimi", TypeAnimal.CHAT);

			SecteurDeschiens.ajouterAnimal(chat);
		} catch (AnimalDansMauvaisSecteurException e) {
			assertEquals(e.getMessage(), "Animal est dans le mauvais sercteur");
		}

	}

}
