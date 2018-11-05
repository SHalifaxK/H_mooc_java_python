#include <iostream>
using namespace std;

/*
Tee ohjelma, jonka avulla voidaan laskea kahden kokonaisluvun summa.
Ohjelman alussa määritellään kaksi muuttujaa, jotka sisältävät summattavat luvut.
Voit tarvittaessa käyttää myös muita muuttujia.

Esimerkiksi jos muuttujissa on luvut 5 ja 4, ohjelman tulostus on seuraava:
5 + 4 = 9

Jos taas muuttujissa on luvut 73457 ja 12888, ohjelman tulostus on seuraava:
73457 + 12888 = 86345
*/

double add(double x, double y){
    double summa;
    summa = x + y;

    return summa;
}

int main(){
    cout<<"Anna kaksi lukua"<<endl;
    cout<<"luku1: "<< endl;
    double x;
    cin>>x;
    cout<<"luku2: "<<endl;
    double y;
    cin>>y;
    cout<<"summa on "<<add(x,y);
    return 0;
}
