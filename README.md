# 🚗📺 Enterprise Java Development 1.08

Este repositorio contiene la solución al conjunto de ejercicios planteados para la práctica de programación orientada a objetos en Java. Abarca desde operaciones con `BigDecimal` hasta el diseño de sistemas de inventario y listas personalizadas con estructuras dinámicas.

---

## 📌 Estructura del Proyecto
Enterprise-Java-Development-1.08/
├── src/
│ ├── bigdecimal/
│ │ └── BigDecimalUtils.java
│ ├── carinventory/
│ │ ├── Car.java
│ │ ├── Sedan.java
│ │ ├── Truck.java
│ │ └── UtilityVehicle.java
│ ├── videostreaming/
│ │ ├── Video.java
│ │ ├── Movie.java
│ │ └── TvSeries.java
│ └── intlist/
│ ├── IntList.java
│ ├── IntArrayList.java
│ └── IntVector.java
└── README.md

markdown
Copiar
Editar

---

## 🔢 BigDecimal Operations

Clase: `BigDecimalUtils`

- **`double roundToHundredth(BigDecimal number)`**  
  Redondea un número `BigDecimal` al **centésimo más cercano (2 decimales)**.  
  Ejemplo: `4.2545` → `4.25`.

- **`BigDecimal reverseAndRoundToTenth(BigDecimal number)`**  
  Invierte el signo del número y lo redondea al **décimo más cercano (1 decimal)**.  
  Ejemplo: `1.2345` → `-1.2`, `-45.67` → `45.7`.

---

## 🚘 Car Inventory System

### Clase abstracta: `Car`

- Atributos: `vinNumber`, `make`, `model`, `mileage`.
- Método: `getInfo()` → Devuelve una descripción legible del vehículo.

### Subclases:

- `Sedan` → Hereda directamente sin atributos adicionales.
- `UtilityVehicle` → Añade `boolean fourWheelDrive`.
- `Truck` → Añade `double towingCapacity`.

**Ejemplo de uso**:
```java
Truck t = new Truck("123ABC", "Ford", "F-150", 12000, 7500.0);
System.out.println(t.getInfo());
📺 Video Streaming Service
Clase abstracta: Video
Atributos: title, duration.

Método: getInfo() → Devuelve información legible del contenido.

Subclases:
TvSeries → Añade int episodes.

Movie → Añade double rating.

Ejemplo de uso:

java
Copiar
Editar
Movie m = new Movie("Inception", 148, 8.8);
System.out.println(m.getInfo());
📚 IntList Interface
Interfaz: IntList

void add(int number)

int get(int index)

Implementaciones:
IntArrayList
Almacena elementos en un array de tamaño inicial 10.

Si se llena, el array se expande un 50% más (de 10 → 15 → 22...).

IntVector
Almacena elementos en un array de tamaño inicial 20.

Si se llena, el array se duplica en tamaño (de 20 → 40 → 80...).

⚖️ ¿Cuál es más eficiente?
Escenario	Mejor Opción	Motivo
Pocos elementos y memoria limitada	IntArrayList	Crece de forma más controlada, útil si no se espera mucho crecimiento.
Gran volumen de datos dinámicos	IntVector	Su crecimiento exponencial lo hace más eficiente en grandes cargas.

🚀 Cómo Ejecutar
Clona el repositorio:

bash
Copiar
Editar
git clone https://github.com/TU_USUARIO/Enterprise-Java-Development-1.08.git
Abre el proyecto en tu IDE Java (Eclipse, IntelliJ, NetBeans).

Ejecuta clases de prueba o crea tu propia clase Main para probar las funcionalidades.

🧑‍💻 Autor/a
Lucintheskies
📬 GitHub









Preguntar a ChatGPT

