public class Filho2 extends Thread{ //início da Thread Filho2
    Neto2 n2 = new Neto2(); //cria um objeto Neto2
    public void falece(){ //método falece() por razões visuais
        System.out.println("Filho 2 falece aos 55 anos"); //exibe a mensagem de falecimento
    } //fim do método falece()
    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            Thread.sleep(25000); //pai vive 25 anos até seu nascimento
            System.out.println("Nasce filho 2"); //nasce o filho 2
            Thread.sleep(20000); //vive durante 20 anos até o nascimento de seu filho
            n2.start(); //nasce o neto 2
            Thread.sleep(35000); //vive durante 35 anos após o nascimento de seu filho
            falece(); //falece
            Thread.interrupted(); //fim da thread
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //tratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Filho2
