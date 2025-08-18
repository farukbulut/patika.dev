package bulut.com.week3.genericmethods;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Generics", "Ödev"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        User[] users = {
                new User("Omer Bulut",  "omer@gmail.com"),
                new User("Abbas Demir",  "abbas@gmail.com"),
                new User("Ali Sert",  "ali@gmail.com")
        };

        Print<String[]> stringPrint = new Print<>();
        stringPrint.setContent(strArray);
        printArray(stringPrint.getContent());
        Print<Integer[]> intPrint = new Print<>();
        intPrint.setContent(intArray);
        printArray(intPrint.getContent());
        Print<User[]> userPrint = new Print<>();
        userPrint.setContent(users);
        printArray(userPrint.getContent());
    }

    public static <T> void printArray(T[] array){
        for (T element: array){
            System.out.println(element);
        }
    }
}
