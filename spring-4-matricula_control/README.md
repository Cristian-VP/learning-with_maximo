# Sprint 4 ~ Sprint 3 - part 2

## Algoritmo inscripción alumno

La escuela de educación primaria de nuestro barrio abre ahora el plazo de inscripción. Tienen muchos datos en
registrar para cada niño que se inscribe y quieren automatizar la recogida de datos para que no les
lleve tanto trabajo, evitar errores y hacer posible en un futuro que se pueda consultar la puntuación por
Internet. Cada niño que se inscribe tiene un número de puntos en función de algunos criterios.

---

        Inicio algoritmo innscripción alumno

            //Declarar métodos 
            function truthMachine(answer: String) : boolean 
                correct :boolean
                correct := false
                Si string  Entonces
                    correct = true 
                Sino
                    Escribir "Invalid entry-Please write a integer number between 1 and 499."
                    Finalizar algoritmo
                devolver coorect 
            ffunction
            
            function checkRegisterNumber(data : Scanner) : int
                toComfirmed, comfirmed : int
                toConfirmed := 0
                confirmed := 0

                Si data == integer Entonces
                    leer teclado(toConfirmed)
                Sino 
                    Escribir "Invalid entry-Please write a integer number."
                    Finalizar algoritmo
                
                Si toComfirmed >= 1 && to confirmed <= 499 Entonces
                    confirmed = toComfirmed
                Sino
                    Escribir "Invalid entry-Please write a integer number between 1 and 499."
                    Finalizar programa

                Devolver confirmed
            ffunction

            //Declarar variables y constantes
            
            var
                scanner : Scanner
                registerStudentNumber, enrolledStudentScore : int
                brotherStudent, homeStudent, parentsWorksStudent, conditionStudent, familyStudent, schooledFamilyStudent : boolean
            fvar
            
            cons
                brothersInCenter : int := 40
                proximityHome : int := 30
                proximityParentWorks : int := 20
                studentCondition : int := 10
                typeFamily : int := 15
                familySchooled : int := 5
            fconst

            Preguntar datos del usuario, por cada respuesta asignar valor
                Escribir "Estas a punto de realizar tu matrícula. Necesitamos tu nº de registro"
                Escribir "Introduce un numero natural entre 1 a 499"
                    Asignar registerStudentNumber := checkRegisterNumber(Leer scanner)
                Escribir "Para poder asignarte una valoración en tu matricula. Debes responder a las siguiente preguntas.
                 Responde unicamente sí o no."
                Escribir "¿Tienes uno o más hermanos/as/es en el centro?"
                    Asignar brotherStudent  :=  truthMachine(Leer scanner)
                Escribir "¿Tu residencia esta en la misma localidad que el centro?"
                    Asignar homeStudent  := truthMachine(Leer scanner)
                Escribir "¿Tus padres trabajan en la misma localidad?"
                    Asignar parentsWorksStudent  := truthMachine(Leer scanner)
                Escribir "Te encuentras en alguna de estas dos situaciones: 
                            - Grado discapacidad mayor o igual 33%
                            - Enfermedad crónica "
                    Asignar conditionStudent  := truthMachine(Leer scanner)
                Escribir "¿Tienes padres o hermanos?"
                    Asignar familyStudent  := truthMachine(Leer scanner)
                Escribir "¿Algun miembro de tu familia es un ex-alumno del centro?"
                    Asignar schooledFamilyStudent  := truthMachine(Leer scanner)               


            Analizar datos usuario y asignar puntuación
                Si brotherStudent Entonces
                    Sumar enrolledStudentScore + brotherInCenter
                Si homeStudent Entonces
                    Sumar enrolledStudentScore + proximity
                Si parentsWorksStudent Entonces
                    Sumar  enrolledStudentScore + parentsWorksStudent
                Si conditionStudent Entonces
                    Sumar enrolledStudentScore + conditionStudent
                Si familyStudent Entonces
                    Sumar enrolledStudentScore + familyStudent
                Si schooledFamilyStudent Entonces
                    Sumar enrolledStudentScore + schooledFamilyStudent
            
            Mostrar en el terminal la puntuación obtenida
                Escribir "Nº registro: registerStudentNumber"
                Escribir "Gracias por responder a las preguntas. Tu puntuación obtenida es: enrolledStudentScore"
       
             Fin algoritmo