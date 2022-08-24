#include<iostream>
#include<cstdlib>
#include<locale>
using namespace std;

struct Pessoa{
	char nome[20], sobrenome[30];
	int idade;
};

int main(){
	setlocale(LC_ALL, "Portuguese");
	Pessoa p1, p2;
	
	p1.idade = 25;
	p1.nome = "Ricardo";
	p1.sobrenome = "Pereira";
	
	strucpy(p1.nome, p1.sobrenome);
	
	cout<< p1.nome << endl;
	
}
