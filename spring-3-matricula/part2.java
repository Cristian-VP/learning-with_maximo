import java.util.Random;
import java.util.Scanner;

public class part2 {
    static boolean truthMachine(String answer){
        boolean correct = false;
        if(answer.equals("si")){

            return correct = true;
        }
        return correct;
    }
    public static void main (String[] args) {
        //Declarar variables y constantes
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int registerStudentNumber, enrolledStudentScore;
        boolean brotherStudent, homeStudent, parentsWorksStudent, conditionStudent, familyStudent, schooledFamilyStudent;

        final int brothersInCenter = 40;
        final int proximityHome =  30;
        final int proximityParentWorks =  20;
        final int studentCondition =  10;
        final int typeFamily =  15;
        final int familySchooled =  5;

        //Preguntar datos del usuario, por cada respuesta asignar valor
        System.out.println("Para poder asignarte una valoración en tu matricula. Debes responder a las siguiente preguntas. Responde unicamente sí o no.");
        System.out.println("¿Tienes uno o más hermanos/as/es en el centro?");
        brotherStudent = truthMachine(scanner.next());
        //System.out.println(brotherStudent);
        System.out.println("¿Tu residencia esta en la misma localidad que el centro?");
        homeStudent = truthMachine(scanner.next());
        System.out.println("¿Tus padres trabajan en la misma localidad?");
        parentsWorksStudent = truthMachine(scanner.next());
        System.out.println("Te encuentras en alguna de estas dos situaciones:");
        System.out.println("- Grado discapacidad mayor o igual 33%");
        System.out.println("- Enfermedad crónica");
        conditionStudent = truthMachine(scanner.next());
        System.out.println("¿Tienes padres o hermanos?");
        familyStudent = truthMachine(scanner.next());
        System.out.println("¿Algun miembro de tu familia estudió en el centro?");
        schooledFamilyStudent = truthMachine(scanner.next());

        // Analizar datos usuario y asignar puntuación
        enrolledStudentScore = 0;
        if(brotherStudent){
            enrolledStudentScore += brothersInCenter;
            System.out.println(enrolledStudentScore);
        }
        if(homeStudent){
            enrolledStudentScore += proximityHome;
            System.out.println(enrolledStudentScore);
        }
        if(parentsWorksStudent){
            enrolledStudentScore += proximityParentWorks;
            System.out.println(enrolledStudentScore);
        }
        if(conditionStudent){
            enrolledStudentScore += studentCondition;
            System.out.println(enrolledStudentScore);
        }
        if(familyStudent){
            enrolledStudentScore += typeFamily;
            System.out.println(enrolledStudentScore);
        }
        if(schooledFamilyStudent){
            enrolledStudentScore += familySchooled;
            System.out.println(enrolledStudentScore);
        }

        //Mostrar en el terminal la puntuación obtenida
        registerStudentNumber = rand.nextInt((100 + 1) - 1) + 1;
        System.out.println("Nº registro: "+ registerStudentNumber);
        System.out.println("Gracias por responder a las preguntas. Tu puntuación obtenida es:"+enrolledStudentScore);
    }
}