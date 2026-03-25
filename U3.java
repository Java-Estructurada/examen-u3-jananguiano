import java.util.Scanner;
public class U3;
public static double
calcularNeto (double bruto) {
double tasaIva = 0.16;
return bruto + (bruto*tasaIva);
public static void main (String[] args){
    Scanner sc = new;
    scanner (System.in);
    Int opcion;
 System.out.println("=====Sistema de Auditoría para Tienda de Hardware======");   
 System.out.println("1. Auditar Facturas del Día");
 System.out.println("2. Calculadora de Impuestos (IVA)");
 System.out.println("3. Cerrar Turno");
 System.out.println("Seleccione una operación:");
 opcion = sc.nextInt ();
if (opcion == 1) {
    System.out.println("¿Cuantas facturas se emitieron Hoy");
    int cantidad = sc.nextInt();
    double acumulado = 0;
    for (int i = 1; <= cantidad; i++ )  {
        System.out.print("Monto de la factuura " + i + ": ");
        double Monto = sc.nextDouble();
        acumulado += Monto;
        System.out.println(">> Corte de caja completado. Ingreso total del día:$" + acumulado);
        else if (opcion == 2) {
            System.out.print("Ingrese el precio bruto del componente: ");
            double precioBruto = sc=nextDouble();
            double resultadoNeto = calcularNeto(precioBruto);
            System.out.println(">> Precio neto procesado con 16% de IVA: $" + resultadoNeto);
            else if (opcion ==3){
                boolean confirmacion = false;
                System.out.print("¿Confirmar cierre de turno? (1: Si / 0: No)");
                int check = sc.nextInt();
                while (check == 1 && ! confirmacion) {
                    System.out.println(">> Turno cerrado exitosamente. Sistema apagado.");
                    confirmacion = true;
                    while (opcion != 3);
                    sc.close();
            
                        
                    }
                }
                    
                }
            }
        }
        
    }
    
}

}    
}

