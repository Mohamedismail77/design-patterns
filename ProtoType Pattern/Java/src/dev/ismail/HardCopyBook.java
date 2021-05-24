package dev.ismail;

public class HardCopyBook extends Book {


    public HardCopyBook(String name, String description, int price) {
        super(name, description, price);
    }



    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (HardCopyBook) super.clone();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
