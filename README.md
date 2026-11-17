# Práctica de Java — fundamentos y POO

46 proyectos cortos en Java (NetBeans) que fui resolviendo para practicar desde lo básico hasta programación orientada a objetos, colecciones, genéricos, hilos e interfaces gráficas con Swing.

## Qué hay adentro

| Tema | Proyectos |
| --- | --- |
| Fundamentos | `EjercicioIf`, `Ejercicio Switch`, `OperadorTernario`, `EjercicioFor`, `EjercicioWhile`, `EjercicioDoWhile`, `ErrorDesbordamiento`, `Conversiones`, `Ejercicio1` a `Ejercicio5` |
| Vectores y matrices | `EjercicioVectores`, `Ejercicio1Vector` a `Ejercicio5Vector`, `EjercicioMatrices` |
| Programación orientada a objetos | `POO`, `Encapsulamiento`, `Herencia`, `ClasesAbstractas`, `Interfaces`, `Sobreescritura`, `SobreescrituraYSobrecarga`, `Relaciones`, `Enums` |
| Colecciones | `ArrayLists`, `LinkedLists`, `ArrayList_vs_LinkedList`, `HashMap`, `Pilas` |
| Temas avanzados | `Genericos`, `Excepciones`, `HilosYConcurrencia` |
| Integradores | `EjercicioIntegradorBasico`, `EjercicioIntegradorPOO`, `EjercicioIntegradorPOO_VideoJuegos`, `EjercicioIntegradorPOO_Vivero`, `EjercicioMerceria`, `EjercicioEnglishSchool` |
| Interfaces gráficas (Swing) | `EjercicioIGU`, `TPIntegradorFinal` |
| Herramientas | `PruebaMaven` (primer proyecto con Maven) |

Algunos para mirar primero:

- **`EjercicioIntegradorPOO`**: jerarquía de clases con una clase abstracta `Pokemon`, subclases y una interfaz por tipo (`IAgua`, `IFuego`, `IPlanta`, `IElectrico`). Herencia, interfaces y polimorfismo en un mismo ejercicio.
- **`TPIntegradorFinal`**: app de escritorio en Swing para hacer sorteos por mes, con formulario, validación de datos y tabla de ganadores (`JTable`). Separa la interfaz (`igu`) de la lógica (`logica`).
- **`EjercicioIntegradorPOO_Vivero`**: clase abstracta `Planta` con `Arbol`, `Flor` y `Arbusto`, cada una con su propia implementación de un método abstracto.
- **`Relaciones`**: relación uno a muchos entre `Auto` y `Propietario` usando una lista.
- **`Genericos`** e **`HilosYConcurrencia`**: una clase genérica `Caja<T>`, y hilos creados de las dos formas (`extends Thread` e `implements Runnable`).

## Tecnologías

Java · Swing · NetBeans (Ant) · Maven

## Cómo correrlos

Cada carpeta es un proyecto de NetBeans independiente: abrirlo con **File → Open Project** y ejecutarlo con **Run**. `PruebaMaven` también se puede abrir desde cualquier IDE que lea el `pom.xml`.

---

Hecho por **Santiago Elian Vazquez**, estudiante de la Tecnicatura Superior en Desarrollo de Software (ISFT 225).
[Portfolio](https://santiago-vazquez-portfolio.vercel.app) · [LinkedIn](https://www.linkedin.com/in/santiagoelianvazquez/)
