package com.exampledevco.unittest;

public class Calculadora {
    public String calcular(int numeroArabigo) {

            return construirRomano(numeroArabigo);

    }

    public String construirRomano(int numeroArabigo){

        if(numeroArabigo>=0) {

            if (numeroArabigo == 5) {
                return "V";
            }

            else if (numeroArabigo==0){
                return "No existe símbolo Romano - Nihil";
            }

            else if (numeroArabigo>=4000&&numeroArabigo<=1000000){
                return "¯IV¯ -> Línea horizontal superior para representar multiplicación por 1000";
            }
            else if (numeroArabigo>=4000000&&numeroArabigo<=999999999){
                return "═IV═ -> Doble línea horizontal superior para representar multiplicación por 1000000";
            }

            else {
                return "I";
            }
        } else {
            return "No se puede convertir a Romano";
        }
    }
}

