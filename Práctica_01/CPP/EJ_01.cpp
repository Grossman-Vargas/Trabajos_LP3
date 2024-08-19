#include <iostream>
#include "vector"
using namespace std;

//Con array
int suma_arr(int *arrreglo,int tamaño){
    int cont = 0;
    for(int i = 0; i < tamaño; i++){
        cont += arrreglo[i];
    }
    return cont;
}

//Con vector
int suma_arr_2(vector<int> vec){
    int cont = 0;
    for (int i : vec){
        cont += i;
    }
    return cont;
}

int main(){
    int arr[5] = {1,2,3,4,5};
    vector vec = {1,3,5,7};

    int rpta = suma_arr(arr,5);
    int rpta_2 = suma_arr_2(vec);

    cout << "La suma es " << rpta << endl;
    cout << "La suma usando vector es " << rpta_2 << endl;

    return 0;
};