import  java.util.Scanner;
import java.util.Random;
public class Controlledwalkusing2persons {
    public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                int x1=0;
                int y1=0;
                int x2=0;
                int y2=0;
                System.out.print("Ali's location: ");
                System.out.println("(" + x1 + "," + y1 + ")");
                System.out.print("Hassan's location: ");
                System.out.println("(" + x2 + "," + y2 + ")");
                System.out.print("Enter the steps for Ali: ");
                int steps1=sc.nextInt();
                int [][] hurdles={{1,1},{2,3},{5,5},{1,8}};
                for(int i=1;i<=steps1;i++)
                {
                    System.out.print("\nEnter the direction for Ali: ");
                    int d = sc.nextInt();
                    if (d==0)
                    {
                        x1=x1+1;
                    }
                    else if (d==1)
                    {
                        x1=x1-1;
                    }
                    else if (d==2)
                    {
                        y1=y1+1;
                    }
                    else if (d==3)
                    {
                        y1=y1-1;
                    }
                    else
                    {
                        System.out.println("out of range direction");
                    } if(hurdles[0][0]==x1 && hurdles[0][1]==y1)
                {
                    System.out.print("There is hurdle,");
                    x1--;
                    System.out.println(" therefore Ali took one step back");
                }
                else if(hurdles[1][0]==x1 && hurdles[1][1]==y1)
                {
                    System.out.print("There is hurdle,");
                    y1--;
                    System.out.println(" therefore Ali took one step back");
                }
                else if (hurdles[2][0] == x1 && hurdles[2][1] == y1)
                {
                    System.out.print("There is hurdle,");
                    x1--;
                    System.out.println(" therefore Ali took one step back");
                }
                else if (hurdles[3][0] == x1 && hurdles[3][1] == y1)
                {
                    System.out.print("There is hurdle,");
                    y1--;
                    System.out.println(" therefore Ali took one step back");
                }
                    System.out.printf("Now the position of Ali is (%d,%d)", x1,y1);
                    Random rn = new Random();
                    int a = rn.nextInt(4);
                    System.out.print("\nRandom no: ");
                    System.out.println(a);
                    if (a==0)
                    {
                        x2=x2+1;
                    }
                    else if (a==1)
                    {
                        x2=x2-1;
                    }
                    else if (a==2)
                    {
                        y2=y2+1;
                    }
                    else if (a==3)
                    {
                        y2=y2-1;
                    }
                    if(hurdles[0][0]==x2 && hurdles[0][1]==y2)
                    {
                        System.out.print("There is hurdle,");
                        x2--;
                        System.out.println(" therefore Hassan took one step back");
                    }
                    else if(hurdles[1][0]==x2 && hurdles[1][1]==y2)
                    {
                        System.out.print("There is hurdle,");
                        y2--;
                        System.out.println(" therefore Hassan took one step back");
                    }
                    else if (hurdles[2][0] == x2 && hurdles[2][1] == y2)
                    {
                        System.out.print("There is hurdle,");
                        x2--;
                        System.out.println(" therefore Hassan took one step back");
                    }
                    else if (hurdles[3][0] == x2 && hurdles[3][1] == y2)
                    {
                        System.out.print("There is hurdle,");
                        y2--;
                        System.out.println(" therefore Hassan took one step back");
                    }

                    System.out.printf("Now the position of Hassan is (%d,%d)", x2, y2);
                }

                System.out.printf("\nThe final position of Ali is (%d,%d)", x1, y1);
                System.out.printf("\nThe final position of Hassan is (%d,%d)", x2, y2);
            }
    }

