package be.intecbrussel.exercise2;

public class NumberDuoDemo {

    public static void main(String[] args) {

        NumberDuo<Integer> ndInt = new NumberDuo<>(9, 4);
        NumberDuo<Double> ndDouble = new NumberDuo<>(3.1415, 2.7172);
//        NumberDuo<Byte> ndByte = new NumberDuo<>(-128, 127); // ERROR, BUT
//        WHY??
//        NumberDuo<Float> ndFloat = new NumberDuo<>(3.1415, 2.7172); //
//        ERROR, BUT WHY??

        System.out.println(ndInt.getSum());
        System.out.println(ndDouble.getSum());
    }

}
