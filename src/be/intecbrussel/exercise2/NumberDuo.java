package be.intecbrussel.exercise2;

public class NumberDuo<E extends Number> {
    private E first;
    private E second;

    public NumberDuo(E first, E second) {
        setFirst(first);
        setSecond(second);
    }

    public void setFirst (E first) {
        this.first = first;
    }

    public E getFirst() {
        return first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E getSecond() {
        return second;
    }

    public double getSum() {
        return first.doubleValue() + second.doubleValue();
    }

}
