class Question2 extends C {
    public static void main(String[] args){
        System.out.print("Q");
        new Question2();
    }
}

class R{
    public R(){
        System.out.print("R");
    }
}

class C extends R{
    public C() {
        System.out.print( "C");
    }
}