package matematica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AlunoTest {
    
    Aluno num = new Aluno();

    @Test
    public void SituacaoTest() {
        assertEquals("REPROVADO POR NOTA", num.situacao(20, 50, 40, 75)); // média 36,67
        assertEquals("REPROVADO POR FALTA", num.situacao(60, 70, 60, 73));
        assertEquals("RECUPERACAO", num.situacao(45, 50, 60, 80));
        assertEquals("APROVADO", num.situacao(70, 80, 60, 75));
        assertEquals("INVALIDO", num.situacao(20, 110, 60, 75));
        assertEquals("INVALIDO", num.situacao(-20, 50, 60, 75));
    }
    public void SituacaoLimitesTest() {
        assertEquals("APROVADO", num.situacao(60, 60, 60, 75));
        assertEquals("RECUPERACAO", num.situacao(59, 60, 60, 75));
        assertEquals("RECUPERACAO", num.situacao(40, 40, 40, 75));
        assertEquals("REPROVADO POR NOTA", num.situacao(40, 40, 39, 75));
        assertEquals("REPROVADO POR FALTA", num.situacao(100, 100, 100, 74));
        assertEquals("REPROVADO POR NOTA", num.situacao(0, 0, 0, 100));
        assertEquals("APROVADO", num.situacao(100, 100, 100, 100));
        assertEquals("INVALIDO", num.situacao(70, 70, 70, -1));
        assertEquals("INVALIDO", num.situacao(70, 70, 70, 101));
        assertEquals("INVALIDO", num.situacao(70, 70, 100.1, 75));
        assertEquals("INVALIDO", num.situacao(70, 70, -0.1, 75));
}
}