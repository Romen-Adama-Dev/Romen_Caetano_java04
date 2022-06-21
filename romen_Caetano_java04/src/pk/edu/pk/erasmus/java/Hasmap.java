package pk.edu.pk.erasmus.java;
import java.util.HashMap;
import java.util.Scanner;

public class Hasmap {
    public static void main(String[] args) {

        HashMap<String,Float> productsList = new HashMap<String,Float>();
        Scanner sc = new Scanner(System.in);
        int chooseOption = 0;
        float p;
        String code;

        while (chooseOption != 5) {
            System.out.println("Choose option:");
            System.out.println("1.- Enter Produc");
            System.out.println("2.- Modify price");
            System.out.println("3.- Show products");
            System.out.println("4.- Delete products");
            System.out.println("5.- Exit");
            chooseOption = sc.nextInt();

            switch (chooseOption) {
                case 1:
                    System.out.println("Enter product code:");
                    code = sc.next();
                    System.out.println("Enter product price:");
                    p = sc.nextFloat();
                    savePodruct(code, p, productsList);
                    break;
                case 2:
                    System.out.println("Product code to change price:");
                    code = sc.next();
                    modificaPrecio(code, productsList);
                    break;
                case 3:
                    mostrarProductos(productsList);
                    break;
                case 4:
                    System.out.println("Product code to delete:");
                    code = sc.next();
                    eliminaProducto(code, productsList);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong option, choose another");
            }

        }
    }

    private static void savePodruct(String codigo, float precio, HashMap<String, Float> listaProductos) {
    }

    private static void modificaPrecio(String codigo, HashMap<String, Float> listaProductos) {
    }

    private static void mostrarProductos(HashMap<String, Float> listaProductos) {
    }

    private static void eliminaProducto(String codigo, HashMap<String, Float> listaProductos) {
    }
}
