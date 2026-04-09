package tp1.punto7;

public class Main {
    public static void main(String[]args){

        Uno a,b;
        Dos c,d;
        int n,m;

        a = new Uno();
        c = new Dos();
        b = c;
        d = c;
        m = d.g() + c.k() + a.f();
        //d = (Dos)a; //error de ejecucion
        n = m - d.k();

        System.out.println(m);
        System.out.println(n);
        System.out.println(d.m());

    }


}
