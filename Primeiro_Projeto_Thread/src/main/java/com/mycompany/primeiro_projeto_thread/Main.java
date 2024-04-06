/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiro_projeto_thread;

/**
 *
 * @author Jorge
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Início do programa.");
        System.out.println("Parte 1 do programa.");
        System.out.println("Parte 2 do programa.");
        System.out.println("Fim do programa.");
        
        
      ThreadYield  primeiro = new ThreadYield("Primeiro");
      ThreadYield  segundo  = new ThreadYield("Segundo");
      ThreadYield  terceiro  = new ThreadYield("Terceiro");
      ThreadYield  quarto  = new ThreadYield("Quarto");

      primeiro.start();
      segundo.start();
      terceiro.start();
      quarto.start();

    }
}

