package tp1;

public class Tres extends Dos{
    
    public int f(){
        return 80;
    }

    public int k(){
        return super.f() + 10;//dara error por que el metodo f() esta llamando a k() y k llama a f() y asi infinitamente.
    }

}
