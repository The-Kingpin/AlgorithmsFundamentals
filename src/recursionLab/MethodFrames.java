package recursionLab;

public class MethodFrames {
    public static void main(String[] args) {

        a();
    }

    public static void a(){
        System.out.print("(MethodFrames.a ");
        b();
        System.out.println(")");
    }

    public static void b(){
        System.out.print("(MethodFrames.b ");
        c();
        System.out.print(")");
    }

    public static void c(){
        System.out.print("(MethodFrames.c ");
        d();
        System.out.print(")");
    }

    public static void d(){
        System.out.print("(MethodFrames.d)");

    }

}
