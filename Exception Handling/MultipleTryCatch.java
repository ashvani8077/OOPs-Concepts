public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }


        try {
            int arr[]={10,20,30,40};
            System.out.println(arr[6]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
