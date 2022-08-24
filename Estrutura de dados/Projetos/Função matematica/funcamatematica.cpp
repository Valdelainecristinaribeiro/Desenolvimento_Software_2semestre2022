/*
Com base nas funções matemáticas crie um programa que 
utiliza uma função que recebe um numero e retorna o 
quadrado desse valor. Faça duas funçoes uma utilizando
passagem de parametro por valor e outra por referencia.
*/

#include<iostream>
#include<locale>
#include<cmath>
using namespace std;
//cabeçalho
int quadrado(int,int);
int quadrado2(int *);

//função retornando o valor sem referencia recebendo uma copia da main
int quadrado(int numero3, int numero2){
	int quad;
	quad=pow(numero3,numero2);
	return quad;
}

//função retornando o valor por referencia recebendo o endereço da main
int quadrado2(int *numero1){
	int quad2;
	quad2=pow(*numero1,2);
	return quad2;
}

int main(){
	setlocale(LC_ALL, "Portuguese");
	int numero1=6, numero2=2, numero3=5;
	
	cout<< quadrado(numero3,numero2) << endl;
	cout<< quadrado2(&numero1) << endl;
	
	return 0;
}
