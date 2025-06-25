Feature: Creación de usuarios en la API

  Como usuario admin de sistemas administrativo  
  Quiero poder crear usuarios con perfiles IT  
  Para que se puedan ingresar a la intranet organizacional

  Scenario: Creación exitosa de usuario
    Given que el endpoint "https://reqres.in/api/users" está disponible
    When envío una solicitud POST con el siguiente cuerpo:
      """
      {
        "name": "morpheus",
        "job": "leader"
      }
      """
    Then la respuesta debe tener código 201
    And el cuerpo de la respuesta debe contener los campos "name", "job", "id" y "createdAt"

  Scenario Outline: Errores al crear usuario con datos incompletos
    Given que el endpoint "https://reqres.in/api/users" está disponible
    When envío una solicitud POST con el cuerpo "<json_payload>"
    Then la respuesta debe tener código <status_code>

    Examples:
      | json_payload                      | status_code |
      | {}                                | 400         |
      | {"job": "leader"}                 | 400         |
      | {"name": "morpheus"}              | 400         |

  Scenario: Error por método incorrecto
    Given que el endpoint "https://reqres.in/api/users" está disponible
    When envío una solicitud GET al endpoint
    Then la respuesta debe tener código 405

  Scenario: Error del servidor
    Given que el endpoint "https://reqres.in/api/users" está simulado para fallar
    When envío una solicitud POST válida
    Then la respuesta debe tener código 500
