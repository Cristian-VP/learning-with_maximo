# Sprint 7 - Listar multiplicaciones dado un número     

## Algoritmo multiplicaciones

implementar un programa para mostrar los múltiplos de un número. Se debe validar que esté en un rango de 1-20.
---

        Algoritmo multiplies
            Function Integer validator (Scanner input)
                Intentar
                    devolver Si  1 >= input <= 20 Entonces input Sino null 
                Capturar Excepción
                    limpiar scanner
                    MostrarMensajeDeError("Sólo acepta numeros entre 1-20")
                    devolver null
            Ffunction
            var
                scanner:scanner
                multiplyTimes:int=0
                limitNumber:Integer
            fvar
            Hacer
              Leer limitNumber = validator(scanner)
            Mientras
            Durante i:int=0, <= limitNumber, incrementar i 
                Escribir multiplyTimes *= i;
            FDurante
        Fin algoritmo multiplies