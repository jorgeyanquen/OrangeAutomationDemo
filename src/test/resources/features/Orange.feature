@Regresion
  Feature: Automate the Orange demo page by validating each of its processes

    @CasoExitosoRegistro
    Scenario: Entering the application and registering a new employee
      Given Juan needs to create an employee in OrageHR
      When he enters the record in the application
      | Firstname | middlename | lastname |
      | Juan      | Andres     | Perez    |
      Then he sees the new employee in the application
