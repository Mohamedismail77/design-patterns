fun main(args: Array<String>) {

    val singletonExample = SingletonExample.getInstance()
    val singletonExample1 = SingletonExample.getInstance()
    val singletonExample2 = SingletonExample.getInstance()


    println(singletonExample)
    println(singletonExample1)
    println(singletonExample2)

}