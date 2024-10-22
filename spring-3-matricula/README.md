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

## Sring 3 - Parte 1 

### Ampliar algoritmo spring 2 - piscina

Modificar el programa que se realizó en le Spring 2, añadiendo tipo de datos y entrada des de teclado.
Las modificaciones tendrán unas especificaciones. Los cambios incluyen tres partes: a. Modificación del programa, b. Añadir "trazos," 
c. Utilizar debugger del IDE. 

___

    Inicio algoritmo piscina

    //Declarar funciones
    function
        calcArea(float width, float large)
            Devuelve width * large
    Ffunction
    function calcVolume(float area, float deep)
        Devuelve area * deep
    Ffunction

    function checkEntry (Scanner data)
        var
            aproved : double
        fvar
        Si data Enconces
            aprobed = data
        Sino
            Escribir "Invalid entry-Please write a floating point number"
        Devuelve aproved
    Ffunction
    //Fin declarar funciones

    //Declarar y asignar
        cons
            largePols := float 300
        fcons
        var
            widthPoolA, widthPoolB, deepPoolA, deepPoolB : float
            resultAreaPools, resultVolumePool, resultValuesBothPools, resultAreaBothPools , resultVolumeBothPools,  resultValuesChangedPools: String
            scanner : Scanner
        fvar
    
    //Solicitar datos usuario
        Escribir"El programa te solicitara el ancho y profundo de las piscinas. Solo admite decimales"
    
        Escribir "Introduce el ancho de la piscina A"
        Leer scanner
        Asignar widthPoolA := checkEntry(scanner)
        
        Escribir "Introduce el ancho de la piscina B"
        Leer scanner
        Asignar widtPoolB := checkEntry(scanner)
        
        Escribir "Introduce la profundidad de la piscina A"
        Leer scanner 
        Asignar deepPoolA := checkEntry(scanner)
        
        Escribir "Introduce la profundidad de la piscina B"
        Leer scanner
        Asignar deepPoolB := checkEntry(scanner)

    //Asignación valores: area, volumen, dimensiones de las piscinas y sus variantes
        areaPoolA := calcArea 
        areaPoolB :=  calcArea
        volumePoolA := calVolume
        volumePoolB := calcVolume
        widthBothPools := widthPoolA + widthPoolB
        areaBothPools := calcArea
        volumeBothPools := volumePoolA + volumePoolB
        volumeChangedPoolA := calcVolume
        volumeChangedPoolB := calcVolume  


    //Mostrar en terminal  
        resultAreaPools := String "El área total de la piscina A es:  m², y de la piscina B es:  m².\n"
        resultVolumePools := String "El volumen total de la piscina A es:  m³, y de la piscina B es:  m³.\n"
        resultValuesBothPools := String "El ancho de las piscinas juntas es:  m, y el largo es:  m.\n"
        resultAreaBothPools := String "El valor del área de las dos piscinas juntas es:  m².\n"
        resultVolumeBothPools := String "El valor del volumen de las dos piscinas juntas es  m³.\n"
        resultValuesChangedPools := String "Los nuevos valores son: Piscina A tiene un ancho de  m, largo m y volumen  m³,  
        piscina B tiene un ancho  m, largo  m y volumen  m³."

    Fin algoritmo piscina