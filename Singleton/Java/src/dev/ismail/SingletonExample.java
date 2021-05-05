package dev.ismail;

public class SingletonExample {

    private static SingletonExample singleTonInstance = null;


    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        if(singleTonInstance == null) singleTonInstance = new SingletonExample();
        return singleTonInstance;
    }

}
