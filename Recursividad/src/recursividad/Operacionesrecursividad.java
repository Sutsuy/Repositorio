/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;
import java.util.*; 
/**
 *
 * @author HP
 */
public class Operacionesrecursividad {
    Scanner leer=new Scanner (System.in);
    
    
 public static   List <Integer> NL=new ArrayList ();
   
   
   private static int fibonachi (int f)
  {
      //se pordria decir que es la formula 
       if ( f==1 || f==2 )
       {
          // System.out.println(" ");
           return 1;
       }
       else 
       {
       //  System.out.println(f);
           
           //esta parte nos ayuda a sacar el prpceso de la serie 
         return fibonachi (f-1)+ fibonachi (f-2);
       }
       
       
   }
    private static void recursividad(int n){
        
         
        if(n==10)
        {
            System.out.println("10");
           
        }
        
        else
        {
            System.out.print(  " "+n+ ", ");
            
            recursividad(n+1);
        
    }
    }
    
    
    private static int recursividadf(int f)
    {
        if (f==1)   
         {
             //System.out.println(f); lo que esta comentado sirve para mostrar la secuencia 
     System.out.println(" El factorial es ");   return 1;                //5*4**3*2*1
          
         }
        else 
        {
           // System.out.println(f); 
         
            return f*recursividadf(f-1);
        }
    }
    
   
   
 private static  int escalerita(int e)
 {     
   
     if(e==10)
        {
            //System.out.println("10");
           return 10;
        }
        
        else
        {
            
            System.out.print(  " "+e+ ", ");
            
            System.out.print(  " "+(e-1)+ ", ");
            System.out.print(  " "+(e-2)+ ", ");
            System.out.print(  " "+(e-3)+ ", ");
            System.out.print(  " "+(e-4)+ ", ");
            System.out.print(  " "+(e-5)+ ", ");
            System.out.print(  " "+(e-6)+ ", ");
            System.out.print(  " "+(e-7)+ ", ");
            System.out.print(  " "+(e-8)+ ", ");
            System.out.print(  " "+(e-9)+ ", ");
            System.out.print(  " "+(e-10)+ ", ");
          
            
            
           
            System.out.print("  \n  ");
           return escalerita (e+1) ;
        
        }
   

 
 
   
   }
  /* if(NL.isEmpty())
   {
     
   }
   else
   {
       return escalerita(NL.remove(i));
   }*/
  
    // return List  NL ;
 //}
  
        
    
      
    private static String Palindromo(String frase,int i,int j){
         
     if(i<j){
      if(frase.charAt(i)==frase.charAt(j)){
     int length = frase.length();
     Palindromo(frase,i+1,j-1);
     frase=true;
     System.out.println("Si es  un palindromo" +frase);
     }else
     frase=false;
     System.out.println("No es  palindromo  " +frase);
        
        }
 
      
    }   
      
  


    
  
  
     public void Menu(){
        Scanner leer=new Scanner(System.in); 
        int opcion,opc;
        
        do{
        System.out.println("**********************************************");
        System.out.println("++++++++++++++Modos de recursividad ++++++++++++++++");
        System.out.println("1.- Serie fibonacci  ");
        System.out.println("2.- Numeros del 1 al 10  ");
        System.out.println("3.- Factorial del numero  ");
        System.out.println("4.- Desaparecer numeros ");
        System.out.println("5.- Palindromos ");
        System.out.println("6.- Salir  ");
        System.out.println("**********************************************");
            System.out.println("Elige una opcion ---->");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println(" la serie fibonacci  es  "+fibonachi(8)); 
              
            break;
                
            case 2:
               //restarecus();
           recursividad(1);  
            break;
                
            case 3:
                System.out.println(recursividadf(5));
            break;
            
                
            case 4:
                escalerita(0);
               // for(int i=1;i<=10;i++)
                //{
               //NL.add(i); 
               //}
            break;
                
            case 5:
               Palindromo(frase);
            break;
             
            case 6:
                System.out.println("CAMBIO Y FUERA ");
            break;
                
            
            default: 
            {
                System.out.println("Corazon la opcion que ingresaste es incorresta :c  ");    
            }    
                
                
        }
    
            System.out.println("--Quieres seguir en el menu ingresa-- 7)si  8)no"); 
            opc=leer.nextInt();
}
        while(opc==7);
        
        if(opc==8){
            System.out.println("Gracias por estar aqui");
        }
                
         
     
     
                
     }
}
