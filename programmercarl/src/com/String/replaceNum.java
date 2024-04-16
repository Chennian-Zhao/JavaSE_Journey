import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length()-1;i++){
            if(Character.isDigit(s.charAt(i))) {
                sb.append("number");
            }else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
        sc.close();
        
    }
}