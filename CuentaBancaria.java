class CuentaBancaria {
    private double saldoCuentaCorriente = 0;
    private double saldoCuentaAhorros = 0; 

    private static int cantidadCuentas = 0;
    private static double dineroTotal=0;


    public CuentaBancaria(){
        cantidadCuentas++;
    }

    public double getSaldoCuentaCorriente(){
        return saldoCuentaCorriente;
    }

    public double getSaldoCuentaAhorros(){
        return saldoCuentaAhorros;
    }
    public void depositar(double monto, String tipoCuenta){
        if (tipoCuenta == "corriente"){
            saldoCuentaCorriente += monto;
            dineroTotal += monto;
            System.out.println("Deposito en cuenta corriente es: "+saldoCuentaCorriente);
        }
        else
        {
            saldoCuentaAhorros += monto;
            dineroTotal += monto;
            System.out.println("Deposito en cuenta ahorros es: "+ saldoCuentaAhorros);
        }

    }
    public void retirar (double monto, String tipoCuenta){
        
        if (tipoCuenta == "corriente"){
            if(saldoCuentaCorriente>=monto ){
                saldoCuentaCorriente -= monto;
                dineroTotal -=monto;
                System.out.println("Después de tu Retiro, tu saldo en cuenta corriente es: "+saldoCuentaCorriente);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            if(saldoCuentaAhorros>=monto){
                saldoCuentaAhorros -= monto;
                dineroTotal -= monto;
                System.out.println("Despues del  retiro, tu saldo en cuenta corriente es: "+saldoCuentaAhorros);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public static double getDineroTotal(){
        return dineroTotal;
    }
}
