package sample;

public interface Animal {
    default void Scream(String sentence) {
        System.out.println(sentence);
    }
    void MakeSound();
}
