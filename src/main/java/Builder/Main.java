package Builder;

// Clase principal (Main) para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Entrada entrada = new EntradaTeclado();
        Salida salida = new SalidaPantalla();
        
        salida.mostrar("Ingrese los detalles de la publicación:");
        
        salida.mostrar("Título: ");
        String titulo = entrada.leerTexto();
        
        salida.mostrar("Descripción: ");
        String descripcion = entrada.leerTexto();
        
        salida.mostrar("Precio: ");
        double precio = entrada.leerNumero();
        
        salida.mostrar("Categoría: ");
        entrada.leerTexto();
        String categoria = entrada.leerTexto();
        
        Builder builder = new PublicacionBuilder()
            .setTitulo(titulo)
            .setDescripcion(descripcion)
            .setPrecio(precio)
            .setCategoria(categoria);
        
        Publicacion publicacion = builder.build();
        
        salida.mostrar("Publicación creada:");
        salida.mostrar(publicacion.mostrarDetalles());
    }
}
