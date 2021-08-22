
import java. util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        try{
            String st1 = new String();
            String st2 = new String();
            String[] operation = {"+", "-", "*", "/"};
            String[] rim = {"I", "II", "III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
            int ind = 0;
            int sumAll = 0;
            boolean arab1 = false;
            boolean arab2 = false;

            System.out.println("Введите уравнение: ");

            Scanner scanner = new Scanner(System.in);
            String stroke = scanner.nextLine();

            for(int a = 0; a < operation.length; a++){
                ind = stroke.indexOf(operation[a]);
                if (ind >= 1) {
                    st1 = stroke.substring(0,ind).trim();
                    st2 = stroke.substring(ind + 1).trim();
                    break;
                }
            }
            for (int a =0; a < 10; a++){
                if(st1.equals(rim[a])) {
                    arab1 = true;
                    a += 1;
                    st1 = Integer.toString(a);
                    break;
                }

            }
            if (arab1 == true){
                for(int a =0; a <10; a++){
                    if(st2.equals(rim[a])){
                        a += 1;
                        st2 = Integer.toString(a);
                        arab2 = true;
                        break;
                    }
                }
            }
            if (arab1 == true && arab2 == false){
                throw new Exception("Числа должны быть одного формата!");
            }
            Integer num1 = Integer.valueOf(st1);
            Integer num2 = Integer.valueOf(st2);
            char ch = stroke.charAt(ind);

            if(num1 > 0 && num1 <=10 && num2 >0 && num2 <= 10){
                Calculator calculator = new Calculator(num1,num2);
                sumAll = calculator.action(ch);
                if(arab1 == true && arab2 == true){
                    Roman roman = new Roman();
                    System.out.println("Результат: " + roman.translation(sumAll));
                }else {
                    System.out.println("Результат: " + sumAll);
                }
        }else {
                throw new Exception("Числа не подходят в заданный диапазон! ");
            }
    }catch (Exception e){
            System.out.println(System.err.printf(e.getMessage()));
        }
    }
}
