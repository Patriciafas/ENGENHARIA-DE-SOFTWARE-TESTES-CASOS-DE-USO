package matematica;

import java.util.Scanner;


public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        Math calc = new Math();
        Funcoes n = new Funcoes();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hello World!");
        System.out.println("Entre com o valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Entre com o valor de b: ");
        int b = entrada.nextInt();
        System.out.println("SOMA = "+ calc.sun(a,b) );
        System.out.println("SUBTRACAO = "+ calc.sub(a,b));
        System.out.println("MULTIPLICACAO = "+ calc.mult(a,b));
        System.out.println("DIVISAO = "+ calc.div(a,b));
        System.out.println("Entre com o valor para fatorial: ");
        int f = entrada.nextInt();
        System.out.println("Fatorial de "+f +" = "+n.fatorial(f));
        System.out.println("Entre com tres valores: ");
        int g = entrada.nextInt();
        int h = entrada.nextInt();
        int i = entrada.nextInt();
        System.out.println("Maior numero: "+n.maiorNumero(g,h,i));
        System.out.println("Entre com um valor: ");
        int j = entrada.nextInt();
        System.out.println("Tipo de numero: "+n.numeroPar(j));
     
      
        entrada.close();
    }
}
