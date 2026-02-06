abstract class Car {
    public abstract void drive();
    

    public void playMusic ()
    {
        System.out.println("Play music");
    }
}

class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}

public class Abstract
{
    public static void main(String[] args) {
        
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}