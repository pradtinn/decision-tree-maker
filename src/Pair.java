package src;

public class Pair<K, V> {

    private K first;
    private V second;

    public Pair(K f, V s) {
        first = f;
        second = s;
    }

    public Pair() {
        first = null;
        second = null;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K f) {
        first = f;
    }

    public void setSecond(V s) {
        second = s;
    }

    public boolean isNull() {
        return ((first == null) || (second == null));
    }
}