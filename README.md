I developed a fully functional Online Reservation System as part of my internship using Java. This console-based application simulates the process of booking train tickets and includes:
Key Features:
- User Registration & Login
Users can create an account and securely log in using a username and password.
A default user (Praveena, password: 1325) is also included for quick access.
- Train Ticket Reservation
Users can make reservations by entering details like name, train number, class type, journey date, and route.
Each booking is assigned a unique PNR number based on system time.
- Cancel Reservation
Users can cancel their tickets by entering the PNR.
The system validates ownership before deletion.
- View My Reservations
This shows all past and current reservations made by the user.
- File Storage (No Database)
User data is saved in users.txt.
Reservations are saved in reservations.txt.
Data persistence is ensured using Java File I/O (BufferedReader, FileWriter).
Technical Highlights:
Fully built in core Java
Uses Object-Oriented Programming (OOP) with custom User and Reservation classes.
Utilizes collections like Map and List to store and manage data.
Generates PNR dynamically with System.currentTimeMillis().
Includes exception handling for file operations.
Features a menu-driven console interface.
This task helped me practice:
- Real-time Java coding
- File handling without a database
- Understanding user flow and modular design
- Error checking and validation
Tools: Java, Notepad/VS Code, Command Prompt/Terminal
Skills: OOP, Java I/O, Logic Building, CLI Design
