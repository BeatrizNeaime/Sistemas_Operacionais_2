package Tarefa3;

class Main {
    public static void main(String[] args) {
      long start = System.currentTimeMillis();
      Tarefa a = new Tarefa(0,5000);
      Tarefa b = new Tarefa(5001,10000);
      Tarefa c = new Tarefa(10001,15000);
      Tarefa d = new Tarefa(15001,20000);
      Tarefa e = new Tarefa(20001,25000);
      Tarefa f = new Tarefa(25001,30000);
      Tarefa g = new Tarefa(30001,35000);
      Tarefa h = new Tarefa(35001,40000);
      Tarefa i = new Tarefa(40001,45000);
      Tarefa j = new Tarefa(45001,50000);
      Tarefa k = new Tarefa(50001,55000);
      Tarefa l = new Tarefa(55001,60000);
      Tarefa m = new Tarefa(60001,65000);
      Tarefa n = new Tarefa(65001,70000);
      Tarefa o = new Tarefa(70001,75000);
      Tarefa p = new Tarefa(75001,80000);
      Tarefa q = new Tarefa(80001,85000);
      Tarefa r = new Tarefa(85001,90000);
      Tarefa s = new Tarefa(90001,100000);    
  
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
          k.join();
          l.join();
          m.join();
          n.join();
          o.join();
          p.join();
          q.join();
          r.join();
          s.join();    
      } catch (Exception exception) {
        exception.printStackTrace();
      }
      long transcorrido = System.currentTimeMillis() - start;
      System.out.println("");
      System.out.println("---*---*---*---*---");
      System.out.println("Tempo transcorrido executando 20 Threads: " + transcorrido + "ms");
      System.out.println("---*---*---*---*---");
      
    }
  }