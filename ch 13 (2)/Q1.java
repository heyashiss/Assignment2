/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/
public class Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> obj1 = new Pair<>(1, "Ashis");
        System.out.println("Key:" + obj1.getKey() + "\nValue:" + obj1.getValue()); //
    }
}

class Pair<E, V> {
    private E key;
    private V value;

    public Pair(E key, V value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(E e) {
        this.key = e;
    }

    public void setValue(V v) {
        this.value = v;
    }

}
/
