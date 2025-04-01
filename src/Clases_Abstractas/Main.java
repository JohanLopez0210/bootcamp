package Clases_Abstractas;

public class Main {
    public static void main(String[] args) {
        Ejecutivo ejecutivo = new Ejecutivo();
        Basico basico = new Basico();
        Cobrador cobrador = new Cobrador();

        ejecutivo.realizarDeposito();
        basico.consultarSaldo();
        cobrador.retirarEfectivo();
    }
}

interface Transaccion {
    void transaccionOk();
    void transaccionNoOk();
}

class Ejecutivo {
    public void realizarDeposito() {
        Deposito deposito = new Deposito();
        deposito.transaccionOk();
    }

    public void realizarTransferencia() {
        Transferencia transferencia = new Transferencia();
        transferencia.transaccionOk();
    }
}

class Basico {
    public void consultarSaldo() {
        ConsultaSaldo consulta = new ConsultaSaldo();
        consulta.transaccionOk();
    }

    public void pagarServicios() {
        PagoServicios pago = new PagoServicios();
        pago.transaccionOk();
    }

    public void retirarEfectivo() {
        RetiroEfectivo retiro = new RetiroEfectivo();
        retiro.transaccionOk();
    }
}

class Cobrador {
    public void retirarEfectivo() {
        RetiroEfectivo retiro = new RetiroEfectivo();
        retiro.transaccionOk();
    }

    public void consultarSaldo() {
        ConsultaSaldo consulta = new ConsultaSaldo();
        consulta.transaccionOk();
    }
}

class Deposito implements Transaccion {
    public void transaccionOk() {
        System.out.println("Realizándose depósito.");
    }

    public void transaccionNoOk() {
        System.out.println("Error en el depósito.");
    }
}

class Transferencia implements Transaccion {
    public void transaccionOk() {
        System.out.println("Realizándose transferencia.");
    }

    public void transaccionNoOk() {
        System.out.println("Error en la transferencia.");
    }
}

class RetiroEfectivo implements Transaccion {
    public void transaccionOk() {
        System.out.println("Realizándose retiro de efectivo.");
    }

    public void transaccionNoOk() {
        System.out.println("Error en el retiro.");
    }
}

class ConsultaSaldo implements Transaccion {
    public void transaccionOk() {
        System.out.println("Consultando saldo.");
    }

    public void transaccionNoOk() {
        System.out.println("Error en la consulta.");
    }
}

class PagoServicios implements Transaccion {
    public void transaccionOk() {
        System.out.println("Realizándose pago de servicios.");
    }

    public void transaccionNoOk() {
        System.out.println("Error en el pago de servicios.");
    }
}