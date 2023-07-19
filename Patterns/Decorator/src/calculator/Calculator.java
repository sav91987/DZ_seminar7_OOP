

public final class Calculator implements iCalculable {

    private int re;
    private int im;

    /**
     * Конструктор
     * 
     * @param re - вещественная часть комплексного числа
     * @param im - мнимая часть комплексного числа
     */
    public Calculator(int re, int im) {
        this.re = re;
        this.im = im;
    }

    

    @Override
    public void sum(int firstArgA, int firstArgB, int secArgA, int secArgB) {
        re = firstArgA + secArgA;
        im = firstArgB + secArgB;
        printResult(re, im);
    }

    @Override
    public void multi(int firstArgA, int firstArgB, int secArgA, int secArgB) {
        re = firstArgA*secArgA - firstArgB*secArgB;
        im = firstArgA*secArgB + firstArgB*secArgA;
        printResult(re, im);     
    }

    @Override
    public void div(int firstArgA, int firstArgB, int secArgA, int secArgB) {
        float re = ((float)firstArgA*secArgA + firstArgB*secArgB) / (secArgA*secArgA + secArgB*secArgB);

        float im = ((float)secArgA*firstArgB - firstArgA*secArgB) / (secArgA*secArgA + secArgB*secArgB);
        printResultFloat(re, im);
    }

    
    /**
     * 
     * Метод для вывода на экран результатов операции div (работает с типом float)
     * 
     * @param re - вещественная часть комплексного числа
     * @param im - мнимая часть комплексного числа
     */
    public void printResultFloat(float re, float im) {
        if (im < 0){
            System.out.println(re +""+ im + "i");
        }
        else {
            if (re == 0 && im == 0) {
                System.out.println(0);
            }
            else {
                if (re==0) {
                    System.out.println(im + "i");
                }
                else System.out.println(re + "+" + im+"i");
            }
        }
    }

    /**
     * 
     * Метод для вывода на экран результатов операции (кроме div)
     * 
     * @param re - вещественная часть комплексного числа
     * @param im - мнимая часть комплексного числа
     */
    public void printResult(int re, int im) {

        if (im < 0){
            System.out.println(re +""+ im + "i");
        }
        else {
            if (re == 0 && im == 0) {
                System.out.println(0);
            }
            else {
                if (re==0) {
                    System.out.println(im + "i");
                }
                else System.out.println(re + "+" + im+"i");
            }
        }
    }
}
