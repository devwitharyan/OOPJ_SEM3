import java.util.Scanner;

public class lab12prac2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age < 0){
                throw new CustomException("Age can not be negative");
            }else{
                System.out.println(age);
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());

        }
    }
}

class CustomException extends Exception {
    public CustomException(String message){
        super(message);
    }
}