# Algoritmo Spring 2 - Piscina    
___

    Inicio algoritmo piscina
   
    Declarar método calcArea(int width, int large)
        Devuelve width * large
    Declarar método calcVolume(int area, int deep)
        Devuelve area * deep

    Declarar y asignar
    cons
        largePols : int := 300
        widthPoolA : int := 150
        widthPoolB : int := 80
        deepPoolA : int := 20
        deepPoolB : int := 35
    fcons

    Declarar y asignar
    var
        resultAreaPools : String := "El area total de la piscina A es  y de la piscina B es "
        resultVolumePools : String := "El volumen total de la piscina A es %d y de la piscina B es "
        resultValuesBothPools : String := "El ancho de las piscinas juntas es %d y el largo es "
        resultAreaBothPools : String := "El valor del area de las dos piscinas juntas es "
        resultVolumeBothPools : String := "El valor del volumen de las dos piscinas juntas es "
        resultValuesChangedPools : String := "Los nuevo valores son: Piscina A tiene un ancho , largo   y volumen   
        y la piscina B tiene un ancho, largo y volumen"

        areaPoolA : int := calcArea 
        areaPoolB : int := calcArea
        volumePoolA : int := calVolume
        volumePoolB : int := calcVolume
        widthBothPools : int := widthPoolA + widthPoolB
        areaBothPools : int := calcArea
        volumeBothPools : int := volumePoolA + volumePoolB
        volumeChangedPoolA : int := calcVolume
        volumeChangedPoolB : int := calcVolume  
    fvar  

    Mostrar en terminal  
        resultAreaPools 
        resultVolumePools
        resultValuesBothPools
        resultAreaBothPools
        resultVolumeBothPools
        resultValuesChangedPools

    Fin algoritmo piscina