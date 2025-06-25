<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">BACK</a>
</p>

# Proceso de desarrollo de testing (IEEE 829)
## Actividad – Diseño de un Caso de Prueba

**Actividad:** Diseñar los casos de pruebas encontrados en el requerimiento “Solicitud de préstamo bancario” (tabla de decisión)

---

## Requerimiento: Solicitud de préstamo bancario

Proceso bancario que se encarga de la aprobación de préstamos.

---

### Reglas del negocio

1. Si la persona que solicita el préstamo es un **Estudiante**, el préstamo **no se aprueba**, aunque no tenga deudas.
2. Si la persona que solicita el préstamo es un **Empleado/Trabajador**, el préstamo **se aprueba**, incluso si tiene deudas.
3. Si la persona que solicita el préstamo es un **Retirado**, el préstamo **se aprueba solo si no tiene deudas**.

---

### Escenarios

**Escenario 1: Estudiante con deudas**  
Dado que el solicitante es un estudiante  
Y tiene deudas activas  
Entonces el préstamo debe ser rechazado

**Escenario 2: Estudiante sin deudas**  
Dado que el solicitante es un estudiante  
Y no tiene deudas  
Entonces el préstamo debe ser rechazado

**Escenario 3: Empleado con deudas**  
Dado que el solicitante es un empleado  
Y tiene deudas  
Entonces el préstamo debe ser aprobado

**Escenario 4: Empleado sin deudas**  
Dado que el solicitante es un empleado  
Y no tiene deudas  
Entonces el préstamo debe ser aprobado

**Escenario 5: Retirado con deudas**  
Dado que el solicitante es un retirado  
Y tiene deudas  
Entonces el préstamo debe ser rechazado

**Escenario 6: Retirado sin deudas**  
Dado que el solicitante es un retirado  
Y no tiene deudas  
Entonces el préstamo debe ser aprobado

---

### Casos de Prueba (Tabla de decisión)

| Caso | Tipo de persona | ¿Tiene deudas? | Préstamo aprobado |
|------|------------------|----------------|--------------------|
| 1    | Estudiante       | Sí             | ❌ No              |
| 2    | Estudiante       | No             | ❌ No              |
| 3    | Empleado         | Sí             | ✅ Sí              |
| 4    | Empleado         | No             | ✅ Sí              |
| 5    | Retirado         | Sí             | ❌ No              |
| 6    | Retirado         | No             | ✅ Sí              |

<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">BACK</a>
</p>