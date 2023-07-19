

public interface iCalculable {
    /**
     * 
     * Метод для подсчета суммы комплексных чисел a1 + b1*i и a2 + b2*i
     * 
     * @param argA1 - значение a1 выражения a1 + b1*i
     * @param argB1 - значение b1 выражения a1 + b1*i
     * @param argA2 - значение a2 выражения a2 + b2*i
     * @param argB2 - значение b2 выражения a2 + b2*i
     */
    void sum(int argA1, int argB1, int argA2, int argB2);

    /**
     * 
     * Метод для подсчета произведения комплексных чисел a1 + b1*i и a2 + b2*i
     * 
     * @param argA1 - значение a1 выражения a1 + b1*i
     * @param argB1 - значение b1 выражения a1 + b1*i
     * @param argA2 - значение a2 выражения a2 + b2*i
     * @param argB2 - значение b2 выражения a2 + b2*i
     */
    void multi(int argA1, int argB1, int argA2, int argB2);

    /**
     * 
     * Метод для подсчета частного комплексных чисел a1 + b1*i и a2 + b2*i
     * 
     * @param argA1 - значение a1 выражения a1 + b1*i
     * @param argB1 - значение b1 выражения a1 + b1*i
     * @param argA2 - значение a2 выражения a2 + b2*i
     * @param argB2 - значение b2 выражения a2 + b2*i
     */
    void div(int argA1, int argB1, int argA2, int argB2); 
}
