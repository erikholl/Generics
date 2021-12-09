package be.intecbrussel.lesson_schoolclass;

import java.util.ArrayDeque;
import java.util.Optional;

// weird app, and still throws an out of bound exception - need to check
// (tomorrow, tomorrow..)
public class SchoolClassApp {
    public static void main(String[] args) {

        SchoolClass sc = new SchoolClass();
        Optional<String> thirdStudent = sc.getStudent(4);

        if (thirdStudent.isPresent()) {
            System.out.println(thirdStudent.get());
        } else {
            System.out.println("There is no student");
        }

        ArrayDeque<String> ad = new ArrayDeque<>(); // hmm, check ArrayDeque..
    }

}
