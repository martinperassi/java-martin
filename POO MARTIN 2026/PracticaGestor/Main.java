import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        int opcion = 0;

        ContactList myContactList = new ContactList(50);
        do{
            System.out.println("selecciona una opcion:");
            System.out.println("--------------------------------");
            System.out.println("1.Agregar Contacto");
            System.out.println("--------------------------------");
            System.out.println("2.Eliminar Contacto:");
            System.out.println("--------------------------------");
            System.out.println("3.Buscar Contacto:");
            System.out.println("--------------------------------");
            System.out.println("4.Mostrar todos los contactos:");
            System.out.println("--------------------------------");
            System.out.println("0.Salir:");
            System.out.println("--------------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("OPCION: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:{
                System.out.print("nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("apellido: ");
                String apellido = scanner.nextLine();
                //System.out.println();
                Contacto contacto = new Contacto(nombre, apellido);
                myContactList.addContact(contacto);
                System.out.println("Contacto agendado :) ");
                System.out.println();
                break;
                }
                case 2:{
                System.out.print("Ingresa el nombre del contacto a eliminar(si no existe o lo escribiste mal se mostrara en pantalla false, en caso de estar en la lista de contactos saldra true y sera eliminado): ");
                String nombre = scanner.nextLine();
                System.out.println(myContactList.removeContact(nombre));
                break;
                }
                case 3:{
                    System.out.print("Ingresa el nombre del contacto a buscar(si no existe o lo escribiste mal se mostrara en pantalla false, en caso de estar en la lista de contactos saldra true): ");
                    String nombre = scanner.nextLine();
                    System.out.println(myContactList.searchContact(nombre));
                    break;
                }
                case 4:{
                    System.out.println("mostrando todos los contactos: ");
                    myContactList.listContacts();
                    break;
                }
                default:
                    System.out.println("ingresa un numero o caracter que vaya del 0 al 4.");
                    break;
            }
            scanner.close();
        }
        while(opcion!= 0);
    }
}

