public class Methodoveriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();

    }
}
class Animal {
    void eats(){
        System.out.println("eats Anything");
    }
}
class Deer{
    void eats(){
        System.out.println("eats grass");
    }
}