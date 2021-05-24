<?php

class SoftCopyBook extends Book
{

    /**
     * HardCopyBook constructor.
     */
    public function __construct($name,$description,$price)
    {
        parent::__construct($name,$description,$price);
    }

    public function __toString()
    {
        return parent::__toString();
    }

}