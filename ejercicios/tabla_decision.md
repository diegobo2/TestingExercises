<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">Volver al README</a>
</p>

# Ejercicio 1: Descuento por tipo de tarjeta

**Enunciado:**
Se quiere determinar el importe a facturar a los clientes de unos grandes almacenes según estos criterios:

* Si pagan con tarjeta oro tendrán un 15% de descuento.
* Si pagan con tarjeta club tendrán un 5% de descuento.
* Si la tarjeta (oro o club) es modalidad joven, tendrán un 5% de descuento adicional.
* Los descuentos son acumulables.

### Tabla de decisión

| Caso | Tarjeta oro | Tarjeta club | Modalidad joven | Descuento total |
| ---- | ----------- | ------------ | --------------- | --------------- |
| 1    | Sí          | No           | No              | 15%             |
| 2    | No          | Sí           | No              | 5%              |
| 3    | Sí          | No           | Sí              | 20%             |
| 4    | No          | Sí           | Sí              | 10%             |
| 5    | No          | No           | Sí              | 5%              |
| 6    | No          | No           | No              | 0%              |

---

# Ejercicio 2: Aprobación de préstamos

**Enunciado:**
Proceso bancario que se encarga de la aprobación de préstamos.

Reglas del negocio:

1. Si la persona es *Estudiante*, el préstamo **no se aprueba**, sin importar si tiene o no deudas.
2. Si es *Empleado*, el préstamo **se aprueba**, incluso si tiene deudas.
3. Si es *Retirado*, el préstamo **se aprueba solo si no tiene deudas**.

### Tabla de decisión

| Caso | Tipo de persona | Tiene deudas | Préstamo aprobado |
| ---- | --------------- | ------------ | ----------------- |
| 1    | Estudiante      | Sí           | No                |
| 2    | Estudiante      | No           | No                |
| 3    | Empleado        | Sí           | Sí                |
| 4    | Empleado        | No           | Sí                |
| 5    | Retirado        | Sí           | No                |
| 6    | Retirado        | No           | Sí                |

---

# Ejercicio 3: Descuentos en Cyber Monday

**Enunciado:**
Aerolíneas Argentinas lanza una venta de pasajes para el Cyber Monday:

* Los destinos *domésticos* tienen un 45% de descuento para hasta 4 personas.
* Los *internacionales* solo tienen beneficios si el destino es *Brasil*, con un 30% de descuento, también hasta 4 personas.
* Si el pago se realiza con *tarjeta Mastercard*, se suma un 5% de descuento adicional.

### Tabla de decisión

| Caso | Destino | Tipo de destino | Cant. personas ≤ 4 | Pago con Mastercard | Descuento total |
| ---- | ------- | --------------- | ------------------ | ------------------- | --------------- |
| 1    | Córdoba | Doméstico       | Sí                 | No                  | 45%             |
| 2    | Córdoba | Doméstico       | Sí                 | Sí                  | 50%             |
| 3    | Córdoba | Doméstico       | No                 | Sí                  | 5%              |
| 4    | Brasil  | Internacional   | Sí                 | No                  | 30%             |
| 5    | Brasil  | Internacional   | Sí                 | Sí                  | 35%             |
| 6    | Brasil  | Internacional   | No                 | No                  | 0%              |
| 7    | Chile   | Internacional   | Sí                 | Sí                  | 5%              |
| 8    | Chile   | Internacional   | No                 | No                  | 0%              |

<p align="right">
  <a href="./../README.md" style="text-decoration:none; background:#eee; border:1px solid #ccc; padding:4px 8px; border-radius:4px; font-size:90%;">Volver al README</a>
</p>
