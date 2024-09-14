/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulapa;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class AlunoMaiordeIdade {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int idade;
      
      System.out.println("Digite sua Idade");
      idade=scanner.nextInt();
      
      if(idade >= 18){
          System.out.println( "Aluno é maior de idade");
      }else{
          System.out.println( "Aluno não é maior de idade");
      }
        
        
    }
}
