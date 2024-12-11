class Student{
    private String name;
    private int iD;
    private String email;
    private int age;
    private double gpa;
    Student(String name, int iD, String email, int age, double gpa){
        this.name = name;
        this.iD = iD;
        this.email = email;
        this.age = age;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return iD;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }
    public double getGPA(){
        return gpa;
    }
    public String toString(){
        return "Name : " + name + "\nID : " + iD + "\nEmail : " + email + "\nAge : " + age + "\nGPA : " + gpa;
    }
}