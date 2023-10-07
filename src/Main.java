import java.util.*;
public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Listar contacto");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // consume newline

            if (option == 1) {
                addressBook.load();
                addressBook.list();
            } else if (option == 2) {
                addressBook.load();
                System.out.println("Introduce el número de teléfono: ");
                String number = scanner.nextLine();
                System.out.println("Introduce el nombre: ");
                String name = scanner.nextLine();
                addressBook.create(number, name);
                addressBook.save();
            } else if (option == 3) {
                addressBook.load();
                System.out.println("Introduce el número de teléfono a eliminar: ");
                String number = scanner.nextLine();
                System.out.println("Introduce el nombre: ");
                String name = scanner.nextLine();
                addressBook.delete(number, name);
                addressBook.save();
            } else if(option == 4){
                break;
            }


        }
    }

}
