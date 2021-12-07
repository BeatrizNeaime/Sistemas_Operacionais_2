public class Filho3 extends Thread { //início da Thread Filho3
    public void falece(){ //método falece() por questões visuais
        System.out.println("Filho 3 falece aos 55 anos"); //exibe a mensagem de falecimento
    } //fim do método falece()
    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            Thread.sleep(32000); //vida de seu pai antes do nascimento do filho 3
            System.out.println("Nasce filho 3"); //nasce filho 3
            Thread.sleep(55000); //vive durante 55 anos
            falece(); //falece
            Thread.interrupted(); //fim da Thread
        } catch (InterruptedException e) { //exceçãp
            e.printStackTrace(); //tratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Filho3
