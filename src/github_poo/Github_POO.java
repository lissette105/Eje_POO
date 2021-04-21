
package github_poo;
import java.util.*;
public class Github_POO {

    
    public static void main(String[] args) {
        System.out.println("Hola grupo de POO");
        Scanner a = new Scanner(System.in);
        System.out.println("Ingresa tu nombre completo");
        String nombre= a.nextLine();
        
        String[] iniciales= nombre.split(" ");
        System.out.println("Iniciales: ");
        for(int i=0; i<iniciales.length; i++){
            System.out.print(iniciales[i].charAt(0)+" ");
        }
    }
    
}
