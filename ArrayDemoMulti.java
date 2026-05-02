class ArrayDemoMulti
{
    public static void main (String A[])
    {
        int arr[][]= new int [3][4];

        arr[0][0]=10;
        arr[0][3]=20;
        arr[1][1]=30;
        arr[1][2]=10;
        arr[2][0]=50;
        
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

    }
}