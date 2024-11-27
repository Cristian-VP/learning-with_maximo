import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;





public class register_users {
    public static boolean truthMachine (Scanner input) {
        try {
            String lecture = input.nextLine().toLowerCase();
            if(lecture.equals("si") || lecture.equals("no")){
                return lecture.equals("si");
            }else{
                System.out.println("Invalid entry. Please write only: yes or not.");
                return false;
            }
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("Invalid entry. Please write only: yes or not.");
            return false;
        }
    }

    public static void main(String[] args) throws Exception {



        Scanner scanner = new Scanner(System.in);
        Integer id, age, kind, total, phone;
        /*El array de valores string de la variable "tipo" tiene que garantizar inmutabilidad en su referencia y sus elementos*/
        List<String> kindsOfSell = List.of("libre", "pensionista", "carnet joven", "socio");
        boolean errorRegister = false;
        boolean continueRegister = false;
        int attemps = 0;

        do{
            System.out.println("Bienvenido! Debes ingresar todos los datos solicitados");
            System.out.print("Ingresa tu ID del usuario: ");
            id = user_shop.checkID(scanner);
            if (id == null) {
                errorRegister = true;
                System.out.println("Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 111 a 999 (incluidos).");
            } else {
                System.out.print("Ingresa tu edad: ");
                age = user_shop.checkAge(scanner);
                if (age == null) {
                    errorRegister = true;
                    System.out.println("Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 14 a 120 (incluidos).");
                } else {
                    System.out.println("Ingresa el número correspondiente al tipo de venta: \n Venta libre (0) \n Pensionista (1) \n Carnet Jove (2) \n Socio (3)");
                    kind = user_shop.checkKind(scanner);
                    if (kind == null) {
                        errorRegister = true;
                        System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 3 (incluidos).");
                    } else {
                        System.out.print("Ingresa el importe de la compra: ");
                        total = user_shop.checkTotal(scanner);
                        if (total == null) {
                            errorRegister = true;
                            System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 1000 (incluidos).");
                            throw new Exception("Programa finalizado");
                        } else {
                            System.out.print("Ingresa tu teléfono sin el prefijo: ");
                            phone = user_shop.checkPhone(scanner);
                            if (phone == null) {
                                errorRegister = true;
                                System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 111111111 a 999999999 (incluidos).");
                                throw new Exception("Programa finalizado");
                            } else {
                                switch (kind) {// "../sprint-6-fidelizacion-clientes/user_shop.java"
                                    case 0:
                                        System.out.println("Gracias por completar el registro");
                                        System.out.println("Tus datos son:");
                                        System.out.println("Id Edad Tipo Importe Teléfono");
                                        System.out.printf("%d %d %s %d %d\n", id, age, kindsOfSell.get(kind), total, phone);
                                        break;
                                    case 1:
                                        System.out.println("Gracias por completar el registro");
                                        System.out.println("Tus datos son:");
                                        System.out.println("Id Edad Tipo Importe Teléfono");
                                        System.out.printf("%d %d %s %d %d\n", id, age, kindsOfSell.get(kind), total, phone);
                                        break;
                                    case 2:
                                        System.out.println("Gracias por completar el registro");
                                        System.out.println("Tus datos son:");
                                        System.out.println("Id Edad Tipo Importe Teléfono");
                                        System.out.printf("%d %d %s %d %d\n", id, age, kindsOfSell.get(kind), total, phone);
                                        break;
                                    case 3:
                                        System.out.println("Gracias por completar el registro");
                                        System.out.println("Tus datos son:");
                                        System.out.println("Id Edad Tipo Importe Teléfono");
                                        System.out.printf("%d, %d, %s, %d, %d\n", id, age, kindsOfSell.get(kind), total, phone);
                                        break;
                                }
                            }
                        }
                    }
                }
            }
            if(errorRegister){
                attemps ++;
                errorRegister = false;
            }
            System.out.println("Te gustaría introducir otro usuario?");
            continueRegister = truthMachine(scanner);
        }while(continueRegister && attemps < 3);

    }
}
