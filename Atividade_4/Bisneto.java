public class Bisneto extends Thread{ //início da Thread Bisneto
    
    public void falece(){ //método falece() por razões visuais
        System.out.println("Bisneto 1 falece aos 12 anos vítima de uma doença"); //exibe a mensagem de falecimento
    } //fim do método falece()

    @Override //sobrescrita
    public void run() { //início do método run()
        try { //início do try catch
            System.out.println("Nasce bisneto 1"); //exibe a mensagem de nascimento
            Thread.sleep(12000); //vive durante 12 anos
            falece(); //falece
            Thread.interrupted(); //fim da Thread
        } catch (InterruptedException e) { //exceção
            e.printStackTrace(); //tratamento da exceção
        } //fim do try catch
    } //fim do método run()
} //fim da Thread Bisneto
