<?php


abstract class Book
{
    private $name;
    private $description;
    private $price;

    private $shippingFees;

    /**
     * Book constructor.
     * @param $name
     * @param $description
     * @param $price
     */
    public function __construct($name, $description, $price)
    {
        $this->name = $name;
        $this->description = $description;
        $this->price = $price;
    }

    /**
     * @return mixed
     */
    public function getShippingFees()
    {
        return $this->shippingFees;
    }

    /**
     * @param mixed $shippingFees
     */
    public function setShippingFees($shippingFees)
    {
        $this->shippingFees = $shippingFees;
    }


    public function __toString()
    {
        return "Book:{name: ".$this->name.",description: ".$this->description.",price: ".$this->price.",shippingFees: ".$this->shippingFees."}";
    }

}