package Actividad_04;

public class ACT_04 < E > {
    private final int tamanio;
    private int superior;
    private E[] elementos;

    public ACT_04() {
        this(10);
    }

    public ACT_04(int s) {
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }

    public void push(E e) {
        if( superior == tamanio - 1 ) {
            throw new ExceptionPilaLlena(String.format("La pila esta llena."));
        }
        elementos[++superior] = e;
    }
    public E pop() {
        if (superior == -1) {
            throw new ExceptionPilaVacia("Pila vacia.");
        }
        return elementos[superior--];
    }

    public boolean contains(E elemento){
        for(int i = elementos.length - 1; i >= 0; i--){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }

    public E[] getElementos() {
        return elementos;
    }

    public boolean esIgualA(ACT_04 <E> pila){
        if (elementos.length == pila.getElementos().length){
            for(int i = elementos.length - 1; i >= 0; i--){
                if(!elementos[i].equals(pila.getElementos()[i])){
                    return false;
                }
            }
        } else { return false;}
        return true;
    }

}

class Main{
    public static void main(String[] args) {
        ACT_04 <Integer> pila = new ACT_04<Integer>();
        ACT_04 <Integer> pila2 = new ACT_04<Integer>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        pila.push(9);
        pila.push(10);
        pila2.push(1);
        pila2.push(2);
        pila2.push(3);
        pila2.push(4);
        pila2.push(5);
        pila2.push(6);
        pila2.push(7);
        pila2.push(8);
        pila2.push(9);
        pila2.push(10);

        boolean exec = pila.esIgualA(pila2);
        System.out.println(exec);
    }
}