public class Cuenta {
    //Atributos
    private String numero="";
    private String tipo="";
    private double saldoActual=0;
    private double saldoMinimo=0;

    //Constructor
    public Cuenta(String numero, String tipo, double valorInicial){
        //Metodo equals para comparar string
        if(tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito")){
            this.tipo = tipo;
            this.numero = numero;
            this.saldoMinimo = valorInicial*0.1;
            this.saldoActual = valorInicial;
        }



    }
    //Getter y setters


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    //Metodos

    public void Consignar(double monto){
        this.saldoActual += monto;
    }
    public void retirar (double monto){
        if((this.saldoActual-monto) < this.saldoMinimo){
            System.out.println("Al hacer el retiro no cumple el saldo minimo, retire menos");
            System.out.println("Solo puede retirar: "+(this.saldoActual-this.saldoMinimo));
        }else{

            System.out.println("Retiro Exitoso de: "+monto);
            this.saldoActual -= monto;}
    }
}
