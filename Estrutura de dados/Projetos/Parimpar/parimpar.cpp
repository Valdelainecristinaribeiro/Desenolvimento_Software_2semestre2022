#include<iostream>
#include<cstdlib>
#include<locale>
using namespace std;

//cabeçalho
void parimpar(int numero);
void primo(int numero);

//função par e impar
void parimpar(int numero){
	float resto;
	resto=numero%2;
	if(resto == 0){
		cout<<"Par \n";
	}else{
		cout<<"Ímpar \n";
	}
}

//função primo
void primo(int numero){
	int div=0;
	for(int i=1; i<=numero; i++){
        if(numero%i==0){
        	div++;
		}  
	}
	
    if(div==2){
        cout<<"É primo"<<endl;
    }else{
        cout<<"Não é primo"<<endl;
	}
}

int main(){
	setlocale(LC_ALL, "Portuguese");
	int numero;
	
	cout<<"Informe um número: \n";
	cin>> numero;
	
	parimpar(numero);
	primo(numero);
	
	return 0;
}
