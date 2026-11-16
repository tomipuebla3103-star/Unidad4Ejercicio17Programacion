<img width="397" height="410" alt="image" src="https://github.com/user-attachments/assets/5b5b71bd-76d5-4f54-ae4e-b91f6936f36d" />

Sistema de Bonificaciones Salariales por Desempeño

 Descripción

Este proyecto consiste en desarrollar un sistema de liquidación de bonificaciones salariales utilizando Java.

El sistema permite calcular los bonos anuales de diferentes trabajadores de una empresa, como empleados de ventas, sistemas y recursos humanos. Cada sector cuenta con sus propios porcentajes de bonificación y premios por objetivos.

 Objetivo

Crear una clase abstracta TrabajadorCorporativo que establezca una estructura general para los empleados y utilizar el polimorfismo para calcular las bonificaciones según el rol de cada trabajador.

 Clases utilizadas

TrabajadorCorporativo: clase abstracta que contiene los atributos nombre y sueldoBase, además del método abstracto calcularBonoAnual().

EmpleadoVentas: representa al personal de ventas y calcula sus bonificaciones mediante porcentajes de comisiones y objetivos.

EmpleadoSistemas: representa al personal de sistemas y calcula sus premios según el cumplimiento de objetivos.

EmpleadoRRHH: representa al personal de recursos humanos y aplica sus propias reglas de bonificación.

LiquidadorSueldos: recibe trabajadores de tipo TrabajadorCorporativo y procesa las liquidaciones sin verificar la subclase.

Main: contiene el método principal, instancia los distintos empleados y muestra los resultados por consola.

 Conceptos aplicados

Clases abstractas: permiten definir una estructura general para los trabajadores.

Herencia: permite que las clases concretas compartan los atributos y comportamientos de TrabajadorCorporativo.

Polimorfismo: permite calcular las bonificaciones de distintos empleados mediante una referencia del tipo general.

Sobrescritura de métodos: cada sector implementa su propia versión de calcularBonoAnual().

Encapsulamiento: permite organizar y proteger los datos de los trabajadores.

 Funcionamiento

Se crea la clase abstracta TrabajadorCorporativo con sus atributos y método abstracto.

Se desarrollan las clases EmpleadoVentas, EmpleadoSistemas y EmpleadoRRHH.

Cada clase establece su propia lógica para calcular el bono anual.

La clase LiquidadorSueldos recibe un trabajador y procesa su liquidación de manera polimórfica.

En el Main se crean distintos perfiles de empleados y se realizan las simulaciones.

Finalmente, se muestra el desglose de las bonificaciones y los montos finales por consola.

 Tecnologías utilizadas

Java

IntelliJ IDEA

Programación Orientada a Objetos (POO)

Resultado esperado

El sistema permite calcular las bonificaciones anuales de diferentes trabajadores utilizando un mismo método general. Cada empleado obtiene un bono según su sector y desempeño, demostrando cómo funciona el polimorfismo mediante clases abstractas y herencia.
