
public class Roman {


    private String[] rom2 = {"I", "II", "III", "IV", "V", "VI", "VII","VIII", "IX"};
    private String[] rom1 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX","XC"};
    private String[] araLl = {"1","2", "3","4", "5", "6", "7", "8", "9"};
    private String str2;
    private String str1;


   public String translation(int a){
       String string = Integer.toString(a);
       if (string.length() ==3){
           string = "C";
           return string;
       } else if (string.length() ==2){
           char ch = string.charAt(0);
           String one = String.valueOf(ch);
           String two = string.substring(1);
           b1(one);
           b2(two);
           string = str1 + str2;
           return string;
       }else{
           b2(string);
           string = str2;
           return string;
       }

   }
   public String b1(String c){
       for(int a = 0; a<=8; a++){
           if(c.equals(araLl[a])){
               this.str1 = rom1[a];
               return str1;
           }
       }return str1;

   }

    public String b2(String c){
        for(int j = 0; j <= 8; j++){
            if(c.equals(araLl[j])){
                this.str2 = rom2[j];
                return str2;
            };
        }str2 = "";
        return str2;
    }
}
