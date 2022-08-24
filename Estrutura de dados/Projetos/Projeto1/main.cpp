#include <iostream>
#include <cstdlib>
#include <locale>

/*
	Crie um programa que fa�a o calculo da �rea, perimetro do ret�ngulo, usando fun��o.
	Ter� duas fun��es. Os lados do ret�ngulo ter� 4 e 5. Retorna o resultado na main.
*/

using namespace std;

int area(int,int);
int perimetro(int,int);

/*fun��o: calculo da �rea do ret�ngulo*/
int area(int l1, int l2){
	int r;
	r = l1 * l2;
	return r;
}

/*fun��o: calculo do per�metro do ret�ngulo*/
int perimetro(int l1, int l2){
	int b;
	b = 2*(l1+l2);
	return b;
}

int main(int argc, char** argv) {
	setlocale(LC_ALL, "Portuguese");
	
	/*declarando variaveis*/
	int l1 = 4, l2 = 5, a, p;
	
	/*chamadas das fun��es*/
	a = area(l1,l2);
	p = perimetro(l1,l2);
	
	/*impress�o dos resultados*/
	cout<< "�rea: " << a << endl;
	cout<< "Per�metro: " << p << endl;
	
	return 0;
}
