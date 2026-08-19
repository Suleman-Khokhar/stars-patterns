public class Stars_pattern_image_Challeng {
    public static void main(String[] args){
        System.out.println(" Pattern #1");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #2");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #3");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #4");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();        
    }
    System.out.println("Pattern #5");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        for(int l=1;l<=i-1;l++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #6");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        for(int l=i;l<=4;l++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Patrern #7");
    for(int i=1;i<=4;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        for(int l=1;l<i;l++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        for(int l=i;l<=4;l++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #8");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=i;j<5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #9");
    for(int i=1;i<=4;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #10");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #11");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("pattern #12");
    for(int i=1;i<5;i++){
        for(int j=i;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #13");
    for(int i=1;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #14");
    for(int i=1;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #15");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(j==1 || i==j || i==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("Pattern #16");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            if(k==1 || k==i || i==5){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("Pattern #17");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=6-i;j++){
            if(j==1 || i==1 || i+j==6){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
        System.out.println();
    }
    System.out.println("Pattern #18");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=6-i;k++){
            if(i==1 || k==1 || k==6-i){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }    
    System.out.println("Pattern #19");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=6-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            if(k==1 || i==5){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
        for(int l=2;l<=i;l++){
            if(l==i || i==5)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
       System.out.println("Pattern #20");
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=6-i;k++){
            if(k==1 || i==1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        for(int l=2;l<=6-i;l++){
            if(i==1 || l==6-i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("Pattern #21");
       for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        } 
        for(int k=1;k<=i;k++){
            if(k==1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int l=2;l<=i;l++){
            if(l==i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
       for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=6-i;k++){
            if(k==1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int l=1;l<=5-i;l++){
            if(l==5-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();       
       }
       System.out.println("Pattern #22");
       for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++)
       {
        if(j==1 || j==i)
        System.out.print("*");
        else
        System.out.print(" ");
       }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=6-i;j++){
            if(j==1 || j==6-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #23");
    for(int i=1;i<=4;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            if(k==1 || k==i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=6-i;k++){
            if(k==1 || k==6-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #24");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=5;k++){
            if(i==1 || i==5 || k==1 || k==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #25");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=5;k++){
            if(i==1 || i==5 || k==1 || k==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #26");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=i;k<=4;k++){
            System.out.print(" ");
        }
        for(int l=i;l<=4;l++){
            System.out.print(" ");
        }
        for(int h=1;h<=i;h++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print("*");
        }
        for(int k=2;k<=i;k++){
            System.out.print(" ");
        }
        for(int l=2;l<=i;l++){
            System.out.print(" ");
        }
        for(int h=i;h<=5;h++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #27");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print("*");
        }
        for(int k=2;k<=i;k++){
            System.out.print(" ");
        }
        for(int l=2;l<=i;l++){
            System.out.print(" ");
        }
        for(int h=i;h<=5;h++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=i;k<=4;k++){
            System.out.print(" ");
        }
        for(int h=i;h<=4;h++){
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #28");
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            if(k==1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int l=2;l<=i;l++){
            if(l==i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
         for(int k=1;k<=6-i;k++){
            if(k==1)
            System.out.print("*");
            else
            System.out.print(" ");
         }
         for(int l=1;l<=5-i;l++){
            if(l==5-i)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
    }
    System.out.println("Pattern #29");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=6-i;k++){
            if(i==1 || k==1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int l=1;l<=6-i;l++){
            if(i==1 || l==6-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            if(k==1 || i==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int l=2;l<=i;l++){
            if(l==i || i==5)
          System.out.print("*");
          else
          System.out.print(" ");  
        }
        System.out.println();
    }
    System.out.println("Pattern #30");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Pattern #31");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==1 || i==5 || j==1 || j==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #32");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==j || i+j==5+1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #33");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==5 || j==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(int k=1;k<=4;k++){
            if(i==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            if(j==5)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #34");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=3;j++){
            if(i==1 || j==1 || j==3)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=3;j++){
            if(i==1 || i==5 || j==1 || j==3)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Pattern #35");
    for(int i=1;i<=5;i++){
           for(int j=1;j<=3;j++){
            if(i%2==1){
            System.out.print(" * ");
                      }else{
                        if(j==1){
                            System.out.print(" ");
                        }else{
                            System.out.print(" * ");
                        }
                      }
            }
        
        System.out.println();
    }
    }
}