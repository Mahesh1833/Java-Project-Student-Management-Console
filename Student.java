import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    static int sid = 123456;
    private String id;
    private String name;
    private String email;
    private int pin;
    private long contact;
    private String address;

    private ArrayList<Education> listEdu = new ArrayList<>();
    private ArrayList<Mock> listMock = new ArrayList<>();
    private ArrayList<Requirement> listReq = new ArrayList<>();

    public Student(int pin, String name, String email, long contact, String address) {
        this.id = "QSP" + sid++;
        this.pin = pin;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.listEdu = addEducationDetails();
    }

    public String getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private ArrayList<Education> addEducationDetails() {
        ArrayList<Education> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nAdd Education Details");

            System.out.print("Course      : ");
            String course = sc.nextLine();

            System.out.print("YOP         : ");
            int yop = sc.nextInt();
            sc.nextLine();

            System.out.print("University  : ");
            String uni = sc.nextLine();

            System.out.print("Marks       : ");
            double marks = sc.nextDouble();
            sc.nextLine();

            Education edu = new Education(course, yop, uni, marks);
            list.add(edu);

            System.out.println("\nEducation Details for '" + course + "' Submitted");

            System.out.print("Do you want to add more educational info? (yes/no): ");
            String resp = sc.nextLine();

            if (!resp.equalsIgnoreCase("yes")) {
                break;
            }
        }

        return list;
    }

    public void displayStudent() {
        System.out.println("\nStudent Info");
        System.out.println("Id      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("Address : " + address);
        displayAllEducationalDetails();
    }

    public void displayAllEducationalDetails() {
        for (Education edu : listEdu) {
            edu.displayEducation();
        }
    }
}
