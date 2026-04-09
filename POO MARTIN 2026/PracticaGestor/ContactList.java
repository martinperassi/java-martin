public class ContactList {
    
    private Contacto [] contactList;
    private int size, next;
    
    //CONSTURCTOR
    ContactList(int n){
        this.size = n;
        this.contactList = new Contacto[size];
        this.next = 0;
    }

    //METODOS
    public void addContact(Contacto contacto){
        //verificacion en caso de que se llegue al maximo de almacenamiento
        if(!(this.next < this.size)){
            this.enlarge();
        }
        contactList[next] = contacto;
        next++;
    }

    public boolean removeContact(String contactName){
        boolean found = false;
        int count = 0;
        Contacto aux;

        while(!found && count < next){//el bucle se ejecutara siempre que found sea = false && cuenta sea menor que next, en caso de encontrar una sola vez coincidencia frenara el bucle.

            if(contactList[count] != null){
                aux = contactList[count];
                if(aux.getNombre().equals(contactName)){
                    found = true;
                }
                count++;
            }
        }

        //esta linea sirve para eliminar el elemento que encontramos, por que supongamos que coincide el nombre al aumentar el contador pasamos al siguiente elemento,
        //pero no queremos eliminarlo sino que queremos eliminar el anterior que es el que encontro coincidencia, por eso el count - 1.
        //para dejar un casillero vacio le asginamos el valor null.
        if(found){
            contactList[count - 1] = null;
        }
        return found;
    }

    public boolean searchContact(String contactName){
        boolean found = false;
        int count = 0;
        Contacto aux;

        while(!found && count < next){//esta linea dice que mientras found sea diferente de falso y count sea menor a next vamos a poder analizar cada casillero del vector
            if(contactList[count] != null){//si el vector contiene algo para analizar, se realiza todo el codigo, no nos sirve analizar o comparar casilleros vacios.
                aux = contactList[count];
                if(aux.getNombre().equals(contactName)){
                    found = true;
                }    
            }
            count++;//fuera del while ya que queremos seguir recorriendo el vector
        }
        return found;//cuando ya termino todo mostramos si el nombre que estamos buscando se encuentra o no.
    }

    public void listContacts(){
        Contacto aux;
        int count = 0;

        while(count < next){
            if(contactList[count] != null){
                aux = contactList[count];
                System.out.print("nombre: ");
                System.out.println(aux.getNombre());
                System.out.print("apellido: ");
                System.out.println(aux.getApellido());
                System.out.println("********************");
            }
            count++;
        }
    }


    //METODO QUE SIRVE PARA REDIMENSIONAR UN VECTOR
    //1.CREAR UN VECTOR AUXILIAR DE MAYOR TAMAÑO Y DEL MISMO TIPO.
    //2. ALMACENAR LOS ELEMENTOS DEL VECTOR ORIGINAL EN EL VECTOR AUXILIAR.
    //3. ASIGNAR LA REFERENCIA DEL VECTOR AUXILIAR Y AJUSTAR ATRIBUTOS 

    private void enlarge(){
        int count2 = 0;
        Contacto [] aux = new Contacto[size + 100];//PASO 1.
        for(int count1 = 0; count1 < size; count1++){//PASO 2.
            if(contactList[count1] != null){
                aux[count2] = contactList[count1];
                count2++;
            }
            this.contactList = aux;//PASO 3.
            this.next = count2;
            this.size = size + 100;
        }

    }

}
