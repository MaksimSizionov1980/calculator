
public class Calculator {
    private int number1;
    private int number2;
    private int sum1;
    private int sum2;


    public Calculator(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
    }
    public int add(){
        sum1 = number1 + number2;
        return sum1;
    }
    public int sub(){
        sum1 = number1 - number2;
        return sum1;
    }
    public int mult(){
        sum1 = number1 * number2;
        return sum1;
    }
    public int div(){
        sum1 = number1 / number2;
        return sum1;
    }

    public int action(char ch1) {
        switch (ch1) {
            case '+':
                sum2 = add();
                return sum2;
            case '-':
                sum2 = sub();
                return sum2;
            case '*':
                sum2 = mult();
                return sum2;
            case '/':
                sum2 = div();
                return sum2;
        }
        return sum2;
    }

}
