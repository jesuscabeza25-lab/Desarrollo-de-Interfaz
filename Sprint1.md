# **Documentación Técnica**

## 1. Identificación del Público Objetivo
El público objetivo de PayClear se define por la necesidad recurrente de compartir gastos y liquidar deudas de manera ágil, transparente y con total privacidad. Se identifican dos perfiles demográficos e interaccionales clave:

### 1.1. Perfiles de Usuario (User Personas)
* **Perfil Primario:** Estudiantes y Jóvenes Profesionales en Pisos Compartidos

  * **Demografía:** Jóvenes de entre 18 y 30 años.

  * **Contexto:** Convivencia continua donde se generan microgastos diarios habituales (compra del supermercado, facturas de suministros, productos de limpieza).

  * **Necesidades y Motiva:** Buscan una herramienta directa de uso cotidiano que no requiera crear cuentas colectivas ni invitar a miembros mediante correos electrónicos. Valoran la inmediatez y la visualización clara de "quién debe a quién".

  * **Puntos de Dolor (Pain Points):** Frustración ante las restricciones de uso diario impuestas por apps comerciales y el spam publicitario.

* **Perfil Secundario:** Grupos de Viajeros y Colectivos/Asociaciones Juveniles

  * **Demografía:** Usuarios de 18 a 45 años organizados en eventos puntuales o escapadas grupales.

  * **Contexto:** Entornos con conectividad a internet limitada o nula (viajes rurales, albergues, zonas de montaña, desplazamientos internacionales).

  * **Necesidades y Motiva:** Necesitan un software Local-First que funcione 100% fuera de línea (offline) y un diálogo modal interactivo para reparto rápido de tickets compartidos (cenas, entradas, transportes).

  * **Puntos de Dolor (Pain Points):** Inoperatividad de las aplicaciones basadas en la nube cuando se pierde la cobertura de datos.

### 1.2. Competencia Digital del Usuario
Nivel de habilidad: Básico a Intermedio. La interfaz debe priorizar la simplicidad operativa, evitando jerarquías de menús profundas y garantizando que cualquier usuario pueda registrar un gasto o consultar su saldo sin curva de aprendizaje.


## 2. Objetivos Principales de la Interfaz (UI/UX)
La interfaz gráfica de PayClear ha sido conceptualizada bajo el principio de diseño Task-Oriented (orientada a la tarea directa) y el paradigma de ventana única (Single Window Interface). Sus objetivos principales son:

**1. Reducción de la Fricción Operativa (Flujo en 2 pasos):**

* Diseñar un flujo de interacción directo que permita al usuario realizar las dos acciones fundamentales (Registrar Movimiento y Consultar/Liquidar Deuda) en un máximo de dos clics desde la pantalla principal.

**2. Retroalimentación Visual Inmediata mediante Señalización Cromática:**

* Garantizar una lectura intuitiva del estado contable individual mediante el componente modular TarjetaSaldoParticipante. La interfaz comunicará visualmente los estados financieros sin necesidad de interpretar cifras complejas:

  * 🟩 Verde (Acreedor): Posición positiva (saldo a cobrar).

  * 🟥 Rojo (Deudor): Posición negativa (saldo a pagar).

  * ⬛/⬜ Gris/Neutral: Posición equilibrada (saldo a 0,00 €).

**3. Arquitectura Visual Desacoplada y Modular:**

* Estructurar la vista principal de modo que integre en un único espacio de trabajo la tabla de registros históricos y el panel de balances individuales, manteniendo la interfaz independiente de la lógica matemática subyacente (patrón MVC).

* Implementar un diálogo modal aislado (DialogoDivisionRapida / Calculadora Rápida) que flote sobre la pantalla principal (overlay) para efectuar repartos equitativos o asimétricos sin perder el contexto visual de la aplicación.

**4. Inclusividad, Accesibilidad y Usabilidad (UX):**

* Garantizar contrastes de color adecuados para asegurar la legibilidad de la información contable.

* Proporcionar respuestas visuales ante eventos del ratón (estados Hover, Focus y Pressed) en botones y tarjetas de usuario para dar confirmación táctil/visual de cada acción.
