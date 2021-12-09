package be.intecbrussel.lesson_arraylist;

import java.util.ArrayList;
import java.util.Optional;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");

        System.out.println(stringList.get(3));

    }

}
