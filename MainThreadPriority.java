class MainThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("inside main theread");
        Thread tobj=Thread.currentThread();
        String name =tobj.getName();

        System.out.println("Name of current Thread"+name);
        System.out.println("Priority of thread is:"+tobj.getPriority);
    }
}