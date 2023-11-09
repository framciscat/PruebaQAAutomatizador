# PRUEBA QA AUTOMATIZADOR FINAL - 3IT Eureka Teams
## Fecha de entrega: 13/11/2023

### Trainee: Francisca Madariaga
### Mentores: Jacob Vega - Jorge Andrewartha

## Descripción de actividad:
Para llevar a cabo esta actividad, se utilizaron dos herramientas para diferentes pruebas. En primer lugar, se realizaron pruebas de obtención de datos desde la página web del Banco Central, integrando Selenium WebDriver y el framework Cucumber con lenguaje Gherkin. Por otro lado, se validaron dos APIs obtenidas desde la Comisión para el Mercado Financiero, mediante el software Postman. 

## Herramientas y entorno
+ Java Development Kit 17
+ Eclipse IDE for Java Developers v4.29.0
+ Apache Maven v3.9.5
+ Selenium Java v4.14.1
+ JUnit v4.13.2
+ Cucumber Java v7.14.0
+ WebDriver Manager v5.5.3
+ Postman v9.4

## Ejecución actividad Selenium/Cucumber:

+ **Paso 1:** Una vez que hayas descargado el proyecto desde el [repositorio](https://github.com/framciscat/PruebaQAAutomatizador) de Francisca Madariaga, nos ubicamos en la carpeta "PruebaQASelenium" y abrimos el proyecto en el Eclipse IDE.

+ **Paso 2:** Al dirigirse al archivo pom.xml se puede verificar los framework instalados para dicho proyecto.

![Alt text](/images/image.png)

+ **Paso 3:**  En el directorio del proyecto, se encuentra las carpetas 'src/test/java' que contendran los package con los archivos principales de las pruebas de automatización.
+ Assets contendrá una clase que controla los diversos drivers de navegadores que se pueden utilizar para las pruebas, tales como Chrome, Firefox y Edge.

+ Cucumber, contendrá la clase 'Banco' como un archivo feature para los steps definition en lenguaje Gherkin. La clase 'TestRunner', permitirá iniciar la prueba con ayuda de anotaciones de JUnit. 

+ Exercise, este package entregará la clase principal para el test de Selenium, con los pasos a seguir para obtener información desde la página web del Banco Central. Se pueden observar anotaciones como @Given, @When o @And, que coinciden con los step definition de la clase del package Cucumber. 

![Alt text](/images/image-1.png)

+ **Paso 4:** Para poder iniciar el test, nos ubicamos en el package 'cucumber' y damos click derecho a la clase 'TestRunner.java'. Dentro de las opciones, se encuentra 'Run As', la cual desplegará la opción de 'JUnit Test'.

![Alt text](/images/image-2.png)

+ **Paso 5:** Al iniciar el test, se abrirá una ventana de JUnit que entregará información sobre el número de test realizados, posibles errores, fallos o si se considera pasado. Para que este test se considere exitoso, se observará una línea horizontal de color verde, arrojando que el test ha pasado sin errores.

![Alt text](/images/image-3.png)

## Ejecución Postman

+ **Paso 1:** Una vez que hayas descargado el proyecto desde el [repositorio](https://github.com/framciscat/PruebaQAAutomatizador) de Francisca Madariaga, nos ubicamos en la carpeta "PruebaQAPostman", la cual contiene el archivo API CMF.postman_collection que se procede a abrir en el software Postman. 

+ **Paso 2:** Ya dentro de Postman, se podrá observar el nombre de la colección "API CMF", la cual contiene dos request para cada endpoint "Dolar año anterior" y "Euro día actual".
![Alt text](/images/image-4.png)
+ **Paso 3:** A nivel de colección, en el apartado de 'Authorization' se podrá observar que se ingresó la Api Key para tener acceso a las API de la Comisión del Mercado Financiero. 
![Alt text](/images/image-5.png)

+ **Paso 4:** Siguiendo a nivel de colección, en el apartado 'Variables' se podrá observar la definición de la URL base para realizar las solicitudes.
![Alt text](/images/image-6.png)

+ **Paso 5:** Al elegir la request "Dolar año anterior", se encontrará la URL definida con la variable anterior y se especifica el formato JSON. Además el tipo de solicitud HTTP que se utilizará es 'GET'.
![Alt text](/images/image-8.png)

+ **Paso 6:** En el apartado 'Test', se encuentran las funciones correspondientes a cada prueba junto a un texto descriptivo. 

![Alt text](/images/image-9.png)

+ **Paso 7:** Al enviar la solicitud, se podrá observar en el cuerpo de la solicitud la respuesta obtenida. Si cambiamos al apartado 'Test Results', se evidencian los test pasados y fallidos según corresponda. 

![Alt text](/images/image-10.png)

![Alt text](/images/image-11.png)

+ **Paso 8:** Al cumplir esta serie de pasos, se habrá finalizado el desarrollo de la prueba correspondiente al Analista QA Automatizador. 