import java.util.Scanner;
class Parking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cap=5;
        int park[]=new int[cap];
        int count=0;
          
        while(true){
          System.out.println("1.Park car");
          System.out.println("2.Remove car\n");
          System.out.println("Enter the choice");
          int c=sc.nextInt();
          System.out.println();
        switch(c){
          case 1:
              if(c==cap){
                System.out.println("Parking Full,No Parking Available");
              }
              else{
                System.out.println("Enter last 4-digit number of your car: ");
                 int n=sc.nextInt();
                 park[count]=n;
                 count++;
               System.out.println("Your car is parked");
               System.out.println();
             }
             break;
       case 2:
           System.out.println("Enter last 4-digit number of your car: ");
             int a=sc.nextInt();
             boolean found=false;
               for(int i=0;i<count;i++){
                  if(park[i]==a){
                    found=true;
                 for(int j=i;j<count-1;j++){
                    park[j]=park[j+1];
                 }
                    count--;
                     System.out.println("Your car is removed");
                    System.out.println();
                   System.out.println("Available parking:"+(cap-count));
                break;
              }
              }
             if(!found){
                 System.out.println("Your car is not founded");
                  System.out.println();
                 }
              break;
       default:
           System.out.println("Invalid Choice");
         break;
     }
   }
}
}