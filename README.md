# ProyectoDbp
- establecer quien se encarga de cada entidad (usuario, reserva, orden)
- autenticacion de usuario (guiarnos del codigo de clase) https://github.com/CS2031-DBP/demo-spring-security/tree/master/src/main/java/com/example/demo/repository
- experimentar con el frontend planeado en el canvas


## Configuración de archivos

├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo  
|   |   |               └── DemoApplication.java  
|   |   |               └── Dto
|   |   |               |      └── .java
|   |   |               |      └── .java
|   |   |               |      └── .java
|   |   |               └── Clases
|   |   |               |      └──Carta.java
|   |   |               |      └──CartaItem.java
|   |   |               |      └──Product.java
|   |   |               |      └──User.java
|   |   |               |      └──Orden.java
|   |   |               └── Service
|   |   |               |      └──OrdenService.java
|   |   |               |      └──ProductService.java
|   |   |               |      └──UserService.java
|   |   |               └── Repository
|   |   |               |      └──CartaRepository.java
|   |   |               |      └──OrdenRepository.java
|   |   |               |      └──ProductRepository.java
|   |   |               └── Controller
|   |   |               |      └── .java
|   |   |               |      └── .java
|   |   |               |      └── .java
|   |   |               └── Segurity
|   |   |                      └── .java
|   |   |                      └── .java
|   |   |                      └── .java
|   |   |                       
|   |   |               
|   |   |                      
│   │   └── resources
│   │       └── application.properties 
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java  (Pruebas unitarias)
├── .gitignore  (Especifica archivos a ignorar en el control de versiones)
├── pom.xml  (Archivo de construcción y dependencias de Maven)
├── mvnw  (Herramienta de envoltura de Maven que asegura la versión correcta de Maven sin requerir su instalación)


## Descripcion de las entidades y sus atributos 
### User
User

| Atributo | Tipo de Dato | Descripción                               |
|----------|---------------|-------------------------------------------|
| usersId  | int           | Identificador único para los usuarios.    |
| username | String        | Nombre de usuario del usuario.             |
| password | String        | Contraseña del usuario se recomienda el almacenamiento seguro. |
| enabled  | Boolean       | Indica si la cuenta de usuario está habilitada o deshabilitada. |


### Orden
Orden
| Atributo  | Tipo de Dato | Descripción                                                  |
|-----------|---------------|--------------------------------------------------------------|
| userId    | int           | Identificador del usuario único para la orden.                           |
| product   | Product       | Producto asociado a la orden (relación uno a muchos).        |
| quantity  | int           | Cantidad de productos en la orden.                            |
| totalPrice| double        | Precio total de la orden (puede incluir impuestos y descuentos). |

### producto

| Atributo            | Tipo de Dato         | Descripción                                                      |
|----------------------|----------------------|------------------------------------------------------------------|
| productId            | int                  | Identificador único para el producto.                             |
| productName          | String               | Nombre del producto.                                             |
| productCategory      | String               | Categoría a la que pertenece el producto.                         |
| productDescription   | String               | Descripción detallada del producto.                               |
| productPrice         | double               | Precio del producto.                                             |
| productStatus        | String               | Estado del producto (disponible, agotado, etc.).                  |
| unitInStock          | int                  | Cantidad de unidades en stock del producto.                       |
| productManufacturer  | String               | Nombre del fabricante o fabrica del producto.                     |
| productImage         | MultipartFile        | Archivo de imagen del producto (puede ser nulo si no hay imagen).  |

// ver
### Carta

| Atributo          | Tipo de Dato    | Descripción                                           |
|-------------------|-----------------|-------------------------------------------------------|
| CartaId           | int             | Identificador único para el ítem de la carta.         |
| Description       | String          | Descripción del ítem de la carta.                      |
| lista_productos   | List\<Product\> | Lista de productos asociados al ítem de la carta.      |



## link al modelo entidad relacion :
 
 https://drive.google.com/file/d/1tzzRZ-M-q2H5ZgDe2etSkiP-zm7TH_Kj/view?usp=sharing


