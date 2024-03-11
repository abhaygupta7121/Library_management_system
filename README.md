# <h1>LIBRARY MANAGEMENT SYSTEM (100% java)<h1>

# INTRODUCTION 

A Library Management System is designed to streamline administrative tasks related to library records, ultimately enhancing efficiency by minimizing the time spent on these following activities.

1) Add books
2) Search for books
3) Remove books
4) Update book price
5) View all books

## Key Features of Library Management System:

1. **Efficient Book Handling:**
   - The system is designed to be user-friendly, allowing librarians to efficiently manage books by easily adding, removing, and viewing their status.

2. **Streamlined Book Addition:**
   - Librarians can seamlessly add new books to the system, enhancing the library's collection and ensuring up-to-date inventory records.

3. **Issued Book Removal:**
   - The system facilitates the removal of issued books, helping librarians keep track of borrowed items and maintain accurate records.

4. **Comprehensive Book Details:**
   - Librarians can access detailed information about books through various classes, aiding in the efficient organization and retrieval of essential book data.

## Reasons for Choosing Java in Developing the Library Management System Project:

1. **Object-Oriented Efficiency:**
   - Java, being an object-oriented language, offers enhanced features for seamless development. Its object-oriented paradigm facilitates efficient code organization and maintenance.

2. **Platform Independence:**
   - Java's platform independence ensures that the Library Management System can run on various platforms, providing flexibility and accessibility to users.

3. **Free Accessibility:**
   - Java's open-source nature allows for free accessibility, making it a cost-effective choice for developing software projects like the Library Management System.

4. **Simplicity:**
   - The simplicity of the Java language simplifies the development process, making it easier for programmers to understand, write, and maintain code.

5. **Security Features:**
   - Java is known for its robust security features, which are crucial for the handling of sensitive information in a Library Management System.

6. **Versatility:**
   - Java's versatility enables developers to create scalable and adaptable solutions, meeting the diverse needs of a Library Management System effectively.
  
## MVC Architecture Implementation for Library Management System:**

The Model-View-Controller (MVC) architecture is a structural pattern that divides the Library Management System into three distinct components: Model, View, and Controller.

### **Workflow of MVC:**
1. **Model:**
   - Represents the application's data and business logic. Responsible for data manipulation, storage, and overall management of the application's internal state.

2. **View:**
   - Represents the user interface, presenting data to the user and transmitting user input to the Controller. Focuses on the visual representation and user interaction aspects of the system.

3. **Controller:**
   - Acts as an intermediary between the Model and the View. Receives user input from the View, processes it, interacts with the Model to update data, and then updates the View accordingly.

In our Library Management System project, we have implemented the MVC architecture by organizing the code into three distinct packages:

a) `com.jsp.lms.model`: Contains classes responsible for managing data and business logic.

b) `com.jsp.lms.view`: Includes classes related to the user interface and data presentation.

c) `com.jsp.lms.controller`: Houses classes that act as intermediaries, handling user input, processing it, and facilitating communication between the Model and the View.

## Source Code Structure - com.jsp.lms.model:

Within the `com.jsp.lms.model` package, two distinct classes have been implemented: `Book` and `Library`.

- **Book Class:**
  - The `Book` class comprises essential data members, including `bookName`, `AuthorName`, `Price`. These members encapsulate key attributes related to individual books within the Library Management System.

- **Library Class:**
  - The `Library` class includes class data members such as `LibraryName`, `LibraryAddress`, `Pincode`. These members collectively represent vital information about the library itself, including its location and the collection of books it contains.

# To Run the project use 
javac view.java (This code complies the source code)

java view (This executes the code)


# OUTPUT :

## LIBRARY DETAILS
![library details](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/11bab82a-457a-43f0-8e6b-b6abf4dbea72)

## ADD BOOK
![1](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/866f0f4a-e646-40b3-b53e-2f10bd348230)

## GET BOOK
![2](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/d451ea50-a6c7-4a9f-b986-f70d2e2eb26d)

## UPDATE BOOK DETAILS
![3](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/585797b7-c544-4218-8f86-fae31d585399)

## REOMVE BOOK
![4](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/08da0e0f-5358-44eb-9c15-cc0f817e5b48)

## RESULT OF GET BOOK AFTER USNING REMOVE BOOK OPTION 
![5](https://github.com/abhaygupta7121/Library_management_system/assets/78422889/4e4710b4-dcc5-4243-8008-33f4ea1d98df)























