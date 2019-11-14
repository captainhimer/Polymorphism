package LatihanPraktikum;
public class penceluk {
    public static void main(String[] args) {
        Line awok = new Line(5,10,10,50);
        System.out.println(awok.getLength());
        System.out.println(awok.isGreater(awok, awok));
        System.out.println(awok.isLess(awok, awok));
        System.out.println(awok.isEqual(awok, awok));
    }
}
