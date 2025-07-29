package bulut.com.week2.validpasswordcheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Lütfen şifrenizi giriniz:");
            String password = scanner.nextLine();
            if (checkPassword(password)){
                System.out.println("Geçerli Şifre");
                break;
            }
        }

        scanner.close();
    }

    public static Boolean checkPassword(String password ){

        if (password.length() < 8){
            System.out.println("Parola 8 karakterden büyük olmalıdır");
            return false;
        }

        if (password.contains(" ")){
            System.out.println("Parola boşluk karakteri içermemelidir");
            return false;
        }

        String firstChar = password.substring(0,1);

        if (!firstChar.equals(password.substring(0,1).toUpperCase())){
            System.out.println("İlk karakter büyük olmalıdır");
            return false;
        }

        if (!password.endsWith("?")){
            System.out.println("Son karakter ? olmalıdır");
            return false;
        }

        return true;
    }
}