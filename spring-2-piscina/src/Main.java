
public class Main {
    //Declaración de métodos.
    public static int  calcArea(int width, int large){
        return width*large;
    }

    public static int calcVolume(int area, int deep){
        return area*deep;
    }
    //Fin de métodos.

    public static void main(String[] args) {
        // Declarar y asignar.
            //Constantes.
        final int largePols = 300;
        final int widthPoolA = 150;
        final int widthPoolB = 80;
        final int deepPoolB = 35;
        final int deepPoolA = 20;

            //Asignación valores: area, volumen, dimensiones de las piscinas y sus variantes.
        int areaPoolA = calcArea(widthPoolA, largePols);
        int areaPoolB = calcArea(widthPoolB, largePols);
        int volumePoolA = calcVolume(areaPoolA, deepPoolA);
        int volumePoolB = calcVolume(areaPoolB, deepPoolB);
        int widthBothPools = widthPoolA + widthPoolB;
        int areaBothPools = calcArea(widthBothPools, largePols);
        int volumeBothPools = volumePoolA + volumePoolB;
        int volumeChangedPoolA = calcVolume(areaPoolA, deepPoolB);
        int volumeChangedPoolB = calcVolume(areaPoolB, deepPoolA);

            //Asignación resultados con sus valores correspondientes.
        String taskAreaPools = "El área total de la piscina A es %d m² y de la piscina B es %d m²\n";
        String resultTaskAreaPools = String.format(taskAreaPools, areaPoolA, areaPoolB) ;
        String taskVolumePools = "El volumen total de la piscina A es %d m³ y de la piscina B es %d m³\n";
        String resultTaskVolumePools = String.format(taskVolumePools, volumePoolA, volumePoolB);
        String taskValuesBothPools = "El ancho de las piscinas juntas es %d m y el largo es %d m\n";
        String resultTaskValuesBothPools = String.format(taskValuesBothPools, widthBothPools, largePols);
        String taskAreaBothPools = "El valor del área de las dos piscinas juntas es %d m²\n";
        String resultTaskAreaBothPools = String.format(taskAreaBothPools, areaBothPools);
        String taskVolumeBothPools = "El valor del volumen de las dos piscinas juntas es %d m³\n";
        String resultTaskVolumeBothPools = String.format(taskVolumeBothPools, volumeBothPools);
        String taskValuesChangedPools = "Los nuevos valores son: Piscina A tiene un ancho %d m, largo %d m  y volumen %d m³ y la piscina B tiene un ancho %d m, largo %d m y volumen %d m³";
        String resultTaskValuesChangedPools = String.format(taskValuesChangedPools, widthPoolA, largePols, volumeChangedPoolA, widthPoolB, largePols, volumeChangedPoolB);
        //Fin declaración y asignación.

        //Mostrar en terminal.
        System.out.println(resultTaskAreaPools);
        System.out.println(resultTaskVolumePools);
        System.out.println(resultTaskValuesBothPools);
        System.out.println(resultTaskAreaBothPools);
        System.out.println(resultTaskVolumeBothPools);
        System.out.println(resultTaskValuesChangedPools);
        //Fin.

    }
}