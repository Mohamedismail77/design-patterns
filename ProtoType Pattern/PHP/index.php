<?php
require 'Book.php';
require 'HardCopyBook.php';
require 'SoftCopyBook.php';

$hardCopyBook = new HardCopyBook("Clean Code","Clean Code by Martin Flower",100);
$softCopyBook = new SoftCopyBook("Clean Code","Clean Code by Martin Flower",100);

$book = clone $softCopyBook;
$book->setShippingFees(0);
echo $book."\n";

$book = clone $hardCopyBook;
$book->setShippingFees(50);
echo $book."\n";

echo $softCopyBook."\n";
echo $hardCopyBook."\n";
$hardCopyBook = $book;
echo $hardCopyBook."\n";