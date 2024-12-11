import java.util.*;
import java.util.regex.*;
public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean opt = true;
        while (opt){
            System.out.print("Enter the Operation(Add Students, View Students, Search Students, Sort Students, Exit): ");
            String operation = input.nextLine();
            switch (operation) {
                case "Add Students":
                    addStudents(input);
                    break;
                case "View Students":
                    viewStudents();
                    break;
                case "Search Students":
                    searchStudents(input);
                    break;
                case "Sort Students":
                    sortStudents(input);
                    break;
                case "Exit":
                    System.out.println("Logging Out");
                    opt = false;
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
    public static void addStudents(Scanner input) {

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Student Age: ");
        int age = input.nextInt();
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student Email Address: ");
        String mail = input.nextLine();
        while(!validEmail(mail)){
            System.out.print("Enter Valid Email Address: ");
            mail = input.nextLine();
        }
        System.out.print("Enter Student GPA: ");
        double gpa = input.nextDouble();

        input.nextLine();
        Student newStudent = new Student(name, id, mail, age, gpa);
        students.add(newStudent);
        System.out.println("Student Added");
    }
    public static boolean validEmail(String email){
        String regexExp = "^[a-zA-Z0-9._]+@[a-zA-Z.]+$";
        Pattern pattern = Pattern.compile(regexExp);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    public static void viewStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }
    public static void searchStudents(Scanner input){
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }
    private static void sortStudents(Scanner input){
        System.out.println("Enter a field to sort by (Name, ID, Age, Mail, CGPA): ");
        String field = input.nextLine();
        Collections.sort(students,new StudentComparator(field));
        for(Student student : students){
            System.out.println(student);
        }
    }

}