# Metodología ADD en el Diseño de Arquitecturas de Software

## 1. ¿Cuál es el propósito principal de la metodología ADD en el diseño de arquitecturas de software?
El propósito principal de ADD es guiar el proceso de diseño arquitectónico basándose en los **atributos de calidad** requeridos por el sistema, en lugar de centrarse exclusivamente en la funcionalidad. ADD proporciona un enfoque sistemático y estructurado para la toma de decisiones arquitectónicas, asegurando que la arquitectura final soporte los requisitos de calidad del software.

## 2. ¿Qué atributos de calidad se consideran en ADD y por qué son importantes en el proceso de diseño?
En ADD, se consideran atributos como **rendimiento, escalabilidad, seguridad, mantenibilidad, disponibilidad y usabilidad**, entre otros. Estos atributos son importantes porque afectan directamente la experiencia del usuario, la viabilidad del sistema a largo plazo y su capacidad para cumplir con los requisitos del negocio. Una arquitectura bien diseñada debe equilibrar estos atributos según las necesidades específicas del proyecto.

## 3. Explica la importancia de la selección del módulo a diseñar en ADD. ¿Cuáles son los criterios principales para elegir un módulo?
La selección del módulo a diseñar es crucial en ADD porque permite abordar primero las partes más críticas del sistema. Los criterios principales para elegir un módulo incluyen:
- **Impacto en los atributos de calidad**: Se priorizan los módulos que afectan atributos clave, como el rendimiento o la seguridad.
- **Riesgo técnico**: Se diseñan primero los módulos con mayor incertidumbre o complejidad técnica.
- **Dependencias**: Se identifican módulos que afectan a otros componentes para definir una base sólida.
- **Prioridad en el desarrollo**: Se eligen los módulos que son esenciales para la entrega de funcionalidades clave.

## 4. ¿Cómo influyen las tácticas arquitectónicas en la toma de decisiones dentro de ADD? Menciona dos ejemplos de tácticas y su aplicación.
Las **tácticas arquitectónicas** son estrategias de diseño que ayudan a alcanzar los atributos de calidad deseados. En ADD, influyen al proporcionar soluciones estructuradas para resolver problemas específicos en el diseño de la arquitectura.

Ejemplos de tácticas:
- **Táctica de balanceo de carga (para rendimiento)**: Se utiliza para distribuir las solicitudes entre varios servidores y evitar cuellos de botella en el sistema.
- **Táctica de redundancia (para disponibilidad)**: Implica replicar servicios o bases de datos para asegurar que el sistema siga funcionando incluso si un componente falla.

## 5. ¿Cuál es la relación entre los escenarios de calidad y la evaluación de la arquitectura en ADD?
Los **escenarios de calidad** describen situaciones específicas en las que se espera que el sistema cumpla con ciertos atributos de calidad. En ADD, estos escenarios son fundamentales porque permiten evaluar la arquitectura en términos de su capacidad para satisfacer requisitos como rendimiento, seguridad o escalabilidad. Una arquitectura bien diseñada debe poder cumplir con estos escenarios bajo condiciones realistas.

## 6. Describe los principales pasos del proceso ADD y cómo se interrelacionan.
Los principales pasos de ADD son:
1. **Identificar los requerimientos del sistema y atributos de calidad**: Se recopilan los escenarios de calidad y requisitos clave.
2. **Seleccionar un módulo a diseñar**: Se elige un módulo con base en su impacto en la calidad y las dependencias.
3. **Elegir tácticas arquitectónicas adecuadas**: Se seleccionan tácticas para cumplir con los atributos de calidad deseados.
4. **Definir la estructura del módulo**: Se detallan sus interfaces, responsabilidades y relaciones con otros componentes.
5. **Evaluar la arquitectura**: Se analiza si la solución cumple con los requisitos establecidos.
6. **Repetir el proceso para otros módulos**: Se repite iterativamente hasta completar la arquitectura.

Cada paso se relaciona con los demás, ya que las decisiones tomadas en una fase influyen en las siguientes.

## 7. ¿Por qué es crucial documentar las decisiones arquitectónicas en ADD? Menciona al menos tres elementos que deben incluirse en la documentación.
La documentación es clave para garantizar la trazabilidad de las decisiones y facilitar el mantenimiento y evolución del sistema. Debe incluir:
- **Decisiones tomadas**: Qué alternativas se evaluaron y cuál fue seleccionada.
- **Justificación**: Razón por la cual se eligió una opción en función de los atributos de calidad.
- **Impacto y consecuencias**: Cómo afecta la decisión al resto del sistema y posibles riesgos asociados.

## 8. En un proyecto real, ¿cómo se puede evaluar si una arquitectura diseñada con ADD cumple con los atributos de calidad esperados?
Se pueden utilizar diversas técnicas, como:
- **Revisión de arquitectura (ATAM - Architecture Tradeoff Analysis Method)**: Evaluar cómo la arquitectura satisface los escenarios de calidad.
- **Pruebas de rendimiento y carga**: Medir el comportamiento del sistema en condiciones de estrés.
- **Prototipos y pruebas piloto**: Implementar versiones reducidas del sistema para validar decisiones arquitectónicas.

## 9. ¿Cuáles son los beneficios de utilizar ADD en comparación con otros enfoques de diseño arquitectónico?
- **Enfoque sistemático**: Reduce la subjetividad en la toma de decisiones.
- **Orientado a calidad**: Garantiza que la arquitectura se alinee con los requisitos no funcionales.
- **Modularidad y escalabilidad**: Facilita la evolución del sistema.
- **Mejor comunicación**: Documenta decisiones clave, facilitando la colaboración en el equipo.

## 10. ¿Qué desafíos pueden surgir al aplicar ADD en un equipo de desarrollo y cómo podrían abordarse?
Algunos desafíos incluyen:
- **Falta de experiencia en tácticas arquitectónicas** → Se puede mitigar con capacitación y mentoría.
- **Dificultad en la priorización de atributos de calidad** → Se deben definir claramente los objetivos del negocio y negociar con stakeholders.
- **Resistencia al cambio** → Involucrar al equipo en el proceso y demostrar beneficios con ejemplos prácticos.