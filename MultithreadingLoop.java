class Demo extends Thread
        {
            public void run()
            {
                
                int i=0;
                for(i=1;i<=100;i++)
                {
                    System.out.println("inside main method"+Thread.currentThread().getName()+":"+i);

                }

            }
        }
class MultithreadingLoop
{
    public static void main(String A[])
    {
        System.out.println("main thread is reuunig");
       
       Demo dobj = new Demo();
       Demo dobj2= new Demo();

       dobj.setName("First");
        dobj2.setName("Second");

       


       dobj.start();
       dobj2.start();

       

       
    }
}