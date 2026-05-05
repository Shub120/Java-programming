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
class MUltithreadingLoopJoin
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("main thread is reuunig");
       
       Demo dobj = new Demo();
       Demo dobj2= new Demo();
       

       dobj.setName("First");
        dobj2.setName("Second");
        

       


       dobj.start();
       dobj2.start();

       dobj.join();
       dobj2.join();
       
       System.out.println("End of main thread ");
    
       
    }
}