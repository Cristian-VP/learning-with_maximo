# Sprint 3 → Parte 2

## Algoritmo inscripción alumno

La escuela de educación primaria de nuestro barrio abre ahora el plazo de inscripción. Tienen muchos datos en
registrar para cada niño que se inscribe y quieren automatizar la recogida de datos para que no les
lleve tanto trabajo, evitar errores y hacer posible en un futuro que se pueda consultar la puntuación por
Internet. Cada niño que se inscribe tiene un número de puntos en función de algunos criterios.

---

        Inicio algoritmo innscripción alumno

            //Declarar método 
            truthMachine(string)
            Si string  Entonces
                devolver true 
            Sino
                devolver false

            //Declarar variables y constantes
            
            var
                random : Random
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
                Escribir "Para poder asignarte una valoración en tu matricula. Debes responder a las siguiente preguntas.
                 Responde unicamente sí o no."
                Escribir "¿Tienes uno o más hermanos/as/es en el centro?"
                    Leer scanner
                    Asignar brotherStudent  :=  truthMachine(brothers)
                Escribir "¿Tu residencia esta en la misma localidad que el centro?"
                    Leer scanner
                    Asignar homeStudent  := truthMachine(homeLocation)
                Escribir "¿Tus padres trabajan en la misma localidad?"
                    Leer scanner
                    Asignar parentsWorksStudent  := truthMachine(parentsWorks)
                Escribir "Te encuentras en alguna de estas dos situaciones: 
                            - Grado discapacidad mayor o igual 33%
                            - Enfermedad crónica "
                    Leer 
                    Asignar conditionStudent  := truthMachine(conditioner)
                Escribir "¿Tienes padres o hermanos?"
                    Leer scanner
                    Asignar familyStudent  := truthMachine(membersFamily)
                Escribir "¿Algun miembro de tu familia a estudiado en el centro?"
                    Leer scanner
                    Asignar schooledFamilyStudent  := truthMachine(scholedFamily)               


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