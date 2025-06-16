# Clean Architecture en Microservicios con Spring Boot

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?
Separar responsabilidades para lograr un sistema flexible, mantenible y testable.

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?
Mejora el desacoplamiento, facilita pruebas, cambios y escalabilidad del microservicio.

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?
- **Entidad (Dominio):** Lógica de negocio pura.  
- **Casos de uso:** Reglas específicas de aplicación.  
- **Interfaz (Interface Adapters):** Entrada/salida (controladores, repositorios, DTOs).  
- **Infraestructura:** Frameworks, bases de datos, APIs externas.

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?
Para permitir cambios tecnológicos sin afectar la lógica de negocio y facilitar pruebas.

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?
Coordina los casos de uso, sin lógica de dominio; maneja la orquestación de tareas.

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?
- **UseCase:** Contiene lógica de aplicación específica.  
- **Service:** Puede ser un componente de infraestructura o soporte (por ejemplo, envío de emails).

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?
Para mantener el dominio independiente de la tecnología de persistencia.

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?
Se implementa como una clase de aplicación que orquesta entidades y servicios.  
**Ventajas:** código limpio, testeable y desacoplado.

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?
Alto acoplamiento, dificultad para probar, escalar o mantener, y dependencia de tecnologías.

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?
Permite evolución independiente de componentes, pruebas aisladas y mejor organización del código.