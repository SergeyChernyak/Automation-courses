import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Calculator {

        public int checkCountValuesFromStr(String values) {
            int count=0;
            String strWithoutSpace = values.replace(" " ,"");
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(strWithoutSpace);
            while (m.find()) {
                count++;
            }
            return count;
        }

        public int checkCountOperation(String values) {
            int count=0;
            String strWithoutSpace = values.replace(" " ,"");

            Pattern p = Pattern.compile("[+-/*]");
            Matcher m = p.matcher(strWithoutSpace);
            while (m.find()) {
                count++;
            }
            return count;
        }

        public BigDecimal[] getValuesFromStr (String values) {

            BigDecimal[] mas = new BigDecimal[values.length()];
            String strWithoutSpace = values.replace(" " ,"");
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(strWithoutSpace);
            for (int i = 0; m.find(); i++) {
                mas[i] = BigDecimal.valueOf(Double.parseDouble(m.group()));
            }
            return mas;
        }

        public String getOperationFromStr (String str) {
            String strWithoutSpace1 = str.replace(" " ,"");
            String masOperators = "";
            Pattern p = Pattern.compile("[+-/*]");
            Matcher m = p.matcher(strWithoutSpace1);
            for (; m.find(); ) {
                masOperators = m.group();
            }
            return masOperators;
        }

        public BigDecimal calculateResult (BigDecimal[] values, String operation) {
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