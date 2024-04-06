/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro_projeto_thread;

/**
 *
 * @author Jorge
 */
public class ThreadYield extends Thread {
   private String nome;
   public ThreadYield(String nome){
	this.nome = nome;
   }	
   public  void run() {
      for( int i=0; i<10; i++){
         System.out.println( "Executando: " + nome + "\t em ("+ i + ")");              
       Thread.yield(); //Cede a CPU para a próxima Thread
      }
   }
}
