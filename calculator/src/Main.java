import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean breakPoint = true;
        while (true) {
            System.out.println("Введите два числа и арифметическую операцию для выполненния: ");
            String values = scanner.nextLine();

            if (checkCountValuesFromStr(values) > 2 | checkCountValuesFromStr(values) == 1 | checkCountValuesFromStr(values) == 0) {
                System.err.println("Необходимо ввести ДВА числа!");
            } else if (checkCountOperation(values) > 1 | checkCountOperation(values) == 0) {
                System.err.println("Необходимо ввести ОДИН математический оператор ('/,', '*', '+', '-')!");
            } else if (BigDecimal.ZERO.compareTo(BigDecimal.valueOf(0)) == 0 & getOperationFromStr(values).equals("/")) {
                System.err.println("Нельзя делить на ноль!");
            } else
                {
                System.out.println("Результат вычисления = " + calculateResult(getValuesFromStr(values), getOperationFromStr(values)));
                breakPoint = false;
                break;
            }
        }
    }

    public static int checkCountValuesFromStr(String values) {
        int count=0;
        String strWithoutSpace = values.replace(" " ,"");
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(strWithoutSpace);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int checkCountOperation(String values) {
        int count=0;
        String strWithoutSpace = values.replace(" " ,"");

        Pattern p = Pattern.compile("[+-/*]");
        Matcher m = p.matcher(strWithoutSpace);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static BigDecimal[] getValuesFromStr (String values) {

            BigDecimal[] mas = new BigDecimal[values.length()];
            String strWithoutSpace = values.replace(" " ,"");
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(strWithoutSpace);
            for (int i = 0; m.find(); i++) {
                    mas[i] = BigDecimal.valueOf(Double.parseDouble(m.group()));
                }
        return mas;
    }

    public static String getOperationFromStr (String str) {
        String strWithoutSpace1 = str.replace(" " ,"");
        String masOperators = "";
        Pattern p = Pattern.compile("[+-/*]");
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