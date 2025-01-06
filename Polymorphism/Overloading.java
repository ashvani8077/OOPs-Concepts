class A{
    void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    void add(int x, int y){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    void add(double x, double y){
        double a=10;
        double b=20;
        double c=a+b;
        System.out.println(c);
        System.out.println("Double");
    }
    public static void main(String[] args) {
        A a=new A();
        a.add();
        a.add(10, 5);
        a.add(40.0,50.0);
    }
}