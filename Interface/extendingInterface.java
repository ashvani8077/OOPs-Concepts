interface Gill{
    void add();
}

interface Raj extends Gill{
    void sub();
}

class Ankit implements Raj{
    
    @Override
    public void add(){
        System.out.println("Addition");
    }

    @Override
    public void sub(){
        System.out.println("Subtraction");
    }

    public static void main(String[] args) {
        Raj a=new Ankit();
        a.add();
        a.sub();
    }
}