import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String L = sc.next();
            boolean P = true;
            if(L.equals("0")){
                break;
            }
            for(int i = 0; i <L.length()/2; i++){
                if(L.charAt(i) != L.charAt(L.length() - 1 - i)) {
                    P = false;
                    break;
                }
            }
            System.out.println(P?"yes":"no");
        }
        sc.close();
    }
}