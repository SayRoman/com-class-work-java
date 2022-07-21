public class task10 {
    public static void main(String[] args) {
        final int height = 170;
        final double weight = 55.5;

        double ideal = height - 110;

        System.out.println(ideal);

        if (weight == ideal) {
            System.out.println("Good");
        } else if (weight > ideal){
            System.out.println("Скинь вес: " + (weight - ideal));}
        else {
            System.out.println("Набери вес: " + ((weight - ideal) * -1));
        }
    }
}
