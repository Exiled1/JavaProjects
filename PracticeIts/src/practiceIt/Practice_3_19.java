package practiceIt;

public class Practice_3_19 {
    public static void main(String[] args) {
        String string1 = "Frodo Baggins";
        String string2 = "Gandalf the GRAY";

        System.out.println(string1.length());

        System.out.println(string1.charAt(7));
        System.out.println(string2.charAt(0));
        System.out.println(string1.indexOf("o"));
        System.out.println(string2.toUpperCase());

        System.out.println(string1.toLowerCase().indexOf("B"));

        System.out.println(string1.substring(4));

        System.out.println(string2.substring(3, 14));
        System.out.println(string2.replace("a", "oo"));
        System.out.println(string2.replace("gray", "white"));
        System.out.println("str1".replace("r", "range"));
    }

}
