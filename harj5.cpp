// vuoden sekunnit
/*

Laskee kuinka monta sekuntia on vuodessa.
Voit olettaa, ett� vuodessa on 365 p�iv��.
Ohjelman tulostus on seuraava:
Vuodessa on X sekuntia.
X:n kohdalle tulee ohjelmasi laskema tulos. Huom! Hy�dynn� t�ss� teht�v�ss� muuttujia.
*/

#include <iostream>
using namespace std;

int main(){

        int paiviaVuodessa = 365;
        int tuntejaPaivassa = 24;
        int minuuttejaTunnissa = 60;
        int sekuntejaMinuutissa = 60;
        int sekuntejaVuodessa = paiviaVuodessa * tuntejaPaivassa * minuuttejaTunnissa * sekuntejaMinuutissa;

        // �l� muuta alla olevaa tulostuslausetta (muokkaa vain yll� olevia muuttujia ja laskua)
        cout<<"Vuodessa on "<<sekuntejaVuodessa<<" sekuntia.";

        return 0;
}

