package Fabrica;

public class ContratosFabrica extends Fabrica{
    @Override
    Fabrica.Car retrieveCar(String requestGrade) {
        if ("A".equals(requestGrade))
        {
         return  new CorolaCar("1","full","white");
        }else {
            return null;
        }
    }
}
