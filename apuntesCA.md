# Clean Architecture

## 1. ¿Qué problema busca resolver Clean Architecture en el desarrollo de software?
Clean Architecture busca resolver el problema del **alto acoplamiento** y la **baja mantenibilidad** en el desarrollo de software. Su objetivo es separar la lógica de negocio de los detalles de implementación (como frameworks, bases de datos o interfaces gráficas) para facilitar la **escalabilidad, flexibilidad y testabilidad** del sistema.

## 2. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?
Clean Architecture se organiza en cuatro capas principales:

1. **Capa de Entidades (Dominio)**:
   - Contiene la lógica de negocio pura.
   - Define entidades y reglas que no dependen de ninguna tecnología específica.

2. **Capa de Casos de Uso (Aplicación)**:
   - Implementa la lógica de aplicación y orquesta las operaciones del dominio.
   - Define los casos de uso que interactúan con las entidades de dominio.

3. **Capa de Adaptadores (Interfaz)**:
   - Contiene controladores, presentadores y gateways que comunican la aplicación con la infraestructura.
   - Convierte las solicitudes externas en acciones dentro del sistema.

4. **Capa de Infraestructura**:
   - Implementa detalles técnicos como bases de datos, frameworks y APIs.
   - Contiene la implementación concreta de los repositorios, controladores y servicios externos.

## 3. ¿Qué relación tiene Clean Architecture con el principio de Inversión de Dependencias (DIP) en SOLID?
Clean Architecture aplica el **principio de Inversión de Dependencias (DIP)** al estructurar el código de manera que las **capas externas dependen de las capas internas, y no al revés**. Esto significa que:
- La lógica de negocio no depende de frameworks ni bases de datos.
- Se usan interfaces en las capas internas que las capas externas implementan.
- Los detalles de implementación pueden cambiar sin afectar el núcleo del sistema.

## 4. ¿Por qué es importante desacoplar la lógica de negocio de la infraestructura en una aplicación?
Desacoplar la lógica de negocio de la infraestructura permite:
- **Facilidad de mantenimiento**: Se pueden actualizar frameworks y tecnologías sin afectar la lógica central.
- **Mayor reutilización**: La lógica de negocio puede ser usada en diferentes interfaces o tecnologías.
- **Mejor testabilidad**: Se pueden probar los casos de uso sin depender de bases de datos o servicios externos.

## 5. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad de un sistema?
- **Escalabilidad**: Al estar modularizado, es más fácil agregar nuevas funcionalidades o adaptarse a diferentes arquitecturas (como microservicios).
- **Mantenibilidad**: El código se mantiene organizado y con menor deuda técnica, permitiendo cambios sin efectos secundarios imprevistos.
- **Flexibilidad**: Se pueden cambiar frameworks, bases de datos o tecnologías sin afectar la lógica de negocio.

## 6. ¿Qué diferencia hay entre la capa de dominio y la capa de aplicación en Clean Architecture?
- **Capa de dominio**:
  - Contiene las **entidades y reglas de negocio**.
  - Es completamente independiente de cualquier tecnología o framework.
  
- **Capa de aplicación (casos de uso)**:
  - Define **los flujos de la aplicación** utilizando las entidades del dominio.
  - Orquesta las acciones necesarias para ejecutar operaciones de negocio.
  - No contiene detalles de infraestructura, solo define la lógica de aplicación.

## 7. ¿Por qué los controladores (controllers) y la base de datos deben estar en la capa de infraestructura?
Los **controladores** y la **base de datos** deben estar en la capa de infraestructura porque:
- **Son detalles de implementación**: No forman parte del núcleo del negocio, sino que sirven como interfaz con el mundo exterior.
- **Siguen el principio de inversión de dependencias**: Las capas internas no deben depender de frameworks específicos.
- **Facilitan cambios tecnológicos**: Se puede cambiar la base de datos o el framework web sin modificar la lógica del negocio.

## 8. ¿Qué ventajas tiene usar una interfaz en la capa de dominio para definir repositorios en lugar de usar directamente JpaRepository?
- **Desacoplamiento**: La lógica de dominio no depende de JPA u otro framework de persistencia.
- **Testabilidad**: Se pueden crear implementaciones mock para pruebas sin necesidad de una base de datos real.
- **Flexibilidad**: Se pueden cambiar tecnologías de persistencia sin afectar la lógica del dominio.

Ejemplo:
```java
public interface UserRepository {
    Optional<User> findById(Long id);
    void save(User user);
}
```
La implementación concreta se define en la capa de infraestructura:
```java
@Repository
public class JpaUserRepository implements UserRepository {
    private final SpringDataUserRepository repository;
    
    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
    
    @Override
    public void save(User user) {
        repository.save(user);
    }
}
```

## 9. ¿Cómo interactúan los casos de uso (UseCases) con las entidades de dominio en Clean Architecture?
Los **casos de uso** son responsables de ejecutar la lógica de negocio utilizando las **entidades de dominio**. La interacción funciona así:
1. Un controlador recibe una solicitud HTTP y la envía a un caso de uso.
2. El caso de uso obtiene datos del repositorio y opera sobre las entidades de dominio.
3. Se aplican reglas de negocio dentro de las entidades.
4. El caso de uso devuelve el resultado a la capa de presentación.

Ejemplo:
```java
public class RegisterUserUseCase {
    private final UserRepository userRepository;
    
    public RegisterUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public void execute(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }
}
```

## 10. ¿Cómo se puede aplicar Clean Architecture en una aplicación de microservicios con Spring Boot?
Para aplicar Clean Architecture en microservicios con **Spring Boot**, se puede seguir esta estructura:

```
project-root/
├── domain/              # Entidades y lógica de negocio
├── application/         # Casos de uso
├── infrastructure/      # Implementaciones concretas
│   ├── persistence/     # Repositorios JPA
│   ├── controllers/     # Controladores REST
│   ├── config/          # Configuraciones
└── main/                # Punto de entrada de la aplicación
```

- **Capa de Dominio**: Define entidades y reglas de negocio puras.
- **Capa de Aplicación**: Contiene los casos de uso sin depender de infraestructura.
- **Capa de Infraestructura**: Implementa los adaptadores como controladores REST y repositorios con JPA.
- **Cada microservicio tiene su propio Bounded Context** definido por DDD.

Con esta estructura, se obtiene una arquitectura modular, escalable y fácil de mantener en entornos de microservicios con **Spring Boot**.
