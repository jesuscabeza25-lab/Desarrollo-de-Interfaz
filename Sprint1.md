# PayClear — Documentación Técnica

* **Módulo:** Desarrollo de Interfaces (DII)
* **Equipo:** Jesús, José Luis, Guillermo
* **Fecha de entrega Sprint 1:** 02/10/2026

| Recurso | Enlace |
| :--- | :--- |
| Prototipo en Figma | [`FIGMA`](https://www.figma.com/make/tw427B0LEsxsFf9xkGl7hG/Maquetacion-Vista-Principal-PI?t=mur4tBSgpFSJc3Sn-1) |
| Repositorio GitHub DI | [`Repositorio DI`](https://github.com/jesuscabeza25-lab/Desarrollo-de-Interfaz) |

---

## 1. Identificación del Público Objetivo
El público objetivo de PayClear se define por la necesidad recurrente de compartir gastos y liquidar deudas de manera ágil, transparente y con total privacidad. Se identifican dos perfiles demográficos e interaccionales clave:

### 1.1. Perfiles de Usuario
* **Perfil Primario:** Estudiantes y Jóvenes Profesionales en Pisos Compartidos
  * **Demografía:** Jóvenes de entre 18 y 30 años.
  * **Contexto:** Convivencia continua donde se generan microgastos diarios habituales (compra del supermercado, facturas de suministros, productos de limpieza).
  * **Necesidades:** Buscan una herramienta directa de uso cotidiano que no requiera crear cuentas colectivas ni invitar a miembros mediante correos electrónicos. Valoran la inmediatez y la visualización clara de "quién debe a quién".
  * **Puntos de Dolor:** Frustración ante las restricciones de uso diario impuestas por apps comerciales y el spam publicitario.

* **Perfil Secundario:** Grupos de Viajeros y Colectivos/Asociaciones Juveniles
  * **Demografía:** Usuarios de 18 a 45 años organizados en eventos puntuales o escapadas grupales.
  * **Contexto:** Entornos con conectividad a internet limitada o nula (viajes rurales, albergues, zonas de montaña, desplazamientos internacionales).
  * **Necesidades:** Necesitan un software Local-First que funcione 100% fuera de línea (*offline*) y un diálogo modal interactivo para reparto rápido de tickets compartidos (cenas, entradas, transportes).
  * **Puntos de Dolor (Pain Points):** Inoperatividad de las aplicaciones basadas en la nube cuando se pierde la cobertura de datos.

### 1.2. Competencia Digital del Usuario
Nivel de habilidad: Básico a Intermedio. La interfaz debe priorizar la simplicidad operativa, evitando jerarquías de menús profundas y garantizando que cualquier usuario pueda registrar un gasto o consultar su saldo sin curva de aprendizaje.

---

## 2. Objetivos Principales de la Interfaz (UI/UX)
La interfaz gráfica de PayClear ha sido conceptualizada bajo el principio de diseño *Task-Oriented* (orientada a la tarea directa) y el paradigma de ventana única (*Single Window Interface*). Sus objetivos principales son:

**1. Reducción de la Fricción Operativa (Flujo en 2 pasos):**
* Diseñar un flujo de interacción directo que permita al usuario realizar las dos acciones fundamentales (Registrar Movimiento y Consultar/Liquidar Deuda) en un máximo de dos clics desde la pantalla principal.

**2. Retroalimentación Visual Inmediata mediante Señalización Cromática:**
* Garantizar una lectura intuitiva del estado contable individual mediante el componente modular `TarjetaSaldoParticipante`. La interfaz comunicará visualmente los estados financieros sin necesidad de interpretar cifras complejas:
  * 🟩 Verde (`#11734F`): Posición positiva (saldo a cobrar / acreedor).
  * 🟥 Rojo (`#B53C3C`): Posición negativa (saldo a pagar / deudor).
  * ⬛/⬜ Gris (`#59665E`): Posición equilibrada (saldo a 0,00 €).

**3. Arquitectura Visual Desacoplada y Modular:**
* Estructurar la vista principal de modo que integre en un único espacio de trabajo la tabla de registros históricos y el panel de balances individuales, manteniendo la interfaz independiente de la lógica matemática subyacente (patrón MVC).
* Implementar un diálogo modal aislado (`DialogoGasto`) que flote sobre la pantalla principal (*overlay*) para efectuar repartos equitativos o asimétricos sin perder el contexto visual de la aplicación.

**4. Inclusividad, Accesibilidad y Usabilidad (UX):**
* Garantizar contrastes de color adecuados para asegurar la legibilidad de la información contable.
* Proporcionar respuestas visuales ante eventos del ratón (estados *Hover*, *Focus* y *Pressed*) en botones y tarjetas de usuario para dar confirmación visual de cada acción.

---

## 3. Benchmarking
Para fundamentar las decisiones de diseño y arquitectura de PayClear, se ha realizado un estudio comparativo respecto a las tres soluciones más extendidas del mercado: Splitwise, Tricount y Settle Up.

| Criterio de Evaluación | Splitwise | Tricount | Settle Up | PayClear (Nuestra Solución) |
| :--- | :--- | :--- | :--- | :--- |
| **Paradigma de Almacenamiento** | Nube (Cloud-First) | Nube (Cloud-First) | Nube / Híbrido | **Local-First (100% Offline)** |
| **Registro y Privacidad** | Obligatorio (Email/Teléfono) | Opcional / Enlace web | Obligatorio (Cuenta Google/Email) | **Sin registro ni datos personales** |
| **Modelo de Monetización** | Freemium (Límites diarios / Pago) | Publicidad invasiva / Compras | Publicidad / Suscripción Premium | **Totalmente Gratuito / Sin Anuncios** |
| **Rendimiento sin Cobertura** | Muy Limitado / Inoperativo | Lectura básica | Lectura básica | **Operativo al 100%** |
| **Complejidad de la Interfaz** | Alta (Múltiples pestañas y menús) | Media (Listas desplegables) | Media (Ajustes avanzados) | **Baja (Ventana Única Optimizada)** |
| **Algoritmo de Liquidación** | En servidor remoto (Caja negra) | En servidor remoto | En servidor remoto | **Algoritmo Voraz Integrado en Local** |

### 3.2. Conclusiones y Factor Diferencial de PayClear
El análisis del mercado evidencia un nicho desatendido: usuarios que requieren calcular y simplificar deudas compartidas sin ceder su privacidad, sin soportar interrupciones publicitarias y sin depender de una conexión a internet activa.

**Ventajas Competitivas de PayClear:**
* **Soberanía de Datos:** Al funcionar de forma estrictamente local, elimina los riesgos de brechas de seguridad o venta de patrones de gasto a terceros.
* **Resiliencia Operativa:** Funcionamiento pleno en cualquier entorno sin depender de infraestructura en la nube.

---

## 4. Product Backlog y Sprint Backlog

### 4.1. Product Backlog (Funcionalidades generales de la aplicación)
* **RE-01:** Como usuario, quiero registrar gastos indicando concepto, importe y pagador para llevar el control del grupo.
* **RE-02:** Como usuario, quiero ver el saldo acumulado de cada miembro del grupo con colores claros (verde si le deben, rojo si debe).
* **RE-03:** Como usuario, quiero pulsar un botón de cálculo que simplifique las deudas para hacer el menor número posible de transferencias.
* **RE-04:** Como usuario, quiero que la interfaz me avise si introduzco datos incorrectos (letras en importes, campos vacíos) sin que la aplicación se bloquee.
* **RE-05:** Como usuario, quiero poder añadir nuevos amigos al grupo de forma rápida para incluirlos en el reparto de gastos inmediatamente.
* **RE-06:** Como usuario, quiero poder exportar o guardar el resumen de cuentas para respaldar la información de forma local.

### 4.2. Sprint Backlog (Sprint 1 - DII / PI)

#### 4.2.1. Objetivo del Sprint (Sprint Goal)
Diseñar y validar un prototipo interactivo de alta fidelidad en Figma que simule operativamente la interfaz de escritorio de PayClear, definiendo los componentes visuales reutilizables, la arquitectura MVC y la documentación técnica requerida para los criterios del RA1.

#### 4.2.2. Tabla de Tareas del Sprint (Sprint Backlog)

| ID | Tarea Técnica | Criterio RA1 / Entregable | Responsable | Estimación | Estado |
| :---: | :--- | :---: | :--- | :---: | :---: |
| #01 | Identificación del público objetivo y perfiles de usuario | Memoria / UX | Jesús | 2 SP | Done |
| #02 | Objetivos principales de la interfaz gráfica | Memoria / UX | Jesús | 2 SP | Done |
| #03 | Estudio de Benchmarking (Splitwise, Tricount, Settle Up) | RA1.a | Jesús | 3 SP | Done |
| #04 | Definición y priorización del Product Backlog | Gestión Scrum | José Luis | 3 SP | Done |
| #05 | Elaboración del Sprint Backlog y Definition of Done | Gestión Scrum | Guillermo | 2 SP | Done |
| #06 | Patrón de arquitectura de la aplicación gráfica (MVC) | RA1.h | Guillermo | 4 SP | Done |
| #07 | Descripción y comparativa técnica de librerías nativas y multiplataforma | RA1.a | Guillermo | 3 SP | Done |
| #08 | Prototipo interactivo de la interfaz de la aplicación en Figma | RA1.b, RA1.c | José Luis | 8 SP | Done |
| #09 | Componentes: características y campo de aplicación | RA1.d | José Luis | 5 SP | Done |
| #10 | Asociación de acciones a eventos y edición del código generado | RA1.e, RA1.f, RA1.g | José Luis | 4 SP | Done |
| #11 | Descripción de clases, propiedades y métodos | RA1.h | Guillermo | 4 SP | Done |

* Carga total estimada y completada: 40 Story Points (SP).

---

## 5. Patrón de Arquitectura: MODELO-VISTA-CONTROLADOR (MVC)

Para la estructuración del software se ha adoptado el patrón estándar **Modelo-Vista-Controlador (MVC)**, adaptado al desarrollo de aplicaciones de escritorio en **Java Swing**.

### 5.1. Justificación de la Elección Arquitectónica

| Criterio | Aplicación en PayClear | Beneficio |
| :--- | :--- | :--- |
| **Separación de Responsabilidades** | El estado contable reside en el Modelo (`Grupo`), la Vista lo renderiza y el Controlador gestiona los eventos. | Evita mezclar lógica de cálculo financiero con el código autogenerado por NetBeans Matisse. |
| **Aislamiento del Algoritmo** | La heurística voraz reside en `modelo/AlgoritmoLiquidacion`. | Permite optimizar o modificar la lógica de pagos sin alterar la interfaz gráfica. |
| **Consistencia de Datos** | La Vista consulta y refleja el estado consolidado de la clase agregada `Grupo`. | Garantiza que cualquier alta o liquidación actualice de inmediato todos los saldos visibles. |
| **Testabilidad** | Las reglas de negocio y los balances no dependen de la máquina gráfica de Swing. | Permite realizar pruebas unitarias automatizadas con JUnit sobre el dominio contable. |

### 5.2. Responsabilidad de los Componentes

* **Modelo (`com.payclear.modelo`):** Gestiona los datos y las reglas contables (`Grupo`, `Participante`, `Gasto`, `Transferencia`, `AlgoritmoLiquidacion`). Representa la única fuente de verdad contable y procesa los saldos netos.
* **Vista (`com.payclear.vista` y `com.payclear.componente`):** Construye las ventanas y diálogos (`VistaPrincipal`, `DialogoGasto`, `DialogoLiquidacion`) y los componentes visuales modulares (`TarjetaSaldoParticipante`). Expone controles y renderiza la información procedente del Modelo.
* **Controlador (`com.payclear.controlador`):** Intermediario de eventos (`ControladorPrincipal`). Implementa `ActionListener`, intercepta las acciones del usuario en la Vista, aplica las mutaciones en el Modelo y solicita a la Vista la actualización de los componentes.

---

## 6. Componentes: Características y Campo de Aplicación

| Componente | Clase Swing | Uso en PayClear | Propiedades principales (definidas en Figma) |
| :--- | :--- | :--- | :--- |
| Ventana principal | `JFrame` | Contiene toda la aplicación | Tamaño, título, color de fondo (`#F3F6F4`) |
| Diálogos | `JDialog` | `DialogoGasto` y `DialogoLiquidacion` | Modal, centrado respecto a la ventana principal |
| Cajas de texto | `JTextField` | Concepto e importe del gasto | Texto de ayuda (*placeholder*), fuente, bordes redondeados |
| Desplegable | `JComboBox` | Selección del miembro pagador | Lista de participantes |
| Selector de modo | `JRadioButton` | Reparto equitativo o manual | Texto, grupo de exclusión mutua (`ButtonGroup`) |
| Botones | `JButton` | Registrar gasto, liquidar, guardar, cancelar | Texto, colores corporativos, estados *hover* y *pressed* |
| Tabla | `JTable` | Historial de gastos | Columnas: fecha, concepto, pagador, importe |
| Lista | `JList` | Plan de liquidación óptimo | Selección simple, formato de fila textual |
| Tarjeta de saldo | `TarjetaSaldoParticipante` (JavaBean propio, `JPanel`) | Nombre y saldo con color según estado | `nombreParticipante`, `saldoActual` |

---

## 7. Asociación de Acciones a Eventos y Edición del Código Generado

### 7.1. Interacción en Figma (Prototipo actual)

* **Acceso al Grupo Local:**  
  Pantalla inicial para seleccionar o abrir el espacio de trabajo local del grupo sin necesidad de registro ni credenciales en la nube.  
  ![Acceso al grupo](https://github.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/blob/main/img/Iniciar%20sesion.png?raw=true)

---

* **Calculadora / Diálogo Modal de Reparto Rápido:**  
  Ventana emergente interactiva para registrar tickets y repartir los importes de forma ágil entre los miembros del grupo.  
  ![Calculadora](https://github.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/blob/main/img/Calculadora.png?raw=true)

---

* **Gestión de Gastos (Vista Principal e Idea Futura de Carpetas):**  
  Espacio central con el listado de gastos registrados. La división visual por categorías o carpetas se plantea en el prototipo como una mejora futura a incorporar en posteriores sprints del proyecto.  
  ![Gestión de gastos](https://github.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/blob/main/img/gestion%20de%20gastos%20dividido%20en%20carpetas.png?raw=true)

---

* **Estado de Deudas (Pendientes, Equilibradas y Saldadas):**  
  Panel de control de saldos que utiliza código de colores para mostrar el balance de cada participante (verde si tiene saldo a favor, rojo si debe dinero y gris si está saldado a 0,00 €).  
  ![Deudas pendientes y saldadas](https://github.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/blob/main/img/pantalla%20de%20deudas%20pendientes%20y%20saldadas.png?raw=true)

---

### 7.2. Matriz de Eventos y Acciones

En la siguiente tabla se especifica la relación entre los componentes de la interfaz, los eventos disparados por el usuario y la acción asociada tanto en el prototipo interactivo de Figma como en la implementación en Java Swing:

| Componente | Evento / Disparador | Acción Asociada |
| :--- | :--- | :--- |
| `btnNuevoGasto` | Clic / Tap | Abre el diálogo modal `DialogoGasto` para registrar un apunte. |
| `btnGuardar` (en modal) | Clic / Tap | Valida los campos, envía los datos al controlador y añade el gasto. |
| `btnLiquidar` | Clic / Tap | Invoca el algoritmo voraz y despliega el diálogo modal con el plan de pagos. |
| `btnNuevoGasto` / `btnGuardar` | While Hovering / Pressed | Retroalimentación visual interactiva en Figma (cambio sutil de elevación y color). |
| `TarjetaSaldoParticipante` | Clic | Filtra el historial para mostrar únicamente los gastos del miembro seleccionado. |

---

### 7.3. Planificación de Conexión de Eventos en Java Swing

Para la fase de desarrollo en código, se seguirá el patrón arquitectónico desacoplado MVC:
* **Encapsulación en la Vista:** La vista mantendrá sus controles como variables privadas y expondrá métodos de acceso públicos, tales como `getBtnNuevoGasto()` o `getBtnGuardar()`.
* **Suscripción Externa:** El controlador (`ControladorPrincipal`) implementará la interfaz `ActionListener` y se vinculará a los componentes sin ensuciar la vista con lógica de eventos:
  ```java
  vista.getBtnNuevoGasto().addActionListener(this);
  vista.getBtnLiquidar().addActionListener(this);

* **Respeto al código autogenerado:** El bloque de código protegido generado por NetBeans Matisse (`// <editor-fold defaultstate="collapsed" desc="Generated Code">`) se conservará intacto para garantizar la compatibilidad con el diseñador visual `.form`.

---

## 8. Descripción de Librerías de Componentes Nativas y Multiplataforma y sus Características

### 8.1. Componentes Pesados frente a Ligeros
* **Componentes Pesados (Nativos):** Son gestionados y dibujados directamente por el sistema operativo mediante su API nativa (GDI, Cocoa, X11). Garantizan integración estética con el entorno, pero sufren de rigidez gráfica e inconsistencias entre plataformas.
* **Componentes Ligeros (Multiplataforma):** Son renderizados directamente por la máquina virtual o el motor gráfico de la aplicación. Permiten control total del ciclo de pintura, soporte de transparencias y consistencia multiplataforma.

### 8.2. Matriz Comparativa de Tecnologías

| Tecnología | Naturaleza | Motor de Renderizado | Plataformas | Decisión en PayClear |
| :--- | :--- | :--- | :--- | :--- |
| **Java AWT** | Pesada (Nativa) | API del SO | Escritorio | **Descartada:** Apariencia obsoleta y rigidez para componentes propios. |
| **Java Swing** | Ligera (JVM) | Java 2D | Escritorio | **Seleccionada (Escritorio):** Soporte nativo de JavaBeans, editor Matisse. |
| **JavaFX** | Scene Graph | Prism (GPU) | Escritorio | **Descartada:** Módulos desacoplados del JDK que añaden complejidad innecesaria. |
| **Flutter / Dart** | Reactiva en lienzo | Impeller / Skia (GPU) | Móvil, Escritorio y Web | **Seleccionada (Móvil):** Código unificado para el cliente móvil en Proyecto Intermodular. |

### 8.3. Justificación de la Elección
1. **Java Swing para Desarrollo de Interfaces:** Permite implementar el componente modular `TarjetaSaldoParticipante` bajo el estándar JavaBean, facilitando la maquetación desacoplada en NetBeans Matisse.
2. **Flutter para Proyecto Intermodular:** Garantiza la migración progresiva hacia entornos móviles en fases posteriores mediante una arquitectura reactiva y renderizado acelerado por GPU.

---

## 9. Descripción de Clases, Propiedades y Métodos

Diseño inicial del Sprint 1 siguiendo el patrón arquitectónico **MVC**. Las clases y métodos se refinarán en los siguientes sprints.

### 9.1. Modelo (`com.payclear.modelo`)

| Clase | Responsabilidad | Propiedades | Métodos clave |
| :--- | :--- | :--- | :--- |
| `Grupo` | Única fuente de verdad contable; gestiona participantes y gastos | `id`, `nombre`, `participantes`, `gastos` | `registrarGasto(Gasto)`, `recalcularSaldos()`, `getTotalPorCobrar()`, `getTotalPorPagar()` |
| `Participante` | Miembro del grupo y su saldo neto consolidado | `id`, `nombre`, `saldo` | `getNombre()`, `getSaldo()`, `setSaldo(double)` |
| `Gasto` | Movimiento económico del grupo (ordinario o liquidación) | `concepto`, `importeTotal`, `pagador`, `asignaciones`, `fecha` | `agregarConsumo(Participante, double)`, `dividirEquitativamente(List<Participante>)` |
| `Transferencia` | Pago directo propuesto por el algoritmo (*record*) | `deudor`, `acreedor`, `importe` | `deudor()`, `acreedor()`, `importe()`, `aGastoCompensatorio()` |
| `AlgoritmoLiquidacion` | Simplifica deudas mediante una heurística voraz (*greedy*) | (sin estado) | `calcularTransferencias(List<Participante>)` |

> *Nota sobre el algoritmo:* El algoritmo empareja al mayor deudor con el mayor acreedor de forma iterativa. Al tratarse de un problema NP-difícil, no garantiza el mínimo absoluto en todos los casos combinatorios, pero asegura saldar todas las cuentas en como máximo $n − 1$ pagos directos.

### 9.2. Componente personalizado (`com.payclear.componente`)

| Clase | Responsabilidad | Propiedades | Métodos clave |
| :--- | :--- | :--- | :--- |
| `TarjetaSaldoParticipante` (JavaBean, extiende `JPanel`) | Muestra nombre y saldo con señalización cromática automática | `nombreParticipante`, `saldoActual` | `setNombreParticipante(String)`, `setSaldoActual(double)` |

Estados visuales: verde (`#11734F`) si el saldo es positivo, rojo (`#B53C3C`) si es negativo y gris (`#59665E`) si es cero (con margen de tolerancia para evitar imprecisiones de redondeo).

### 9.3. Vista (`com.payclear.vista`)

Las vistas construyen la interfaz visual y exponen sus controles para que el controlador pueda suscribir escuchadores de eventos.

| Clase | Tipo | Componentes principales | Métodos clave |
| :--- | :--- | :--- | :--- |
| `VistaPrincipal` | `JFrame` | Panel de tarjetas, `JTable` de historial, `btnNuevoGasto`, `btnLiquidar` | `getBtnNuevoGasto()`, `getBtnLiquidar()`, `actualizar(Grupo)` |
| `DialogoGasto` | `JDialog` | `txtConcepto`, `txtImporte`, `cmbPagador`, filas de reparto, `btnGuardar`, `btnCancelar` | `getConceptoInput()`, `getImporteInput()`, `getBtnGuardar()` |
| `DialogoLiquidacion` | `JDialog` | `JList` de transferencias, `btnConfirmar` | `mostrarPlan(List<String>)`, `getBtnConfirmar()` |

### 9.4. Controlador (`com.payclear.controlador`)

| Clase | Responsabilidad | Propiedades | Métodos clave |
| :--- | :--- | :--- | :--- |
| `ControladorPrincipal` (implementa `ActionListener`) | Conecta vistas y modelo; captura eventos de los botones y muta el modelo | `vista`, `grupo` | `actionPerformed(ActionEvent)`, `procesarNuevoGasto()`, `gestionarLiquidacion()` |
