import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        if (n1.equals(n2))
            System.out.println("Same (Case-Sensitive)");
        else
            System.out.println("Different (Case-Sensitive)");

        if (n1.equalsIgnoreCase(n2))
            System.out.println("Same (Case-Insensitive)");
        else
            System.out.println("Different (Case-Insensitive)");
    }
}
