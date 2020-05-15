import java.util.Scanner;

public class Serie
{
    // instance variables - replace the example below with your own
   
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        int n=0;
        System.out.println("ingrese un numero");
        n=entrada.nextInt();
        String  r=serieNumeros(n);
        System.out.print(r);
    
  }
    public static  String   serieNumeros (int n)
    {
        String serie="";
     String nstring="";
        if (n>0){ 
         System.out.print(n+ " ");
        while (n>1 ){
         
         if (n%2==0 ){
            
            n=n/2;
               
         }else{
            
            n=n*3+1;
         
      }
      
      nstring=Integer.toString(n);
      serie+= nstring;
      serie+=" ";
      
    }
    
}else{
    
    System.out.println(n);
}
      return serie ;
    }
}
