
/*Tee ohjelma, jonka tulostus on seuraava:
*
*     *
*    ***
*   *****
*  *******
* *********
*     *
*/

#include <iostream>
#include <iomanip>  //<--- needed for setting the width of the print 'screen'

using namespace std;
//     ########## functio: kuinka monta tyhj�� ja kuinka monta t�hte�.#############
/*string printStar(string blank, int num){

}
*/
void normalPrint(){
        cout<<"    *    "<<endl;
        cout<<"   ***   "<<endl;
        cout<<"  *****  "<<endl;
        cout<<" ******* "<<endl;
        cout<<"*********"<<endl;
        cout<<"    *    "<<endl;
}
void setWidth(){
    cout<<setw(5)<<"*"<<setw(4)<<endl;
    cout<<setw(6)<<"***"<<setw(3)<<endl;
    cout<<setw(7)<<"*****"<<setw(2)<<endl;
    cout<<setw(8)<<"*******"<<setw(1)<<endl;
    cout<<setw(9)<<"*********"<<endl;
    cout<<setw(5)<<"*"<<setw(4)<<endl;
}
int main(){
    setWidth();
    return 0;
}
