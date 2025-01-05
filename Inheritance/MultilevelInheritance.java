// package Inheritance;

// class A{
//     int a,b,c;
//     void add(){
//         a=10;
//         b=34;
//         c=a+b;
//         System.out.println("sum:"+c);
//     }

//     void sub(){
//        a=200;
//        b=50;
//        c=a-b;
//        System.out.println("sub:"+c);
//     }
// }

// class B extends A{
//     void multi(){
//         a=10;
//         b=22;
//         c=1*b;
//         System.out.println("Mul:"+c);
//     }

//     void div(){
//         a=10000;
//         b=55;
//         c=a/b;
//         System.out.println("Div:"+c);
//     }
// }

// class C extends B{
//     void remainder(){
//         int a=55;
//         int b=20;
//         c=a%b;
//         System.out.println("Rem:"+c);
//     }
//     public static void main(String[] args) {
//         C c=new C();
//         c.add();
//         c.sub();
//         c.multi();
//         c.div();
//         c.remainder();
//     }
// }