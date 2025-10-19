public class Getters_Setters {
    static class Pen {
        private String color;
        private String tip;

        String getcolor() {
            return this.color;
        }
        String gettip(){
            return this.tip;
        }

        void setcolor(String newcolor){
            this.color = newcolor;
        }
        void settip(int newtip){
            this.tip = tip;
        }
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
    }
}
