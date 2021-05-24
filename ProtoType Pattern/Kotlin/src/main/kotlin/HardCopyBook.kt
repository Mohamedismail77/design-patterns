class HardCopyBook(name: String, description: String, price: Int) : Book(name, description, price),Cloneable {

    public override fun clone(): Book {
        return super<Book>.clone() as HardCopyBook
    }
}