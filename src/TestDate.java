public class TestDate {

    public static void main(String[] args) {
        Date d1 = new Date(21, 10, 15);
        Date d2 = new Date(10, 20, 25);

        String d1String = d1.toString();
        String d2String = d2.toString();

        System.out.println(d1String);
        System.out.println(d2String);
    }
}
