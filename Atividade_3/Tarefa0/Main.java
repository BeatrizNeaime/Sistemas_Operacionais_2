package Tarefa0;
class Main {
    public static void main(String[] args) {
      long T0 = System.currentTimeMillis();
      Tarefa a = new Tarefa(0,50000);
      Tarefa b = new Tarefa(50001,100000);
     try{
        a.join();
        b.join();
     } catch(Exception exception) {
        exception.printStackTrace();
     }
      long DT = System.currentTimeMillis() - T0;
      System.out.println(" ");
      System.out.println("\n---*---*---*---*---*---*---*---*---");
      System.out.println("Tempo transcorrido para 2 Threads: "+ DT + "ms");
    }
  }