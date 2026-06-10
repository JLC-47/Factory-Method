1. ¿Qué problema busca solucionar el patrón Factory Method?
   R//= El alto acopalmiento en la creación de objetos
2. ¿Por qué no es recomendable crear objetos directamente en todas las clases del sistema?
   R//= Porque genera alto acoplamiento y dependencia entre clases
3. ¿Qué función cumple la fábrica dentro del patrón?
   R//= Encapsular y delegar la creación de objetos
4. ¿Cuál es la diferencia entre el producto y los productos concretos?
   R//= El Producto es la interfaz o clase abstracta (el "plano" general) que define qué debe hacer el objeto, mientras que los Productos Concretos son las implementaciones reales y específicas de ese plano
5. ¿Qué ventajas aporta Factory Method en aplicaciones desarrolladas con Spring Boot?
   R//= Centraliza la creación de objetos y evita el uso directo del operador new.
6. ¿Qué ocurriría si fuera necesario agregar un nuevo tipo de objeto al sistema?
    R//= El unico codigo que se modifica es poco y no se tendria que cambiar todo porque los metodos estan centralizado para todos
7. ¿Cómo se relaciona Factory Method con el principio de bajo acoplamiento?
    R//= Porque permite crear objetos sin especificar la clase exacta de la implementación que se va a instanciar.
