import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();
        boolean isBissexile;

        switch(year%100){
            case 0:
                if(year%400 == 0){
                    isBissexile = true;
                    break;
                }
                else{
                    isBissexile = false;
                    break;
                }
            default:
                if(year%4 == 0){
                    isBissexile = true;
                }
                else{
                    isBissexile = false;
                }
        }
        String bissextile = (isBissexile)? "Bissextile":"not Bissextile";
        System.out.println("the Year " + year + " is "+ bissextile);

    }
}