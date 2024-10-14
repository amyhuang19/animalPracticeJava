class Animal { //defines a class called Animal: object/instances

	//instance variables
	private String animalName;
	private int humanAge;

	//constructor
	public Animal(String animalName, int humanAge) { //constructor
		this.animalName = animalName; //initalize w/ input
		this.humanAge = humanAge; //initialize
	} //Animal constructor

	//getter methods
	public void getName() {
		System.out.println("Animal name: " + this.animalName);
	} //getName
	public int getHumanAge() {
		System.out.println("Animal human age: " + this.humanAge);
		return this.humanAge;
	} //getHumanAge

	//special methods
	public void getAnimalAge() { //method paramters/return type everything must be same
		System.out.println("Some generic animal age.");
	} //getHumanAge
	public void makeSound() { //method inside Animal class, void method, public method (can acess out of class)
		System.out.println("Some generic animal sound."); //prints, placeholder sound for generic animal
	} //closes the makeSound method

} //closes the Animal class definition
