
package com.mycompany.lab3p1_fernandogomez;

import java.util.Scanner;

public class Lab3P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        

    while(true){
        System.out.println("Menu principal coloque un numero");
        System.out.println("1.) ejercicio 1");
        System.out.println("2.) ejercicio 2");
        System.out.println("3.) ejercicio 3");
        System.out.println("4.) Finalizacion");
        
        int i = entrada.nextInt(); 
        
        switch(i){
       
        case 1:
            //ejercicio 1     
           /* entrada =new Scanner(System.in);
               System.out.println("Ingrese una cadena");
                String C1 =entrada.nextLine();
                C1=C1.replace(".","");
                        System.out.println(C1);
                        break;*/
                        
        case 2:
            //ejercicio 2
            entrada =new Scanner(System.in);
                      System.out.println("Ingrese k");
                        double k= entrada.nextDouble();
                        double q, sum;
                        int ab = 0;
                            
                         double ac,ac2 = 0;
                        q = k*2+1;
                        while (k==0){
                        ac = ab*ab;
                        
                                ac2 = ac2 + ac + 3;
                                
                        }
                              sum = q/ac2;
                              System.out.println("Su resultado es:"+sum);
                               
                                
                                
                                
            //for(int H=0;H<1;H)
                        System.out.println("Ingrese un numero");
            break;


            
                 case 4: 
 System.out.println("terminando programa...");
        System.exit(0);
         break;
         
        case 3:
            //ejercicio 3
            entrada =new Scanner(System.in);
            int cont =0;
                        System.out.println("Ingrese un numero");
                        int num= entrada.nextInt();
            for(int x=0;x<num;x++){
            for (int y=0;y<num;y++)
                System.out.print(" * ");
            
                    System.out.print("*");
         
        
            
            break;
            
          
  
            
            }
        }
    }
    }
}

            
   
   




        
          
        
                

