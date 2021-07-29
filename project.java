import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        
        int x=name.length();
        boolean validity=true;
        
        for(int a=0;a<=x-1;a++)
        {
            char b=name.charAt(a);
            
            if(!(Character.isSpace(b) || Character.isLetter(b)))
            {
                validity=false;
                break;
            }
            else
            {
                validity=true;
            }
                    
        }
        if(validity==true)
        {
            System.out.println("Valid Name");
        }
        else if(validity==false)
        {
            System.out.println("Invalid Name");
        }
            
    }
    
}
