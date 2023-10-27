import SangSin.Pen;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("Black Pen", 38);

        pen.write();
        System.out.println();
        pen.knockPenCap();
        System.out.println();
        pen.write();
        System.out.println();
        pen.knockPenCap();
        System.out.println();
        pen.write();

    }
}