# Sprint 8 - Amppliacion integraión registro datos usuario

## Algoritmo register_users

Se debe realizar una ampliación del programa de fidelización de clientes del sprint 6 "Fidelizacion de clientes". En esta ampliación el programa podrá permitir la entrada de un indeterminado númeor de clientes y limitar los intentos en la introducción de datos a 3 intentos.
---

        Inicio algoritmo register_user
            //Usaremos los métodos de la clase para validar la introducción de datos
            importar clase user_shop del sprint 6 
            
            var
                scanner:scanner
                id, age, kind, total, phone, attemps : Integer
                /*El array de valores string del tipo tiene que garantizar inmutabilidad en su referencia y sus elementos*/
                kindOfSell:final string[]
                errorRegister:boolean
                continueRegister:boolean
            fvar

            errorRegister <- false
            scanner <- scanner
            kindOfSell <- "libre","pensionista","carnet joven","socio"
            

            Hacer
                Escribir "Bienvenido! Debes ingresar todos los datos solicitados"
                
                Escribir "Ingresa tu Id de usuario: "
                Leer id <- checkID(scanner)
                Si id es null Entonces
                    errorRegister <- true
                    Escribir "Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 111 a 999 (incluidos)."
                Sino
                    Escribir "Ingresa tu edad: "
                    Leer age <- checkAge(scanner)
                    Si age es null Entonces
                        errorRegister <- true
                        Escribir "Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 14 a 120 (incluidos)."
                    Sino 
                        Escribir "Ingresa el número correspondiente al tipo de venta: \n Venta libre (0) \n Pensionista (1) \n Carnet Jove (2) \n Socio (3)"
                        Leer kind <- checkKind(scanner)
                        Si kind es null Entonces
                            errorRegister <- true
                            Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 3 (incluidos)."
                        Sino 
                            Escribir "Ingresa el importe de la compra: "
                            Leer total <- checkTotal(scanner)
                            Si total es null Entonces
                                errorRegister <- true
                                Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 1000 (incluidos)."
                            Sino 
                                Escribir "Ingresa tu teléfono sin el prefijo: "
                                Leer phone <- checkPhone(scanner)
                                Si phone es null Entonces
                                    errorRegister <- true
                                    Escribir "Error! Entrada de dato inválida. Solo se aceptan números naturales de 111111111 a 999999999 (incluidos)."
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
                si errorRegister es true Entonces
                    attemp + 1
                    errorRegister <- false
                Finsi
                continueRegister <- truthmachine(scanner)
            Mientras attemp <3 t 
            
        Fin algoritmo register_user