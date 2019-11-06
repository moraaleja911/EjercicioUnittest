package com.exampledevco.unittest;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnit4.class)
public class CalculadoraTest {

    //@Spy
    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora= new Calculadora();
        calculadora= Mockito.spy(calculadora);
    }

    @Test
    public void cuandoIngresa5EntoncesRetornaV(){
       // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("V");
        String respuesta=calculadora.calcular(5);
        assertThat(respuesta,equalTo("V"));
    }

    @Test
    public void cuandoIngresa1EntoncesRetornaI(){
        //Calculadora calculadora= new Calculadora();
        String respuesta=calculadora.calcular(1);
        assertThat(respuesta,equalTo("I"));
    }

    @Test
    public void cuandoIngresaNegativoEntoncesRetornaMensaje(){
        // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("No se puede convertir a Romano");
        String respuesta=calculadora.calcular(-1);
        assertThat(respuesta,equalTo("No se puede convertir a Romano"));
    }
    @Test
    public void cuandoIngresa0EntoncesRetornaNihil(){
        // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("No existe símbolo Romano - Nihil");
        String respuesta=calculadora.calcular(0);
        assertThat(respuesta,equalTo("No existe símbolo Romano - Nihil"));
    }
    @Test
    public void cuandoIngresa4000EntoncesRetornaIV(){
        // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("¯IV¯ -> Línea horizontal superior");
        String respuesta=calculadora.calcular(4000);
        assertThat(respuesta,equalTo("¯IV¯ -> Línea horizontal superior"));
    }
    @Test
    public void cuandoIngresa4000000EntoncesRetornaIV(){
        // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("═IV═ -> Doble línea horizontal superior");
        String respuesta=calculadora.calcular(4000000);
        assertThat(respuesta,equalTo("═IV═ -> Doble línea horizontal superior"));
    }

}
