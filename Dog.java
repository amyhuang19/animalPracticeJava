/** class Dog: extends Animal class
*   - subclass/childclass of Animal: inherits properties/methods from Animal
*   - the Dog class inherits from the Animal class
*   super() keyword: calls the constructor of the superclass (or parent class) from a subclass (or child class)
*           - used to initialize the fields or properties of parent class as part of creating an instance of child class
*           - How super() Works:
*	            - Every time you create an object of subclass constructor of its superclass is automatically called before subclass's constructor
*	            - If the superclass constructor has parameters: explicitly call it using super(arguments) to pass values to those parameters
*           - super() call: subclass inherit/initialize fields of the parent class
*/
class Dog extends Animal { 
	//constructor for Dog class
	public Dog(String animalName, int humanAge) {
		super(animalName, humanAge); //calls the superclass constructor:
	} //Dog constructor

	//overrided methods
	@Override //annotation: following method overrides method from parent class (Animal), tells compiler/reader
	public void makeSound() { //defines makeSound method inside Dog class, new version called w/ an instance of Dog
		System.out.println("The dog says: Bark"); //prints specific dog sound
	} //closes makeSound method in Dog class
	@Override
	public void getAnimalAge() { //uses super class variable humanAge
		System.out.println("Dog's age in dog years: " + (super.getHumanAge() * 7)); //prints dog age
	} //getAnimalAge

} //closes Dog class