#!/bin/bash

# usage: $ bash run_java.sh

# Compile each file
#   javac encounters error during compilation, non-0 exit status: 
#       - command following the || operator executes (echo message, exit 1 on error)
javac Animal.java || { echo "Compilation failed for Animal.java"; exit 1; }
javac Dog.java || { echo "Compilation failed for Dog.java"; exit 1; }
javac Cat.java || { echo "Compilation failed for Cat.java"; exit 1; }
javac Main.java || { echo "Compilation failed for Main.java"; exit 1; }

# Run the Java program
java Main
