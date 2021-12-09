package be.intecbrussel.lesson_arraylist;

import java.util.ArrayList;
import java.util.Optional;

public class ArrayListOptional {

    private ArrayList<String> stringList = new ArrayList<>();

    public Optional<String> getString(int indexPlusOne) {
        if (indexPlusOne > stringList.size() || stringList.get(indexPlusOne - 1) == null) {
            return Optional.empty();
        }

        String stringToReturn = stringList.get(indexPlusOne - 1);

        if (stringToReturn != null) {
            Optional<String> string = Optional.of(stringToReturn);
            return string;
        }

        return Optional.empty();
    }

}
