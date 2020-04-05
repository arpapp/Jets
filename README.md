### Jets

##Overview

The program begins by reading information from a .txt file and creating Jet objects from that information. The jet objects are then assigned to an array list. The program then presents a menu to the user. All menu options will call methods from the Airfield object where all Jet object information is stored and handled. The actual qualities of Jet objects, (model, speed, range, and price), are all private fields listed in the Jet class. Both these practices allow for better encapsulation and protection of data.

The list fleet menu option lists all Jet objects and relevant information, (model, speed, range, and price).

The fly fleet menu option iterates through the array list and simulates all Jet objects flying and displays additional fly time and Mach speed information.

The fastest jet method will display the jet with the highest speed after it has iterated through the array list and compared all speeds of each Jet object. The longest range menu option works in the same way.

The load fleet option will find the objects that are an instance of cargo planes and simulate the loading of cargo for these planes only. The dogfight method works in the same way but it will look for jet object that are an instance of fighter planes.

The add jet menu option will ask the user to provide data for each field of a Jet object and then add the newly created jet to the array. 

The remove jet option asks for the user to select a jet to remove from the fleet. Once a user has made a selection, the jet object is removed from the array list.

The quit option prints a goodbye message and exits the program.

## Technologies Used

- Eclipse
- Java
- GitHub

## Lessons Learned

This project was a good exercise in maintaining array lists and the interplay between arrays and objects. I was able to get a better grasp on inheritance through the use of subclasses, superclasses, and interfaces. This project also portrayed a wider view of polymorphism and how objects can be manipulated to be more and more specialized as compared to their superclass(es). I was able to learn more about encapsulation and protecting data through the use of the Jet and Airfield classes. 