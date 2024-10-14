Animal class: base class for animal types dog and cat
- 2 attributes: name and human age
- 4 methods: makeSound(), getName(), getHumanAge(), getAnimalAge()

Dog class: inherits from Animal class, has dog-specific behavior/attributes
- overrides Animal's makeSound method

Cat class: inherits from Animal class, has cat-specific behavior/attributes
- overrides Animal's makeSound method

Main class: creates instances of Animal, Dog, Cat and calls their methods; handles generic Animal objects and specific Dog/Cat objects with polymorphism

Bash script: compiles all files, runs the main file