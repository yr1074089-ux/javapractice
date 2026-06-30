
import java.rmi.registry.RegistryHandler;

public class personString {
    // public static void main(String[] args) {
    //     String obj="luckhnow";
    //     String obj2="LUCKHNOW";
    //     // System.out.println(obj.startsWith("L"));
    //     // System.out.println(obj.endsWith("w"));
    //     // System.out.println();
    //     if (obj.equalsIgnoreCase(obj2)){
    //         System.out.println("Valid");
    //     }else{
    //         System.out.println("Invalid");
    //     }
    // }
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("luckhnow");
        System.out.println(obj.reverse());
        System.out.println(obj.insert(2,"Rishabh"));
        System.out.println(obj.append("Rishabh"));
        System.out.println(obj.delete(2, 3));
    }
}
