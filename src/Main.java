public class Main {
    public static void main(String[] args) {
        Cuenta cuentaJaider = new Cuenta("1234","ahorro",200.00);
        System.out.println(cuentaJaider.getSaldoActual());
        cuentaJaider.Consignar(100);
        System.out.println(cuentaJaider.getSaldoActual());
        cuentaJaider.retirar(280);
        System.out.println(cuentaJaider.getSaldoActual());


    }
}
