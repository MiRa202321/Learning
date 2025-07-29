import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int emp= sc.nextInt();
        String dept= sc.next();

        switch(emp){
            case 1 -> System.out.println("Rashi");
            case 2-> System.out.println("Mihir");
            case 3 -> {
                System.out.println("3rd Employee");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Mechanical" -> System.out.println("Mechanical Department");
                    default -> System.out.println("Inavlid department");
                }
            }
           default -> System.out.println("Invalid Id");
            }
        }
    }
