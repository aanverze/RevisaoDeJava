package calculadora;

public class Calculadora {
    public static void main(String[] args) {

        //args recebe os argumentos passados na linha de comando
        int n1 = Integer.parseInt(args[0]); //converte String para inteiro
        int n2 = Integer.parseInt(args[1]);


        System.out.println("Soma:  " + (n1 + n2));
        System.out.println("Diferença: " + (n1 - n2));
        System.out.println("Produto: " + (n1 * n2));
        System.out.println("Divisão: " + (n1 / n2));
        if(n1 > n2) {
            System.out.println("N1 é maior: " + (n1));
        }
            else if (n2 > n1) {

            System.out.println("N2 é maior: " + (n2));
        }

            else {
            System.out.println("Números iguais");
                }

        }


    }

