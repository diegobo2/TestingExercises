# Proceso de desarrollo de testing (IEEE 829)
## Actividad – Diseño de un Caso de Prueba

**Actividad:** Diseñar los casos de pruebas encontrados en el requerimiento “Solicitud de préstamo bancario” (tabla de decisión)

---

### Requerimiento
Proceso bancario que se encarga de la aprobación de préstamos.

---

### Reglas del negocio

1. Si la persona que solicita el préstamo es un **Estudiante**, el préstamo **no se aprueba**, aunque no tenga deudas.
2. Si la persona que solicita el préstamo es un **Empleado/Trabajador**, el préstamo **se aprueba** aunque tenga deudas.
3. Si la persona que solicita el préstamo es un **Retirado**, el préstamo **se aprueba solo si no tiene deudas**.

---

### Casos de Prueba (Tabla de decisión)

| Caso | Tipo de persona | ¿Tiene deudas? | Préstamo aprobado |
|------|-----------------|---------------|--------------------|
| 1    | Estudiante      | Sí            | ❌ No             |
| 2    | Estudiante      | No            | ❌ No             |
| 3    | Empleado        | Sí            | ✅ Sí             |
| 4    | Empleado        | No            | ✅ Sí             |
| 5    | Retirado        | Sí            | ❌ No             |
| 6    | Retirado        | No            | ✅ Sí             |
