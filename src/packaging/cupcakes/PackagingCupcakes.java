/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packaging.cupcakes;
import java.util.Scanner;
public class PackagingCupcakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int a;
        while(t>0)
        {
            int n=in.nextInt();
            a=n/2+1;
            System.out.println(a);
            
        }
        t--;
    }
    
}
