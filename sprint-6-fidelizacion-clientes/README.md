                                Lanzar mensaje "Programa finalizado"
# Sprint 6 - Integraión registro datos usuario

## Algoritmo inscripción alumno

Para apoyar la recopilación de datos, solicitan una aplicación sencilla. Esta debe permitir registrar los datos del cliente cuando realiza una compra. Más adelante, la aplicación servirá para realizar el sorteo entre todos los clientes registrados
---

        Inicio algoritmo control
            function checkID (Scanner input) Integer
                var 
                    id:int:=input
                fvar
                    return Si id es >= 111 AND id es <= 99 Entonces id Sino null
            ffunction
            function checkAge (Scanner input) Integer
                var 
                    age:int:=input
                fvar
                    return Si age es >= 14 AND id es <= 120 Entonces age Sino null
            ffunction
            function checkKind (Scanner input) Integer
                var 
                    kind:int:=input
                fvar
                    return Si kind es >= 0 AND id es <= 3 Entonces kind Sino null
            ffunction
            function checkTotal (Scanner input) Integer
                var 
                    total:int:=input
                fvar
                    return Si total es >= 0 AND id es <= 1000 Entonces total Sino null
            ffunction
            function checkPhone (Scanner input) Integer
                var 
                    phone:int:=input
                fvar
                    return Si phone es >= 111111111 AND id es <= 999999999 Entonces phone Sino null
            ffunction

            var
                scanner:scanner
                id, age, kind, total, phone : Integer
                /*El array de valores string del tipo tiene que garantizar inmutabilidad en su referencia y sus elementos*/
                kindOfSell:final string[]
                errorRegister:boolean
            fvar

            errorRegister <- false
            scanner <- scanner
            kindOfSell <- "libre","pensionista","carnet joven","socio"

            Escribir "Bienvenido! Debes ingresar todos los datos solicitados"
            
            Escribir "Ingresa tu Id de usuario: "
            Leer id <- checkID(scanner)
            Si id es null Entonces
                errorRegister <- true
                Escribir "Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 111 a 999 (incluidos)."
                Lanzar mensaje "Programa finalizado"
            Sino Si !errorRegister 
                Escribir "Ingresa tu edad: "
                Leer age <- checkAge(scanner)
                Si age es null Entonces
                    errorRegister <- true
                    Escribir "Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 14 a 120 (incluidos)."
                    Lanzar mensaje "Programa finalizado"
                Sino Si !errorRegister
                    Escribir "Ingresa el número correspondiente al tipo de venta: \n Venta libre (0) \n Pensionista (1) \n Carnet Jove (2) \n Socio (3)"
                    Leer kind <- checkKind(scanner)
                    Si kind es null Entonces
                        errorRegister <- true
                        Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 3 (incluidos)."
                        Lanzar mensaje "Programa finalizado"
                    Sino Si !errorRegister
                        Escribir "Ingresa el importe de la compra: "
                        Leer total <- checkTotal(scanner)
                        Si total es null Entonces
                            errorRegister <- true
                            Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 1000 (incluidos)."
                            Lanzar mensaje "Programa finalizado"
                        Sino Si !errorRegister
                            Escribir "Ingresa tu teléfono sin el prefijo: "
                            Leer phone <- checkPhone(scanner)
                            Si phone es null Entonces
                                errorRegister <- true
                                Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 111111111 a 999999999 (incluidos)."
                                Lanzar mensaje "Programa finalizado"
                            Sino
                                Segun kind Hacer
                                    Caso 0:
                                        Escribir "Gracias por completar el registro"
                                        Escribir "Tus datos son:"
                                        Escribir "Id Edad Tipo Importe Teléfono"
                                        Escribir id, age, kindOfSell[0], total, phone
                                    Caso 1:
                                        Escribir "Gracias por completar el registro"
                                        Escribir "Tus datos son:"
                                        Escribir "Id Edad Tipo Importe Teléfono"
                                        Escribir id, age, kindOfSell[1], total, phone
                                    Caso 2:
                                        Escribir "Gracias por completar el registro"
                                        Escribir "Tus datos son:"
                                        Escribir "Id Edad Tipo Importe Teléfono"
                                        Escribir id, age, kindOfSell[2], total, phone
                                    Caso 3:
                                        Escribir "Gracias por completar el registro"
                                        Escribir "Tus datos son:"
                                        Escribir "Id Edad Tipo Importe Teléfono"
                                        Escribir id, age, kindOfSell[3], total, phone
                                Fin Segun
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
    Fin algoritmo control