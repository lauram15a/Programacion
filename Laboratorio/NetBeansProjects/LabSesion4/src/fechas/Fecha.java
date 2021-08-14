/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author laura
 */

public class Fecha {
    
    public static void main (String[] args){
        
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("La fecha de hoy completa es: " + hoy);
        
        //Cambio de formato
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm");
        System.out.println("Hoy es (formato corto): " + formatoCorto);
        
        //Establecemos una fecha
        LocalDateTime diaHora = LocalDateTime.of(2010, Month.FEBRUARY, 25, 10, 59, 59);
        System.out.println("La afecha establecida: " + diaHora);
        diaHora = diaHora.plusMonths(1).minusDays(5).minusHours(3);  //suma un mes, resta 5 días, resta 3 horas
        System.out.println("La fecha modificada: " + diaHora);
        
        //Diferencia entre fechas
        long dias = ChronoUnit.DAYS.between(diaHora, hoy);
        System.out.println("dias: " + dias);
            
    }    
}
