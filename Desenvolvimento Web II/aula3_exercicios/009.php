<?php
/*
Faça o cálculo da média simples de 
$nota_1 e $nota_2.
Imprima a média simples.
Imprima a condição:
    Se a média menor ou igual a 4.9, reprovado.
    Se a média entre 5 e 7, recuperação.
    Se a média acima de 7, aprovado.
*/
$nota_1 = 9;
$nota_2 = 4;

function mediasimples($nota_1, $nota_2){
    $soma = 0;
    $media = 0;
    $soma = $nota_1 + $nota_2;
    $media = $soma / 2;
    return $media;
}

function rra($media){
    // 1= reprovado
    // 2= recuperação
    // 3= aprovado
    if ($media <=4.9) {
        return 1;
    }elseif ($media >= 5 and $media < 7) {
        return 2;
    }else {
        return 3;
    }
}

echo 'Média é: '. mediasimples($nota_1, $nota_2) ."<br>\n";

$media = mediasimples($nota_1, $nota_2);

if (rra($media) == 1) {
    echo 'Reprovado'."<br>\n"; 
}elseif (rra($media) == 2) {
    echo 'Recuperação'."<br>\n";
}else {
    echo 'Aprovado'."<br>\n";
}



?>