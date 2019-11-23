## Food Truck Project

### Week 3 Homework for Skill Distillery

### Overview
I was tasked with creating a java application that simulates a food truck rating service in the command line. The user is prompted to input information for up to 5 food trucks:
  :Name
  :Type of food
  :Rating
After taking the information, a main menu is presented where there are four options:
  :List trucks
  :Get the average rating
  :Get information on the highest rated truck
  :Quit program

### Topics/Technologies Used

Static fields for unique ID's
Java
While loops , For loops , if statements
Constructors
Object classes
Object arrays
StringBuilder

### Lessons Learned
scanner.nextInt(); puts the scanner cursor right after the integer and does not go to the next line.
If you try to assign  String name = scanner.nextLine(); after your nextInt(); it will skip the String assignment. solution is to put an empty scanner.nextLine() after your nextInt() to get the scanner pointer on a new line to accept a user input.

Static field variables can be used for unique ID allocation. At a later point I may be able to implement hash codes and random increments to create unpredictable ID's for object constructions.

Methods should not be larger than a screen. (generally)

Never write code twice. Put it into a method.

-Neal Savant
