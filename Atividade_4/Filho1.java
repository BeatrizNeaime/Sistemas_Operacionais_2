public class Filho1 extends Thread{ //cria a Thread Filho1
    Neto1 n1 = new Neto1(); //instancia Neto1
    public void falece(){ //Só fi em uma função para não deixar o método run muito poluído
        System.out.println("Filho 1 falece aos 61 anos"); //exibe a mensagem no terminal
    } //fim do método falece()

    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch necessário ao se utilizar o método sleep()
            Thread.sleep(22000); //vida do pai até seu nascimento
            System.out.println("Nasce filho 1"); //nascimento
            Thread.sleep(16000); //16 anos de vida
            n1.start(); //Nasce neto 1
            Thread.sleep(45000); //vive durante 45 anos após o nascimento do filho
            falece(); //falece
            Thread.interrupted(); //fim da thread
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //tratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Filho1
