public class Blacklist {
    public static void main(String[] args) {
        Blacklist obj = new Blacklist();
        String[][] array = new String[][]{
                {"Name   ", "LastName", " Result"},
                {"Ivan   ", "  Ivanov", "     10"},
                {"Petro  ", "   Popov", "      9"},
                {"Andry  ", " Fedotov", "     10"},
                {"Antony ", "   Mamov", "      7"},
                {"Igor   ", "  Vlasov", "      8"}
        };
        obj.showArray(array);
        System.out.println();
        obj.showArrayOfResults(array);
        String maxMark = "10";

    }

    public void equalsResult(String maxMark, String [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][2].equals(maxMark)){
                    sout
                }

            }

        }
    }

    public void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showArrayOfResults(String[][] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
