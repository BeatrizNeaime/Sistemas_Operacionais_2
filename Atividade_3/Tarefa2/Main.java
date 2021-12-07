package Tarefa2;

class Main {
    public static void main(String[] args) {
      Tarefa a = new Tarefa(1, 10000);
      Tarefa b = new Tarefa(10001, 20000);
      Tarefa c = new Tarefa(20001, 30000);
      Tarefa d = new Tarefa(30001, 40000);
      Tarefa e = new Tarefa(40001, 50000);
      Tarefa f = new Tarefa(50001, 60000);
      Tarefa g = new Tarefa(60001,70000);
      Tarefa h = new Tarefa(70001, 80000);
      Tarefa i = new Tarefa(80001, 90000);
      Tarefa j = new Tarefa(90001, 100000);
  
      long start = System.currentTimeMillis();
      try {
        a.join();
        b.join();
        c.join();
        d.join();
        e.join();
        f.join();
        g.join();
        h.join();
        i.join();
        j.join();
      } catch (Exception y) {
        y.printStackTrace();
      }
  
      long transcorrido = System.currentTimeMillis() - start;
      System.out.println("");
      System.out.println("---*---*---*---*---");
      System.out.println("Tempo transcorrido executando 10 Threads: " + transcorrido + "ms");
      System.out.println("---*---*---*---*---");
    }
  }