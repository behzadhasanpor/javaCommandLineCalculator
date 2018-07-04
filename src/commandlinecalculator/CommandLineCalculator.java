/*
--------------------------------------------------------------------------------------


*main calculator moderator class*


---------------------------------------------------------------------------------------
*/
package commandlinecalculator;

import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        while(true){
            System.out.print(" KBase -> ");
            Scanner input=new Scanner(System.in);
            try{
            String inp=input.nextLine().trim();
                if("exit".equals(inp) || "end".equals(inp)){System.out.println("Bye!");break;}
                System.out.println(new calculator(inp).solvePattern());
            }
            catch(Exception exp){
                throw exp;
//                System.out.println("Please check the command out and try again!");
            }
        }
    }
    
}
/*
--------------------------------------------------------------------------------------
MIT licence@KBase -> https://github.com/behzadhasanpor
---------------------------------------------------------------------------------------
*/

