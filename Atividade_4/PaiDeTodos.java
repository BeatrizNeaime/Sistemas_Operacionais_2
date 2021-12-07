public class PaiDeTodos extends Thread { //início da Thread PaiDeTodos

    public void nasce(){ //início do método nasce(), feito para deixa o método run mais limpo
        System.out.println("Nasce Antônio"); //exibe a mensagem de nascimento de Antônio, iniciando o problema
    } //fim do método nasce()

    Filho1 f1 = new Filho1(); //cria o primeiro filho 
    Filho2 f2 = new Filho2(); //cria o segundo filho
    Filho3 f3 = new Filho3(); //cria o terceiro filho
    Morre morte = new Morre(); //cria o evento morte

    @Override //sobrescrita do método run()
    public void run() { //início do método run 
        nasce(); //chamada do método nasce()
        f1.start(); //início do primeiro filho
        f2.start(); //início do primeiro filho
        f3.start(); //início do terceiro filho
        morte.start(); //início do evento morte
    } //fim do método run
} //fim da Thread
