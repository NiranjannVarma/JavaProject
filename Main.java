import java.util.ArrayList;
import java.util.Scanner;

          public class Main {
          private static ArrayList<User> users = new ArrayList<>();
          private static ArrayList<Student> students = new ArrayList<>();

           public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            while (true) {
              System.out.println("\nSelect an option:");
              System.out.println("1. Create a user");
              System.out.println("2. Create a student registration");
              System.out.println("3. Edit user information");
              System.out.println("4. Edit student information");
              System.out.println("5. Search for a user");
            System.out.println("6. Search for a student");
            System.out.println("7. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    User user = new User(username, password);
                    users.add(user);
                    System.out.println("User created successfully!");
                    break;
                case 2:
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Enter email address: ");

                    String email = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    Student student = new Student(firstName, lastName, email, phoneNumber,
 branch, cgpa);
                    students.add(student);
                    System.out.println("Student registration created successfully!");
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    String usernameToUpdate = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newPassword = sc.nextLine();
                    for (User u : users) {
                        if (u.getUsername().equals(usernameToUpdate)) {
                            u.setPassword(newPassword);
                            System.out.println("User information updated successfully!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter first name: ");
                    String firstNameToUpdate = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lastNameToUpdate = sc.nextLine();
                    for (Student s : students) {
                        if (s.getFirstName().equals(firstNameToUpdate) && s.getLastName().equals(lastNameToUpdate)) {
                            System.out.println("Select an option to edit:");
                            System.out.println("1. Email address");
                            System.out.println("2. Phone number");
                            System.out.println("3. Branch");
                            System.out.println("4. CGPA");
                            int editOption = sc.nextInt();
                            sc.nextLine();

                            switch (editOption) {
                                case 1:

                                    System.out.print("Enter new email address: ");
                                    String newEmail = sc.nextLine();
                                    s.setEmail(newEmail);

                                    System.out.println("Student information updated successfully!");
                                    break;
                                case 2:
                                    System.out.print("Enter new phone number: ");
                                    String newPhoneNumber = sc.nextLine();
                                    s.setPhoneNumber(newPhoneNumber);
                                    System.out.println("Student information updated successfully!");
                                    break;
                                case 3:
                                    System.out.print("Enter new branch: ");
                                    String newBranch = sc.nextLine();
                                    s.setBranch(newBranch);
                                    System.out.println("Student information updated successfully!");
                                    break;
                                case 4:
                                    System.out.print("Enter new CGPA:");
double newCGPA = sc.nextDouble();
s.setCGPA(newCGPA);
System.out.println("Student information updated successfully!");
break;
default:
System.out.println("Invalid option!");
break;
}
break;
}
}
break;
case 5:
System.out.print("Enter username to search: ");
String usernameToSearch = sc.nextLine();
for (User u : users) {
if (u.getUsername().equals(usernameToSearch)) {
System.out.println("User found!");
break;
}

}
break;
case 6:
System.out.print("Enter first name to search: ");
String firstNameToSearch = sc.nextLine();
System.out.print("Enter last name to search: ");
String lastNameToSearch = sc.nextLine();
for (Student s : students) {

if (s.getFirstName().equals(firstNameToSearch) && s.getLastName().equals(lastNameToSearch)) {
System.out.println("Student found!");
break;
}
}
break;
case 7:
System.out.println("Exiting program...");
System.exit(0);
break;
default:
System.out.println("Invalid option!");
break;
}
}
}
}

class User {
private String username;
private String password;


public User(String username, String password) {
    this.username = username;
    this.password = password;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {

    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}
}

class Student {
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private String branch;
private double cgpa;

public Student(String firstName, String lastName, String email, String phoneNumber, String branch, double cgpa) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.branch = branch;
    this.cgpa = cgpa;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {

    this.lastName = lastName;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getBranch() {
    return branch;
}

public void setBranch(String branch) {
    this.branch = branch;
}

public double getCGPA() {
    return cgpa;
}

public void setCGPA(double cgpa) {
    this.cgpa = cgpa;
}
} 
