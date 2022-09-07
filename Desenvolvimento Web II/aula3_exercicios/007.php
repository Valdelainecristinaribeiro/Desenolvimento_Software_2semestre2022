<?php
/*
Crie um script que percorra toda a $array, apresentando os valores.
Utilize foreach.
Adapte o código para exibir somente os valores inteiros.
Realize a soma dos números inteiros

Dica: https://www.php.net/manual/en/control-structures.foreach.php
*/ 
$array = [
    "n1" => 10,
    "n2" => 20,
    "n3" => 30,
    "n4" => 'oi mundo',
];

$soma = 0;

foreach($array as $values){
    echo $values."<br>".PHP_EOL;
}

echo "<br>".PHP_EOL;

foreach($array as $key => $values){
    if (is_integer($values)) {
        echo $values."<br>".PHP_EOL;
        $soma = $soma + $values;
    }   
}

echo "<br>".PHP_EOL;

echo $soma."<br".PHP_EOL;

?>