public class Neto2 extends Thread { //início da Thread Neto2

    public void falece(){ //métofo falece() criado por razões visuais
        System.out.println("Neto 2 falece aos 33 anos"); //exibe a mensagem de falecimento
    } //fim do método falece()

    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            System.out.println("Nasce neto 2"); //exibe a mensagem de nascimento
            Thread.sleep(33000); //vive durante 33 anos
            falece(); // falece
            Thread.interrupted(); //fim da thread
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //tratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Neto2
