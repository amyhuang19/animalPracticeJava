import java.util.Scanner; //Import the Scanner class for user input

/** Uses Scanner: accept user input
*   - creats Animal, Dog and Cat object
*   - allow the user to input the name and age of the animals
*   - display sounds/animal ages of animals
*/
public class Main {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

		//Create a generic Animal object
		String animalName1 = "";
		System.out.print("First Animal's name: ");
		animalName1 = scanner.nextLine();
		int animalHumanAge1 = 0;
		System.out.print("First Animal's human age: ");
		animalHumanAge1 = scanner.nextInt();
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Animal genericAnimal1 = new Animal(animalName1, animalHumanAge1); //create generic Animal object
		genericAnimal1.getName();
		genericAnimal1.printHumanAge();
		genericAnimal1.makeSound();
		genericAnimal1.getAnimalAge();

		System.out.println("------------------------------------------------------------------------");

		// Create a Dog object
		String dogName1 = "";
		System.out.print("First Dog's name: ");
		dogName1 = scanner.nextLine(); //get dog name
		int dogHumanAge1 = 0;
		System.out.print("First Dog's human age: ");
		dogHumanAge1 = scanner.nextInt(); //get dog age
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Dog dog1 = new Dog(dogName1, dogHumanAge1);
		dog1.getName();
		dog1.printHumanAge();
		dog1.makeSound();
		dog1.getAnimalAge();

		System.out.println("------------------------------------------------------------------------");

		// Create a Cat object
		String catName1 = "";
		System.out.print("First Cat's name: ");
		catName1 = scanner.nextLine(); //get cat name
		int catHumanAge1 = 0;
		System.out.print("First Cat's human age: ");
		catHumanAge1 = scanner.nextInt(); //get cat age
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Cat cat1 = new Cat(catName1, catHumanAge1);
		cat1.getName();
		cat1.printHumanAge();
		cat1.makeSound();
		cat1.getAnimalAge();

		System.out.println("------------------------------------------------------------------------");


		//Create another generic Animal object
		String animalName2 = "";
		System.out.print("Second Animal's name: ");
		animalName2 = scanner.nextLine();
		int animalHumanAge2 = 0;
		System.out.print("Second Animal's human age: ");
		animalHumanAge2 = scanner.nextInt();
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Animal genericAnimal2 = new Animal(animalName2, animalHumanAge2); //create generic Animal object
		handleAnimal(genericAnimal2); //polymorphic call: calls handle method for any Animal/subclass

		System.out.println("------------------------------------------------------------------------");

		// Create a Dog object using polymorphism
		String dogName2 = "";
		System.out.print("Second Dog's name: ");
		dogName2 = scanner.nextLine(); //get dog name
		int dogHumanAge2 = 0;
		System.out.print("Second Dog's human age: ");
		dogHumanAge2 = scanner.nextInt(); //get dog age
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Dog dog2 = new Dog(dogName2, dogHumanAge2);
		handleAnimal(dog2); //polymorphic call: calls handle method for any Animal/subclass

		System.out.println("------------------------------------------------------------------------");

		// Create a Cat object using polymorphism
		String catName2 = "";
		System.out.print("Second Cat's name: ");
		catName2 = scanner.nextLine(); //get cat name
		int catHumanAge2 = 0;
		System.out.print("Second Cat's human age: ");
		catHumanAge2 = scanner.nextInt(); //get cat age
		scanner.nextLine(); //Consume leftover newline character: used to prevent scanner confusion

		Cat cat2 = new Cat(catName2, catHumanAge2);
		handleAnimal(cat2); //polymorphic call: calls handle method for any Animal/subclass


		//close the scanner to avoid leak of resource
		scanner.close();

	} //main method

	public static void handleAnimal(Animal animal) { //polymorphic method to handle any Animal (or subclass) and perform operations
		animal.getName();       //Calls appropriate getName method (inherited)
		animal.printHumanAge();   //Calls appropriate getHumanAge method (inherited)
		animal.makeSound();     //Polymorphic call: Executes based on actual object type (Animal, Dog, or Cat)
		animal.getAnimalAge();  //Polymorphic call: Executes based on actual object type
	} //handleAnimal
} //Main