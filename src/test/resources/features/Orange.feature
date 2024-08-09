@Regresion
  Feature: Automate the Orange demo page by validating each of its processes

    @CasoExitosoRegistro
    Scenario: Entering the application and registering a new employee
      Given Juan needs to create an employee in OrageHR
      When he enters the record in the application
      | Firstname | middlename | lastname |
      | Juan      | Andres     | Perez    |
      Then he sees the new employee in the application


      @CasoExitosoActualizacion
      Scenario: enter the application and update an employee
         Given Juan needs to update an employee in OrageHR
        When he enters the update in the application
        | Employeeid | numberlicence | licence expdate | datebirth  |
        | 0404       | 123456780     | 2024-09-16      | 1992-15-08 |
        Then he sees the updated employee in the application
