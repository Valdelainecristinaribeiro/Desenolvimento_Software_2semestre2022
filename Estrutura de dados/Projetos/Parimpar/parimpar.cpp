#include<iostream>
#include<cstdlib>
#include<locale>
using namespace std;

//cabe�alho
void parimpar(int numero);
void primo(int numero);

//fun��o par e impar
void parimpar(int numero){
	float resto;
	resto=numero%2;
	if(resto == 0){
		cout<<"Par \n";
	}else{
		cout<<"�mpar \n";
	}
}

//fun��o primo
void primo(int numero){
	int div=0;
	for(int i=1; i<=numero; i++){
        if(numero%i==0){
        	div++;
		}  
	}
	
    if(div==2){
        cout<<"� primo"<<endl;
    }else{
        cout<<"N�o � primo"<<endl;
	}
}

int main(){
	setlocale(LC_ALL, "Portuguese");
	int numero;
	
	cout<<"Informe um n�mero: \n";
	cin>> numero;
	
	parimpar(numero);
	primo(numero);
	
	return 0;
}
