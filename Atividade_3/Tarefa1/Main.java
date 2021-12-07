package Tarefa1;

class Main {
    public static void main(String[] args) {
      long start = System.currentTimeMillis();
      Tarefa a = new Tarefa(1, 20000);
      Tarefa b = new Tarefa(20001, 40000);
      Tarefa c = new Tarefa(40001, 60000);
      Tarefa d = new Tarefa(60001, 80000);
      Tarefa e = new Tarefa(80001, 100000);
      try{
        a.join();
        b.join();
        c.join();
        d.join();
        e.join();
      } catch(Exception exception){
       exception.printStackTrace();
      }
      long transcorrido = System.currentTimeMillis() - start;
      System.out.println("");
      System.out.println("---*---*---*---*---");
      System.out.println("Tempo transcorrido executando 5 Threads: " + transcorrido + "ms");
      System.out.println("---*---*---*---*---");
    }
  }
