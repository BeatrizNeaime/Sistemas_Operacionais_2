package Tarefa4;

public class Tarefa extends Thread{
    private int min;
    private int max;
    public Tarefa(int mi, int ma){
      min = mi;
      max = ma;
      start();
    }
    
     private static boolean procuraPrimo(int a){
       for (int j = 2; j < a; j++) {
             if (a % j == 0)
                 return false;  
         }
         return true;
     }
    
     public void run(){
       for(int i=min; i<max; i++){
         procuraPrimo(i);
       }
     }
   }
