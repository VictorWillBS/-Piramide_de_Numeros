import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor");
        int number = sc.nextInt();
        sc.close();
        System.out.println("--------------");
        int multiplier = 1;
        int increment = 0;
        for(int i = 1 ; i<= number; i++){
            System.out.println(i*multiplier);
            
            if(increment== 0 ){
                increment = 1;
            }
            increment = increment * 10;
            multiplier = multiplier + increment;
            // System.out.println(multiplier);
        
        }
    }
}
