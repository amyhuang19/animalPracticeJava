/** class Cat: extends Animal class
*   - subclass/childclass of Animal: inherits properties/methods from Animal
*   - the Cat class inherits from the Animal class
*   super() keyword: calls the constructor of the superclass (or parent class) from a subclass (or child class)
*      - used to initialize the fields or properties of parent class as part of creating an instance of child class
*      - How super() Works:
*	       - Every time you create an object of subclass constructor of its superclass is automatically called before subclass's constructor
*	       - If the superclass constructor has parameters: explicitly call it using super(arguments) to pass values to those parameters
*      - super() call: subclass inherit/initialize fields of the parent class
*   Cat class: inherits from Animal class, has cat-specific behavior/attributes
*   - overrides Animal's makeSound method
*/
class Cat extends Animal { //defines another class Cat: extends Animal clas
	//constructor for Cat class
	public Cat(String animalName, int humanAge) {
		super(animalName, humanAge); //calls the superclass constructor:
	} //Cat constructor

	//overrided methods
	@Override //overrides Animal class def of makeSound
	public void makeSound() {
		System.out.println("The cat says: Meow"); //prints cat sound
	} //makeSound
	@Override
	public void getAnimalAge() { //uses super class variable humanAge
		System.out.println("Cat's age in cat years: " + (super.getHumanAge() * 15)); //prints cat age
	} //getAnimalAge

} //closes Cat class
