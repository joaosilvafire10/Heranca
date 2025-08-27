import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflexao {

    public static void listarAtributos(Object obj) {
        Class<?> classe = obj.getClass();

        while (classe != null  && classe != Object.class) {
            System.out.println("Atributos da classe: " + classe.getSimpleName());
            for (Field field : classe.getDeclaredFields()) {
                System.out.println("\t" + field.getName());
            }
            classe = classe.getSuperclass();
        }
    }

    public static void listarMetodos(Object obj) {
        Class<?> classe = obj.getClass();
        while (classe != null  && classe != Object.class) {
            System.out.println("Métodos da classe: " +classe.getSimpleName());
            for (Method method : classe.getDeclaredMethods()) {
                System.out.println("\t" + method.getName());
            }
            classe = classe.getSuperclass();
        }
    }
}
