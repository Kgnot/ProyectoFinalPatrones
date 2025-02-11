package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;
import pd.fn.src.service.*;

public class CompraFacade {
    // un apartado de outout
    private Salida out;
    private UsuarioService usuarioService;
    private ProductoService productoService;
    private EnvioService envioService;
    private PagoService pagoService;
    private FacturaService facturaService;
    public CompraFacade() {
        this.usuarioService = new UsuarioService();
        this.productoService = new ProductoService();
        this.envioService = new EnvioService();
        this.pagoService = new PagoService();
        this.facturaService = new FacturaService();
        this.out = new SalidaPantalla();
    }
    public void realizarCompra(String email, String producto, String direccion, double monto) {
        if (usuarioService.findByUsuario(email) != null) {
            productoService.findProductById(producto);
            envioService.calcularEnvio(direccion);
            pagoService.procesarPago(monto);
            facturaService.generarFactura(email);
            out.imprimir("Compra completada \n");
        } else {
            out.imprimir("Error: Usuario no se ecnuentra");
        }
    }
}

