/*
Muuta ohjelmaa annetuista kohdista niin että tuloste on:
Kanoja:
9000
Pekonia (kg):
0.1
Tässä vielä tiivistelmä:
9000
0.1
*/
#include <iostream>

using namespace std;

int main(){

int kanojenLkm = 9000;
double pekoninPaino = 0.1;

// ÄLÄ MUUTA NÄITÄ:
cout<<"Kanoja:"<<endl;
cout<<kanojenLkm<<endl;

cout<<"Pekonia (kg):"<<endl;
cout<<pekoninPaino<<endl;

cout<<"Tassa viela tiivistelma:"<<endl;
cout<<kanojenLkm<<endl;
cout<<pekoninPaino;

return 0;
}

