#include <iostream>
#include <cstdlib>
#include <locale>

using namespace std;

/*
Criar um programa que recebe di usuário os dados para
preencher dois vetores de inteiros de 5 elementos cada.
Passar os dois vetores para uma função e calcular a soma
dos vetores com os respectivos indices (1:1,  2:2, .., 5:5).
A função vai retornar o terceiro vetor para exibir na Main.
 */
 
//cabeçalho
int *soma(int,int,int);

//função soma de vetores
int *soma(int a[], int b[], int c[]){
	
	for(int i=0; i<5; i++){
		c[i] = a[i] + b[i];
	}
	return c;
}
int main(int argc, char** argv) {
	setlocale(LC_ALL, "Portuguese");
	int a [5], b[5], c[5];
	
	for(int l=0; l<5; l++){
		cout<< "Digite o número para vator A " << l+1 <<endl;
		cin>> a[l];
	}
	
	cout<< "------------------- \n";
		
	for(int j=0; j<5; j++){
		cout<< "Digite o número para vetor B " << j+1 <<endl;
		cin>> b[j];
	}
		
	cout<< "Os valores para vetor c é: \n";
	
	soma(a,b,c);
	
	for(int k=0; k<5; k++){
		cout<< "Vetor c: " << c[k] <<endl;
	}
	
	return 0;
}
