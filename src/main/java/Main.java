public class Main {
    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = "World!";
        String name3 = "My";
        String name4 = "name";
        String name5 = "is";
        String name6 = "Anti";
        System.out.println(name1 + name2 + name3 + name4 + name5 + name6);
        System.out.println(name1+ "World!Mynameis" + name6);

        int a = 0;
        if (a < 0) {
            System.out.println("a on negatiivne");
        } else if (a == 0) {
            System.out.println("a on 0");
        } else if (a < 100) {
            System.out.println("a on väike positiivne arv");
        } else {
            System.out.println("a on suur positiivne arv");
        }


    }
}
