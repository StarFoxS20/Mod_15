package Fabrica;

public abstract class Car {

    private int horsePower;
    private String fuelSouce;
    private String color;

    public Car(int horsePower,String fuelSouce,String color)
    {
        this.horsePower = horsePower;
        this.fuelSouce = fuelSouce;
        this.color = color;
    }

    public void  startEngine()
    {
        System.out.println("The"+ fuelSouce + "engine has been started and is ready to utilize"+ horsePower);
    }

    public void clean()
    {
        System.out.println("Car has been cleaned,and the"+color.toLowerCase() + "color shines");
    }

    public void mechanicCheck()
    {
        System.out.println("Car has been checked");
    }
    public void fuelCar()
    {
        System.out.println("Car has been filled with"+fuelSouce.toLowerCase());
    }
}
