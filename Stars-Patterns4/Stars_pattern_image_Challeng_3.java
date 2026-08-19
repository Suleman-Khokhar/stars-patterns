import javax.xml.transform.SourceLocator;

public class Stars_pattern_image_Challeng_3{
    public static void main(String[] args){
        /*
         * Number Pattern
         */
        System.out.println("Pattern #1");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #2");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Pattern #3");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #4");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #5");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #6");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #7");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #8");
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern #9");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern 10");
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #11");
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #12");
        for(int i=1;i<=5;i++){
              int num1=i;  
            for(int j=1;j<=i;j++){ 
            System.out.print(num1+" ");
          num1=num1+5;
            }
            System.out.println();
        }
        System.out.println("Pattern #13");
        for(int i=1;i<=5;i++){
            for(int k=i;k<=5;k++){
                System.out.print(" ");
            }
            int tem=1;
            for(int j=1;j<=i;j++){
                System.out.print(tem+" ");
                tem=tem*(i-j)/j;
            }
            System.out.println();
        }
        System.out.println("Pattern #14");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("Pattern #15");
        for(int i=1;i<=5;i++){
            for(int k=1;k<=6-i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("Pattern #16");
        for(int i=1;i<=4;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #17");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #18");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #19");
        for(int i=5;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #20");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            //int num3=1;
            for(int k=1;k<=i;k++){
                System.out.print(k);
              //  num3=num3*(i-k)/k;
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("Pattern #21");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j%2==1)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println("Pattern #22");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==i)
                System.out.print(i+" ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println("Pattern #23");
        for(int i=1;i<=5;i++){
            for(int j=2;j<=6-i;j++){
                System.out.print("1 ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #24");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j);
            }
             for(int k=5-1;k>=i;k--){
                 System.out.print(k);
             }
            System.out.println();
        }
        System.out.println("Pattern #25");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #26");
        for(int i=5;i>=1;i--){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            for(int k=i;k>=2;k--){
                System.out.print("5 ");
            }
            System.out.println();
        }
        System.out.println("Pattern #27");
        for(int i=1;i<=5;i++){
            int num4=i;
             int num5=4;
            for(int j=1;j<=i;j++){
                System.out.print(num4+" ");
                num4=num4+num5;
                num5--;
            }
            System.out.println();
        }
        System.out.println("Pattern #28");
        for(int i=1;i<=4;i++){
            int num6=i;
            for(int j=1;j<=i;j++){
                System.out.print(num6+" ");
                num6=num6+i;
            }
            System.out.println();
        }
        for(int i=5;i<=7;i++){
            int num7=i;
            for(int j=i;j<=7;j++){
                System.out.print(num7+" ");
                num7=num7+i;
            }
            System.out.println();
        }
        System.out.println("Pattern 29");
        System.out.println("Have to understand it");
        int rows=5;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + i - j + " ");
                } else
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + rows - 1 - i + " ");
                }
            }

         System.out.println();
        }
        System.out.println("Pattern #30");
         System.out.println("Have to understand it");
      for (int i = 0; i <rows; i++)
        {
            for (int j = 0; j <rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((rows * (j)) + i + 1 + " ");
                else
                    System.out.print((rows * (j + 1)) - i + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern 31");
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern #32");
        for(int i=1;i<=5;i++){
            int a=0,b=1;
            for(int j=1;j<=i;j++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
        System.out.println("Pattern 33");
        for(int i=5;i>=1;i--){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            for(int k=4;k>=i;k--){
            System.out.print(k+" ");
        }
        System.out.println();
        }
        for(int i=2;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
       System.out.println("Pattern #34");
       for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(j+" ");
        }
        for(int k=1;k<i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
       }
       System.out.println("Pattern #35");
       for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(j+" ");
        }
        for(int k=i-1;k>=1;k--){
            System.out.print(k+" ");
        }
        System.out.println();
       }
       System.out.println("Pattern #36");
       for(int i=1;i<=9;i+=2){
        for(int j=i;j<=9;j+=2){
            System.out.print(j+" ");
        }
        for(int k=1;k<i;k+=2){
            System.out.print(k+" ");
        }
        System.out.println();
       } 
       System.out.println("Pattern #37");
       for(int i=1;i<=9;i+=2){
        for(int j=i;j<=9;j+=2){
            System.out.print(j+" ");
        }
        for(int k=i-2;k>=1;k-=2){
            System.out.print(k+" ");
        }
        System.out.println();
       }
       System.out.println("Pattern #38");
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=i;k<=4;k++){
            System.out.print(" ");
        }
        for(int l=i;l<=4;l++){
            System.out.print(" ");
        }
        for(int m=i;m>=1;m--){
            System.out.print(m);
        }
        System.out.println();
       }
       System.out.println("Pattern #39");
        System.out.println("Have to understand it");
       int currentRow = 1;
       int counter = 1;
       for (int i=1; i<= rows; i++)
       {
           if (i % 2 == 0) 
           {
               int reverse = currentRow + counter - 1;
               for (int j = 0; j<i; j++)
               {
                   System.out.print(reverse--  +" ");
                   counter++;
               }
           }
           else
           {
               for (int j = 1; j<=i; j++)
               {
                   System.out.print(counter  +" ");
                   counter++;
               }
           }
           System.out.println();
           currentRow++;
       }
       System.out.println("Pattern #40");
       int counter1 =1,currentRow1 =1;
       for(int i=1;i<=5;i++){ 
        if(i%2==0){
            for(int j=1;j<=i;j++){
                System.out.print(counter1+" ");
                counter1++;
            }
        }
            else{
                int reverse=counter1+currentRow1-1;
                for(int k=1;k<=i;k++){
                    System.out.print(reverse--+" ");
                counter1++;
                }
                
            }
             System.out.println();
        currentRow1++;
        }
       System.out.println("Pattern #41");
       System.out.println("IT IS GREAT");
       for(int i=5;i>=1;i--){
        for(int j=5;j>=1+5-i;j--){
            System.out.print(j);
        }
        for(int k=3;k>=i;k--){
            System.out.print(" ");
        }
        for(int m=4;m>=i;m--){
            System.out.print(" ");
        }
        for(int l=1+5-i;l<=5;l++){
            if(l!=1)
            System.out.print(l);
        }
        System.out.println();
       }
       System.out.println("Pattern #42");
       for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=4;k>=i;k--){
            System.out.print(" ");
        }
        for(int l=3;l>=i;l--){
            System.out.print(" ");
        }
        for(int m=i;m>=1;m--){
            if(m!=5)
            System.out.print(m);
        }
        System.out.println();
       }
       System.out.println("Pattern #43");
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=i-1;k>=1;k--){
            System.out.print(k);
        }
        System.out.println();
       }
       for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=i-1;k>=1;k--){
            System.out.print(k);
        }
        System.out.println();
       }
       System.out.println("Pattern #44");
       System.out.println("How to understand it");
       for(int i=1;i<=5;i++){
         int num8=i;
        for(int j=1;j<=i;j++){
           
           System.out.print(num8);
           num8++; 
        }
        for(int k=2;k<=i;k++){
            num8=num8-2;
            System.out.print(k);
            num8--;
        }
        System.out.println();
       }
       for(int i=4;i>=1;i--){
        int num9=i;
        for(int j=i;j>=1;j--){
            System.out.print(num9);
             num9++;
        }
          num9=num9-2;
          for(int k=i-1;k>=1;k--){
              System.out.print(num9);   
              num9--;
         }
        System.out.println();
       }
       System.out.println("Pattern #45");
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
       }
       for(int i=6;i<=9;i++){
        for(int j=i;j<=9;j++){
            System.out.print(i);
        }
        System.out.println();
       }
       System.out.println("Pattern #46");
       for(int i=1;i<=5;i++){
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int k=2;k<=i;k++){
            System.out.print(k);
        }
        System.out.println();
       }
       for(int i=4;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int k=2;k<=i;k++){
            System.out.print(k);
        }
        System.out.println();
       }
       System.out.println("Pattern #47");
       for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        int num10=1;
        for(int k=1;k<=i;k++){
            System.out.print(num10);
            num10=num10+num10;
        }
        for(int l=i-1;l>=1;l--){
            System.out.print(l);
        }
        System.out.println();
       }
       System.out.println("Pattern #48");
       for(int i=5;i>=1;i--){
        for(int j=i;j<=5;j++){
            System.out.print(j);
        }
        System.out.println();
       }
       System.out.println("Pattern #49");
       System.out.println("Have to understand it");
//        int temp = 2;

//        for (int i = 1; i <= 5; i++)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                while (!isPrime(temp))
//                {
//                    temp++;
//                }
//                System.out.print(temp + " ");
//                temp++;
//            }
//            System.out.println();
//        }
//    }

// public static boolean isPrime(int num)
//    {
//        boolean flag = false;
//        for (int k = 2; k <= num / 2; k++)
//        {

//            if (num % k == 0)
//            {
//                flag = true;
//                break;
//            }
//        }
//        if (flag)
//            return false;
//            int temp = 2;

//            for (int i = 1; i <= 5; i++)
//            {
//                for (int j = 1; j <= i; j++)
//                {
//                    while (!isPrime(temp))
//                    {
//                        temp++;
//                    }
//                    System.out.print(temp + " ");
//                    temp++;
//                }
//                System.out.println();
//            }
//        }
   
//        public static boolean isPrime(int num)
//        {
//            boolean flag = false;
//            for (int k = 2; k <= num / 2; k++)
//            {
   
//                if (num % k == 0)
//                {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag)
//                return false;
//                return true;
System.out.println("Pattern #50");
System.out.println("0");
for(int i=5;i>=1;i--){
    for(int j=i;j<=5;j++){
        System.out.print(j);
    }
    System.out.print("0");
    for(int k=5;k>=i;k--){
        System.out.print(k);
    }
    System.out.println();
     }
     System.out.println("Pattern #51");
     int num11=1;
     for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num11+" ");
            num11++;
        }
        int num12=num11-2;
        for(int k=2;k<=i;k++){
            System.out.print(num12+" ");
            num12--;
        }
        System.out.println();
     }
     System.out.println("Pattern #52");
       int num13=1;
     for(int i=1;i<=5;i++){
        for(int j=i;j<=4;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(num13+" ");
            num13++;
        }
        int num14=num13-2;
        for( int l=2;l<=i;l++){
            System.out.print(num14+" ");
            num14--;
        }
        System.out.println();
     }
     System.out.println("Pattern #54");
     int num15=1;
     for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            if(num15==10){
                System.out.print("0 ");
            }else
            System.out.print(num15+" ");
            num15++;
        }
        int num16=num15-2;
        for(int k=2;k<=i;k++){
            System.out.print(num16+" ");
            num16--;
        }
        System.out.println();
     }
     int num17=1;
     for(int i=1;i<=1;i++){
        for(int j=1;j<=5;j++){
            System.out.print(num17+" ");
            num17++;
        }
        int num18=num17-2;
        for(int k=1;k<5;k++){
            System.out.print(num18+" ");
            num18--;
        }
        System.out.println();
     }
     System.out.println("Pattern #55");
     int counter2=1;
     int currentRows2=1;
     for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        if(i%2==0){  int reverse1=counter2+currentRows2-1;
            for(int l=1;l<=i;l++){
                System.out.print(reverse1+" ");
                reverse1--;
                counter2++;
           
            }
        }else{
          
                 for(int k=1;k<=i;k++){
                System.out.print(counter2+" ");
                counter2++;
            }

        }
        System.out.println();
        currentRows2++;
     }
     System.out.println("Pattern #58");
     for(int i=1;i<=5;i++){
        int a=0,b=1;
        System.out.print("1 ");
        for(int j=1;j<i;j++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
     }
   }
}
