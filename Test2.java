import java.util.Scanner;

class Test2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner scanner = new Scanner(System.in);
        
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            
            while (t>0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
      
                int totalCoins = x * y;
                int maxBags = totalCoins / 100;
                
            
                System.out.println(maxBags);
                T--;
            }
        }
        
        scanner.close();
    }
}
