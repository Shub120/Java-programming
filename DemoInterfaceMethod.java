interface Circle
{
  // characteristic this is publi9c static final
    float PI=3.14f;
   //behaavoiurs  all are by default public and abstract
   float Area(float Radius);
   float Circumference(float Radius);

}
class Marvallous implements Circle
{
//error due to missing body of are and comference 
}
class DemoInterfaceMethod
{

    public static void main (String a[])
    {
        Marvallous mobj= new Marvallous();
    
        

    }
}