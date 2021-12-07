public class Neto1 extends Thread { //início da Thread Neto1
    Bisneto b = new Bisneto(); //cria um Bisneto
    public void falece(){ //início do método flece(), criado por razões visuais
        System.out.println("Neto 1 falece aos 35 anos"); //exibe a mensagem de falecimento
    } //fim do método falece()
    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            System.out.println("Nasce neto 1"); //exibe o nascimento do neto 1
            Thread.sleep(30000); // vive durante 30 anos até o nascimento de seu filho
            b.start(); //nasce seu filho (bisneto 1)
            Thread.sleep(5000); //vive por mais 5 anos
            falece(); //exibe a mensagem de falecimento 
            Thread.interrupted(); //fim da thread
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //tratamento da exceção
        } //fim da exceção
    } //fim do método run()
} //fim da Thread Neto1
