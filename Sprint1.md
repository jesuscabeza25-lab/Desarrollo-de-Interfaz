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

## 3. Benchmarking.
Para fundamentar las decisiones de diseño y arquitectura de PayClear, se ha realizado un estudio comparativo respecto a las tres soluciones más extendidas del mercado: Splitwise, Tricount y Settle Up.

| Criterio de Evaluación      | Splitwise                                 | Tricount                             | Settle Up                         | PayClear (Nuestra Solución)        |
| --------------------------- | ----------------------------------------- | ------------------------------------ | --------------------------------- | ---------------------------------- |
| Paradigma de Almacenamiento | Nube (Cloud-First)                        | Nube (Cloud-First)                   | Nube / Híbrido                    | Local-First (100% Offline)         |
| Registro y Privacidad       | Obligatorio (Email/Teléfono)              | Opcional / Enlace web                | Obligatorio (Cuenta Google/Email) | Sin registro ni datos personales   |
| Modelo de Monetización      | Freemium (Límites diarios / Muro de pago) | Publicidad invasiva / Compras in-app | Publicidad / Suscripción Premium  | Totalmente Gratuito / Sin Anuncios |
| Rendimiento sin Cobertura   | Muy Limitado / Inoperativo                | Lectura básica                       | Lectura básica                    | Operativo al 100%                  |
| Complejidad de la Interfaz  | Alta (Múltiples pestañas y menús)         | Media (Listas desplegables)          | Media (Ajustes avanzados)         | Baja (Ventana Única Optimizada)    |
| Algoritmo de Liquidación    | En servidor remoto (Caja negra)           | En servidor remoto                   | En servidor remoto                | Algoritmo Voraz Integrado en Local |

### 3.2. Conclusiones y Factor Diferencial de PayClear.
El análisis del mercado evidencia un nicho desatendido: usuarios que requieren calcular y simplificar deudas compartidas sin ceder su privacidad, sin soportar interrupciones publicitarias y sin depender de una conexión a internet activa.

**Ventajas Competitivas de PayClear:**

* Soberanía de Datos: Al funcionar de forma estrictamente local, elimina los riesgos de brechas de seguridad o venta de patrones de gasto a terceros.

## 4. Product Backlog y Sprint Backlog

### 4.1. Product Backlog (Funcionalidades generales de la aplicación)
Lista inicial de requisitos e historias de usuario identificadas para el producto completo:

* **RE-01:** Como usuario, quiero registrar gastos indicando concepto, importe y pagador para llevar el control del grupo.
* **RE-02:** Como usuario, quiero ver el saldo acumulado de cada miembro del grupo con colores claros (verde si le deben, rojo si debe).
* **RE-03:** Como usuario, quiero pulsar un botón de cálculo que simplifique las deudas para hacer el menor número posible de transferencias.
* **RE-04:** Como usuario, quiero que la interfaz me avise si meto datos incorrectos (letras en el dinero, campos vacíos) sin que la aplicación se cierre.
* **RE-05:** Como usuario, quiero poder añadir nuevos amigos al grupo de forma rápida.
* **RE-06:** Como usuario, quiero poder exportar o guardar el resumen de cuentas para compartirlo con el resto del grupo.

* Cero Barreras de Entrada: Permite abrir la aplicación y registrar un gasto en segundos, convirtiéndose en una herramienta ideal para el entorno de escritorio y movilidad rápida.
