# Algoritmo Spring 2 - Piscina    
___

    Inicio algoritmo piscina
   
    Declarar y asignar  
        largePols := int 300
        widthPoolA := int 150
        widthPoolB := int 80
        deepPoolA := int 20
        deepPoolB := int 35
        resultAreaPools := String "El area total de la piscina A es %d y de la piscina B es %d"
        resultVolumePools := String "El volumen total de la piscina A es %d y de la piscina B es %d"
        resultValuesBothPools := String "El ancho de las piscinas juntas es %d y el largo es %d"
        resultAreaBothPools := String "El valor del area de las dos piscinas juntas es %d"
        resultVolumeBothPools := String "El valor del volumen de las dos piscinas juntas es %d"
        resultValuesChangedPools := String "Los nuevo valores son: Piscina A tiene un ancho %d , largo %d  y volumen %d  
         y la piscina B tiene un ancho %d, largo %d y volumen %d"      

    Declarar método calcArea(int width, int large)
        Devuelve cálculo de área
    Declarar método calcVolume(int area, int deep)
        Devuelve cálculo de volumen
    Declarar método changeDeep(int assingOf, int assingTo)
        Devuelve nueva asignación  

    Declarar y asignar  
        areaPoolA := calcArea 
        areaPoolB :=  calcArea
        volumePoolA := calVolume
        volumePoolB := calcVolume
        widthBothPools := widthPoolA + widthPoolB
        areaBothPools := calcArea
        volumeBothPools := volumePoolA + volumePoolB
        volumeChangedPoolA := calcVolume
        volumeChangedPoolB := calcVolume  

    Mostrar en terminal  
        TaskAreaPools 
        TaskVolumePools
        TaskValuesBothPools
        TaskAreaBothPools
        TaskVolumeBothPools
        TaskValuesChangedPools

    Fin algoritmo piscina