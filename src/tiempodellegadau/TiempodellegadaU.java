/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiempodellegadau;

import java.util.Scanner;

/**
 *
 * @author Phineas
 */
public class TiempodellegadaU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner teclado = new Scanner(System.in);
        
        int hora, minuto, segundo;
        
        System.out.println("Ingresa hora de salida: ");
        hora = teclado.nextInt();
        System.out.println("Ingresa minuto de salida");
        minuto = teclado.nextInt();
        System.out.println("Ingresa segundo de salida");
        segundo = teclado.nextInt();
        System.out.println("Ingresa tiempo de viaje en segundos");
        int tsegundos = teclado.nextInt();
        
        int total = ((hora * 3600) + (minuto * 60) + segundo) + tsegundos;
        
        int htotal = total/3600;
        int modtotal = total%3600;
        int mtotal = modtotal/60;
        int stotal = modtotal%60;
        
        System.out.println("Llega en: " + htotal + " Horas " + mtotal + " Minutos y " + stotal + " Segundos");
        
    }
    
}
