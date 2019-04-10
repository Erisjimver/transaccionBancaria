package Controlador;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 * @author Israel
 */
public class ejecutoraMultiplesLineas {

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
    

    if((cuentaA==cuentaCliente)&&(cuentaB==cuentaDestino))//comprobar cuentas
    {
        aprobado=true;
    }
    else
    {
        System.out.println("Verifique los numeros de cuenta");
    }
    if(banco==bancoCliente)
    {
        costoTransaccion = 0;
    }
    else
    {
        costoTransaccion = 100;
    }
    
    if((saldoCliente>monto)&&(saldoCliente>costoTransaccion))
    {
       montoTransaccion = monto; 
    }
    else
    {
        System.out.println("No tienes suficiente dinero en tu cuenta...");
    }
    if((hora>=9 && hora <=12)||(hora>=15&&hora <=20))
    {
        horaCorrecta= true;
    }
    else
    {
        System.out.println("Transaccion invalidad, no operamos en estos horarios");
    }
    if((aprobado=true) && (horaCorrecta=true))
    {
        System.out.println("Transaccion de: "+montoTransaccion+ " exitosa"+" Costo de transaccion: "+costoTransaccion+ "");
        System.out.println("Saldo anterior del cliente: "+saldoCliente+"\n"+"Saldo Actual del cliente: "+(saldoCliente - costoTransaccion));
    }
    }

    
} 

