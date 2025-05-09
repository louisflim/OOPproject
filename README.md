# OOPproject

## Class and Object 
I created a `tempConvertProject` class that acts as the main window of my project. Within the `tempConvertProject` objects include all aspects required like a text field, labels, a button, and a combo box. I declared all of the GUI elements and data as private fields to structure the program appropriately. I created the `tempConvertProject` object in the `main` method so that it would show the window. 

## Class Diagram 
I created a class diagram that shows all of the fields and methods inside of the `tempConvertProject` class. The diagram clearly distinguishes the attributes (JPanel, JTextField, JButton, JComboBox, JLabel) and the methods (constructor, and main method). This is helpful in terms of clarifying the ordering of the class and its responsibilities.

## Four OOP Principles
I applied the four OOP principles in the project:

- **Abstraction**: I hid all the detailed actions (like temperature conversion) inside the class.
- **Encapsulation**: I made all the components private so that they are protected and only accessible inside the class.
- **Inheritance**: The `tempConvertProject` class extends `JFrame`, showing how a child class can inherit properties from a parent class.
- **Polymorphism**: I used an anonymous class to handle the button’s `ActionListener`, which is an example of polymorphism in Java.

## Exception Handling
I added a try-catch block inside the button’s action. When the user types an invalid input (like letters instead of numbers), the program will catch the error and show a pop-up message saying "Invalid number input!". This prevents the program from crashing and gives a better experience for the user.

## File Handling 
There is no file handling.

## Graphical User Interface 
I used Java Swing to create the graphical user interface. The design is simple but organized. There is a title label at the top, a combo box to select conversion types, a text field to input numbers, a button to convert, and another text field to show the result. 
