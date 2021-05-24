fun main(args: Array<String>) {

    var hardCopyBook = HardCopyBook(name="Clean Code",description = "Clean Code By Martin Flower",price = 100)
    val softCopyBook = SoftCopyBook(name="Clean Code",description = "Clean Code By Martin Flower",price = 100)

    var book = softCopyBook.clone()
    book.setShippingFees(0)
    println(book)

    book = hardCopyBook.clone()
    book.setShippingFees(50)
    println(book)

    println(hardCopyBook);

    hardCopyBook = book as HardCopyBook
    print(hardCopyBook)
}