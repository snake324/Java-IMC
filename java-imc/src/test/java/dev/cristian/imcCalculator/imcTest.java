package dev.cristian.imcCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class imcTest {
    
    @Test
    public void testCalcularImc() {
        double peso = 60;
        double altura = 1.7;
        double resultadoEsperado = 20.761245674740486;
        double resultadoCalculado = imc.calcularIMC(peso, altura);
        assertEquals(resultadoEsperado, resultadoCalculado, 0.0001);
    }


    @Test
    public void testTablaIMC() {
        assertEquals("Peso normal", imc.tablaIMC(20.761245674740486));
    }
}