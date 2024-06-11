package fa.training.hashsetdemo.test;

import fa.training.hashsetdemo.*;

public class TestHashSetDemo {
    public static void main(String[] args) {
        HashSetCreationExample hashSetCreation = new HashSetCreationExample();
        HashSetRetrieveElementExample hashSetElements = new HashSetRetrieveElementExample();
        HashSetRemoveElementExample hashSetRemove = new HashSetRemoveElementExample();
        HashSetIterationExample hashSetIteration = new HashSetIterationExample();

        hashSetCreation.createHashSet();
        hashSetElements.retrieveElements();
        hashSetRemove.removeElements();
        hashSetIteration.hashSetIterator();

    }
}
