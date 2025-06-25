# Ejercicio 1: Empresa de préstamos

1- Definir los casos de pruebas del ejercicio de la empresa de prestamos.

2- Escribir los casos de pruebas de: “La cuenta puede tener a lo sumo dos titulares”.

### 1. Casos de prueba para la edad

| Caso | Edad ingresada | Categoría de equivalencia       | Resultado esperado |
| ---- | -------------- | ------------------------------- | ------------------ |
| 1    | 17             | Valor inferior al límite mínimo | ❌ Rechazo          |
| 2    | 18             | Límite inferior válido          | ✅ Aceptado         |
| 3    | 45             | Valor dentro del rango          | ✅ Aceptado         |
| 4    | 65             | Límite superior válido          | ✅ Aceptado         |
| 5    | 66             | Valor superior al límite        | ❌ Rechazo          |

### 2. Casos de prueba para cantidad de titulares

| Caso | Número de titulares | Categoría de equivalencia  | Resultado esperado |
| ---- | ------------------- | -------------------------- | ------------------ |
| 1    | 0                   | Valor válido (caso mínimo) | ✅ Aceptado         |
| 2    | 1                   | Valor válido               | ✅ Aceptado         |
| 3    | 2                   | Límite superior permitido  | ✅ Aceptado         |
| 4    | 3                   | Valor fuera de límite      | ❌ Rechazo          |

---

# Ejercicio 2: Control de velocidad

Un sistema de control e informacion de velocidad tiene las siguientes caracteristicas:
-Si usted conduce a 50km/h o menos, no ocurrirá nada.
-Si usted conduce a mas de 50 km/h, pero a 55 km/h o menos, sera advertido.
-Si usted conduce a una velocidad superior a 55/km/h pero no superior a 60 Km/h, se le impondrá una multa.
-Si udsted conduce a mas de 60 Km/h, su licencia de conducri será suspendida.

La velocidad en Km/H, esta disponible para el sistema como un valor entero.

¿Cuál sería el conjunto de valores (Km/h) más probable identificado mediante la aplicación del análisis de frontera, en el que solo son relevantes los valores de fronteras de las clases de equivalencia?

- A)0, 49, 50, 54, 59, 60.
- B)50, 55, 60.
- C)49, 50, 54, 55, 60, 62.
- D)50, 51, 55, 56, 60, 61.

### Análisis de valores frontera:

Rangos definidos:

* ≤ 50 km/h: nada
* 51–55 km/h: advertencia
* 56–60 km/h: multa
* mayor que 60 km/h: suspensión

Fronteras: 50, 51, 55, 56, 60, 61

### Respuesta

**D) 50, 51, 55, 56, 60, 61**

---

# Ejercicio 3: Retroalimentación por temperatura

Una aplicación inteligente para el hogar mide la temperatura promedio en la casa durante la semana anterior y proporciona información a los ocupantes sobre su compatibilidad con respecto del medio ambiente basada en esa temperatura.
 
La retroalimentación para los diferentes rangos de temperatura promedio (hasta el °C mas cercano) debe ser:

* Hasta 10°C - ¡Frío glacial!
* 11°C a 15°C - ¡Frio!
* 16°C a 19°C - ¡Fresco!
* 20°C a 22°C - ¡Muy cálido!
*Por encima de los 22°C - ¡Calor excesivo!
Utilizando la técnica de análisis de Valores Frontera en su variante de dos puntos, ¿cuál de los siguientes conjuntos de
entradas de pruebas proporciona el nivel ás alto de cobertura de frontera?
- A) (0°C,  11°C,  20°C,  22°C,  23°C)
- B) (9°C,  15°C,  19°C,  23°C,  100°C)
- C) (10°C,  16°C,  19°C,  22°C, 23°C)
- D) (14°C,  15°C,  18°C,  19°C,  21°C,  22°C)


### Rango de temperaturas y retroalimentación:

* ≤10°C: ¡Frío glacial!
* 11°C–15°C: ¡Frío!
* 16°C–19°C: ¡Fresco!
* 20°C–22°C: ¡Muy cálido!
* mayor que 22°C: ¡Calor excesivo!

### Variante de dos puntos (valor mínimo y máximo de cada rango):

Fronteras:

* 10/11
* 15/16
* 19/20
* 22/23

### Respuesta

**C) (10°C, 16°C, 19°C, 22°C, 23°C)**
