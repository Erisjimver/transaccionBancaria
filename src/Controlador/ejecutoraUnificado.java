package Controlador;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 * @author Israel
 */
public class ejecutoraUnificado {

static boolean aprobado=false, horaCorrecta=false;

static String 
        bancoCliente="banco a", 
        bancoDestino="banco b", 
        banco="";
static int 
        cuentaCliente=12345,
        cuentaA=0,
        cuentaDestino=98765,
        cuentaB=0,
        saldoCliente=100000,
        costoTransaccion=0,
        montoTransaccion=0,
        monto=0,
        hora = 15
        ;

    public static void main(String[] args) {
    //solicitar datos por teclado     
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese #Cuenta del cliente A: ");
    cuentaA = parseInt(leer.nextLine());
    System.out.println("Ingrese #Cuenta del cliente B: ");
    cuentaB = parseInt(leer.nextLine());
    System.out.println("Ingrese monto a trasferir: ");
    monto = parseInt(leer.nextLine());
    System.out.println("Ingrese el banco de destino: "); 
    banco = leer.nextLine();
    

    if((cuentaA==cuentaCliente)&&(banco==bancoCliente)&&(saldoCliente>monto)&&(saldoCliente>costoTransaccion)&&(hora>=9 && hora <=12)||(hora>=15&&hora <=20))//comprobar cuentas
    {
        if((cuentaB==cuentaDestino))
        {
            costoTransaccion = 100;
        }
        else
        {
            costoTransaccion = 0;
        }
        aprobado=true;
        montoTransaccion = monto;
        System.out.println("Transaccion de: "+montoTransaccion+ " exitosa"+" Costo de transaccion: "+costoTransaccion+ "");
        System.out.println("Saldo anterior del cliente: "+saldoCliente+"\n"+"Saldo Actual del cliente: "+(saldoCliente - costoTransaccion));
    }
    }

    
} 

