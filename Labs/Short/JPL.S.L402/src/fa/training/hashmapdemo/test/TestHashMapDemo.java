package fa.training.hashmapdemo.test;

import fa.training.hashmapdemo.*;

public class TestHashMapDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMapCreationExample hashMapCreation = new HashMapCreationExample();
        HashMapAccessKeyExample hashMapAccess = new HashMapAccessKeyExample();
        HashMapObtainKeySetExample hashMapKeySet = new HashMapObtainKeySetExample();
        HashMapIteratorExample hashMapIterator = new HashMapIteratorExample();
        HashMapRemoveKeyExample hashMapRemove = new HashMapRemoveKeyExample();
        
        hashMapCreation.createHashMap();
        hashMapCreation.createEmployeeMap();
        hashMapAccess.accessKeys();
        hashMapKeySet.obtainEntryKeySetValues();
        hashMapIterator.iterateHashMap();
        hashMapRemove.removeKeys();
    }
}
