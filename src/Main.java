public class Main {
    public static void main(String[] args) {
        // laço enqunto- while
        int contador = 0;
        while (contador < 10) {
            // processos
            System.out.println("Contador = " + contador);
            contador = contador + 1; //Incremento
        }
        // laço faça enquanto- do while
        int cont = 1;
        do {
            System.out.println(cont);
            cont++; //Incremento
        } while (cont <= 10);

        // laço para faça for
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
        }
    }
    }