public class Inheritance {
    public static void main(String[] args) {
        machli shark = new machli();
        shark.eats();
    }

}
    class Jaanwar {
        String color ;

        void eat(){
            System.out.println("eats");
        }
        void sleep(){
            System.out.println("sleeps");
        }
    }
    class machli extends Animal {
        int fins;
        void swim(){
            System.out.println("swims");
        }
    }

