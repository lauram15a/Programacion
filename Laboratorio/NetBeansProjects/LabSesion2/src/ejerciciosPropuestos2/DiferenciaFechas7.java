/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPropuestos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author laura
 * 
 * Programa que dadas dos fechas diga la diferencia en días entre ellas.
 * 
 */

public class DiferenciaFechas7 {
    
    public static void main (String[] args) throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int dia1;
        int mes1;
        int anio1;
        int dias1;
        int aniosBisiestos1;
        int diasAnio1 = 0;
        int diasMes1 = 0;
        
        
        int dia2;
        int mes2;
        int anio2;
        int dias2;
        int aniosBisiestos2;
        int diasAnio2 = 0;
        int diasMes2 = 0;
        
        int diferencia;
        
        //Fecha 1
        
        System.out.print("\nFECHA 1\n");
        
        System.out.print("\nDía 1: ");
        dia1 = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nMes1 : ");
        mes1 = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nAño 1: ");
        anio1 = Integer.parseInt(entrada.readLine());
        
        
        
        //Fecha 2
        
        System.out.print("\nFECHA 2\n");
        
        System.out.print("\nDía 2: ");
        dia2 = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nMes2 : ");
        mes2 = Integer.parseInt(entrada.readLine());
        
        System.out.print("\nAño 2: ");
        anio2 = Integer.parseInt(entrada.readLine());
        
        
        System.out.println("\n" + dia1 + " - " + mes1 + " - " + anio1);
        System.out.println("\n" + dia2 + " - " + mes2 + " - " + anio2);
        
        
        //FECHA 1
        //anio 
        aniosBisiestos1 = anio1 / 4;
        diasAnio1 = (anio1 - aniosBisiestos1) * 365 + aniosBisiestos1 * 366;
        //mes
        mes1 -= 1;
        if (mes1 == 0){
            diasMes1 = 0;
        } else if (mes1 == 1){
            diasMes1 = 31; //enero
        } else if (mes1 == 2){
            diasMes1 = 31 + 28;  //febrero
        } else if (mes1 == 3){
            diasMes1 = 31 + 28 + 31;  //marzo
        } else if (mes1 == 4){
            diasMes1 = 31 + 28 + 31 + 30;  //abril
        } else if (mes1 == 5){
            diasMes1 = 31 + 28 + 31 + 30 + 31;  //mayo
        } else if (mes1 == 6){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30;  //junio
        } else if (mes1 == 7){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30 + 31;  //julio
        } else if (mes1 == 8){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;  //agosto
        } else if (mes1 == 9){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;  //septiembre
        } else if (mes1 == 10){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;  //octubre
        } else if (mes1 == 11){
            diasMes1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;  //noviembre
        }
        
        
        dias1 = dia1 + diasMes1 + diasAnio1;
        
        //FECHA 2
        //anio 
        aniosBisiestos2 = anio2 / 4;
        diasAnio2 = (anio2 - aniosBisiestos2) * 365 + aniosBisiestos2 * 366;
        //mes
        mes2 -= 1;
        if (mes2 == 0){
            diasMes2 = 0;
        } else if (mes2 == 1){
            diasMes2 = 31; //enero
        } else if (mes1 == 2){
            diasMes2 = 31 + 28;  //febrero
        } else if (mes2 == 3){
            diasMes2 = 31 + 28 + 31;  //marzo
        } else if (mes2 == 4){
            diasMes2 = 31 + 28 + 31 + 30;  //abril
        } else if (mes2 == 5){
            diasMes2 = 31 + 28 + 31 + 30 + 31;  //mayo
        } else if (mes2 == 6){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30;  //junio
        } else if (mes2 == 7){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30 + 31;  //julio
        } else if (mes2 ==  8){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;  //agosto
        } else if (mes2 == 9){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;  //septiembre
        } else if (mes2 == 10){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;  //octubre
        } else if (mes2 == 11){
            diasMes2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;  //noviembre
        }
               
        
        dias2 = dia2 + diasMes2 + diasAnio2;
        
        //Diferencia fechas
        if (dias1 > dias2){
            diferencia = dias1 - dias2;
        }
        else{
            diferencia = dias2 - dias1;
        }
        
        System.out.println("\nLa diferencia es de " + diferencia + " días.");
        
        
    }
}
