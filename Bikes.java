package AbstractExx;
abstract class motorbike{
    public abstract void brake();
        }
class Mountainbike extends motorbike{
    public void brake(){
        System.out.println("These are mountain brakes");
    }
}
class Sportsbike extends motorbike{
    @Override
    public void brake() {
        System.out.println("These are motor brakes");

    }
}
public class Bikes {
    public static void main(String[] args) {
        Mountainbike obj =new Mountainbike();
        obj.brake();
        Sportsbike obj1 = new Sportsbike();
        obj1.brake();
    }
}
