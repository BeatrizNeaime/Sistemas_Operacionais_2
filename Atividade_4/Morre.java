public class Morre extends Thread { //Início da Thread Morre
    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            Thread.sleep(90000); //vida de Antônio (90  anos)
            System.out.println("Aos 90 anos, Antônio falece por complicações da idade"); //mensagem de falecimento
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //ratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Morre
