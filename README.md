# COSC 310 Assignment 3
Cosc 310 Project plan for developing chatbot software

The project is a chatbot that specialises in helping with mental health issues and problems, the bot is programmed to give the user a platform to connect with a therapist and communicate with them.

The chatbot prompts the users to type their problems or issues that they are facing for the chatbot to get a better understanding and guide the user accordingly.

To compile and run the code the user needs to compile the java package in their IDE and to run the program they need to access the GreetTest class to get the program working. In this class the user has to create a chatbot object and use that object to invoke greet class. The object needs to have the username as its input. After which the user can run the code.

Classes: 
The general classes Chatbot and Greet are in their own packages, the interfaces are in a different interface package. All the moods are organised into the moods package and the various different therapists are in the therapist package.


All the interface for the specific moods all they do is enable the creation of a mood object in ChatBot class 

ChatBot class has six different objects for the moods, those objects can be used to invoke the associated moods for the objects.

GreetTest class is the class used to create an object with username in order to start the program.

Each mood class contains a message made for the particular mood for the bot to reply to the user with, it consists of Anxiety, Depression, Emergency, Happy, Others, and Stressed. Some of the moods that connects the user to a therapist. The Emergency class is the only class with the option to contact autorities if needed.

Therapist Connection class consists of the code that is related what each therapist would say according to the particular mood.

Methods:
The invoke methods in AnxietyTherapist, DepressionTherapist, OtherTherapist and StressedTherapist are the methods invoked when the user wants to get in contact with a therapist. Each method involves the particular therapist introducing themself to the user and then asking their age, gender and what day is most suitable for them to meet on.

The TherapistConnection class was created in order to create therapist objects. These objects were not able to call the methods respective to the moods without an individual TherapistInterface class, ex: AnxietyTherapist.java

The methods in the classes of the Moods package are used to give response to the user when they inform the chat bot of what problem they are facing. The bot then gives them some piece of helpful advice and then presents the user the option to connect to a professional therapist if they feel that the advice has not been able to help them. 

Added the new feature where the user can choose an 'other' option under the list of moods where they are then prompted with a question asking if they would like to connect to a therapist specializing in mental illnesses. 

Features implemented as part of assignment 2: 
  * Named Entity Recognition (NER) - Implemented NER to recognize the users name from their introduction to the chat bot and used their name to greet them back.
  * Porter Stemmer - Implemented porter stemmer to streamline the recognition for what mood the user inputs without having to hard code it.

List of 5 features that can be used as an API:
 1. The list of different moods that the chatbot can help with. 
 2. The list and network of licensed therapists that the chatbot helps the user connect to.
 3. A method that allows the chatbot to randomise the response to a particular text.
 4. An introduction feature where the bot takes the users name from their introduction and greets them back with their name. 
 5. Feature using porter stemmer to recgonize what mood has been input by the user and move on to the next step seamlessly. 

