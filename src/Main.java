import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem();
userChooseFunction();
    }


    public static void functionSave(){
        print100150(); //1
        print200200(); //2
        printMultiplyDots506070(); //3
        takeUserInput(); //4
        userChooseMultiply(); //5
        printFunctionLine(); //6
    }
    public static void print100150(){
        AxisSystem axisSystem = new AxisSystem();
        String color= "blue";
        axisSystem.addSinglePoint(100,150, color );
    }
    public static void print200200(){
        AxisSystem axisSystem = new AxisSystem();
        String color= "green";
        axisSystem.addSinglePoint(-200,200, color );
    }
    public static void printMultiplyDots506070(){
        AxisSystem axisSystem = new AxisSystem();
        int[] dots={50,50,60,60,70,70};
        String color= "black";
axisSystem.addMultiplePoints(dots,color);

    }

    public static void takeUserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter X:");
        int x= scanner.nextInt();
        System.out.println("Enter Y:");
        int y= scanner.nextInt();
        String color= "black";
        AxisSystem axisSystem = new AxisSystem();
        axisSystem.addSinglePoint(x,y, color );

    }

    public static void userChooseMultiply(){
        AxisSystem axisSystem = new AxisSystem();
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        System.out.println("How Many dots you would like to paint?: ");
        int dotNumber= scanner.nextInt();
        System.out.println("Choose a color: ");
        String color= scanner.nextLine();
        int[] dotArgs= new int[dotNumber*2];
        for (int i = 0; i <dotArgs.length ; i++) {
            dotArgs[i] = random.nextInt(501)-250;
        }
        axisSystem.addMultiplePoints(dotArgs,color);



    }

    public static void printFunctionLine(){
        AxisSystem axisSystem = new AxisSystem();
        int x=0;
        int y=10;
        String color= "red";
        int[] lineArgs=new int[200];
        for (int i = 0; i <lineArgs.length ; i++) {
            lineArgs[i]=x++;
            i++;
            lineArgs[i]=y++;
        }
        axisSystem.addMultiplePoints(lineArgs,color);
    }

    public static void userChooseFunction(){
        AxisSystem axisSystem = new AxisSystem();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter mx: ");
        int mx = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int x = -250; x <= 250; x++) {
            int y =(mx*x) + n;
            if (y >= -250 && y <= 250) {
               axisSystem.addSinglePoint(x,y,"BLACK");
            }
        }
    }

}

