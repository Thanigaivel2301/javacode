import java.util.Scanner;
class busticket{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number of passengers: ");
         int a=sc.nextInt();
         int start[]=new int[a];
         int end[]=new int[a];
         int ticket[]=new int[a];
         
         int total=0;
        for(int i=0;i<a;i++){
           System.out.println("Passenger"+(i+1));
           System.out.print("Enter th boarding point: ");
             start[i]=sc.nextInt();
            System.out.print("Enter th ending point: ");
             end[i]=sc.nextInt();

           ticket[i]=Math.abs((start[i]-end[i])*5);
           Math.abs(total=total+ticket[i]);
        }
        System.out.println();
         System.out.println("Start  End  Price");
              for(int i=0;i<a;i++){
          System.out.println(start[i]+"\t"+end[i]+"\t"+ticket[i]);
             }
           System.out.println()
           System.out.println("Total amount collection is Rs."+total);  
}
}