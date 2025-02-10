/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;


/**
 *
 * @author Sara
 */
public class Main {
    
    public static void main(String[] args) {
        EntradaTeclado entrada = new EntradaTeclado();
        SalidaPantalla salida = new SalidaPantalla();
        
        salida.mostrarMensaje("Ingrese el nombre del producto: ");
        String producto = entrada.leerTexto();
        
        salida.mostrarMensaje("Ingrese el precio del producto: ");
        double precio = entrada.leerDouble();
        entrada.leerTexto();
        
        MetodoPago metodoPago = new PagoTarjeta(); // Cualquier otro método
        Publicacion publicacion = new PublicacionNueva(metodoPago, producto, precio);
        
        salida.mostrarMensaje(publicacion.realizarVenta());
    }
}