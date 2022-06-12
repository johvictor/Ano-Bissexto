package Projetos_pessoais;

import java.util.Scanner;


public class Ano_Bissexto {

    
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
//Intro 

        System.out.println("---BEM VINDO---");
        System.out.println("Descubra qual ano é o bissexto.\n");
        System.out.println("Digite um ano:");
        int ano=input.nextInt();
   

//caso seja dividido por 4     
    if((ano%4==0)){

//caso não seja dividido por 100
    if((ano%100!=0)){
        System.out.println("O ano "+ano+" é bissexto.");

//dividido por 100 e por 400
}else if((ano%400==0)){
           System.out.println("O ano "+ano+" é bissexto.");
 
}

}else

            System.out.println("O ano "+ ano + " não é bissexto.");
    }
    
}
