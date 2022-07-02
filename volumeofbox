import java.util.Scanner;
class box{
    private double wed, hei, dep;
    box(double width, double height, double depth){
        wed=width;
        hei=height;
        dep=depth;
    }
    public double volume(){
        return wed*hei*dep;
    }
    public double area(){
        return wed*dep;
    }
}
public class volumeofbox {
    public static void main(String[] args) {
        double w, h, d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width of box:");
        w=sc.nextDouble();
        System.out.println("Enter the height of box:");
        h=sc.nextDouble();
        System.out.println("Enter the depth of box:");
        d=sc.nextDouble();
        box bx=new box(w, h, d);
        System.out.println("Volume of box is "+bx.volume());
        System.out.println("Area of box is"+bx.area());
    }
}
