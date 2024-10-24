import java.util.Scanner;

public class control {
    static boolean truthMachine(String answer) {
        boolean correct = false;
        String convertLowerCase = answer.toLowerCase();
        if (convertLowerCase.equals("si") || convertLowerCase.equals("sí")) {
            correct = true;
        }else {
            System.out.println("Invalid entry. Please write only: yes or not.");
            System.exit(0);
        }
        return correct;
    }

    static int checkRegisterNumber (Scanner data){
        int confirmed = 0;
        int toConfirmed = 0;
        if(data.hasNextInt()){
            toConfirmed = data.nextInt();
        }else{
            System.out.println("Invalid entry-Please write a integer number.");
            System.exit(0);
        }
        if(toConfirmed >0 && toConfirmed <= 499){
            confirmed = toConfirmed;
        }else {
            System.out.println("Invalid entry-Please write a integer number between 1 and 499.");
            System.exit(0);
        }
        return confirmed;
    }

    public static void main(String[] args) {
        //Declarar variables y constantes
        Scanner scanner = new Scanner(System.in);
        int registerStudentNumber, enrolledStudentScore;
        boolean brotherStudent, homeStudent, parentsWorksStudent, conditionStudent, familyStudent, schooledFamilyStudent;

        final int brothersInCenter = 40;
        final int proximityHome = 30;
        final int proximityParentWorks = 20;
        final int studentCondition = 10;
        final int typeFamily = 15;
        final int familySchooled = 5;

        //Preguntar datos del usuario, por cada respuesta asignar valor
        System.out.println("Estas a punto de realizar tu matrícula. Necesitamos tu nº de registro");
        System.out.println("Introduce un numero natural entre 1 a 499");
        registerStudentNumber = checkRegisterNumber(scanner);
        System.out.println("Para poder asignarte una valoración en tu matricula. Debes responder a las siguiente preguntas. Responde unicamente sí o no.");
        System.out.println("¿Tienes uno o más hermanos/as/es en el centro?");
        brotherStudent = truthMachine(scanner.next());
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
        if (brotherStudent) {
            enrolledStudentScore += brothersInCenter;
        }
        if (homeStudent) {
            enrolledStudentScore += proximityHome;
        }
        if (parentsWorksStudent) {
            enrolledStudentScore += proximityParentWorks;
        }
        if (conditionStudent) {
            enrolledStudentScore += studentCondition;
        }
        if (familyStudent) {
            enrolledStudentScore += typeFamily;
        }
        if (schooledFamilyStudent) {
            enrolledStudentScore += familySchooled;
        }

        //Mostrar en el terminal la puntuación obtenida
        System.out.println("Nº registro: " + registerStudentNumber);
        System.out.println("Gracias por responder a las preguntas. Tu puntuación obtenida es:" + enrolledStudentScore);
    }
}
