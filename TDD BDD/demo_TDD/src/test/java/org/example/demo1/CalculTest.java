package org.example.demo1;

import org.example.exception.DividedByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    private Calcul calcul;

    @Test
    public void whenAddition_1_2_Then_3() {
        // Arrange : Prépare
        calcul = new Calcul();
        double x = 1;
        double y = 2;


        // Act : Déclenche
        double result = calcul.addition(x, y);


        // Assert : Vérifie
        Assert.assertEquals(3, result, 0.0001);

    }

    @Test
    public void whenDivision_30_10_Then_3() {
        // Arrange : Prépare
        calcul = new Calcul();

        double x = 30;
        double y = 10;


        // Act : Déclenche
        double result = calcul.division(x, y);


        // Assert : Vérifie
        Assert.assertEquals(3, result, 0.01);
    }

    @Test
    public void whenDivision_10_0_Then_DividedByZeroException() {
        // Arrange : Prépare
        calcul = new Calcul();
        double x = 10;
        double y = 0;


        // Act : Déclenche
//        double result = calcul.division(x, y);

        // Assert : Vérifie
        Assert.assertThrows(DividedByZeroException.class, () -> {
            calcul.division(x, y);
        });
    }

}
