package be.intecbrussel.exercise1;

public class DuoApp {

    public static void main(String[] args) {

        Duo<String> stringDuo = new Duo<>("Hi", "MrsJenkins");
        Duo<Integer> integerDuo = new Duo<>(9, 3);
        MixedDuo<String, Integer> stringAndIntegerDuo = new MixedDuo<>("Hi",
                                                                       42);

        String first = stringDuo.getFirst();
        String second = stringDuo.getSecond();

        String firstFromMixed = stringAndIntegerDuo.getFirst();
        Integer secondFromMixed = stringAndIntegerDuo.getSecond();

        stringDuo.swap();
        System.out.println(stringDuo);

        System.out.println(secondFromMixed + " " + firstFromMixed);
    }

}
