<?php
/*
Crie um script que apresente o tipo de $array e os valores presentes.
Neste mesmo script, tente acessar na $array com a chave 'teste' e descubra o que acontece.
*/ 
$array = [
    "n1" => 10,
    "n2" => 20,
    "n3" => 30,
    "n4" => 'oi mundo',
];

print gettype($array['n1']). '<br>' .PHP_EOL;
echo $array['n1']. '<br>' .PHP_EOL;
print gettype($array['n2']). '<br>' .PHP_EOL;
echo $array['n2']. '<br>' .PHP_EOL;
print gettype($array['n3']). '<br>' .PHP_EOL;
echo $array['n3']. '<br>' .PHP_EOL;
print gettype($array['n4']). '<br>' .PHP_EOL;
echo $array['n4']. '<br>' .PHP_EOL;
print gettype($array['teste']). '<br>' .PHP_EOL;
echo $array['teste']. '<br>' .PHP_EOL;

?>