
# Test de JAVA



## Actividad



* Correr la aplicacion y verla en <http://localhost:8080> 

```java
mvn clean install
mvn spring-boot:run
```

* Modificar en HomeController,a un tipo no primitivo

```
con eclipse usar ctrl + shift + R  y buscar homecontroller
modificar el atributo "activado"

```

* Crear un dto para almacenar una Persona con nombre , apellido y edad


*  Instanciar una persona el home controller , setearle nombre, apellidos y edad y devolver el mensaje en el metodo home()  "la persona <nombre> <apellido> con <edad> años de edad, ha sido creada"


* Crear una interfaz Humano con el metodo void caminar()


* Crear dos clase (hombre y mujer) que implementen humano e implementar como deben caminar 

```
System.out.print("Camina como hombre");

System.out.print("Camina como mujer");

```

* Crear una clase abstracta llamada BaseProject con un constructor que reciba un String mensaje


* crear un metodo abstracto en BaseProject que reciba el dto Persona y un Integer
 y retorne una fecha  Date()


* Heredar BaseProject e implementar lo anterior


* Crear un package services (siguiendo el estandar actual de los paquetes del proyecto)


* Crear un package services.impl



  
 
  


 

