

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    /**
     * Основная программа
     * 
     * @param args
     */
    public static void main(String[] args) {

        iCalculable calculator = new Calculator(0,0);

        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        //ViewCalculator view = new ViewCalculator(calculator);
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}
