package fr.ensim;

public class Chien extends Animal{
	
	public Chien(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal,typeAnimal);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chien est :" + super.getNomAnimal();
	}
}
