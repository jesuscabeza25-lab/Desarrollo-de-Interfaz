
## 2.1. Usabilidad y accesibilidad: características, pautas y estándares

#### 2.1.1. Atributos de usabilidad y métricas de evaluación (ISO/IEC 25010)
* **Efectividad:** Tasa de éxito del 100% al registrar gastos y calcular saldos locales en JSON. Garantiza que el algoritmo voraz ($N-1$) reduzca las deudas al mínimo de transferencias sin errores contables.
* **Eficiencia:** Registro de un gasto en menos de 10 segundos y en un máximo de 3 pasos, aprovechando la interfaz de ventana única en Java Swing y la modal de reparto rápido.
* **Satisfacción del usuario:** Meta de puntuación > 80/100 en la escala SUS (System Usability Scale), lograda al eliminar formularios de registro, anuncios y muros de pago (paywalls).

---

#### 2.1.2. Principios heurísticos de Nielsen aplicados
1. **Visibilidad del estado del sistema:** El componente TarjetaSaldoParticipante refresca los saldos en tiempo real tras cada operación sin recargas manuales.
2. **Consistencia y estándares:** Uso de patrones de diseño reconocidos y la librería FlatLaf en Java Swing para asegurar una estética uniforme en Windows, Linux y macOS.
3. **Prevención de errores:** Validación en tiempo real; los botones de guardado permanecen deshabilitados si el importe es nulo, no numérico o si el reparto de tickets no coincide con el total.
4. **Flexibilidad de uso:** Flujo por teclado mediante tabulación para el perfil gestor y modales táctiles simples para el usuario ocasional.

---

#### 2.1.3. Marco normativo de accesibilidad universal
El diseño cumple con los requisitos legales de la Norma UNE-EN 301 549:2022 y las WCAG 2.1 (Nivel AA) del W3C:
* **Ratio de contraste de color (WCAG 1.4.3):** Mínimo de 4.5:1 en texto estándar y 3:1 en componentes e iconos esenciales.
* **Navegabilidad por teclado (WCAG 2.1.1 e indicador 2.4.7):** Operatividad 100% sin ratón (Tab / Enter) con indicador visual de foco (*focus ring*) siempre activo.
* **Compatibilidad con tecnologías de apoyo (WCAG 4.1.2):** Mapeo de componentes mediante AccessibleContext en Java Swing y Semantics en Flutter para lectores de pantalla (NVDA, TalkBack).

---

#### 2.1.4. Aplicación práctica: Librería FlatLaf y paleta de colores
* **Librería FlatLaf (Java Swing):** Aporta de forma nativa el *Focus Ring* de alto contraste durante la tabulación por teclado, soporte para reescalado HiDPI y navegación completa sin ratón.
* **Paleta corporativa y doble codificación (WCAG 1.4.1):** Las tarjetas de saldo combinan color, texto explícito e iconografía para no depender exclusivamente de la percepción cromática (apto para personas con daltonismo):
  * **Acreedor (Verde #1B5E20):** Ratio 9.2:1 + Texto *"Le deben X €"* + Icono (+).
  * **Deudor (Rojo #B71C1C):** Ratio 8.5:1 + Texto *"Debe X €"* + Icono (-).
  * **Saldado (Gris #424242):** Ratio 10.1:1 + Texto *"Saldado"* + Icono (✓).   

#### Fuentes y referencias normativas
Norma UNE-EN 301 549:2022 (AENOR): [Requisitos de accesibilidad para productos y servicios TIC](https://www.google.com/search?q=https://www.en-301-549.info/)

BOE (Boletín Oficial del Estado): [Real Decreto 405/2023 (Actualización títulos FP - Resultado de Aprendizaje 2)](https://www.boe.es/eli/es/rd/2023/05/29/405)

Agencia Española de Protección de Datos (AEPD): [Guía de Privacidad desde el Diseño][(https://www.google.com/search?q=https://www.aepd.es/guias/guia-privacidad-desde-el-diseno.pdf)](https://www.aepd.es/guias/guia-privacidad-desde-diseno.pdf)
