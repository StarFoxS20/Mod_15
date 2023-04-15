package Fabrica;

public class Demo
{
    public  static void main(String[] args) {
        Cliente cliente;
        cliente = new Cliente("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Car car = fabrica.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Fabrica getFabrica(Cliente cliente)
    {
        if (cliente.HasCompanyContract())
        {
            return new ContratosFabrica();
        }else {
            return new SemContrato();
        }

    }
}
