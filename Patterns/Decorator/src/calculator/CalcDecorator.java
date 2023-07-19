public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    /**
     * Конструктор Decorate
     * 
     * @param oldCalc - объект класса Calculator
     * @param logger - объект класса Logger. 
     */
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public void sum(int argA1, int argB1, int argA2, int argB2) {
        logger.log(String.format("Начало вызова метода sum с параметрами a1=%d, b1=%d, a2=%d, b2=%d", argA1, argB1, argA2, argB2));
        oldCalc.sum(argA1, argB1, argA2, argB2);
        logger.log(String.format("Вызов метода sum произошел успешно"));
    }

    @Override
    public void multi(int argA1, int argB1, int argA2, int argB2) {
        logger.log(String.format("Начало вызова метода multi с параметрами a1=%d, b1=%d, a2=%d, b2=%d", argA1, argB1, argA2, argB2));
        oldCalc.multi(argA1, argB1, argA2, argB2);
        logger.log(String.format("Вызов метода multi произошел успешно"));
    }

    @Override
    public void div(int argA1, int argB1, int argA2, int argB2) {
        logger.log(String.format("Начало вызова метода div с параметрами a1=%d, b1=%d, a2=%d, b2=%d", argA1, argB1, argA2, argB2));
        oldCalc.div(argA1, argB1, argA2, argB2);
        logger.log(String.format("Вызов метода div произошел успешно"));
    }
}
