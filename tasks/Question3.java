public class Question3 {
    public static void main(String[] args){
        T t = new T();
        S r = new S();
        X x = (X)r;
        if( t instanceof S ) { System.out.print(1);}
        if( t instanceof X ) { System.out.print(2);}
        if( t == r ) { System.out.print( 3);}
        if( r == x ) { System.out.print(4);}
    }

}
interface X{}
class T implements X{}
interface Y extends X{}
class S extends T implements Y{}