# Proceso de desarrollo de testing (IEEE 829)
## Actividad – Diseño de un Caso de Prueba

**Actividad:** Diseñar los casos de pruebas de las siguientes historias de usuario

---

## US1: Buscar vuelos

**Como** usuario  
**Quiero** cargar fechas  
**Para** buscar vuelos disponibles

---

### Criterios de Aceptación

- Cuando se seleccione una fecha menor a la actual de **partida**, el sistema debe mostrar un **mensaje de error**.
- Cuando se seleccione una fecha menor a la actual de **llegada**, el sistema debe mostrar un **mensaje de error**.
- Cuando se seleccione una fecha **válida**, con vuelos disponibles para el destino, se debe visualizar el **listado de vuelos disponibles**.

---

### Casos de Prueba

| Caso | Fecha de partida | Fecha de llegada | Estado actual | Vuelos disponibles | Resultado esperado                              |
|------|------------------|------------------|---------------|--------------------|--------------------------------------------------|
| 1    | 01/01/2023       | 10/01/2023       | 15/01/2023    | No                 | ❌ Error: fecha de partida en el pasado       	|
| 2    | 20/01/2023       | 10/01/2023       | 15/01/2023    | No                 | ❌ Error: fecha de llegada en el pasado       	|
| 3    | 16/01/2023       | 18/01/2023       | 15/01/2023    | No                 | ⚠️ No hay vuelos disponibles                  	|
| 4    | 16/01/2023       | 18/01/2023       | 15/01/2023    | Sí                 | ✅ Se muestra listado de vuelos disponibles   	|

> **Nota:** Se recomienda parametrizar el valor de la “fecha actual” (estado del sistema) para mantener los casos reproducibles.
