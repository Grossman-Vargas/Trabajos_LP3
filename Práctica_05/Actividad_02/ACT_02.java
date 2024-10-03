package Actividad_02;

public class ACT_02 < E > {
    private final int tamanio;
    private int superior;
    private E[] elementos;

    public ACT_02() {
        this(10);
    }

    public ACT_02(int s) {
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

}
