import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static Student student;
    static ArrayList<Mock> listMock = new ArrayList<Mock>();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("welcome");
            System.out.println();
            System.out.println("1.Student");
            System.out.println("2.HR");
            System.out.println();
            System.out.println("Enter an option");
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    studentHomePage();
                    break;
                }
                case 2: {
                    hrHomePage();
                    break;
                }
                default: {
                    System.out.println("invalid option ");
                }
            }
        }
    }

    private static void hrHomePage() {
        if (student == null) {
            System.out.println("Student data is not present ");
        }

        for (;;) {
            System.out.println("HR module");
            System.out.println();
            System.out.println("1.View All Students");
            System.out.println("2.Mock Rating ");
            System.out.println("3.Requirements");
            System.out.println("4.logout");
            System.out.println();
            System.out.println("Enter an option  ");
            int opt = new Scanner(System.in).nextInt();

            switch (opt) {
                case 1: {
                    viewAllStudents();
                    break;
                }
                case 2: {
                    mockRatings();
                    break;
                }
                case 3: {
                    requirements();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Invalid option ");
            }
        }
    }

    private static void requirements() {
    }

    private static void mockRatings() {
        for (;;) {
            System.out.println("mock module ");
            System.out.println();
            System.out.println("1.Add mock");
            System.out.println("2.view All Mock");
            System.out.println("3.exit");
            System.out.println("Enter an option");

            int opt = new Scanner(System.in).nextInt();
            switch (opt) {
                case 1: {
                    addMock();
                    break;
                }
                case 2: {
                    viewAllMock();
                    break;
                }
                case 3: {
                    return;
                }
                default: {
                    System.out.println("invalid option");
                }
            }
        }
    }

    private static void viewAllMock() {
        System.out.println();
        System.out.println("All mock");
        
    }

    private static void addMock() {
        System.out.println();
        System.out.println("Add mock Module");
        System.out.println();
        System.out.println("Date :");
        String date = new Scanner(System.in).next();
        System.out.println("Trainer name : ");
        String trainerName = new Scanner(System.in).next();
        System.out.println("Subject :");
        String sub = new Scanner(System.in).next();
        System.out.println("Ratings : ");
        String rating = new Scanner(System.in).next();
        Mock mock = new Mock(trainerName, sub, date, rating);
        listMock.add(mock);
    }

    private static void viewAllStudents() {
        student.displayStudent();
    }

    private static void studentHomePage() {
        for (;;) {
            System.out.println();
            System.out.println("Student Module ");
            System.out.println();
            System.out.println("1.Create profile ");
            System.out.println("2.Profile");
            System.out.println("3.mock ratings");
            System.out.println("4.Requirements");
            System.out.println("5.logout");
            System.out.println();
            System.out.println("Enter an option ");

            int opt = new Scanner(System.in).nextInt();

            switch (opt) {
                case 1: {
                    createProfile();
                    break;
                }
                case 2: {
                    viewProfile();
                    break;
                }
                case 3: {
                    viewMockRating();
                    break;
                }
                case 4: {
                    viewRequirements();
                    break;
                }
                case 5: {
                    return;
                }
                default:
                    System.out.println("Invalid option ");
            }
        }
    }

    private static void viewRequirements() {
    }

    private static void viewMockRating() {
        if (student == null) {
            System.out.println("Create Your acc first");
            return;
        }
        System.out.println("All mock Ratings");
        
    }

    private static void viewProfile() {
        if (student == null) {
            System.out.println("Create your acc first");
            return;
        }
        System.out.println("Student Profile Module");
        student.displayStudent();

        System.out.println();
        System.out.println("Do u want to edit something :");
        String resp = new Scanner(System.in).next();
        if (resp.equalsIgnoreCase("YES")) {
            editStudentProfile();
        }
    }

    private static void editStudentProfile() {
        for (;;) {
            System.out.println();
            System.out.println("Edit student info");
            System.out.println("1.Name");
            System.out.println("2.email");
            System.out.println("3.contact");
            System.out.println("4.address");
            System.out.println("5.change pin");
            System.out.println("6.Exit");

            System.out.println();
            System.out.println("Enter an option ");
            System.out.println();
            int opt = new Scanner(System.in).nextInt();

            switch (opt) {
                case 1: {
                    System.out.println("New name :");
                    String newName = new Scanner(System.in).nextLine();
                    System.out.println("pin:");
                    int userPin = new Scanner(System.in).nextInt();
                    if (userPin == student.getPin()) {
                        student.setName(newName);
                    } else {
                        System.out.println("invalid pin ");
                    }
                    break;
                }
                case 2: {
                    System.out.println("New email :");
                    String newEmail = new Scanner(System.in).nextLine();
                    System.out.println("pin:");
                    int userPin = new Scanner(System.in).nextInt();
                    if (userPin == student.getPin()) {
                        student.setEmail(newEmail);
                    } else {
                        System.out.println("invalid pin ");
                    }
                    break;
                }
                case 3: {
                    System.out.println("New con :");
                    long newContact = new Scanner(System.in).nextLong();
                    System.out.println("pin:");
                    int userPin = new Scanner(System.in).nextInt();
                    if (userPin == student.getPin()) {
                        student.setContact(newContact);
                    } else {
                        System.out.println("invalid pin ");
                    }
                    break;
                }
                case 4: {
                    System.out.println("New address :");
                    String newAdd = new Scanner(System.in).nextLine();
                    System.out.println("pin:");
                    int userPin = new Scanner(System.in).nextInt();
                    if (userPin == student.getPin()) {
                        student.setAddress(newAdd);
                    } else {
                        System.out.println("invalid pin ");
                    }
                    break;
                }
                case 5: {
                    System.out.println("New Pin :");
                    int newPin = new Scanner(System.in).nextInt();
                    System.out.println("pin:");
                    int userPin = new Scanner(System.in).nextInt();
                    if (userPin == student.getPin()) {
                        student.setPin(newPin);
                    } else {
                        System.out.println("invalid pin ");
                    }
                    break;
                }
                case 6: {
                    System.out.println();
                    return;
                }
            }
        }
    }

    private static void createProfile() {
        System.out.println("Create profile Module");
        System.out.println();
        System.out.println("pin : ");
        int pin = new Scanner(System.in).nextInt();

        System.out.println("Name : ");
        new Scanner(System.in).nextLine();
        String name = new Scanner(System.in).nextLine();

        System.out.println("Email : ");
        String email = new Scanner(System.in).next();

        System.out.println("Contact : ");
        long contact = new Scanner(System.in).nextLong();

        System.out.println("Address : ");
        new Scanner(System.in).nextLine();
        String address = new Scanner(System.in).nextLine();

        student = new Student(pin,name,email,contact,address);
    }
}


