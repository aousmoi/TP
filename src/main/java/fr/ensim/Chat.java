package fr.ensim;

public class Chat extends Animal {

	public Chat(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal, typeAnimal);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chat est :" + super.getNomAnimal();
	}
	
}
