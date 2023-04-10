PEJERCICIOS DE APRENDIZAJE

1.Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente:

2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible.
Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, 
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes 
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio
Se debe crear también una subclase llamada Televisor con los siguientes atributos: 
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos 
heredados. 
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
el precio final de los dos electrodomésticos. 

3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor.


4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2

PEJERCICIOS DE APRENDIZAJE EXTRA

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler.

2. Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas

3. Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros. 
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. 
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione 
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres 
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de 
información debe gestionar esta aplicación: 
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
identificación y su estado civil. 
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado. 
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están 
matriculados. 
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
pertenecen (lenguajes, matemáticas, arquitectura, ...). 
• Sobre el personal de servicio, hay que conocer a qué sección están asignados 
(biblioteca, decanato, secretaría, ...). 
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A 
continuación, debe programar las clases definidas en las que, además de los constructores, 
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona. 
• Reasignación de despacho a un empleado. 
• Matriculación de un estudiante en un nuevo curso. 
• Cambio de departamento de un profesor. 
• Traslado de sección de un empleado del personal de servicio. 
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba 
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. 

