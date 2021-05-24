package dev.ismail;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    // write your code here
        Book hardCopyBook = new HardCopyBook("Clean Code","Clean Code By Martin Fowler",100);
        Book softCopyBook = new SoftCopyBook("Clean Code","Clean Code By Martin Fowler",100);

        Book book = softCopyBook.clone();
        book.setShippingFees(0);
        System.out.println(book);

        book = hardCopyBook.clone();
        book.setShippingFees(50);

        System.out.println(book);

        System.out.println(hardCopyBook);
        System.out.println(softCopyBook);

        hardCopyBook = book;
        System.out.println(hardCopyBook);


    }
}
