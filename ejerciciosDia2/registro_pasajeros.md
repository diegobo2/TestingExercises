# Proceso de desarrollo de testing (IEEE 829)
## Actividad – Diseño de un Caso de Prueba

**Actividad:** Diseñar los casos de pruebas de las siguientes historias de usuario

---

## US2: Registro de pasajeros

**Como** usuario  
**Quiero** poder cargar mis datos personales  
**Para** registrarme en la página

---

### Criterios de Aceptación

- Visualizar mensaje de validación del campo **nombre y apellido**: solo deben aceptar letras.
- Visualizar mensaje de validación del campo **phone**: solo debe aceptar valores numéricos.
- Visualizar mensaje de validación del campo **username**: campo obligatorio de 8 caracteres alfanuméricos, con mayúsculas y minúsculas.
- Visualizar mensaje de validación del campo **password**: campo obligatorio de 6 caracteres alfanuméricos.
- Completar correctamente el formulario debe permitir el **registro exitoso** y mostrar el mensaje correspondiente.

---

### Escenarios

**Escenario 1: Teléfono con caracteres inválidos**  
Dado que el usuario completa el formulario  
Cuando ingresa letras en el campo "phone"  
Entonces el sistema debe mostrar un mensaje de error por valor no numérico

**Escenario 2: Nombre con caracteres inválidos**  
Dado que el usuario completa el formulario  
Cuando ingresa números en el campo "nombre y apellido"  
Entonces el sistema debe mostrar un mensaje de error por uso de caracteres no permitidos

**Escenario 3: Username demasiado corto**  
Dado que el usuario completa el formulario  
Cuando el campo "username" tiene menos de 8 caracteres  
Entonces el sistema debe mostrar un mensaje de error por longitud insuficiente

**Escenario 4: Password inválido**  
Dado que el usuario completa el formulario  
Cuando el campo "password" tiene menos de 6 caracteres  
Entonces el sistema debe mostrar un mensaje de error por longitud inválida

**Escenario 5: Registro exitoso**  
Dado que el usuario completa correctamente todos los campos  
Entonces el sistema debe registrar al usuario y mostrar mensaje de éxito

---

### Casos de Prueba

| Caso | Nombre y Apellido     | Teléfono     | Username     | Password   | Resultado esperado                                |
|------|------------------------|--------------|--------------|------------|---------------------------------------------------|
| 1    | Juan Pérez             | abc123       | JuAnUsEr     | 12ab34     | ❌ Error: Teléfono inválido                        |
| 2    | Juan123                | 1234567890   | JuAnUsEr     | 12ab34     | ❌ Error: Nombre contiene caracteres no permitidos |
| 3    | Juan Pérez             | 1234567890   | JUA123       | 12ab34     | ❌ Error: Username con menos de 8 caracteres       |
| 4    | Juan Pérez             | 1234567890   | JuAn2023     | 12a        | ❌ Error: Password con menos de 6 caracteres       |
| 5    | Juan Pérez             | 1234567890   | JuAn2023     | 12ab34     | ✅ Registro exitoso                                |

