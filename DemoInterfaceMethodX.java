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
  public float Area(float Radius)
   {return Circle.PI*Radius*Radius;
   }
  public float Circumference(float Radius)
   {return 2*Circle.PI*Radius;
   }
}
class DemoInterfaceMethodX
{

    public static void main (String a[])
    {
        Marvallous mobj= new Marvallous();
        float ret=0.0f;
        ret=mobj.Area(Radius:10.5f);
        System.out.println("Area:"+ret);
        
        pet=mobj.Circumference(Radius:10.5f);
        System.out.println("circumference"+pet);
    
        

    }
}