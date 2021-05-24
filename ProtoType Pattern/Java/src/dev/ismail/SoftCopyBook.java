package dev.ismail;

public class SoftCopyBook extends Book {


    public SoftCopyBook(String name, String description, int price) {
        super(name, description, price);
    }


    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (SoftCopyBook) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
