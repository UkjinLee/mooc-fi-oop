package week5;

public class Student {

//    EXERCISE 88.1: CLASS STUDENT

//    name (String)
    private String name;

//    studentNumber (String)
    private String studentNumber;

//    A constructor that initializes the name and the student number with the given parameters.
    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

//    getName, that returns the student name
    public String getName() {
        return name;
    }

//    getStudentNumber, that returns the student number
    public String getStudentNumber() {
        return studentNumber;
    }

//    toString, that returns a String representation of the form:
//    Pekka Mikkola (013141590)

    @Override
    public String toString() {
        return name + " (" + studentNumber + ")";
    }
}
