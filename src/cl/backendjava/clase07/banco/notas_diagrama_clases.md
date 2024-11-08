## Notas de Creación de Diagramas de Clases en UML

### Estructura General de una Clase
1. **Nombre de la Clase**:
   - Colocar el nombre de la clase en la parte superior.
   - El nombre debe estar centrado y en negrita.

2. **Atributos**:
   - Se colocan en la segunda sección, debajo del nombre.
   - Formato de cada atributo:
     ```
     [visibilidad] nombreAtributo: tipo
     ```
     - **Visibilidad**:
       - `+`: Público
       - `-`: Privado
       - `#`: Protegido
     - **Tipo**: Se coloca después de los dos puntos.

   - Ejemplo:
     ```
     - numero: int
     - saldo: double
     - transactions: List<Transaction>
     ```

3. **Métodos**:
   - Se colocan en la tercera sección, debajo de los atributos.
   - Formato de cada método:
     ```
     [visibilidad] nombreMetodo(parametro: tipo): tipoRetorno
     ```
     - **Visibilidad**:
       - `+`: Público
       - `-`: Privado
       - `#`: Protegido
     - **Parámetros**: Se especifican con su tipo entre paréntesis.
     - **Tipo de Retorno**: Se indica después de los dos puntos.

   - Ejemplo:
     ```
     + getNumero(): int
     + setSaldo(saldo: double): void
     + transferir(monto: double, cuentaDestino: Cuenta): void
     ```

### Consideraciones Especiales
- **Clases Abstractas**:
  - Indicar con cursiva o con un sufijo `[abstract]` los métodos.
  - El nombre de la clase también puede estar en cursiva.

- **Enumeraciones (`enum`)**:
  - Representarlas con `<<enumeration>>`.
  - Listar sus valores en la sección de atributos.

  ```
  <<enumeration>> TipoTransaccion
  ------------------------------
  CARGO
  ABONO
  PENALIZACION
  ```

### Buenas Prácticas
- **Simplicidad**: Incluir solo los atributos y métodos relevantes.
- **Consistencia**: Usar la misma notación de visibilidad y formato.
- **Relaciones**:
  - Indicar herencia con líneas y un triángulo que apunta a la superclase.
  - Usar líneas de asociación para mostrar relaciones, indicando
    multiplicidad si es necesario (por ejemplo, `1..*`).

### Ejemplo de Clase Completa
```plaintext
-------------------------
|         Cuenta         |
-------------------------
| - numero: int          |
| - saldo: double        |
| - transactions: List<Transaction> |
-------------------------
| + Cuenta()             |
| + Cuenta(numero: int, saldo: double) |
| + getNumero(): int     |
| + setSaldo(saldo: double): void |
| + transferir(monto: double, cuentaDestino: Cuenta): void |
| + actualizarSaldoMensual(): void [abstract] |
-------------------------
```

Usa esta guía para crear y estructurar tus diagramas de clases de forma clara.

