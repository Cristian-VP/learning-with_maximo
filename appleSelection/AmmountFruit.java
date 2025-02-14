import java.util.*;
/*DESCRIPCIÓN EJER 1 MATRIXGAME:
Una chica camina por un huerto de manzanos con una bolsa en cada mano.
Le gusta recoger manzanas de cada árbol a medida que avanza, pero es meticulosa en no poner diferentes tipos de manzanas en la misma bolsa.
Dado un input que describe los tipos de manzanas que encontrará en su camino, en orden, determina la longitud del tramo más largo de su camino que contenga solo dos tipos de árboles de manzanas.
Por ejemplo, con el input [2, 1, 2, 3, 3, 1, 3, 5], el tramo más largo será de tipos 1 y 3, con una longitud de cuatro. No olvidéis el programa principal.
 */

public class AmmountFruit {
    public static String kinsOfApples = "Los tipos de manzana son, %d y %d";

    /*Lo que voy hacer es crear un hashmap para hacer unas confirmaciones previas de manera más eficiente ya que realizaría un recorrido lineas, para los casos:
      1 - En el que el input tiene un unico tipo de manzanas. En ese caso el resultado devolvería 0 ya que no cumple con el requisito de que haya dos tipos de manzanas
      2 - En el que el input tiene dos tipos de manzanas. En ese caso el resultado devolvería la longitud del input ya que cumple con el requisito de que haya dos tipos de manzanas
      3 - En el caso de que el input todos los indices son tipos de manzanas únicas, es decir no hoy dos tipos de manzanas iguales.
          En este caso el tramo más largo será cuelquier grupo de dos, por ejemplo los dos primeros indices servirían para el tramo más largo.

      Una vez contemplado estos dos casos base realizaría la busqueda del tramo más largo en el array original convertido previamente a un ArrayList. Esta conversión de tipo
      me ayudará a recorrer el array por tramos, comenzaré con el primer índice y buscare la siguiente ocurrencia del mismo tipo de manzana, recorreré este tramo, en el caso de que
      encuentre más de dos tipos de manzanas pararé el tramo y comenzaré un nuevo tramo con el índice donde encontre el tercer tipo que fue el motivo de mi parada de busqueda.
      Comienzo con el nuevo tramo, si recorro todo el tramo significará que cumple con el requisito pero si el tramo no esta al final del array tengo que seguir buscando iniciando de neuvo
      un nuevo tramo con el indice dode terminó mi tramo anterior, si el fin tramo anterior el al fin del array no tengo que buscar más y será este el tramo mas largo.
      En cambio si tengo que hacer esta busqueda cosntante tendré que almacenar de alguna manera los tramos que cumplen con los reqqusitos, no sé si almacenarlo o como hacerlo

    */
    public static int  pickApples(int[] appleOrchard){
        HashMap<Integer, Integer> kindOfApplesMap = new HashMap<>();
        ArrayList<Integer> kindOfApplesList = new ArrayList<>(appleOrchard.length);
        int currentLength = 0;
        int limitTypeApples = 1;
        int largestSecctionStretch = Integer.MIN_VALUE;

        for(int apple : appleOrchard){
            kindOfApplesMap.put(apple, kindOfApplesMap.getOrDefault(apple, 0) +1);
            kindOfApplesList.add(apple);
        }

        if(kindOfApplesMap.size() == 1) return 0;
        if(kindOfApplesMap.size() == 2) return kindOfApplesMap.size();
        if(kindOfApplesMap.size() == appleOrchard.length) return 2;

        while(currentLength < appleOrchard.length){
            int nextLength = kindOfApplesList.indexOf(currentLength);
            for(int i = currentLength; i < nextLength; i++){

            }
            currentLength = ;
        }
        
        return 0;
    }
}
