<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">BACK</a>
</p>

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

### Escenarios

**Escenario 1: Fecha de partida en el pasado**  
Dado que el usuario abre el buscador de vuelos  
Cuando selecciona una fecha de partida anterior a la fecha actual  
Entonces el sistema debe mostrar un mensaje de error indicando que la fecha no es válida

**Escenario 2: Fecha de llegada en el pasado**  
Dado que el usuario abre el buscador de vuelos  
Cuando selecciona una fecha de llegada anterior a la fecha actual  
Entonces el sistema debe mostrar un mensaje de error indicando que la fecha no es válida

**Escenario 3: Fechas válidas pero sin vuelos**  
Dado que el usuario ingresa una fecha de partida y llegada válidas  
Y no hay vuelos disponibles para ese destino  
Entonces el sistema debe informar que no hay vuelos disponibles

**Escenario 4: Fechas válidas y vuelos disponibles**  
Dado que el usuario selecciona fechas válidas  
Y hay vuelos disponibles para ese destino  
Entonces el sistema debe mostrar el listado de vuelos disponibles

---

### Casos de Prueba

| Caso | Fecha de partida | Fecha de llegada | Estado actual | Vuelos disponibles | Resultado esperado                                     |
|------|------------------|------------------|----------------|--------------------|--------------------------------------------------------|
| 1    | 01/01/2023       | 10/01/2023       | 15/01/2023     | No                 | ❌ Error: fecha de partida en el pasado                |
| 2    | 20/01/2023       | 10/01/2023       | 15/01/2023     | No                 | ❌ Error: fecha de llegada en el pasado                |
| 3    | 16/01/2023       | 18/01/2023       | 15/01/2023     | No                 | ⚠️ No hay vuelos disponibles                           |
| 4    | 16/01/2023       | 18/01/2023       | 15/01/2023     | Sí                 | ✅ Se muestra listado de vuelos disponibles            |


<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">BACK</a>
</p>