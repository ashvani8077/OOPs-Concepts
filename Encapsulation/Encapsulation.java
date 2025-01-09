package Encapsulation;

class A{
    private int value;
    void setValue(int x){
        value=x;
    }
    public int getValue(){
        return value;
    }
}

class B{
    public static void main(String[] args) {
        A r=new A();
        // r.value=100;
        // System.out.println(r.value);
        r.setValue(5);
        System.out.println(r.getValue());
    }
}
