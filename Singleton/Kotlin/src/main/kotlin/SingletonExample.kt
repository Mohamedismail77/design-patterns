class SingletonExample private constructor() {


    companion object{
        private var instance: SingletonExample? = null
        fun getInstance():SingletonExample{
            if (instance == null) instance = SingletonExample();
            return instance as SingletonExample
        }
    }


}