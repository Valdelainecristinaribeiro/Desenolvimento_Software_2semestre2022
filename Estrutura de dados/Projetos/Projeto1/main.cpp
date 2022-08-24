#include <iostream>
#include <cstdlib>
#include <locale>

/*
	Crie um programa que faça o calculo da área, perimetro do retângulo, usando função.
	Terá duas funções. Os lados do retângulo terá 4 e 5. Retorna o resultado na main.
*/

using namespace std;

int area(int,int);
int perimetro(int,int);

/*função: calculo da área do retângulo*/
int area(int l1, int l2){
	int r;
	r = l1 * l2;
	return r;
}

/*função: calculo do perímetro do retângulo*/
int perimetro(int l1, int l2){
	int b;
	b = 2*(l1+l2);
	return b;
}

int main(int argc, char** argv) {
	setlocale(LC_ALL, "Portuguese");
	
	/*declarando variaveis*/
	int l1 = 4, l2 = 5, a, p;
	
	/*chamadas das funções*/
	a = area(l1,l2);
	p = perimetro(l1,l2);
	
	/*impressão dos resultados*/
	cout<< "Área: " << a << endl;
	cout<< "Perímetro: " << p << endl;
	
	return 0;
}
