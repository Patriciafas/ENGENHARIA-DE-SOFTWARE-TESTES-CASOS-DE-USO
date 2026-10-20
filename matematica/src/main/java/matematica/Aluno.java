package matematica;

public class Aluno{
    // : APROVADO, RECUPERACAO, REPROVADO_NOTA, REPROVADO_FALTA
    // APROVADO = Frequência ≥ 75% e média ≥ 60,0.
    // RECUPERÇÃO = Frequência ≥ 75% e média ≥ 40,0 e < 60,0.
    // REPROVADO POR NOTA = Frequência ≥ 75% e média < 40,0.
    // REPROVADO POR FALTA = Frequência menor que 75% reprova o aluno, independentemente da nota.


    public String situacao(int n1,int n2,int n3,Float freq){
        if(n1 > 100 || n1 < 0){
            return "INVALIDO"
        }
        if(n2 > 100 || n2 < 0){
            return "INVALIDO"
        }
        if(n3 > 100 || n3 < 0){
            return "INVALIDO"
        }
        int media = ((n1 + n2 + n3)/3);
        int frequencia = freq;
        if (media >= 60 && frequencia >= 75){
            return "APROVADO";
        }else if((media >= 40 && media < 60) && frequencia >= 75){
            return "RECUPERACAO";
        }else if(media < 40 && frequencia >= 75){
            return "REPROVADO POR NOTA";   
        }else if (frequencia < 75) {
            return "REPROVADO POR FALTA";   
        }

    }
       
}
