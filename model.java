package sample;

public class model {

    public double calculate(double number1, double number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0;

                return number1 / number2;
            case "sqr":
                return number1 * number1;
            case "sqrt":
                return Math.sqrt(number1);
            case "log":
                return Math.log(number1);
        }

        System.out.println("Unknown operator - " + operator);
        return 0;
    }
}
