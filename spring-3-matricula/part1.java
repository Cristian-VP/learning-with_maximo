public class part1 {
    public static void main(String[] args) {
        //Declaración de métodos.
        public static int  calcArea(double width, double large){
            double area = width * large;
            return (int) area;
        }

        public static int calcVolume(double area, double deep){
            double volume = area*deep;
            return (int) volume;

        }
        //Fin de métodos.

        public static void main(String[] args) {

            //Constantes.
            final int largePols = 300;
            //Variables
            double widthPoolA, widthPoolB, deepPoolB, deepPoolA;
            Scanner widthInput = new Scanner(System.in);
            Scanner deepInput = new Scanner(System.in);
            String resultTaskAreaPools, resultTaskVolumePools, resultTaskValuesBothPools, resultTaskAreaBothPools, resultTaskVolumeBothPools, resultTaskValuesChangedPools;

            //Solicitar datos usuario
            System.out.println("El programa te solicitara el ancho y profundo de las piscinas. Solo admite decimales.");
            System.out.println("Introduce el ancho de la piscina A");
            widthPoolA = widthInput.nextDouble();
            System.out.println("Introduce el ancho de la piscina B");
            widthPoolB = widthInput.nextDouble();
            System.out.println("Introduce la profundidad de la piscina A");
            deepPoolA = deepInput.nextDouble();
            System.out.println("Introduce la profundidad de la piscina B");
            deepPoolB = deepInput.nextDouble();



            //Asignación valores: area, volumen, dimensiones de las piscinas y sus variantes.
            int areaPoolA = calcArea(widthPoolA, largePols);
            int areaPoolB = calcArea(widthPoolB, largePols);
            int volumePoolA = calcVolume(areaPoolA, deepPoolA);
            int volumePoolB = calcVolume(areaPoolB, deepPoolB);
            double widthBothPools = widthPoolA + widthPoolB;
            int areaBothPools = calcArea(widthBothPools, largePols);
            int volumeBothPools = volumePoolA + volumePoolB;
            int volumeChangedPoolA = calcVolume(areaPoolA, deepPoolB);
            int volumeChangedPoolB = calcVolume(areaPoolB, deepPoolA);

            //Asignación resultados con sus valores correspondientes.
            resultTaskAreaPools = "El área total de la piscina A es %d m² y de la piscina B es %d m² \n";
            resultTaskVolumePools = "El volumen total de la piscina A es %d m³ y de la piscina B es %d m³\n";
            resultTaskValuesBothPools = "El ancho de las piscinas juntas es %.1f m y el largo es %d m\n";
            resultTaskAreaBothPools = "El valor del área de las dos piscinas juntas es %d m²\n";
            resultTaskVolumeBothPools = "El valor del volumen de las dos piscinas juntas es %d m³\n";
            resultTaskValuesChangedPools = "Los nuevos valores son: Piscina A tiene un ancho %.1f m, largo %d m  y volumen %d m³ y la piscina B tiene un ancho %.1f m, largo %d m y volumen %d m³";

            //Mostrar en terminal.
            System.out.printf(resultTaskAreaPools, areaPoolA, areaPoolB);
            System.out.printf(resultTaskVolumePools, volumePoolA, volumePoolB);
            System.out.printf(resultTaskValuesBothPools, widthBothPools, largePols);
            System.out.printf(resultTaskAreaBothPools, areaBothPools);
            System.out.printf(resultTaskVolumeBothPools, volumeBothPools);
            System.out.printf(resultTaskValuesChangedPools, widthPoolA, largePols, volumeChangedPoolA, widthPoolB, largePols, volumeChangedPoolB);
            //Fin.
        }
    }