# Proceso de desarrollo de testing (IEEE 829)
## Actividad � Dise�o de un Caso de Prueba

**Actividad:** Dise�ar los casos de pruebas de las siguientes historias de usuario

---

## US2: Registro de pasajeros

**Como** usuario  
**Quiero** poder cargar mis datos personales  
**Para** registrarme en la p�gina

---

### Criterios de Aceptaci�n

- Visualizar mensaje de validaci�n del campo **nombre y apellido**: solo deben aceptar letras.
- Visualizar mensaje de validaci�n del campo **phone**: solo debe aceptar valores num�ricos.
- Visualizar mensaje de validaci�n del campo **username**: campo obligatorio de 8 caracteres alfanum�ricos, con may�sculas y min�sculas.
- Visualizar mensaje de validaci�n del campo **password**: campo obligatorio de 6 caracteres alfanum�ricos.
- Completar correctamente el formulario debe permitir el **registro exitoso** y mostrar el mensaje correspondiente.

---

### Casos de Prueba

| Caso | Nombre y Apellido     | Tel�fono     | Username     | Password   | Resultado esperado                                |
|------|-----------------------|--------------|--------------|------------|---------------------------------------------------|
| 1    | Juan Perez            | abc123       | JuAnUsEr     | 12ab34     | X Error: Telefono invelido                        |
| 2    | Juan123               | 1234567890   | JuAnUsEr     | 12ab34     | X Error: Nombre contiene caracteres no permitidos |
| 3    | Juan Perez            | 1234567890   | JUA123       | 12ab34     | X Error: Username con menos de 8 caracteres       |
| 4    | Juan Perez            | 1234567890   | JuAn2025     | 12a        | X Error: Password con menos de 6 caracteres       |
| 5    | Juan Perez            | 1234567890   | JuAn2025     | 12ab34     | V Registro exitoso                                |

