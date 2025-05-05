/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.netbeans.operacionesconarreglos;

/**
 *
 * @author brian
 */
public class OperacionesConArreglos {

    public static void main(String[] args) {
        //Arrays definidos
        int [] arreglo1 = {5,10,15,20,25};
        int [] arreglo2 = {1,2,3,4,5};
        
        //Sumar 2 arreglos elemento por elemento
        int [] suma = new int [arreglo1.length];
        
        for(int i=0; i<arreglo1.length;i++){
            suma[i] = arreglo1[i]+arreglo2[i];
        }
        //Recorrer arreglos e imprimir sus elementos
        System.out.println("Elmentos del arreglo1: ");
        for(int i=0; i<arreglo1.length;i++){
            System.out.println("Elemnto "+(i+1)+": "+arreglo1[i]);
        }
        
        //Multiplicar arreglos
        int [] multiplicacion = new int[arreglo1.length];
        for(int i=0; i<arreglo1.length;i++){
            multiplicacion [i] = arreglo1[i]*arreglo2[i];
        }
        //Recorrer arreglos e imprimir sus elementos
        System.out.println("Multiplicaion del arreglo:");
        for(int i=0; i<multiplicacion.length; i++){
            System.out.println("Elemento "+ (i+1)+": "+multiplicacion[i]);
        }
        
        //Extraer informacion: Valor maximo, minimo y promedio
        int maximo = arreglo1[0];
        int minimo = arreglo1[0];
        int sumaTotal = 0;
        
        for (int i = 0; i < arreglo1.length; i++) {
            //Encontrar el maximo t¿y el minimo
            if(arreglo1[i] > maximo) {
               maximo = arreglo1[i];           
            }
            if(arreglo1[i] < minimo) {
                minimo = arreglo1[i];
            }
            //Sumar los elementos par calcular el promedio
            sumaTotal += arreglo1[i];
        }
        //Calcular promedio
        double promedio = (double)sumaTotal / arreglo1.length;
        System.out.println("Informacion extraida del arreglo1:");
        System.out.println("Valor maximo: "+maximo);
        System.out.println("Valor minimo: "+minimo);
        System.out.println("valor promedio: "+promedio);
        
        // Operaciones con arreglo2
        
        //Sumar 2 arreglos elemento por elemento
        int [] sumas = new int [arreglo2.length];
        
        for(int i=0; i<arreglo2.length;i++){
            suma[i] = arreglo2[i]+arreglo1[i];
        }
        //Recorrer arreglos e imprimir sus elementos
        System.out.println("Elmentos del arreglo2: ");
        for(int i=0; i<arreglo2.length;i++){
            System.out.println("Elemnto "+(i+1)+": "+arreglo2[i]);
        }
        
        //Multiplicar arreglos
        int [] multiplicacions = new int[arreglo2.length];
        for(int i=0; i<arreglo2.length;i++){
            multiplicacions [i] = arreglo2[i]*arreglo2[i];
        }
        //Recorrer arreglos e imprimir sus elementos
        System.out.println("Multiplicaion del arreglo:");
        for(int i=0; i<multiplicacions.length; i++){
            System.out.println("Elemento "+ (i+1)+": "+multiplicacions[i]);
        }
        
        //Extraer informacion: Valor maximo, minimo y promedio
        int maximos = arreglo2[0];
        int minimos = arreglo2[0];
        int sumaTotals = 0;
        
        for (int i = 0; i < arreglo2.length; i++) {
            //Encontrar el maximo t¿y el minimo
            if(arreglo2[i] > maximo) {
               maximo = arreglo2[i];           
            }
            if(arreglo2[i] < minimos) {
                minimos = arreglo2[i];
            }
            //Sumar los elementos par calcular el promedio
            sumaTotals += arreglo2[i];
        }
        //Calcular promedio
        double promedios = (double)sumaTotals / arreglo2.length;
        System.out.println("Informacion extraida del arreglo2: ");
        System.out.println("Valor maximo: "+maximos);
        System.out.println("Valor minimo: "+minimos);
        System.out.println("valor promedio: "+promedios);
    }
}