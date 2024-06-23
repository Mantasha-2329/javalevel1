import java.util.Scanner;
 class converter
{
    public static void main(String[]abc){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperatre");
        float d=sc.nextFloat();
        float fahrenheit=((d*9)/5)+32;
        System.out.println("Tempereture in Fahrenheits:"+fahrenheit);
    

    }
}