package matematica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncoesTest {
    
    Funcoes num = new Funcoes();

    @Test
    public void fatorialTest(){
        
        assertEquals(-1, num.fatorial(-2));
        assertEquals(1, num.fatorial(0));
        assertEquals(1, num.fatorial(1));
        assertEquals(120, num.fatorial(5));
    }

    @Test
    public void maiorNumeroTest(){
        assertEquals(99, num.maiorNumero(33, 33, 99));
        assertEquals(99, num.maiorNumero(99, 33, 33));
        assertEquals(99, num.maiorNumero(33, 99, 33));
        assertEquals(99, num.maiorNumero(33, 66, 99));
        assertEquals(99, num.maiorNumero(66, 33, 99));
    }

    @Test
    public void numeroParTest(){
        assertEquals("PAR", num.numeroPar(4));
    }
    
    @Test
    public void triangulosTest(){
        assertEquals("Equilatero", num.triangulos(4.0, 4.0, 4.0));
        assertEquals("Isosceles", num.triangulos(4.0, 6.0, 4.0));
        assertEquals("Isosceles", num.triangulos(4.0, 4.0, 6.0));
        assertEquals("Isosceles", num.triangulos(6.0, 4.0, 4.0));
        assertEquals("Escaleno", num.triangulos(4.0, 5.0, 6.0));
        assertEquals("Não forma triangulo", num.triangulos(9.0, 4.0, 3.0));
        assertEquals("Não forma triangulo", num.triangulos(4.0, 9.0, 3.0));
        assertEquals("Não forma triangulo", num.triangulos(4.0, 3.0, 9.0));
    }
}
