<?php
/*
Descrubra se $numero é :
 - Divisível por 10
 - Divisível por 3
 - Se não é divisível por nenhum destes 

Imprimir mensagem na tela do número e as condições acima.
*/
$numero = 150;
$aux;
echo $numero . '<br>' . PHP_EOL;
$aux = $numero % 10;
$numero = $numero % 3;
if ($aux == 0) {
    echo 'Número divisivel por 10 ' . '<br>' . PHP_EOL;
    echo $aux . '<br>' . PHP_EOL;
}
if ($numero == 0) {
    echo 'Número divisivel por 3 ' . '<br>' . PHP_EOL;
    echo $numero . '<br>' . PHP_EOL;
}
if($numero != 0) {
    echo 'Número não é divisivel por 3 ' . '<br>' . PHP_EOL;
}
if ($aux != 0) {
    echo 'Número não é divisivel por 10 ' . '<br>' . PHP_EOL;
}

?>