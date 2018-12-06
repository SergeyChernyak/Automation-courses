import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа и арифметическую операцию для выполненния: ");
        String values = scanner.nextLine();
        System.out.println(calculateResult(getValuesFromStr(values), getOperationFromStr(values)));
    }

    public static BigDecimal[] getValuesFromStr (String values) {

            BigDecimal[] mas = new BigDecimal[values.length()];
            String strWithoutSpace = values.replace(" " ,"");

            //Pattern p = Pattern.compile("-?\\d+");
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(strWithoutSpace);

            for (int i = 0; m.find(); i++) {
                    mas[i] = BigDecimal.valueOf(Double.parseDouble(m.group()));
                }
//            if (mas.length>3) {
//                return
//            } else
        return mas;
    }

    public static String getOperationFromStr (String str) {
        String strWithoutSpace1 = str.replace(" " ,"");
        String masOperators = "";

        Pattern p = Pattern.compile("[+-/*]");
                //("(\\+|\\-|\\*|\\/|\\(|\\)|(\\d+\\.?\\d*))");
        Matcher m = p.matcher(strWithoutSpace1);
        for (; m.find(); ) {
            masOperators = m.group();
        }
        return masOperators;
    }

    public static BigDecimal calculateResult (BigDecimal[] values, String operation) {
        BigDecimal result = BigDecimal.valueOf(0);
            if (operation.equals("+")) {
                result =  values[0].add(values[1]);
            } else if (operation.equals("-")) {
                result = values[0].subtract(values[1]);
            } else if (operation.equals("*")) {
                result = values[0].multiply(values[1]);
            } else if (operation.equals("/"))
            {
            result = values[0].divide(values[1]);
            }
        return result;
    }

}


