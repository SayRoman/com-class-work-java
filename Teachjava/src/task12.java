import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Students the first class");
        int students_1class = s.nextInt();
        System.out.println("Students the first class, that weight <30 kg");
        int students_1class30kg_less = s.nextInt();
        System.out.println("How much student weight <30 kg come to school in %?");
        int student_in_percent = s.nextInt();
        int cake = 1;
        int glass = 200;
        int pack = 900;

        int cake1 = students_1class * cake;
        int cent  = (int )Math.ceil ((students_1class30kg_less * student_in_percent) / 100);
        int cake2 = (int) Math.ceil (cent * cake + cake1);
        int milk = glass * cent;
        int _pack = (int) Math.ceil (milk / pack);

        System.out.println("If in school " + student_in_percent + " % students that wight < 30 kg, need cakes: " + cake2 +  ", a pack of milk " + _pack);


    }
}

