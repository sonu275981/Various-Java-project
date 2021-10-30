import java.util.Scanner;
class mark
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
Double eng, hindi, chem, phy, math;
Double total, average, percentage;
System.out.println("enter mark of eng");
eng=ob.nextDouble();
System.out.println("enter mark of hindi");
hindi=ob.nextDouble();
System.out.println("enter mark of chem");
chem=ob.nextDouble();
System.out.println("enter mark of phy");
phy=ob.nextDouble();
System.out.println("enter mark of math");
math=ob.nextDouble();
total=eng+hindi+chem+phy+math;
System.out.println("total marks are"+total);
average=total/5.0;
System.out.println("total average is "+average);
percentage=(total/500)*100;
System.out.println("total percentage is "+percentage);
}
}


