import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    /**
     * Конструктор для работы с калькулятором
     * 
     * @param calculator 
     */
    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    /**
     * Исполняемый метод
     */
    public void run() {
        while (true) {
            int primaryArgA = promptInt("Введите значение a1 для выражения a1 + b1*i для первого комплексного числа: ");
            int primaryArgB = promptInt("Введите значение b1 для выражения a1 + b1*i для первого комплексного числа: ");
           
            while (true) {
                String cmd = prompt("Введите команду (*, +, /) : ");
                if (cmd.equals("*")) {
                    int secondArgA = promptInt("Введите значение a2 для выражения a2 + b2*i для второго комплексного числа: ");
                    int secondArgB = promptInt("Введите значение b2 для выражения a2 + b2*i для второго комплексного числа: ");
                    calculator.multi(primaryArgA, primaryArgB, secondArgA, secondArgB);
                    break;
                }
                if (cmd.equals("+")) {
                    int secondArgA = promptInt("Введите значение a2 для выражения a2 + b2*i для второго комплексного числа: ");
                    int secondArgB = promptInt("Введите значение b2 для выражения a2 + b2*i для второго комплексного числа: ");
                    calculator.sum(primaryArgA, primaryArgB, secondArgA, secondArgB);
                    break;
                }
                if (cmd.equals("/")) {
                    int secondArgA = promptInt("Введите значение a2 для выражения a2 + b2*i для второго комплексного числа: ");
                    int secondArgB = promptInt("Введите значение b2 для выражения a2 + b2*i для второго комплексного числа: ");
                    calculator.div(primaryArgA, primaryArgB, secondArgA, secondArgB);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?").toUpperCase();
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
