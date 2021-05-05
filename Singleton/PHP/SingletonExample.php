<?php


class SingletonExample
{

    private static $instance = null;

    private function __construct()
    {

    }

    public static function  getInstance(){
        if (!isset($instance)){
            $instance = new SingletonExample();
        }
        return $instance;
    }


    public function __toString()
    {
       return spl_object_hash($this)  ;
    }
}