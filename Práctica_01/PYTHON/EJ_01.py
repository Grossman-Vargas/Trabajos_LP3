import array;

def suma_arreglo(arreglo):
    cont = 0;
    for i in arreglo:
        cont += i;
    return cont;


arr = array.array("i", [1,2,3,4,5]);
print(suma_arreglo(arr));