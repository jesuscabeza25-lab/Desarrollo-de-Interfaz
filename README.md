# PayClear - Desarrollo de Interfaces (DI)

Prototipo interactivo y especificacion tecnica del gestor de gastos compartidos y liquidacion multilateral en local (Local-First), desarrollado para el modulo de Desarrollo de Interfaces (2º DAM).

---

## 1. Descripcion General

PayClear es una solucion orientada a simplificar la division de gastos grupales y la optimizacion de balances en comunidades cerradas (pisos compartidos, viajes y colectivos). Funciona de forma 100% local, sin muros de pago, sin publicidad y sin requerir registro de cuentas.

---

## 2. Entregables del Sprint 1

* **Prototipo Interactivo en Figma:** [Acceso al prototipo navegable](https://www.figma.com/)
* **Gestion del Proyecto:** [Tablero en GitHub Projects]([https://github.com/](https://github.com/users/jesuscabeza25-lab/projects/2))
* **Memoria Tecnica Detallada:** Consultar [SPRINT-1.md](Sprint 1.md) para la evaluacion formal de los criterios RA1 (arquitectura MVC, comparativa de librerias graficas, componente reutilizable y caso de prueba del algoritmo).

---

## 3. Alcance del Sprint 1

* Prototipado interactivo de alta fidelidad en Figma de la ventana principal y de la calculadora modal de tickets.
* Sistema de componentes reutilizables con variantes de estado para representar los saldos individuales (acreedor, deudor y neutral).
* Simulacion funcional de eventos y transiciones entre pantallas.
* Definicion formal de la arquitectura Modelo-Vista-Controlador (MVC) y el catalogo de clases para su implementacion en Java Swing durante el Sprint 2.

---

## 4. Estructura Proyectada de Paquetes (MVC)

```text
src/main/java/com/payclear/
|-- AplicacionPayClear.java
|-- componente/
|   `-- TarjetaSaldoParticipante.java
|-- controlador/
|   `-- ControladorPrincipal.java
|-- modelo/
|   |-- Gasto.java
|   `-- Participante.java
`-- vista/
    |-- DialogoDivisionRapida.form
    |-- DialogoDivisionRapida.java
    |-- VistaPrincipal.form
    `-- VistaPrincipal.java
```

---

## 5. Equipo de Desarrollo

* Guillermo Eugui Sanchez
* Jesus Cabeza
* Jose Luis Fernandez
