
### **2.1. Usabilidad y accesibilidad: características, pautas y estándares**

#### **2.1.1. Atributos de usabilidad y formas de medirlo**

-   **Efectividad:** El programa garantiza que los gastos se guarden correctamente y que las cuentas cuadren al 100%. Además, la forma en que calcula las deudas asegura que los compañeros se hagan el menor número posible de pagos entre sí, evitando errores de cálculo.
-   **Eficiencia:** Cualquier usuario puede registrar un gasto en menos de 10 segundos y en solo 3 pasos. Esto se consigue porque toda la aplicación está en una sola pantalla principal y las pantallas emergentes para repartir tickets son muy sencillas.
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
Norma UNE-EN 301 549:2022 (AENOR): [Requisitos de accesibilidad para productos y servicios TIC](https://www.google.com/search?q=https://www.en-301-549.info/)

BOE (Boletín Oficial del Estado): [Real Decreto 405/2023 (Actualización títulos FP - Resultado de Aprendizaje 2)](https://www.boe.es/eli/es/rd/2023/05/29/405)

Agencia Española de Protección de Datos (AEPD): [Guía de Privacidad desde el Diseño][(https://www.google.com/search?q=https://www.aepd.es/guias/guia-privacidad-desde-el-diseno.pdf)](https://www.aepd.es/guias/guia-privacidad-desde-diseno.pdf)

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

### 2.5.4. Distribución de Elementos

La maquetación organiza el espacio para conseguir tener una navegación intuitiva y sin sobrecarga la interfaz:

* **Diseño en cuadrícula y alineación:** Menú lateral fijo (`244px`) y área principal en doble columna (`CSS Grid`), ubicando los saldos a la izquierda y la calculadora rápida a la derecha (`360px`).
* **Jerarquía visual:** Un único punto de impacto principal arriba (`balance-hero`) con el saldo total del grupo, seguido del desglose en tarjetas.
* **Espaciado y modales:** Uso de espacios en blanco (`padding` y `gap` amplios) para evitar la saturación, aislando las tareas secundarias (nuevo gasto, liquidación, ajustes) en cuadros de diálogo modales (`role="dialog"`).

---

### **Fuentes:**

* Adobe. (s. f.). *Archivo SVG: Qué es un archivo SVG*. Adobe Creative Cloud. [https://www.adobe.com/es/creativecloud/file-types/image/vector/svg-file.html](https://www.adobe.com/es/creativecloud/file-types/image/vector/svg-file.html)


* Calou, J. (s. f.). *Guía: Cómo Animar con SVG*. Toptal. [https://www.toptal.com/developers/front-end/guia-como-animar-con-svg](https://www.toptal.com/developers/front-end/guia-como-animar-con-svg)

 
* Jimdo. (2015, 10 de febrero). Cómo elegir los colores para tu página web. Jimdo Blog. https://www.jimdo.com/es/blog/colores-paginas-web/

* Torresburriel Estudio. (2022, 7 de febrero). WCAG 2.1: qué son y cómo respetarlas. Torresburriel Estudio Blog. https://torresburriel.com/weblog/wcag-2-1-que-son-y-como-respetarlas/


* Acosta Lugo, W. (2026). *UD01.2. Usabilidad: Unidad 4. Diseño de interfaces atendiendo a criterios de usabilidad* [Presentación]. Desarrollo de Interfaces, Campus Cámara Comercio Sevilla. [https://docs.google.com/presentation/d/1RENkac6LJWCK7VsLMN4KRsrvTlCqjNoHPTaZd8lSTQw/edit?usp=sharing](https://docs.google.com/presentation/d/1RENkac6LJWCK7VsLMN4KRsrvTlCqjNoHPTaZd8lSTQw/edit?usp=sharing)


* Alex, D. (2024, 10 de octubre). *Cómo elegir las fuentes para tu sitio web*. Squarespace Blog. [https://es.squarespace.com/blog/como-elegir-las-fuentes-de-un-sitio-web](https://es.squarespace.com/blog/como-elegir-las-fuentes-de-un-sitio-web)
