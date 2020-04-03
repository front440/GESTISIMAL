
# Bienvenidos al Repositorio de Java

Hola! Mi nombre es **Francisco Javier Campos Gutiérrez**, soy estudiante de Desarrollo de Aplicaciones Web en [IES Grán Capitán](https://informatica.iesgrancapitan.org/), Córdoba.

# Gestísimal

 Será un programa en el que haremos la gestión simplificada de un almacén, en el que llevamos a cabo la gestión de **artículos** el cual tendrá los siguientes atributos:
 
## Clase Artículo
Esta será la clase que representa los artículos que tendrá el almacén.
 1. **Código**: Se incrementará automáticamente cuando se añada un artículo
 2. **Descripción**: Breve descripción del artículo
 3. **Precio Venta**: Precio de venta
 4. **Precio de Compra**: Precio de venta al público
 5. **Unidades**: Stock del artículo en el almacén
 
## Clase Almacén
Es el encargado de gestionar los artículos en el almacén, estos serán guardados en un **ArrayList** , este tendrá una serie de comportamientos:

 1. **Añadir**: No podrá existir dos artículos iguales
 2. **Borrar**: Baja de artículos.
 3. **Modifica**: Modificamos todos los atributos del artículo.
 4. **Incrementa Stock**: Incrementamos existencias del artículo.
 5. **Decrementa Stock**: Incrementamos existencias del artículo.
 6. **Mostrar**: Mostramos los atributos del artículo.

## Clase Test
En ella realizaremos la comunicación con el usuario y desde la cual manipularemos el almacén. Tendremos un menú desde el cual se harán llamadas a los métodos que delegarán el trabajo a las clases almacén y artículo a su vez

> Tendremos que tener en cuenta las excepciones las cuales las tendremos que crear y aplicar y capturas para evitar errores en tiempo de ejecución. La comunicación con el usuario tiene que ser la más clara posible y mostrar el máximo número de detalles.
