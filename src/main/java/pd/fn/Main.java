package pd.fn;

import pd.fn.src.CompraFacade;

public class Main {
    public static void main(String[] args) {
        // instanciamos la compra
        CompraFacade compra =  new CompraFacade();
        // y sencillamente ralizamos la compra

        compra.realizarCompra("unemail@email","Maleta toto","Avenida 30",122000);



    }
}