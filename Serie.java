

public class Serie
{
    // instance variables - replace the example below with your own
    private int a;
    private String serie="";
    static int n=0;
    static int se=0;
    public static void main (String[]args){
        String  r=serieNumeros(5);
        System.out.print(r);
    
    }
    
    public Serie()
    {
       n=3;
       
    }

    
    public static  String   serieNumeros (int n)
    {

        if (n>0){ 
           System.out.print(n+ ",");
        while (n>1 ){
         
         if (n%2==0 ){
            
            n=n/2;
               
         }else{
            
            n=n*3+1;
         
      }
      System.out.print(n+ ",");
    }
    
}else{
    
    System.out.println(n);
}
      return "";
    }
}
