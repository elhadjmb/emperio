package emperio;

public class codeGen {

    public static int count = 1;

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

    public static void main(String[] args) {
        System.out.println(codeGen.code('A', 3));
        System.out.println(codeGen.code('B', 3));
    }
}

