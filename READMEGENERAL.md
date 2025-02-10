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

## Bridge

## Composite

## Decorator

## Facade

## Flyweight

## Proxy
# Patrones de comportamiento 

## Plantilla

## Estrategia

## Cadena de responsabilidades 

## Comando

## Iterator 

## Mediador

## Memento

## Observer
