# Patrones: 

## Abstract factory: 
Mercado Libre permite a los vendedores ofrecer diferentes tipos de productos: electrónicos, ropa y muebles. Cada categoría tiene una forma diferente de calcular el precio final, debido a impuestos y costos de envío específicos.
Por lo tanto, queremos crear una solución que permita generar distintos tipos de productos de forma flexible, asegurando que cada categoría tenga su propia lógica de cálculo de precio.

## Metodo Fabrica 
Mercado libre al ser una plataforma de comercio online (e-commerce) tiene que tomar en cuenta no solo la idea de poder comprar si no también el cómo se van a entregar cada uno de los productos que el cliente desee comprar. 
Por dicha razón la solución propuesta a nivel de código viene siendo la implementación del patrón de diseño Factory Method el cúal nos hará , mediante la delegación de creación de clases, crear qué tipo de entrega quiere el usuario en proceso de ejecución, de esta forma solucionando el problema de las entregas.

## Builder
 Los vendedores necesitan crear publicaciones para sus productos, pero cada publicación puede tener múltiples configuraciones y atributos opcionales, como título, descripción, precio, categoría, imágenes y detalles adicionales. Manejar todas estas combinaciones con subclases resultaría en una jerarquía compleja y difícil de mantener.
Para resolver este problema, implementaremos el patrón Builder, permitiendo la creación paso a paso de publicaciones personalizadas sin necesidad de múltiples constructores o subclases innecesarias.

## Prototype
Dentro del contexto de Mercado Libre podemos encontrar opciones la cual permiten duplicar o replicar ya sea una publicación, un comentario, etc. Realmente hay múltiples cosas que podemos clonar, sin embargo nos centraremos en la solución frente a publicaciones y comentarios.
	Esto ayudaría a no tener que repetir el código si no solo crear por medio de una instancia prototípica, así, copiando un archivo que nosotros deseemos, ya sea solo para cambiar algunas configuraciones extra y no tener que hacerlo desde cero

## Singleton
Cada compra genera un número de orden único y debe ser registrada en un sistema de seguimiento. Para evitar que múltiples instancias del sistema asignen números de orden duplicados, necesitamos garantizar que solo exista un único gestor de órdenes en toda la aplicación.

# Patrones Estructurales 

## Adapter
No se porque no se poneeeeE!!!! 
Existen diferentes tipos de publicaciones de productos (Ejemplo: productos nuevos, usados, subastas). Cada publicación puede tener distintos métodos de pago (Ejemplo: tarjeta de crédito, PayPal, pago contra entrega).
El problema es que si combinamos cada tipo de publicación con cada método de pago directamente, el código se volvería muy difícil de entender. Por lo tanto aplicamos el patrón Bridge, separando la abstracción (Publicación) de su implementación (Método de Pago), permitiendo mayor flexibilidad.



## Bridge
En una plataforma como Mercado Libre, existen diferentes tipos de publicaciones de productos (Ejemplo: productos nuevos, usados, subastas). Cada publicación puede tener distintos métodos de pago (Ejemplo: tarjeta de crédito, PayPal, pago contra entrega).
El problema es que si combinamos cada tipo de publicación con cada método de pago directamente, el código se volvería muy rígido y difícil de mantener. Aquí es donde aplicamos el patrón Bridge, separando la abstracción (Publicación) de su implementación (Método de Pago), permitiendo mayor flexibilidad.	

## Composite
Existen diferentes tipos de publicaciones de productos (Ejemplo: productos nuevos, usados, subastas). Cada publicación puede tener distintos métodos de pago (Ejemplo: tarjeta de crédito, PayPal, pago contra entrega).
El problema es que si combinamos cada tipo de publicación con cada método de pago directamente, el código se volvería muy difícil de entender. Por lo tanto aplicamos el patrón Bridge, separando la abstracción (Publicación) de su implementación (Método de Pago), permitiendo mayor flexibilidad.


## Decorator
Los vendedores pueden ofrecer envíos de sus productos con diferentes opciones adicionales, como envoltura de regalo, seguro de envío y entrega express. Cada una de estas opciones incrementa el costo del envío, y los clientes pueden combinarlas según sus necesidades.
Para resolver esto, usaremos el patrón Decorator, que nos permite agregar funcionalidades (envoltura, seguro, express) de forma dinámica sin modificar la estructura base del cálculo de envíos.

## Facade

## Flyweight
Los usuarios pueden dejar reseñas sobre los productos. Sin embargo, muchas reseñas contienen frases repetitivas como "Buena calidad", "Llegó rápido", "Recomiendo al vendedor", etc. En lugar de almacenar una nueva cadena de texto para cada reseña similar, usaremos el patrón Flyweight para compartir las frases repetidas y reducir el consumo de memoria.

## Proxy
# Patrones de comportamiento 

## Plantilla
Los vendedores pueden ofrecer descuentos (Descuento porcentual, descuento fijo)en función de la cantidad comprada. Existen diferentes estrategias de descuento.
	Queremos estandarizar la forma en que se calcula el precio final aplicando el patrón Template Method.

## Estrategia

## Cadena de responsabilidades 

## Comando

## Iterator 

## Mediador

## Memento

## Observer
