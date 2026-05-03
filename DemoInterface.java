interface Circle
{
    float PI=3.14f;// publi9c static final
}
class DemoInterface
{

    public static void main (String a[])
    {
        System.out.println(Circle.PI);
        Circle.PI=7.12f;   // error due to final


    }
}