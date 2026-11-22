
class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class GenericPair {
    public static void main(String[] args) {

        Pair<Integer, String> student =
                new Pair<>(101, "Ananya");

        Pair<String, Double> product =
                new Pair<>("Laptop", 58999.50);

        System.out.println("Student Details:");
        student.display();

        System.out.println("\nProduct Details:");
        product.display();
    }
}
