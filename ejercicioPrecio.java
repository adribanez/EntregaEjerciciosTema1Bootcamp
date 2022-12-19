package com.ejerciciosBootcamp;

public class ejercicioPrecio {

    public static void main(String[] args) {


        System.out.println("Precio sin impuestos");


        double precioProducto = 200;


        System.out.println(precioProducto);


        System.out.println("impuestos a sumar del 21 %");


        double impuestos = 0.21;


        double impuestosasumar = precioProducto*impuestos;
        System.out.println(impuestosasumar);


        System.out.println("Precio final del producto" );


        double preciofinal = precioProducto + impuestosasumar;
        

        System.out.println(preciofinal);







    }



    }

