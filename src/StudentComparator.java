import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
    private String field;
    public StudentComparator(String field) {
        this.field = field;
    }
    public int compare(Student s1, Student s2) {
        switch (field) {
            case "name":
                return s1.getName().compareTo(s2.getName());
            case "age":
                return Integer.compare(s1.getAge(), s2.getAge());
            case "id":
                return Integer.compare(s1.getID(), s2.getID());
            case "email":
                return s1.getEmail().compareTo(s2.getEmail());
            case "gpa":
                return Double.compare(s1.getGPA(), s2.getGPA());
            default:
                return 0;
        }
    }
}