package fr.ensim;

public class Animal {

	public String nomAnimal;
	public TypeAnimal typeAnimal;
	
	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}
	
	public String getNomAnimal() {
		return nomAnimal;
	}
	
	public Enum getTypeAnimal() {
		return typeAnimal;
	}

	
}
