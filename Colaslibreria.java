/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colaslibreria;

/**
 *
 * @author alexj
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;
public class Colaslibreria {

    public static void main(String[] args) {
        System.out.println("Ejercicios Colas con libreria de JAVA\n");
        Colasimple();
    }
    static void Colasimple(){
        System.out.println("Ejericios colas Simple: primero en llegar primero en slair (fifo)");
        Queue<String> java = new ArrayDeque <>();
        java.offer("Ana");
        java.offer("Viviana");
        java.offer ("Maria");
        System.out.println("Java : " + java.poll() + "," + java.poll() + "\n");
        
       
}
     static void Colacircular(){
        System.out.println("Ejericios colas circular: Reutilozar los epacios del Arreglo");
        Queue<String> java = new ArrayDeque <>();
        java.offer("Ana");
        java.offer("Viviana");
        java.offer ("Maria");
         System.out.println("SALE :" + java.poll());
         java.offer ("Fabio");
        System.out.println("Java : " + java.poll() + "," + java.poll() + "\n");
}
      static void Colaprioridad(){
        System.out.println("Ejericios colas circular: Reutilozar los epacios del Arreglo");
        Queue<Integer> java = new PriorityQueue <>();
        java.offer(5);
        java.offer(2);
        java.offer (3);
 
        System.out.println("Java : " + java.poll() + "," + java.poll() + "\n");
}
      static void Colasdoble(){
          System.out.println("ColaDoble (Deque): Permite usar ambos extremos");
          Deque <String> java = new ArrayDeque<>();
          java.offerLast("Ana");
          java.offerLast("Viviana");
          java.offerLast("Leiner");
          System.out.println("Java : Sale del inicio " + java.pollFirst() + ", SAle del final" + java.pollLast());
          
      }
}