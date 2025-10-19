public class Super_Keyword {
    public static void main(String[] args) {
        horse h = new horse();
    }
}
class jaanwar {
    jaanwar() {
        System.out.println("Animal");
    }
}
class horse extends jaanwar {
    horse() {
        super();
        System.out.println("Horse");
    }
}
