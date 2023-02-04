
import java.util.*;
class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the SnakeAndLadders Game\nDo you want to play? -> Yes or No");
        String st = sc.nextLine();
        while(!st.equals("Yes")){
            System.out.println("Please enter Yes or No :");
            st = sc.nextLine();
            if(st.equals("No")){
                System.out.println("Ok thank you, Have a nice day.");
                return;
            }
        }
        System.out.println("Enter the Number of Players in team :");
        int numOfPlayers = Integer.parseInt(sc.nextLine());
        String[] arr = new String[numOfPlayers];
        System.out.print(arr.length);
        for(int i=0; i<numOfPlayers; i++){
            System.out.print("Enter Player name : ");
            String playerName = sc.nextLine();
            System.out.print("Enter "+playerName+" prioity number : ");
            int index = Integer.parseInt(sc.nextLine());
            arr[index-1]= playerName;
        }
        getAlphaNumericString(8));
        
    }
    static String getAlphaNumericString(int n){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }


}
