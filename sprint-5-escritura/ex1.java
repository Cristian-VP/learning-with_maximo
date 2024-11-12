import java.util.Arrays;

public class ex1 {

    public static void main(String[] args) {
        int edad = 8;
        int ciclo = 0;
        int curso = 0;

        if (edad < 3) {
            System.out.println("El niño es demasisdo pequeño");
            System.exit(0);
        } else if (edad < 6) {
            ciclo = 0;
        } else if(edad < 7){
            curso = 1;
            ciclo = 1;
        } else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        }else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        } else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        } else if (edad < 11) {
            curso = 5;
            ciclo = 2;
        } else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        }else{
            System.out.println("La edad del niño es demasiado grande");
            System.exit(0);
        }
        System.out.println("El alumno de edad: "+edad);
        System.out.println("El curso que se la ha asignado es : " + curso);
        
        switch (ciclo) {
            case 0:
                System.out.println("Es de educación infantil");
                break;
                case 1:
                    System.out.println("Es de educación primaria. Ciclo inicial.");
                    break;
                    case 2:
                        System.out.println("Es de educación primaria. Ciclo medio.");
                        break;
                        case 3:
                            System.out.println("Es de educación primaria. Ciclo superior.");
                            break;
        }
    }

}

