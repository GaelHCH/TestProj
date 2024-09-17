import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*equivTemp();*/
        /*goofyQuestions();*/
        /*int[] nums = {12,53,64,24,56,64,11,23,64,23};
        System.out.println("Average: " + getAverage(nums));*/
        /*waitUnitlNegative();*/
        /*System.out.println(doStuff(3));*/
        /*System.out.println("All Star: " + allStar("hello"));*/
        /*Student x = new Student();
        ShakesHands y = new Teacher();
        String parent = new String("klo");
        y.shakeHands(y);*/
        /*ArrayList<String> list = new ArrayList<>();*/
       /* Scanner sc = new Scanner(System.in);
        *//*double d = sc.nextDouble();
        int i = sc.nextInt();*//*
        String s = sc.nextLine();
        System.out.println("String: " + s);
        String s2 = sc.nextLine();
        System.out.println("String2: " + s2);*/
        double d = 645 * 4;
        System.out.println("Double: " + d);
        throw new ArithmeticException("lol");
        /*String str = null;
        int size;
        size = str.length();
        try {

        }
        catch (NullPointerException e) {

        }*/

        /*System.out.println(addTwoPositive(9,-2));*/
    }

    public static void equivTemp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature");
        float temperature = scan.nextFloat();
        System.out.println("C or F");
        /*String unit = scan.nextLine().toUpperCase();*/
        /*float c = scan.nextFloat();*/
        Scanner scan2 = new Scanner(System.in);
        String unit = scan2.nextLine().toUpperCase();
        float newTemp;
        float eqVar;
        if(unit.equals("C")){
            eqVar = (float) 9/5;
            newTemp = eqVar*temperature + 32;
            System.out.println(newTemp);
        }
        else if(unit.equals("F")){
            eqVar = 5/9;
            newTemp = eqVar*(temperature-32);
            System.out.println(newTemp);
        }

    }

    public static void goofyQuestions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a type of pet");
        String pet = scan.nextLine().toLowerCase();
        int dogsScratched = 0;
        int catsEaten = 0;
        String dogQuestion = "How many cats has it eaten this year?";
        String catQuestion = "Number of dogs scratched?";
        Scanner scan2 = new Scanner(System.in);
        if (pet.equals("dog")) {
            System.out.println(dogQuestion);
            catsEaten = scan2.nextInt();
        }
        else if (pet.equals("cat")) {
            System.out.println(catQuestion);
            dogsScratched = scan2.nextInt();
        }
        else if (pet.equals("cockatiel")) {
            System.out.println(dogQuestion);
            catsEaten = scan2.nextInt();
            System.out.println(catQuestion);
            dogsScratched = scan2.nextInt();
        }
        else {
            System.out.println("No further questions");
            System.exit(0);
        }
        System.out.println("Species: " + pet + "\n" + "Number of cats eaten: " + catsEaten + "\n" + "Number of dogs scratched: " + dogsScratched);

    }

    public static int getAverage(int[] nums) {
        int average = 0;
        for (int a = 0; a < nums.length; a++) {
            average+=nums[a];
        }
        average/=nums.length;
        return average;
    }

    public static void getLargest(int[] nums) {
        int largest = 0;
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] > largest) {
                largest = nums[a];
            }
        }
    }

    public static void waitUnitlNegative() {
        Scanner scan = new Scanner(System.in);
        /*ArrayList<Integer> positiveNums = new ArrayList<>();*/
        boolean noNegative = true;
        int positiveNumSum = 0;
        while (noNegative) {
            int newNum = scan.nextInt();
            if (newNum < 0) {
                noNegative = false;
            }
            else {
                positiveNumSum+=newNum;
            }
        }
        System.out.println(positiveNumSum);
    }

    public static int doStuff(int n) {
        if (n<1) return n;
        return 2*n + doStuff(n-1);
    }

    public int bunnyEars(int bunnies){
        if (bunnies < 1) {
            return 0;
        }
        else {
            return 2 + bunnyEars(bunnies-1);
        }
    }

    public static String allStar(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length()==1) {
            return str;
        }
        else {
            return str.substring(0,1) + "*" + allStar(str.substring(1,str.length()));
        }
    }

    public static int sum2DArray(int[][] array) {
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array[a].length; i++) {
                sum += array[a][i];
            }
        }
        return sum;
    }

    public static int addTwoPositive(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Non-positive integers sent!");
        }
        else {
            return a + b;
        }

    }
}