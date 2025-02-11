package pd.fn;

import pd.fn.src.Categoria;
import pd.fn.src.Elemento;
import pd.fn.utils.User;

public class Main {
    public static void main(String[] args) {

        // vamos a ahora a hacer la prueba.
        // lo primero a hacer  será  crear el usuario:
        User user = new User("Jaime", "Jaime@correo.com");
        //Crearemos categorias:
        Categoria tecnologia = new Categoria();
        tecnologia.setNombre("Tecnologia");
        Categoria celulares = new Categoria();
        celulares.setNombre("Celulares");
        Categoria partes = new Categoria();
        partes.setNombre("Partes");
        // Ahora los productos individuales
        // creanos el elemento "celularSamsung"
        Elemento celularSamsung = new Elemento();
        celularSamsung.setTitulo("Samsung Galaxy S23");
        celularSamsung.setDescripcion("El último smartphone de Samsung con cámara de 108MP.");
        celularSamsung.setUsuario(user);
        celularSamsung.setValor(999.99f);

        // creamos el elemento "camaraCelular"
        Elemento camaraCelular = new Elemento();
        camaraCelular.setTitulo("Cámara Samsung S23");
        camaraCelular.setDescripcion("Cámara principal de 108MP con estabilización óptica.");
        camaraCelular.setUsuario(user);
        camaraCelular.setValor(199.99f);

        // despues de crearlos vamos a añadirlos:
        tecnologia.add(celulares);
        celulares.add(partes);
        celulares.add(celularSamsung);
        partes.add(camaraCelular);

        //Mirarmoes tecnologia;
        tecnologia.mostrar();
    }
}