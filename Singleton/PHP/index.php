<?php
require 'SingletonExample.php';

$singletonExample = SingletonExample::getInstance();
$singletonExample1 = SingletonExample::getInstance();

echo $singletonExample."\n".$singletonExample1;