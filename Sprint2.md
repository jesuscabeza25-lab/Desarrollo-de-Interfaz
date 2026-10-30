# PayClear - Documentación Técnica - SPRINT 2

* **Módulo:** Desarrollo de Interfaces (DII)
* **Equipo:** Jesús, José Luis, Guillermo
* **Fecha de entrega Sprint 2:** 30/10/2026

### Coevaluación
| Integrante | Nota (%) |
| :--- | :--- |
| Guillermo Eugui | 100% |
| Jesús Cabeza | 100% | 
| JoseLuís Segura | 70% |

---

### **2.1. Usabilidad y accesibilidad: características, pautas y estándares**

#### **2.1.1. Atributos de usabilidad y formas de medirlo**

-   **Efectividad:** El programa garantiza que los gastos se guarden correctamente y que las cuentas cuadren al 100%. Además, la forma en que calcula las deudas asegura que los compañeros se hagan el menor número posible de pagos entre sí, evitando errores de cálculo.
-   **Eficiencia:** Cualquier usuario puede registrar un gasto en menos de 15 segundos y en solo 3 pasos. Esto se consigue porque toda la aplicación está en una sola pantalla principal y las pantallas emergentes para repartir tickets son muy sencillas.
-   **Satisfacción del usuario:** Buscamos una nota alta (más de 80 puntos sobre 100 en la encuesta de satisfacción estándar SUS). Esto se logra porque la aplicación no exige registrarse con correo electrónico, no tiene anuncios molestos ni pide pagos para usar sus funciones.

#### **2.1.2. Principios de diseño intuitivo**

1.  **Saber siempre qué está pasando:** En cuanto añades o borras un gasto, la pantalla actualiza los saldos de cada persona al instante y de forma automática, sin que tengas que darle a ningún botón de refrescar.
2.  **Estilo claro y conocido:** La aplicación se ve y funciona exactamente igual si la usas en un ordenador con Windows, Mac o Linux , utilizando botones e iconos sencillos que todo el mundo reconoce.
3.  **Evitar errores antes de que ocurran:** Si se te olvida poner cuánto ha costado la compra o intentas escribir letras en lugar de números, el botón de "Guardar" se queda deshabilitado para que no puedas cometer un fallo por despiste.
4.  **Fácil para todo tipo de usuarios:** Si prefieres usar el ordenador rápido, puedes hacer todo solo con la tecla Tabulador sin tocar el ratón. Si usas la pantalla táctil de un móvil, dispones de botones grandes y sencillos.

#### **2.1.3. Reglas de accesibilidad (Pensado para que lo use cualquier persona)**

La aplicación cumple con las normas oficiales de accesibilidad para programas informáticos (UNE-EN 301 549 y WCAG 2.1 Nivel AA):

-   **Colores fáciles de leer:** El texto y las letras destacan mucho sobre el fondo. Cumplimos con los niveles de contraste exigidos para que a nadie le cueste leer la información, incluso si tiene problemas de vista.
-   **Uso completo sin ratón:** Puedes controlar el 100% de la aplicación usando solo las teclas del ordenador (Tab para moverte y Enter para pulsar). Además, la casilla o botón donde estás situado se marca con un borde de color muy claro (*recuadro de foco*) para que nunca te pierdas.
-   **Pensado para lectores de pantalla**: La aplicación está adaptada para que las personas con discapacidad visual que usan lectores de voz (como NVDA en el ordenador o TalkBack en el móvil) puedan escuchar sin problemas qué hace cada casilla o botón.

#### **2.1.4. Aplicación práctica en PayClear: Diseño visual y tarjetas de colores**

-   **Aspecto moderno y adaptado:** Es la plantilla gráfica que usa el programa para que los botones y tablas se vean modernos, se adapten al tamaño de cualquier pantalla y marquen de forma clara el cursor al navegar con el teclado.
-   **Tarjetas de saldo fáciles de entender (Apto para personas daltónicas):** Para saber si debes o te deben dinero, la aplicación no usa solo el color, sino que combina color de alto contraste + texto claro + icono visual:
-   -   **Verde (Te deben dinero):** Fondo verde oscuro con letra blanca + Texto *"Le deben X €"* + Icono de sumar (+).
    -   **Rojo (Debes dinero):** Fondo rojo oscuro con letra blanca + Texto *"Debe X €"* + Icono de restar (-).
    -   **Gris (Cuentas al día):** Fondo gris oscuro con letra blanca + Texto *"Saldado"* + Icono de visto (✓).  

#### Fuentes y referencias normativas

**Accesibilidad Universal:** https://www.fundacionmdp.org/que-es-la-accesibilidad-universal/?gad\_source=1&gad\_campaignid=11414872512&gbraid=0AAAAACKtZL7u0IrytwlBJBalbZp5YXCNX&gclid=CjwKCAjwuobXBhBXEiwAYUaIlRBEWFZehm1t-2s5gvVYqseyS2xpmmzDNO0d3bmfGk5MpjtORRqT7xoCob0QAvD\_BwE

**Usabilidad para el diseño de interfaces de usuario:** https://www.nngroup.com/articles/ten-usability-heuristics/

**Guía de contraste de colores:** https://webaim.org/articles/contrast/

## **2.2. Medidas de usabilidad y accesibilidad; herramientas de auditoría**

Aquí explicamos **cómo comprobamos que PayClear es fácil de usar y accesible**, qué números queremos conseguir, con qué herramientas lo medimos y **qué resultados hemos obtenido**.

### **2.2.1. Estándares que seguimos**

Usamos estándares para no decidir "a ojo" y poder justificar cada cambio de diseño.

| Estándar                             | Para qué lo usamos                                                                       |
| ------------------------------------ | ---------------------------------------------------------------------------------------- |
| ISO 9241-11                          | Define la usabilidad con tres ideas: efectividad, eficiencia y satisfacción.             |
| 10 heurísticas de Nielsen            | Lista de reglas para encontrar fallos de diseño.                                         |
| WCAG 2.1 nivel AA (y UNE-EN 301 549) | Reglas de accesibilidad: contraste, teclado, errores, nombres para lectores de pantalla. |

### **2.2.2. Medidas de usabilidad (indicadores clave)**

| Qué medimos                    | Atributo ISO 9241-11 | Cómo                                                                         | Objetivo                                                           |
| ------------------------------ | -------------------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Tiempo medio de crear un gasto | Eficiencia           | Segundos desde que se pulsa "Nuevo gasto" hasta que el gasto queda guardado  | < 15 s                                                             |
| Tasa de error en formularios   | Efectividad          | Errores por intento (dato rechazado, campo olvidado, Cancelar por confusión) | ≤ 0,5 por tarea                                                    |
| Tareas completadas             | Efectividad          | Tareas hechas sin ayuda ÷ tareas intentadas                                  | ≥ 90 %                                                             |
| Pasos y clics                  | Eficiencia           | Contar clics hasta completar la tarea                                        | ≤ 2 clics para llegar a la acción; 3 pasos para registrar un gasto |
| Puntuación SUS                 | Satisfacción         | Cuestionario de 10 preguntas (resultado de 0 a 100)                          | ≥ 80                                                               |
| Facilidad por tarea (SEQ)      | Satisfacción         | "¿Qué tan fácil fue?" de 1 a 7                                               | Media ≥ 5,5                                                        |
| Mensajes de la app             | Efectividad          | Cada mensaje dice qué pasó y cómo arreglarlo, en pocas palabras              | 100 % correctos                                                    |

### **2.2.3. Medidas de accesibilidad**

**Contraste (WCAG 1.4.3 y 1.4.11).** Texto normal: **≥ 4,5 : 1**. Componentes gráficos (bordes, iconos, botones): **≥ 3 : 1**. Hemos medido la paleta corporativa:

| Combinación           | Uso                               | Ratio aprox. | Umbral | Resultado |
| --------------------- | --------------------------------- | ------------ | ------ | --------- |
| #11734F sobre #EAF7F1 | Texto de saldo a favor            | 5,3 : 1      | 4,5    | ✔         |
| #B53C3C sobre #FFF0EE | Texto de saldo en contra          | 5,2 : 1      | 4,5    | ✔         |
| #59665E sobre #F3F6F4 | Saldo a cero y texto secundario   | 5,5 : 1      | 4,5    | ✔         |
| #18201D sobre #F3F6F4 | Texto principal                   | 15,3 : 1     | 4,5    | ✔         |
| #FFFFFF sobre #173E34 | Cabeceras y botones primarios     | 11,8 : 1     | 4,5    | ✔         |
| #11734F sobre #F3F6F4 | Iconos, bordes y botones en verde | 5,4 : 1      | 3      | ✔         |
| #B53C3C sobre #F3F6F4 | Iconos, bordes y avisos en rojo   | 5,3 : 1      | 3      | ✔         |
| #59665E sobre #F3F6F4 | Bordes de campos y separadores    | 5,5 : 1      | 3      | ✔         |

**Otras comprobaciones**

| Qué comprobamos            | Cómo                                       | Aprobado si...                                                                                                                 |
| -------------------------- | ------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| No depender solo del color | Escala de grises y simulador de daltonismo | Se entiende igual (hay signo +/−, texto e icono)                                                                               |
| Lector de pantalla         | NVDA con Java Access Bridge                | Cada control tiene nombre (AccessibleName), rol (AccessibleRole) y los iconos tienen texto alternativo (AccessibleDescription) |
| Solo teclado               | Recorrer toda la app sin ratón             | Todo se alcanza con Tab, se acciona con Enter o Espacio y se cancela con Esc; no hay "trampas"                                 |
| Foco visible               | Mirar el control seleccionado              | Siempre se ve dónde estamos                                                                                                    |
| Texto ampliado             | Subir el tamaño al 200 %                   | No se corta nada                                                                                                               |

### **2.2.4. Herramientas de auditoría**

| Herramienta                                        | Para qué                                                     |
| -------------------------------------------------- | ------------------------------------------------------------ |
| WebAIM Contrast Checker / Colour Contrast Analyser | Medir contraste (la segunda funciona en apps de escritorio). |
| Stark (Figma) y simulador de daltonismo            | Revisar contraste y colores en el prototipo.                 |
| NVDA + Java Access Bridge                          | Comprobar qué "lee" la app a una persona ciega.              |
| Navegación solo con teclado                        | Probar foco y orden de Tab.                                  |
| OBS y Google Forms                                 | Grabar las pruebas y pasar el SUS y el SEQ.                  |
| GitHub Issues                                      | Apuntar cada fallo con su gravedad y responsable.            |

> Las herramientas automáticas no detectan todo, así que la prueba manual con teclado y lector de pantalla es obligatoria.

### **2.2.5. Pruebas realizadas**

#### Participantes

| Participante | Perfil                                 | ¿Usa teclado a menudo?                  | Fecha |
| ------------ | -------------------------------------- | --------------------------------------- | ----- |
| P1           | Estudiante, uso habitual del móvil     | No (solo ratón)                         | …     |
| P2           | Gestor de piso, perfil técnico         | Sí (uso avanzado de atajos)             | …     |
| P3           | Usuario ocasional, perfil no técnico   | No (navegación lenta con ratón)         | …     |
| P4           | Perfil administrativo (contabilidad)   | Sí (habituada a tabular en formularios) | …     |
| P5           | Usuario habitual de lector de pantalla | Sí (solo teclado y NVDA)                | …     |

#### Tareas

| Tarea | Qué se le pide                                                              | Éxito si...                                                      |
| ----- | --------------------------------------------------------------------------- | ---------------------------------------------------------------- |
| T1    | "Has pagado 24,50 € de la compra. Regístralo y repártelo a partes iguales." | El gasto aparece en el historial y los saldos se actualizan      |
| T2    | "¿Cuánto le debe una persona a otra?"                                       | Lee la tarjeta de saldo correspondiente en la pantalla principal |
| T3    | "Obtén el plan de pagos para dejar las cuentas a cero."                     | Abre el plan de compensación (como máximo n − 1 pagos) y lo lee  |
| T4    | "Reparte un ticket de 60 € de forma desigual entre tres personas."          | Los importes suman exactamente el total                          |
| T5    | "Intenta guardar un gasto con letras en el importe y corrígelo."            | Ve que el botón queda bloqueado, entiende el motivo y lo corrige |
| T6    | "Registra un gasto solo con el teclado."                                    | Lo completa con Tab, Enter y Espacio, sin tocar el ratón         |

#### Hoja de registro del participante P1

| Tarea | ¿Éxito? | Tiempo (s) | Errores | Clics | SEQ (1-7) |
| ----- | ------- | ---------- | ------- | ----- | --------- |
| T1    | Sí      | 12,2       | 0       | 3     | 6         |
| T2    | Sí      | 4,1        | 0       | 1     | 7         |
| T3    | Sí      | 6,2        | 0       | 2     | 7         |
| T4    | Sí      | 14,5       | 1       | 5     | 5         |
| T5    | Sí      | 8,2        | 1       | 2     | 6         |
| T6    | Sí      | 18,2       | 1       | 0     | 5         |

#### Resultados por tarea (media de los 5 participantes)

| Tarea | Éxito          | Tiempo medio (s) | Errores por intento | Clics (media) | SEQ (media) |
| ----- | -------------- | ---------------- | ------------------- | ------------- | ----------- |
| T1    | 5 de 5 (100 %) | 12,8             | 0,20                | 3,2           | 6,6         |
| T2    | 5 de 5 (100 %) | 5,2              | 0,00                | 1,0           | 6,8         |
| T3    | 5 de 5 (100 %) | 7,2              | 0,00                | 1,8           | 6,6         |
| T4    | 4 de 5 (80 %)  | 16,1             | 0,80                | 5,4           | 5,2         |
| T5    | 5 de 5 (100 %) | 9,4              | 1,20                | 2,2           | 6,2         |
| T6    | 4 de 5 (80 %)  | 16,0             | 0,60                | 0,0           | 5,4         |

Cómo se calculan: **tasa de éxito** = tareas con éxito ÷ tareas intentadas × 100; **tiempo medio** = suma de tiempos ÷ 5; **errores por intento** = total de errores ÷ intentos.

**Desglose de tiempos clave**

-   **T1 con ratón:** P2 (técnico) tardó 8,4 s; P3 (no técnico), 14,8 s; P5 (con NVDA), 18,5 s, por el tiempo que tarda la voz en leer las etiquetas.
-   **T6 solo con teclado:** P2 tardó 9,5 s; P1 y P3, que no suelen usar el teclado, tardaron 18,2 s y 23,5 s por falta de costumbre al tabular.
-   **T4 (reparto desigual):** P3 no cuadró los céntimos a la primera y tuvo que repetirlo.

#### Cuestionario SUS

Cada pregunta se responde de 1 a 5. En las impares se resta 1 a la respuesta; en las pares se hace 5 menos la respuesta. Se suman las 10 cifras y se multiplica por 2,5 (resultado de 0 a 100).

| Participante | Q1 | Q2 | Q3 | Q4 | Q5 | Q6 | Q7 | Q8 | Q9 | Q10 | SUS (0-100) |
| ------------ | -- | -- | -- | -- | -- | -- | -- | -- | -- | --- | ----------- |
| P1           | 4  | 2  | 4  | 1  | 4  | 2  | 5  | 2  | 4  | 1   | 82,5        |
| P2           | 5  | 2  | 5  | 1  | 5  | 1  | 5  | 2  | 4  | 1   | 92,5        |
| P3           | 4  | 3  | 4  | 2  | 3  | 2  | 4  | 2  | 4  | 3   | 67,5        |
| P4           | 5  | 2  | 4  | 1  | 5  | 2  | 5  | 2  | 5  | 1   | 90,0        |
| P5           | 4  | 2  | 4  | 2  | 4  | 2  | 4  | 2  | 5  | 2   | 77,5        |
| Media        |    |    |    |    |    |    |    |    |    |     | 82,0        |

**Interpretación.** La media de 82,0 es una valoración buena. La satisfacción es más alta en el perfil técnico (92,5) y el administrativo (90,0) que en el perfil no técnico (67,5) y en el usuario de lector de pantalla (77,5), que encontraron más fricción al principio.

#### Prueba solo con teclado

La hizo el equipo, sin participantes (✔ cumple, ✘ no cumple).

| Elemento                                  | Se alcanza con Tab | Se acciona con Enter / Espacio | Se cancela con Esc | Foco visible |
| ----------------------------------------- | ------------------ | ------------------------------ | ------------------ | ------------ |
| Barra lateral (4 secciones)               | ✔                  | ✔                              | —                  | ✔            |
| Botón Nuevo gasto                         | ✔                  | ✔                              | —                  | ✔            |
| Campos del diálogo de gasto               | ✔                  | ✔                              | ✔                  | ✔            |
| Botones Guardar y Cancelar                | ✔                  | ✔                              | ✔                  | ✔            |
| Plan de compensación                      | ✔                  | ✔                              | ✔                  | ✔            |
| Diálogo de seguridad                      | ✔                  | ✔                              | ✔                  | ✔            |
| Historial y tarjetas de saldo             | ✔                  | ✔                              | —                  | ✔            |
| Bloqueo con Ctrl + L (pantalla de acceso) | ✔                  | ✔                              | —                  | ✔            |

#### Prueba con NVDA

La hizo el equipo, sin participantes.

| Elemento                                       | ¿Lee el nombre? | ¿Lee el rol? | ¿Iconos con texto alternativo? | Resultado |
| ---------------------------------------------- | --------------- | ------------ | ------------------------------ | --------- |
| Botones de la barra lateral                    | Sí              | Sí           | Sí                             | ✔         |
| Botón Nuevo gasto                              | Sí              | Sí           | Sí                             | ✔         |
| Campos del formulario (con su etiqueta)        | Sí              | Sí           | —                              | ✔         |
| Tarjetas de saldo ("Le deben X €", "Debe X €") | Sí              | Sí           | Sí                             | ✔         |
| Mensajes de error y avisos                     | Sí              | Sí           | —                              | ✔         |

### **2.2.6. Resultados y conclusión**

| Medida                         | Objetivo                                      | Resultado obtenido                                                                                        | ¿Cumple?                                |
| ------------------------------ | --------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------- |
| Contraste de la paleta         | ≥ 4,5 : 1 y ≥ 3 : 1                           | Todas las combinaciones superan 5,1 : 1                                                                   | Sí                                      |
| Tiempo medio de crear un gasto | < 15 s                                        | 12,8 s en T1 (de 8,4 s a 18,5 s según el perfil). En T4, con reparto manual, sube a 16,1 s                | Sí en el reparto igual; no en el manual |
| Tasa de error en formularios   | ≤ 0,5 por tarea                               | 0,47 en las seis tareas; 0,32 sin T5, que provoca el error a propósito                                    | Sí                                      |
| Tareas completadas             | ≥ 90 %                                        | 93,3 % (28 de 30)                                                                                         | Sí                                      |
| Pasos y clics                  | ≤ 2 clics para llegar; 3 pasos para registrar | Llegar a la acción: 1,0 clic (T2) y 1,8 clics (T3). Registrar un gasto (T1): 3 pasos y 3,2 clics de media | Sí                                      |
| SUS (media)                    | ≥ 80                                          | 82,0 sobre 100 (de 67,5 a 92,5)                                                                           | Sí                                      |
| Solo teclado                   | 100 %                                         | Todos los controles se pueden usar con teclado (tras corregir H-01)                                       | Sí                                      |
| NVDA                           | 100 %                                         | Todos los elementos se leen con nombre y rol (tras corregir H-02 y H-03)                                  | Sí                                      |

**Conclusión.** PayClear cumple los umbrales de usabilidad y los criterios de accesibilidad WCAG 2.1 AA que nos propusimos. Las pruebas también mostraron puntos a mejorar: el **reparto desigual (T4)** y el **uso solo con teclado (T6)** fueron las tareas con más errores y las únicas que no completó todo el mundo, sobre todo en personas que no suelen tabular. La puntuación SUS más baja (67,5) fue la del perfil no técnico. Los tres fallos encontrados se corrigieron antes de cerrar el Sprint 2.

#### Fallos encontrados y corregidos

| ID   | Fallo                                                                                                       | Gravedad (0-4) | Corrección                                                                                         | Estado    |
| ---- | ----------------------------------------------------------------------------------------------------------- | -------------- | -------------------------------------------------------------------------------------------------- | --------- |
| H-01 | Al pulsar Esc en el diálogo de reparto, el foco no volvía al botón desde el que se abrió.                   | 2              | Se programó una política de foco (FocusTraversalPolicy) para devolver el foco al botón de origen.  | Corregido |
| H-02 | NVDA anunciaba "Botón sin etiqueta" en el icono del desglose de saldos.                                     | 3              | Se definió AccessibleName = "Ver desglose de saldos del grupo" y un texto alternativo en el icono. | Corregido |
| H-03 | Al escribir letras en el importe, el botón Guardar se desactivaba sin avisar por voz a las personas ciegas. | 2              | Se programó un aviso accesible prioritario con rol ALERT para que NVDA lo lea.                     | Corregido |


---
## 2.3. Seguimiento, modificación y documentación de los esquemas (Wireframes) y maquetas (Mockups)

> Fuentes: material de clase de la Unidad 1.2 (usabilidad, HCI y decálogo de Nielsen) y presentación de Willman.

### 2.3.1 ¿Qué teníamos antes y qué tenemos ahora?
- **Antes (Sprint 1):** bocetos rápidos en Figma para colocar botones y títulos.

![VistaBloqueoFigma](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaBloqueoFigma.png)
![VistaGruposFigma](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaGruposFigma.png)
![VistaHistorialFigma](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaHistorialFigma.png)
![VistaParticipantesFigma](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaParticipantesFigma.png)
![VistaPrincipalFigma](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaPrincipalFigma.png)

- **Ahora (Sprint 2):** pantallas finales a color en Figma y su versión real en **Java Swing con FlatLaf**.

![VistaBloqueo](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaBloqueo.png)
![VistaGrupos](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaGrupos.png)
![VistaHistorial](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaHistorial.png)
![VistaParticipantes](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaParticipantes.png)
![VistaPrincipal](https://raw.githubusercontent.com/jesuscabeza25-lab/Desarrollo-de-Interfaz/main/img/VistaPrincipal.png)


### 2.3.2 Fallos detectados y cómo los arreglamos
| Pantalla | Fallo detectado | Principio aplicado | Solución en la versión nueva |
|---|---|---|---|
| Acceso | Parecía un login web (correo y cuenta) y la app no usa internet | Nielsen 2: hablar el idioma del usuario | "Bóveda local bloqueada", solo contraseña, ojo para verla y aviso de modo offline |
| Inicio | Números sueltos; había que calcular de cabeza | Nielsen 8: diseño minimalista · HCI: visibilidad | Tres tarjetas (Te deben / Debes / Saldo neto), últimas compras y calculadora en la misma pantalla, y botón "Registrar gasto" con atajo Ctrl+N |
| Participantes | Verde/rojo solo por color: problema con daltonismo | Accesibilidad · Nielsen 5: reconocer antes que recordar | Etiqueta "Acreedor"/"Deudor" más el signo + o − |
| Gastos | Lista liada: no se veía quién pagó a quién | Nielsen 3: control y libertad | Ventana emergente (Me debe / Le debo) que se cierra con Esc |
| Historial | Lista de texto y no se sabía si se había guardado | Nielsen 1: visibilidad del estado · HCI: retroalimentación | Tarjetas por movimiento con "Pendiente", barra inferior de estado y avisos |

**Figma frente a Swing (lo que cambió al maquetar):**
| Aspecto | Figma | Swing + FlatLaf |
|---|---|---|
| Sombras y esquinas | Sombras y esquinas redondeadas | Esquinas rectas y sin sombras |
| Calculadora | "Todos (3)" + "Dividir al instante" | Concepto, pagado por y casillas de "Dividir entre" |
| Menú lateral | Con "Calculadora" | Sin ella: está integrada en Inicio |
| Barra inferior | No existía | Estado de la bóveda y atajo de ayuda F1 |

### 2.3.3 ¿Qué es FlatLaf y por qué mejora el proyecto?
FlatLaf es una librería gratuita que da a Swing un aspecto moderno y plano, como las apps actuales (con modo claro y oscuro). No cambia lo que hace la app, solo cómo se ve. Con ella:
- Todas las pantallas se ven iguales (**consistencia**).
- Botones y campos reaccionan al pasar el ratón o al seleccionarlos (**retroalimentación**).
- El texto se ve nítido y con buen contraste (**accesibilidad**).
- El estilo se activa en un solo sitio, así que es fácil de mantener.

### 2.3.4 Herramientas usadas
Figma (wireframes y mockups) · NetBeans con su diseñador (maquetación) · Java Swing · FlatLaf y FlatLaf Extras 3.7.2 · JDK 26 · GitHub (issues y seguimiento).

### 2.3.5 Justificación basada en Usabilidad, Accesibilidad y HCI
* **Usabilidad:** La aplicación elimina la fricción cognitiva y permite al usuario alcanzar su objetivo rápidamente (registrar y saldar cuentas). Se han integrado atajos de teclado (como `Ctrl+N` para nuevos gastos) y una calculadora en la pantalla de Inicio para evitar la navegación innecesaria.
* **Accesibilidad:** La información crítica nunca recae únicamente en el color. Las deudas y créditos se diferencian mediante colores (verde/rojo), símbolos matemáticos explícitos (+ y -), y etiquetas de texto descriptivas ("Deudor" / "Acreedor").
* **HCI (Interacción Persona-Ordenador):**
  * *Visibilidad:* El estado del sistema es constante gracias a la barra de estado inferior que confirma que los datos están "sincronizados en local".
  * *Prevención de errores (Restricción):* El uso de menús desplegables para seleccionar "Pagado por" y *checkboxes* para elegir a los deudores evita que el usuario introduzca datos incorrectos manualmente.
---

## **2.4. Pautas de diseño estructural: menús, ventanas, cuadros de diálogo y atajos de teclado**

En este apartado contamos **cómo está organizada PayClear**: qué pantallas tiene, cómo se pasa de una a otra, cómo funcionan las ventanas emergentes y qué atajos de teclado hay. Con tres ideas en mente: que la persona **sepa siempre dónde está**, que **todo funcione igual en todas partes** y que se pueda usar **también con el teclado**.

### **2.4.1. Qué pantallas y ventanas tiene la aplicación**

Las ordenamos en tres niveles, de lo más general a lo más puntual.

| Nivel                           | Qué es                                  | Qué contiene                                                                                                                                       |
| ------------------------------- | --------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1. Pantallas principales        | Donde se entra y se trabaja             | La pantalla de acceso al grupo (con contraseña) y la pantalla principal, con las tarjetas de saldo, el historial de gastos y los botones de acción |
| 2. Secciones de trabajo         | Lo que se cambia desde la barra lateral | Inicio, Participantes, Calculadora e Historial                                                                                                     |
| 3. Ventanas emergentes y avisos | Lo que aparece encima de lo demás       | Registrar un gasto (DialogoGasto), plan de compensación (DialogoLiquidacion), ajustes y seguridad, y avisos de confirmación                        |

-   **Ventanas emergentes (diálogos):** hay que terminar lo que se está haciendo, o cerrarlas, para seguir. Se abren centradas sobre la ventana principal y así no se pierde el contexto.
-   **Avisos pequeños (*****toasts*****):** mensajes breves en la **esquina inferior**, como "Gasto guardado". No bloquean nada y desaparecen solos a los pocos segundos.

### **2.4.2. Cómo se navega y qué menús hay**

Usamos **tres tipos de menú**, cada uno para lo que mejor sirve:

-   **Barra lateral fija** (a la izquierda) para **cambiar de sección**: Inicio, Participantes, Calculadora e Historial, siempre en ese orden. Cada opción tiene **icono y texto**, así se reconoce sin tener que acordarse. La sección en la que estás aparece **resaltada**.
-   **Botones de acción siempre visibles**: **Nuevo gasto** y **Liquidar**, para lo que más se hace en la app.
-   **Menú contextual** (clic derecho) para hacer algo con un elemento concreto: sobre un gasto, eliminarlo; sobre una tarjeta de saldo, ver solo los gastos de esa persona.

Desde la pantalla principal se llega a cualquier acción en **máximo 2 clics**.

| Elemento                       | ¿Se ve siempre?       | Para qué sirve                     |
| ------------------------------ | --------------------- | ---------------------------------- |
| Barra lateral                  | Sí                    | Cambiar de sección sin perderse    |
| Sección resaltada              | Sí                    | Saber dónde estoy                  |
| Botones Nuevo gasto y Liquidar | Sí                    | Hacer lo más habitual              |
| Menú contextual                | Al hacer clic derecho | Acciones rápidas sobre un elemento |

### **2.4.3. Cómo funcionan las ventanas emergentes**

Todas siguen las mismas normas, para que la persona sepa qué esperar:

-   **El botón Guardar está apagado** hasta que los datos sean correctos (concepto escrito e importe en número). Así se evitan errores antes de que ocurran.
-   **Los mensajes son cortos y sin tecnicismos**: dicen qué ha pasado y cómo arreglarlo. Por ejemplo: "El importe debe ser un número, por ejemplo 12,50".
-   **Al eliminar un gasto se pide confirmación**, y el botón marcado por defecto es **Cancelar**, no Eliminar.
-   **Poca información en cada una**, y siempre con los mismos colores, letras y botones.

### **2.4.4. Atajos de teclado**

Pensados para quien usa la app a menudo y quiere hacerlo **todo sin tocar el ratón**. Son teclas que mucha gente ya conoce.

| Tecla             | Qué hace                                                  |
| ----------------- | --------------------------------------------------------- |
| Tab / Mayús + Tab | Pasar de un campo al siguiente, o volver al anterior      |
| Enter             | Confirmar el formulario o pulsar el botón seleccionado    |
| Esc               | Cerrar al momento cualquier ventana emergente sin guardar |
| Ctrl + N          | Abrir "Nuevo gasto" desde cualquier sección               |
| Ctrl + 1 a 4      | Ir a Inicio, Participantes, Calculadora o Historial       |
| F1                | Abrir una ayuda con la lista de atajos                    |
| Ctrl + L          | Bloquear la aplicación                                    |

Además:

-   El elemento seleccionado siempre se ve con un **recuadro de foco**.
-   Al cerrar una ventana emergente, el foco vuelve a donde estaba la persona.
  
### **Fuentes**

-   Acosta Lugo, W. (2026). *UD01.2. Usabilidad: Unidad 4. Diseño de interfaces atendiendo a criterios de usabilidad* \[Presentación\]. Desarrollo de Interfaces, Campus Cámara Comercio Sevilla.
-   Nielsen, J. (1994). *10 Usability Heuristics for User Interface Design*. [https://www.nngroup.com/articles/ten-usability-heuristics/](https://www.nngroup.com/articles/ten-usability-heuristics/)


# 2.5 Pautas de aspecto: colores, fuentes, iconos, distribución

### 2.5.1. Colores y Accesibilidad (WCAG 2.1)
La paleta aplica los principios de **contraste, consistencia y accesibilidad** bajo el nivel **AA de la norma WCAG 2.1**. Para usuarios con daltonismo, los estados financieros incluyen siempre signos (`+` / `−`) y etiquetas explícitas (`Te debe` / `Le debes`) además del color:

* **Marca y cabeceras (`#173E34`):** Verde oscuro que aporta estabilidad, confianza y autoridad en los bloques principales y botones primarios.
* **Acreedor / Éxito (`#11734F` sobre `#EAF7F1`):** El verde es el color que el ojo procesa mejor y se asocia al dinero y al éxito (VERDE = EXITO); indica saldos a favor y confirmaciones.
* **Deudor / Alerta (`#B53C3C` sobre `#FFF0EE`):** Rojo desaturado para captar la atención en deudas pendientes y avisos de error sin saturar la vista.
* **Fondos y Textos (`#F3F6F4`, `#FFFFFF` y `#18201D`):** Lienzos claros y texto oscuro que aseguran la máxima legibilidad y limpieza visual.

### 2.5.2. Fuentes y Tipografía

Utilizamos **dos fuentes Sans-serif** para facilitar la lectura en pantallas digitales y mantener la consistencia:

* **`Manrope` (Semibold / ExtraBold):** Aplicada en títulos (`h1` a `h3`), logotipo y cifras monetarias para resaltar los importes y marcar la jerarquía visual.

* **`DM Sans` (Regular / Bold):** Empleada en el cuerpo de texto, menús, botones, formularios e historial por su alta legibilidad en tamaños pequeños (`11px` - `14px`).

### 2.5.3  ¿Qué es un archivo SVG?
Una imagen **SVG o Grafico Vectorial Escalable**, es un formato de archivo  basado en un lenguaje XML. A diferencia de los formatos rasterizados tradicionales compuestos por píxeles (JPEG, PNG...), los archivos SVG crean las imágenes mediante fórmulas matemáticas que describen puntos, líneas, curvas y formas geométricas sobre una cuadrícula en 2D. 

Las ventajas del formato SVG es que no pierde resolución ni nitidez al ser ampliado o reducido, se adapta de forma nativa a cualquier densidad de pantalla. 

### ¿Porqué hemos usado para el logo e iconos, imagenes SVG?

* **Independencia absoluta de la resolución:** Porque deben visualizarse de claramente en cualquier dispositivo y nivel de zoom, evitando así el verse pixelado o borroso que tienen formatos como el PNG o JPEG.

* **Optimización del rendimiento y ligereza:** Los iconos vectoriales en SVG tienen un peso en bytes minúsculo en comparación con imágenes rasterizadas más complejas, lo que minimiza los tiempos de carga de la interfaz y optimiza los recursos del sistema.

* **Interactividad y dinamismo visual:** El formato SVG es compatible con CSS y JavaScript, lo que permite aplicar efectos de movimientos, transiciones suaves y estados interactivos (como cambios de color o animaciones de trazo).

| Logo estático SVG (3 KB) | Logo animado SVG (5 KB) |
| :---: | :---: |
| ![Logo Estático](img/logo-PayClear.svg) | ![Logo Animado](img/logoAnimado-PayClear.svg) |

### 2.5.4. Distribución de Elementos

La maquetación organiza el espacio para conseguir tener una navegación intuitiva y sin sobrecarga la interfaz:

* **Diseño en cuadrícula y alineación:** Menú lateral fijo (`244px`) y área principal en doble columna (`CSS Grid`), ubicando los saldos a la izquierda y la calculadora rápida a la derecha (`360px`).
* **Jerarquía visual:** Un único punto de impacto principal arriba (`balance-hero`) con el saldo total del grupo, seguido del desglose en tarjetas.
* **Espaciado y modales:** Uso de espacios en blanco (`padding` y `gap` amplios) para evitar la saturación, aislando las tareas secundarias (nuevo gasto, liquidación, ajustes) en cuadros de diálogo modales (`role="dialog"`).

---

### **Fuentes:**

* Calou, J. (s. f.). *Guía: Cómo Animar con SVG. Toptal. [https://www.toptal.com/developers/front-end/guia-como-animar-con-SVG](https://www.toptal.com/developers/front-end/guia-como-animar-con-svg)

 
* Jimdo. (2015, 10 de febrero). Cómo elegir los colores para tu página web. Jimdo Blog. https://www.jimdo.com/es/blog/colores-paginas-web/

* Torresburriel Estudio. (2022, 7 de febrero). WCAG 2.1: qué son y cómo respetarlas. Torresburriel Estudio Blog. https://torresburriel.com/weblog/wcag-2-1-que-son-y-como-respetarlas/


* Acosta Lugo, W. (2026). *UD01.2. Usabilidad: Unidad 4. Diseño de interfaces atendiendo a criterios de usabilidad* [Presentación]. Desarrollo de Interfaces, Campus Cámara Comercio Sevilla. [https://docs.google.com/presentation/d/1RENkac6LJWCK7VsLMN4KRsrvTlCqjNoHPTaZd8lSTQw/edit?usp=sharing](https://docs.google.com/presentation/d/1RENkac6LJWCK7VsLMN4KRsrvTlCqjNoHPTaZd8lSTQw/edit?usp=sharing)


* Alex, D. (2024, 10 de octubre). *Cómo elegir las fuentes para tu sitio web*. Squarespace Blog. [https://es.squarespace.com/blog/como-elegir-las-fuentes-de-un-sitio-web](https://es.squarespace.com/blog/como-elegir-las-fuentes-de-un-sitio-web)

---
## 2.6. Componentes reutilizables, controles de entrada, feedback y adaptabilidad

> Fuentes: material de clase de la Unidad 1.2 (usabilidad, HCI y decálogo de Nielsen) y presentación de Willman.

### 2.6.1. Componentes reutilizables
Repetimos los mismos bloques en toda la app para que el usuario los reconozca:
- **Tarjeta de saldo:** Aparecerá en verde te deben (acreedor) y en rojo si debes (deudor) y en gris si no hay deudas de ningún tipo.
- **Fila de lista:** tiene la misma estructura en grupos, participantes y movimientos.
- **Botones:** principal (verde oscuro, "Registrar gasto") y secundarios (con borde, "Saldar cuentas").
- **Etiquetas pequeñas:** "100% offline", "3 integrantes", "Acreedor/Deudor".
- **Medidas base:** márgenes internos iguales y bordes finos grises. En Figma las esquinas eran de 12–16 px, en Swing quedan rectas, algo que mejorar a futuro si lo vemos conveniente para la mejoría del aspecto de la aplicacion.

### 2.6.2. Consistencia en los controles de entrada
- Los importes llevan el símbolo **€** dentro del campo.
- Los campos tienen un texto de ayuda ("Mínimo 4 caracteres", "Ej. Cena, compra, taxi").
- La contraseña tiene un ojo para poder verla.
- "Pagado por" es un desplegable, y "Dividir entre" son casillas con estado claro: marcada con fondo verde.
- El foco y  el pasar el ratón por encima lo gestiona FlatLaf, igual en todos los controles de cada vista.

### 2.6.3. Retroalimentación visual
- Los botones y campos cambian al pasar el ratón o seleccionarlos.
- Los movimientos muestran su estado ("Pendiente") y la barra inferior informa del estado de la bóveda.
- Al ser una app **100% local no hay cargas**: la respuesta es inmediata. 

### 2.6.4. Adaptabilidad
- Todas las pantallas comparten estructura: menú lateral fijo y zona central que se ajusta al tamaño de la ventana.
- La app es de  escritorio,  la version para movil se realizara a futuro. (solo en Figma de momento).
---

## 2.7. Pautas de la secuencia de control de la aplicación


### 2.7.1. Modelo de flujo y navegación de pantallas

Para organizar cómo se mueve el usuario dentro de **PayClear**, planteamos un a de flujo donde cada recuadro corresponde a una pantalla del programa. Y para evitar repetir elementos comunes en la documentación, el **menú lateral fijo** se trata como un bloque independiente que se mantiene constante mientras cambia el contenido central.
#### 1. Secuencia lógica de uso y pantallas del sistema
* **`P1` - Pantalla de Desbloqueo de la Bóveda (`VistaBoveda`) [Condicional / Opcional]:** Esta pantalla solo aparecerá si el usuario ha pone una contraseña o cuando bloquea la sesión a propósito (desde P2 o P3). Si el grupo no tiene clave, la aplicación entra directamente a P2.
* **`P2` - Selección de Grupos (`VistaSeleccionGrupo`):** Es la vista donde se ven los archivos `.json` guardados en local (ej: *"Piso Nervión"* o *"Viaje Fin de Curso" ...*). Aquí se elige con qué grupo trabajar o si crear uno desde cero.
* **`P3` - Detalles y Balances (`VistaPrincipal`):** Es la pantalla principal donde se ve todo. A la izquierda agrupa el resumen superior (`balance-hero`), las tarjetas de saldo de cada amigo y el historialy los ajustes; a la derecha está fija la calculadora rápida para hacer las cuentas rapidamente sin cambiar de ventana.
* **`P3.1`, `P3.2` y `P3.3` - Ventanas Modales (`JDialog`):** Son pantallas emergentes para tareas concretas (meter un gasto nuevo, repartir un ticket detallado o ver el plan de liquidación). Tienen una relación bidireccional con `P3`: cuando se abren, bloquean el fondo para que el usuario no se distraiga y, al terminar o cancelar, siempre devuelven el control a la pantalla principal.
![Diagrama Vistas](img/DiagramaVistas_PayClear.png) 

### 2.7.2. Gestión visual de errores y condiciones límite

La interfaz controla las entradas de datos en dos fases para evitar errores que descuadren las cuentas del grupo. Primero bloquea fallos comunes desde los propios controles y, si aun así falta algo, avisa en el mismo formulario.

Los botones de confirmación (`btnGuardar` en los modales o `Crear` al añadir un grupo) están desactivados mientras queden campos obligatorios en blanco. Y tampoco se pueden meter letras o signos negativos en las casillas de dinero: en Swing filtramos el texto con `DocumentFilter` o `JFormattedTextField`, y en el prototipo limitamos el campo con `type="number"` y `min="0"`.

Si el usuario intenta guardar un importe de `0,00 €`, poner una contraseña 4 o menos caracteres o repite el nombre de un grupo que ya existe, el programa avisa en el propio campo sin sacar ventanas emergentes (`JOptionPane`) que corten el paso. El borde de la casilla cambia a rojo (`#B53C3C` usando la propiedad `JComponent.outline` de FlatLaf) y debajo sale un texto corto con la etiqueta accesible `role="alert"` explicando qué pasa.


| Incidencia del usuario | Respuesta en pantalla | Implementación (Swing / Prototipo) |
| :--- | :--- | :--- |
| Escribir letras en el importe | El campo ignora las teclas y deja solo números y coma decimal (`0,00`). | Filtro de entrada numérica (`DocumentFilter` / `inputMode="decimal"`). |
| Importe negativo o a cero (`<= 0`) | Borde rojo (`#B53C3C`) y mensaje: *"Introduce un importe mayor que 0"*. | Propiedad `JComponent.outline = "error"` en FlatLaf y aviso inferior. |
| Dejar el concepto o nombre vacío | Botón de guardar desactivado (opacidad al 45%-60%) y cursor en el campo vacío. | `setEnabled(false)` conectado al `DocumentListener` del formulario. |
| Fallar la contraseña en Bóveda (`P1`) | Recuadro de aviso con fondo rosa claro (`#FFF0EE`), borde `#F3BDB8` y letras rojas (`#B53C3C`). | Mensaje con `role="alert"` y foco devuelto al campo de contraseña. |

### 2.7.3. Secuencia de actualización reactiva de la interfaz

En PayClear no hace falta darle a ningún botón de refrescar para ver los saldos al día. Cuando se guarda un cambio en cualquiera de las ventanas modales (`P3.1`, `P3.2` o `P3.3`), la pantalla principal se actualiza sola en cuatro pasos:

1. El controlador recoge los datos del modal, añade el movimiento a la lista y guarda los cambios en el archivo `.json` con **Gson** (o en `localStorage` dentro del prototipo).
2. El programa recalcula en memoria lo que te deben (`toReceive`), lo que debes (`toPay`), el saldo neto del grupo y los pagos mínimos del algoritmo voraz.
3. Al cerrarse el modal con `dispose()`, la vista `P3` cambia al momento las cifras del bloque superior (`balance-hero`), las tarjetas de los participantes y la tabla de movimientos. En Java Swing hacemos esto llamando a `revalidate()` y `repaint()` dentro del hilo de eventos (**EDT**). Como Swing dibuja los cambios primero en memoria (*doble búfer*) antes de volcarlos a la pantalla, la ventana no parpadea ni hace recargas raras.
4. Abajo a la derecha sale un aviso flotante durante 4 segundos (`role="status"`, con textos como *"Gasto añadido a pagos pendientes"* o *"Calculadora reiniciada"*) para confirmar que todo se ha guardado sin tapar la tabla.

### 2.7.4. Secuencia de salida y bloqueo seguro

Como la aplicación puede usarse en ordenadores compartidos de un piso de estudiantes, el botón **"Bloquear bóveda"** (o el atajo `Ctrl + L`) cierra la sesión al instante para que nadie cotillee las cuentas:

1. Si hay algúna ventana abierta, el programa lo cierra y destruye la ventana activa (`P2` o `P3`) con `dispose()`.
2. Se borra la marca de sesión activa (`sessionStorage` o la referencia del grupo cargado en la memoria RAM) y se limpian las variables temporales de los formularios.
3. La aplicación vuelve a la pantalla de bloqueo (`P1`) y coloca el cursor (`autoFocus`) directamente en la casilla de la contraseña.

### Fuentes utilizadas

* **Universitat Oberta de Catalunya (UOC).** *El diseño de la interacción: Los documentos a entregar (a de navegación y guión técnico)*. Materiales docentes multimedia en español: https://cv.uoc.edu/UOC/a/moduls/90/90_574b/web/main/m5/c4/3.html
* **Uifrommars** *Heurísticas de Nielsen: las 10 heuristicas de Nielsen:* https://uifrommars.com/10-reglas-heuristicas-como-aplicarlas/
* **Acosta Lugo, W. (2026), Desarrollo de Interfaces, Campus Cámara FP (EUSA) Sevilla.**  https://docs.google.com/presentation/d/1RENkac6LJWCK7VsLMN4KRsrvTlCqjNoHPTaZd8lSTQw/edit?usp=sharing.

# 2.8. Cronograma de ejecución

Para organizar el trabajo del **Sprint 02** (del 15 al 30 de octubre de 2026) nos hemos dividido las tareas entre los tres. Planificamos el esfuerzo en **horas reales de dedicación** y mantenemos una correspondencia exacta con las tarjetas abiertas en nuestro tablero Kanban de GitHub Projects.

## 2.8.1. Desglose real de trabajo por sesiones

1. **Fase 1 - Clases teóricas, reparto y arranque (15 oct - 21 oct):** Se repartieron las tarjetas en GitHub Projects. A partir del día 19, Jesús empezó con usabilidad y accesibilidad (`[2.1]`) y con el diseño estructural de menús, ventanas y atajos (`[2.4]`); Guillermo comenzó las pautas de aspecto (`[2.5]`); y José Luis empezo con los wireframes y mockups (`[2.3]`).
2. **Fase 2 - Aspecto visual y arranque de auditoría y secuencia (22 oct - 27 oct):** Guillermo cerró las pautas de aspecto el día 26, con la paleta accesible WCAG 2.1, las tipografías y los logos en SVG (`[2.5]`). Ese mismo día empezó la secuencia de control (`[2.7]`) y Jesús arrancó las métricas y herramientas de auditoría (`[2.2]`). Mientras tanto, Jesús y José Luis siguieron avanzando con `[2.1]`, `[2.4]` y `[2.3]`.
3. **Fase 3 - Cierre de secuencia y usabilidad (28 oct):** Guillermo terminó el diagrama de flujo de vistas (de `P1` a `P3.x`) y la documentación del punto `[2.7]`. Jesús dejó cerrado el `[2.1]`.
4. **Fase 4 - Revisión cruzada, componentes y cierre del sprint (29 oct - 30 oct):** Revisión en grupo de lo redactado. Jesús aplicó las correcciones acordadas y cerró `[2.2]` y `[2.4]`; José Luis terminó de documentar los mockups (`[2.3]`) y completó las pautas de componentes visuales (`[2.6]`); y Guillermo cerró este cronograma (`[2.8]`). Entre el 29 y el 30 dejamos lista la presentación para la *Sprint Review*.

---

## 2.8.2. Asignación de recursos, tarjetas (GitHub Issues) y horas dedicadas

| Tarjeta / Entregable en GitHub Projects | Responsable | Inicio - Fin real | Horas |
| :--- | :--- | :---: | :---: |
| **`[2.1]`** Usabilidad y accesibilidad: características, pautas y estándares | **Jesús** | 19/10 - 28/10 | 4 h |
| **`[2.5]`** Pautas de aspecto: colores, fuentes, iconos, distribución | **Guillermo** | 19/10 - 26/10 | 5 h |
| **`[2.3]`** Seguimiento, modificación y documentación de wireframes y mockups | **José Luis** | 19/10 - 29/10 | 6 h |
| **`[2.4]`** Pautas de diseño estructural: menús, ventanas, diálogos, atajos | **Jesús** | 19/10 - 29/10 | 3 h |
| **`[2.7]`** Pautas de la secuencia de control de la aplicación | **Guillermo** | 26/10 - 28/10 | 3 h |
| **`[2.2]`** Medidas de usabilidad y accesibilidad; herramientas de auditoría | **Jesús** | 26/10 - 29/10 | 3 h |
| **`[2.6]`** Pautas para el desarrollo de componentes visuales | **José Luis** | 29/10 - 29/10 | 2 h |
| **`[2.8]`** Cronograma de ejecución | **Guillermo** | 29/10 - 29/10 | 2 h |
| **`[Sprint Review]`** Presentación y defensa del Sprint 02 | **Todo el grupo** | 29/10 - 30/10 | 40 min (x3) |

**Total por persona:** Jesús: 10 h · Guillermo: 10 h · José Luis: 8 h (más la preparación de la *Sprint Review*).

---

## 2.8.3. Diagrama de Gantt y sincronización con Kanban

* **Dependencias y revisión en equipo:** El trabajo se organizó con tareas en paralelo desde el 19 de octubre (`[2.1]`, `[2.3]`, `[2.4]` y `[2.5]`). Las dependencias directas son dos: las pautas de componentes visuales (`[2.6]`) necesitan tener definido el aspecto visual (`[2.5]`) y los mockups (`[2.3]`), y la *Sprint Review* depende de que todas las tarjetas anteriores estén cerradas. Antes de mover las tareas a *Terminado*, hicimos una revisión grupal que sirvió para pulir el punto `[2.4]` y alinear los textos con el prototipo final.
* **Estado del tablero Kanban (GitHub Projects):** Hoy jueves 29 de octubre, las tarjetas `[2.1]` a `[2.8]` están ya en la columna *Terminado*. Solo sigue en curso la tarjeta conjunta `[Sprint Review] Presentación` para la defensa de mañana viernes 30 de octubre.

![Diagrama Vistas](img/Gantt_Sprint2_PayClear.png) 

---

# Fuentes utilizadas

* **Martins, J. (2026, 14 de agosto).** *Diagrama de Gantt: guía paso a paso, ejemplos y Excel*. Asana. https://asana.com/es/resources/gantt-chart-basics
