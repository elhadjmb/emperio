package emperio;

import javax.swing.table.DefaultTableModel;

public class codeGen {

    public static int count = 1;

    //code limit = 4
    public static String code(char department, int limit) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        limit -= 1;

        codeGen.count++;

        StringBuilder sb = new StringBuilder(limit);

        for (int i = 0; i < limit; i++) {

            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }

        String cod = department + sb.toString() + String.valueOf(codeGen.count);

        return cod;
    }

    public static void join(int table, char department) {
        int limit = 15; //nbr of rows in table

        // add empty column "the_code"

        // go through each row
        for (int i = 0; i < limit; i++) {
            int y = 0;
            // generate a code
            // assign code in the empty column of "the_code"
        }
    }

    public static void main(String[] args) {
    }
    

}

