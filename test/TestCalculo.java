/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculo.Calculo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Y4307944
 */
public class TestCalculo {

    public TestCalculo() {
    }

    @Test

    /**
     *
     * @Description Testa o método de divisão
     */
    public void testDivisao() {
        System.out.println("Divisão");
        float a = 20;
        float b = 10;
        float expResult = 2;
        float result = Calculo.Divisao(a, b);
        assertEquals(expResult, result, 0);

    }

    @Test

    /**
     *
     * @Description Testa o método de divisão
     */
    public void testSoma() {
        System.out.println("Soma");
        float a = 10;
        float b = 6;
        float expResult = 16;
        float result = Calculo.Soma(a, b);
        assertEquals(expResult, result, 0);

    }

}
