<?php
/*
Escreva um script que imprima qual o maior número.
Use IF
*/
$a = 10;
$b = 1;
$c = 40;
$maior;

if ($a > $b && $a > $c) {
    $maior = $a;
}

if ($b > $a && $b > $c) {
    $maior = $b;
}

if ($c > $b && $c > $a) {
    $maior = $c;
}

echo $maior;

?>