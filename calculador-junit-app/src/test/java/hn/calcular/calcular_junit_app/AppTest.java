package hn.calcular.calcular_junit_app;

import org.junit.Test;

import hn.calcular.calcular_junit_app.MetodoCal;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalcularAreaCirculo() {
        MetodoCal cal = new MetodoCal();
        assertEquals(28.27, cal.calcularAreaCirculo(3), 0.01);
        assertEquals(0, cal.calcularAreaCirculo(0), 0.01);
        assertThrows(IllegalArgumentException.class, () -> cal.calcularAreaCirculo(-1));
    }

    @Test
    public void testCalcularAreaCuadrado() {
        MetodoCal cal = new MetodoCal();
        assertEquals(25, cal.calcularAreaCuadrado(5), 0.01);
        assertEquals(0, cal.calcularAreaCuadrado(0), 0.01);
        assertThrows(IllegalArgumentException.class, () -> cal.calcularAreaCuadrado(-1));
    }

    @Test
    public void testCalcularAreaRectangulo() {
        MetodoCal cal = new MetodoCal();
        assertEquals(20, cal.calcularAreaRectangulo(4, 5), 0.01);
        assertEquals(0, cal.calcularAreaRectangulo(0, 5), 0.01);
        assertThrows(IllegalArgumentException.class, () -> cal.calcularAreaRectangulo(-4, 5));
    }

    @Test
    
    public void testCalcularAreaTriangulo() {
        MetodoCal cal = new MetodoCal();
        assertEquals(10, cal.calcularAreaTriangulo(4, 5), 0.01);
        assertEquals(0, cal.calcularAreaTriangulo(0, 5), 0.01);
        assertThrows(IllegalArgumentException.class, () -> cal.calcularAreaTriangulo(-4, 5));
    }

}
