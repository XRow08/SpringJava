package oneDdigitalInnovation;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazy eager = SingletonLazy.getInstancia();
        System.out.println(eager);
        eager = SingletonLazy.getInstancia();
        System.out.println(eager);

        SingletonLazy lazyHolder = SingletonLazy.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazy.getInstancia();
        System.out.println(lazyHolder);
    }
}
