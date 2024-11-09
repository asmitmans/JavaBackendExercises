## Lecciones Aprendidas

1. **Cuidado con la Recursión Infinita**:
   - Es importante tener en cuenta cómo se relacionan los objetos cuando se sobrescribe el método `toString()`. Si hay referencias a otros objetos que a su vez hacen referencia al objeto original, puede ocurrir una recursión infinita.
   - Un `toString()` bien pensado es clave para evitar estos problemas. Es mejor extraer y mostrar atributos simples (como un identificador) en lugar de objetos completos si hay riesgo de recursión.

2. **Práctica en `toString()`**:
   - Cuando una clase tiene referencias a objetos complejos, muestra solo los atributos esenciales que sean suficientes para una representación informativa.
   - En lugar de imprimir el objeto completo, usa atributos identificadores como `id`, `nombre`, o `número de cuenta` para evitar la recursión infinita.

3. **Buenas Prácticas de Desarrollo**:
   - Implementa `toString()` de forma que sea útil para la depuración y evite problemas potenciales.
   - Si es necesario imprimir objetos complejos, hazlo de forma controlada y asegurándote de que no se genere un ciclo infinito.

## Reflexión Final 
Esta experiencia es un ejemplo excelente de cómo situaciones inesperadas pueden surgir incluso en problemas que parecen simples al principio. El manejo de estos casos te ayuda a desarrollar una mentalidad de prevención y cuidado en tu código. La práctica constante con estos detalles hará que tus futuras implementaciones sean más sólidas y a prueba de errores.