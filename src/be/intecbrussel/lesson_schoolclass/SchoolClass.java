package be.intecbrussel.lesson_schoolclass;

import java.util.Optional;

public class SchoolClass {

    private String[] presentStudents = {"Ali", "Loic", "Nazif"};

    public Optional<String> getStudent(int orderArrived) {
        String orderedStudent = presentStudents[orderArrived -1];
        if (orderArrived > presentStudents.length || orderedStudent == null) {
            return Optional.empty();
        }

        return Optional.of(orderedStudent);
    }

}
