package matematica;



public class Funcoes {
    
    public int fatorial(int valor){
        int fat =1;

        if (valor<0){
            System.out.println("Valor Negativo!!! Não é válido");
            fat=-1;
        }
        else
            if (valor==0 || valor == 1)
                return fat;
            else
                while (valor>0){
                    valor--;
                    fat+=(fat*valor);
                }
        return fat;


    }

    public int maiorNumero(int v1, int v2, int v3){
        int maior = 0;
        if(v1>v2 && v1>v3)
            maior = v1;
        else
            if (v2>v1 && v2>v3)
                maior = v2;
            else maior = v3;
        return maior;
    }

    public String numeroPar(int valor){
        String x;
        if (valor == 0)
           x = "0";
        else
            if(valor%2 == 0)
                x = "PAR";
            else
                x ="IMPAR";
        return x;


    }

    public String triangulos(double a, double b, double c){

        if (a<c+b && b<a+c && c<a+b){
            if(a==b && b==c)
                return "Equilatero";
            else 
                if (a==b || b==c || c==a)
                    return "Isosceles";
                else
                    return "Escaleno";
        }
        else
            return "Não forma triangulo";     

    }

}
