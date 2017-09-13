package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

//        EXERCISE 88.1: CLASS STUDENT

//        name: Pekka Mikkola
//        studentnumber: 013141590
//        Pekka Mikkola (013141590)

//        week5.Student pekka = new week5.Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);


//        EXERCISE 88.2: LIST OF STUDENTS

//        name: Alan Turing
//        studentnumber: 017635727
//        name: Linus Torvalds
//        studentnumber: 011288989
//        name: Steve Jobs
//        studentnumber: 013672548
//        name:
//
//        Alan Turing (017635727)
//        Linus Torvalds (011288989)
//        Steve Jobs (013672548)

//        asks for student information from the user until the user gives a student an empty name.
//        After the student info has been entered, all students are printed.
//        use ArrayList for storing week5.Student object

//        ArrayList<week5.Student> students = new ArrayList<>();
//
//        while (true) {
//            System.out.print("name: ");
//            Scanner reader = new Scanner(System.in);
//            String name = reader.nextLine();
//            if (name.isEmpty())
//                break;
//            System.out.print("studentnumber: ");
//            String studentNumber = reader.nextLine();
//            students.add(new week5.Student(name, studentNumber));
//        }
//
//        System.out.println();
//        for (week5.Student student : students) {
//            System.out.println(student);
//        }


//        EXERCISE 88.3: SEARCH

//        name: Carl Gustaf Mannerheim
//        studentnumber: 015696234
//        name: Steve Jobs
//        studentnumber: 013672548
//        name: Edsger Dijkstra
//        studentnumber: 014662803
//        name:
//
//        Carl Gustaf Mannerheim (015696234)
//        Steve Jobs (013672548)
//        Edsger Dijkstra (014662803)
//
//        Give search term: st
//        Result:
//        Carl Gustaf Mannerheim (015696234)
//        Edsger Dijkstra (014662803)

//        after the student info has been entered and students printed,
//        the user can search the student list based on a given search term.

        ArrayList<Student> students = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty())
                break;
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }

        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student student : students) {
            if (student.getName().contains(search))
                System.out.println(student);
        }
    }
}
