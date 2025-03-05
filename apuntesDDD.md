# Domain-Driven Design (DDD)

## 1. ¿Qué es Domain-Driven Design (DDD) y cuál es su objetivo principal?
Domain-Driven Design (DDD) es un enfoque de diseño de software centrado en el **modelo del dominio** y en la colaboración con expertos del dominio para construir sistemas que reflejen con precisión los procesos y reglas del negocio. Su objetivo principal es mejorar la comprensión y alineación entre el equipo de desarrollo y el negocio, asegurando que el software represente fielmente la lógica y comportamiento del dominio.

## 2. ¿Cuál es la diferencia entre una Entidad y un Objeto de Valor en DDD?
- **Entidad**: Es un objeto que tiene una identidad única y persiste en el tiempo, incluso si cambia su estado o atributos. Ejemplo: Un "Usuario" identificado por su ID.
- **Objeto de Valor**: Es un objeto sin identidad propia que se define por sus atributos. Si dos objetos de valor tienen los mismos atributos, se consideran iguales. Ejemplo: Una dirección postal.

## 3. ¿Qué es un Bounded Context y por qué es importante en DDD?
Un **Bounded Context (Contexto Delimitado)** es un límite explícito dentro del cual un modelo de dominio específico es definido y consistente. Es importante porque:
- Ayuda a evitar conflictos entre modelos de dominio.
- Permite a los equipos trabajar de manera independiente dentro de su contexto.
- Facilita la modularización y escalabilidad del sistema.

## 4. ¿Cuál es el propósito del Lenguaje Ubicuo (Ubiquitous Language) en DDD?
El **Lenguaje Ubicuo** es un conjunto de términos compartidos y comprendidos por todos los involucrados en el desarrollo (desarrolladores, diseñadores, expertos del dominio). Su propósito es:
- Mejorar la comunicación entre el equipo técnico y los expertos del negocio.
- Garantizar que el modelo de dominio sea claro y consistente.
- Reducir malentendidos y errores en el desarrollo.

## 5. ¿Qué es un Agregado (Aggregate) y cómo garantiza la consistencia en el dominio?
Un **Agregado** es un grupo de objetos de dominio que se tratan como una unidad coherente. Tiene un **objeto raíz (Aggregate Root)** que controla el acceso y garantiza la consistencia en los cambios. Esto se logra mediante:
- Restricción de modificaciones a través del Aggregate Root.
- Mantenimiento de reglas de negocio y consistencia dentro del agregado.
- Control de transacciones y persistencia dentro de los límites del agregado.

## 6. ¿Cómo se relacionan los Repositorios en DDD con la infraestructura de persistencia?
Los **Repositorios** en DDD actúan como intermediarios entre el dominio y la infraestructura de persistencia. Su función es:
- Encapsular el acceso a la base de datos.
- Proveer una interfaz basada en el modelo de dominio.
- Permitir recuperar y almacenar entidades sin exponer detalles de la infraestructura subyacente (por ejemplo, consultas SQL o tecnologías específicas).

## 7. ¿Qué son los Eventos de Dominio y cómo mejoran la comunicación entre Bounded Contexts?
Los **Eventos de Dominio** son notificaciones que indican que algo relevante ha ocurrido en el dominio. Mejoran la comunicación entre Bounded Contexts porque:
- Permiten la integración de sistemas desacoplados.
- Facilitan la escalabilidad y distribución del sistema.
- Permiten la implementación de arquitecturas basadas en eventos (Event-Driven Architecture).

Ejemplo: Un evento "PedidoCreado" podría ser escuchado por diferentes Bounded Contexts para ejecutar acciones relacionadas, como actualizar inventario o enviar notificaciones.

## 8. ¿Cómo se diferencian los Servicios de Aplicación y los Servicios de Dominio en DDD?
- **Servicios de Aplicación**: Coordinan flujos de negocio, gestionan transacciones y delegan lógica al dominio. No contienen lógica de negocio.
- **Servicios de Dominio**: Contienen lógica de negocio que no encaja en una entidad o agregado. Se usan cuando la lógica involucra múltiples entidades o reglas de negocio complejas.

Ejemplo:
- Un **Servicio de Aplicación** podría gestionar el proceso de registro de un usuario.
- Un **Servicio de Dominio** podría calcular descuentos en una compra basada en reglas de negocio.

## 9. ¿Cómo DDD facilita el diseño de software en sistemas complejos y escalables?
DDD facilita el diseño de software escalable y manejable mediante:
- **Modularización**: Uso de Bounded Contexts para dividir sistemas grandes en partes más manejables.
- **Separación de responsabilidades**: Define límites claros entre infraestructura, aplicación y dominio.
- **Modelado explícito**: Asegura que el código refleje fielmente el dominio del negocio.
- **Arquitecturas flexibles**: Soporte para patrones como Event-Driven y Microservicios.

## 10. ¿Cómo se puede combinar DDD con Clean Architecture en una aplicación de microservicios?
DDD y **Clean Architecture** se complementan bien en una arquitectura de microservicios:
- **DDD proporciona el modelo de dominio**, incluyendo entidades, agregados y bounded contexts.
- **Clean Architecture organiza el código en capas**, asegurando separación de preocupaciones:
  - Capa de Dominio (DDD): Contiene la lógica central del negocio.
  - Capa de Aplicación: Coordina la ejecución de casos de uso.
  - Capa de Infraestructura: Implementa detalles técnicos como bases de datos o APIs externas.
  - Capa de Presentación: Maneja la interacción con el usuario.

Al combinar ambos enfoques, se obtiene un sistema modular, mantenible y preparado para la escalabilidad en entornos de microservicios.
