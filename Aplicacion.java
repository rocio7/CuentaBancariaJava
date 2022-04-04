public class Aplicacion {

    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.depositar(750.80,"corriente");
        cuenta1.depositar(320.10,"ahorros");
        cuenta1.retirar(200.50,"ahorros");

        System.out.println("Cantidad de dinero total en cuentas: "+cuenta1.getDineroTotal());


    }


}