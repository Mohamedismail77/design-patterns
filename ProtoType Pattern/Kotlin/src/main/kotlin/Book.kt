abstract class Book(var name:String,var description:String,var price:Int):Cloneable {

    private var shippingFees:Int = 0;

    fun setShippingFees(fees:Int){
        this.shippingFees = fees
    }


    override fun clone(): Book {
        return super.clone() as Book
    }

    override fun toString(): String {
        return "Book{name:${this.name},description:${this.description},price:${this.price},shippingFees:${shippingFees}}"
    }

}