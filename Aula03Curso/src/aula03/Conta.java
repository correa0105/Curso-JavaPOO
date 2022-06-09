package aula03;
public class Conta{
 
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean status;

    //MÉTODO CONSTRUTOR
    public void Conta(double saldoConta, boolean status) {
        this.setSaldoConta(0);
        this.setStatus(false);
    }
    
    //MÉTODOS GETTER AND SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
               
    //MÉTODOS
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldoConta(50);
        }else if (t == "CP") {
            this.setSaldoConta(150);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta nao pode ser fechada, pois ainda tem dinheiro");
        }else if (this.getSaldoConta() < 0) {
            System.out.println("Conta nao pode ser fechada, pois tem valores a pagar");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus() == true) {
            this.setSaldoConta(getSaldoConta() + v);
            System.out.println("Deposito realizado na conta de: " + this.getDonoConta());
        }else{
            System.out.println("Impossivel depositar, pois sua conta nao esta aberta");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus() == true){
            if(this.getSaldoConta() >= v){
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        }else if (this.getTipoConta() == "CP") {
            v = 20;
        }
        if (this.isStatus() == true) {
            if (this.getSaldoConta() >= v) {
              this.setSaldoConta(getSaldoConta() - v);
                 System.out.println("Mensalidade paga com sucesso!");  
            }else{
                System.out.println("Saldo insuficiente para pagar mensalidade");
                }
            }else{
                System.out.println("Impossivel pagar a conta, pois sua conta esta fecahda");
        }
    } 
    
        public void statusAtualConta(){
        System.out.println("################################");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta: " + this.getTipoConta());
        System.out.println("Dono da Conta: " + this.getDonoConta());
        System.out.println("Saldo da Conta: " + this.getSaldoConta());
        System.out.println("Esta aberta? " + this.isStatus());
        System.out.println("################################");
    }
        
}
