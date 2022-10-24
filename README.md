# cosc310Project
Cosc 310 Project plan for developing chatbot software

The project is a chatbot that specialises in helping with mental health issues and problems, the bot is programmed to give the user a platform to connect with a therapist and communicate with them.

The chatbot prompts the users to type their problems or issues that they are facing for the chatbot to get a better understanding and guide the user accordingly.

To compile and run the code the user needs to compile the java package in their IDE and to run the program they need to access the GreetTest class to get the program working. In this class the user has to create a chatbot object and use that object to invoke greet class. The object needs to have the username as its input. After which the user can run the code.

Classes: The general classes Chatbot and Greet are in their own packages, the interfaces are in a different interface package. All the moods are organised into the moods package and the various different therapists are in the therapist package.


All the interface for the specific moods all they do is enable the creation of a mood object in ChatBot class 

ChatBot class has six different objects for the moods, those objects can be used to invoke the associated moods for the objects.

GreetTest class is the class used to create an object with username in order to start the program.

Each mood class contains a message made for the particular mood for the bot to reply to the user with, it consists of Anxiety, Depression, Emergency, Happy, Others, and Stressed. Some of the moods that connects the user to a therapist. The Emergency class is the only class with the option to contact autorities if needed.

Therapist Connection class consists of the code that is related what each therapist would say according to the particular mood.

