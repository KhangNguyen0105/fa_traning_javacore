package fa.training.stringdemo.test;

import fa.training.stringdemo.*;

public class TestStringDemo {
    public static void main(String[] args) {
        StringImmutableExample stringImmutable = new StringImmutableExample();
        StringMethodExample stringMethod = new StringMethodExample();
        StringCountNumberOfWord CountWord = new StringCountNumberOfWord();

        stringImmutable.demonstrateStringImmutable();
        stringMethod.demonstrateStringMethod();
        CountWord.demonstrateCountWord();
    }
}
