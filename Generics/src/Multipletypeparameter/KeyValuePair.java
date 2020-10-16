package Multipletypeparameter;

public class KeyValuePair<K,V> { // here there are two types of paramters here
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
