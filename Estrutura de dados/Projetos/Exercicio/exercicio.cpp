#include<iostream>
#include<cstdlib>
#include<locale>
using namespace std;

/*
A delegação francesa de Futsal deseja criar um
programa que deva conter o nome do atleta, sua
posição, idade e altura. Crie uma estrutura
representando um atleta. Agora, escreva um
programa que leia os dados de cinco atletas.
Calcule e exiba os nomes do atleta mais alto e do
mais velho.
*/

struct Atleta{
	
};

int main(){
	setlocale(LC_ALL, "Portuguese");
	Pessoa p1, p2;
	
	p1.idade = 25;
	p1.nome = "Ricardo";
	p1.sobrenome = "Pereira";
	
	strcpy(p1.nome, p1.sobrenome);
	
	cout<< p1.nome << endl;
	
}
