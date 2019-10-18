package laboratorio2_guillermo_espinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Laboratorio2_Guillermo_Espinal {

    public static Scanner zelda = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        boolean usuario = false;
        System.out.println("1. Crear Universidades ");
        System.out.println("2. Eliminar Universidades ");
        System.out.println("3. Log In ");
        System.out.println("4. Ascender Universidad");
        System.out.println("5. Listar Universidades y su Sucursal ");
        System.out.println("6. Modificar Universidad");
        System.out.println("7. Descender Universidad");
        System.out.println("8. RANDOM");
        int resp = zelda.nextInt();
        while (usuario == false) {
            System.out.println("Primero debe de hacer log in");
            System.out.println("");
            System.out.println("1. Crear Universidades ");
            System.out.println("2. Eliminar Universidades ");
            System.out.println("3. Log In ");
            System.out.println("4. Ascender Universidad");
            System.out.println("5. Listar Universidades y su Sucursal ");
            System.out.println("6. Modificar Universidad");
            System.out.println("7. Descender Universidad");
            System.out.println("8. RANDOM");
            resp = zelda.nextInt();
            switch (resp) {
                case 1:

                //break;
                case 2:
                //break;
                case 3:
                    System.out.println("Ingrese el usuario: ");
                    zelda.nextLine();
                    String user = zelda.nextLine();
                    System.out.println("Ingrese la contraseña");
                    //zelda.nextLine();
                    String contra = zelda.nextLine();
                    if (user.equals("leobanegas") && contra.equals("99")) {
                        usuario = true;
                    }
                // break;
                case 4:
                //break;
                case 5:
                //break;
                case 6:
                // break;
                case 7:
                // break;
                case 8:
                // break;

            }
        }// fin del while de validacion de ususario
       
        //fin de validacion de usuario 
        while (resp!=0){
        System.out.println("0. Salir");
        System.out.println("1. Crear Universidades ");
        System.out.println("2. Eliminar Universidades ");
        System.out.println("3. Log In ");
        System.out.println("4. Ascender Universidad");
        System.out.println("5. Listar Universidades y su Sucursal ");
        System.out.println("6. Modificar Universidad");
        System.out.println("7. Descender Universidad");
        System.out.println("8. RANDOM");
        resp = zelda.nextInt();
        ArrayList<Universidad> unis = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyy");
        switch (resp) {
            case 1:
                System.out.println("Ingrese el nombre de la universidad:");
                zelda.nextLine();
                String nombre = zelda.nextLine();
                
                //sucursal con validacion
                System.out.println("Ingrese el nombre de la sucursal");
                //zelda.nextLine();
                String sucursal = zelda.nextLine();
                boolean validacionsuc = true;
                for (int i = 0; i < unis.size(); i++) {
                    if (unis.get(i).getSucursal().equals(sucursal)) {
                        validacionsuc = false;
                    }
                }
                while (validacionsuc == false) {
                    System.out.println("Ingrese el nombre de la sucursal");
                    zelda.nextLine();
                    sucursal = zelda.nextLine();
                    validacionsuc = true;
                    for (int i = 0; i < unis.size(); i++) {
                        if (unis.get(i).getSucursal().equals(sucursal)) {
                            validacionsuc = false;
                        }
                    }

                }
                //fin de la validacion

                // validacion de nivel
                System.out.println("Ingrese el nivel de la universidad ( 1.- publica/2.- privada): ");
                int nivel = zelda.nextInt();
                String nivel_s;
                boolean valiniv = true;
                if (nivel==1){
                  nivel_s = "publica";  
                }else{
                    nivel_s="privada";
                }
                /*while (valiniv == false) {
                    System.out.println("Ingrese el nivel de la universidad: ");
                    nivel = zelda.nextLine();
                   // valiniv = true;
                    if (nivel!="publica" || nivel!="privada") {
                        System.out.println("La universidad solo puede ser publica/privada");
                        valiniv = false;
                    }else
                        valiniv =true;
                }*/
                // final dela validacion de nivel

                System.out.println("Ingrese el nombre del rector:  ");
                zelda.nextLine();
                String rector = zelda.nextLine();

                System.out.println("Ingrese la fecha de creacion: (dia/fecha/año)");
                String fecha = zelda.nextLine();
                Date date = sf.parse(fecha);

                System.out.println("Ingrese la cantidad de maestros: ");
                int maestros = zelda.nextInt();

                System.out.println("Ingrese la cantidad de estudiantes: ");
                int estudiantes = zelda.nextInt();

                System.out.println("");

                //resto de validaciones
                int costo;
                if (nivel_s.equals("publica")) {
                    costo = 0;
                } else {
                    costo = 600;
                }

                // adicion de la universidad
                Universidad uni = new Universidad(nombre, sucursal, nivel_s, rector, date, maestros, estudiantes, costo);
                unis.add(uni);
                break;
            case 2:
                System.out.println("Ingrese el numero de la universidad que quiere eliminar: ");

                //falta validar
                for (int i = 0; i < unis.size(); i++) {
                    System.out.println("" + unis.indexOf(i) + " " + unis.get(i).getNombre());
                }
                int num = zelda.nextInt();
                unis.remove(num);
                break;
            case 3:
                System.out.println("Usuario ya ingresado");
                break;
            case 4:
                System.out.println("Ingrese el numero de la universidad que quiere ascender: ");
                for (int i = 0; i < unis.size(); i++) {
                    System.out.println("" + unis.indexOf(i) + " " + unis.get(i).getNombre());
                }
                int ascend = zelda.nextInt();

                //descenso de las universidades
                if (unis.get(ascend).getNivel().equals("publica")) {
                    unis.get(ascend).setNivel("publica prestigiosa");

                } else if (unis.get(ascend).getNivel().equals("privada")) {
                    unis.get(ascend).setNivel("privada prestigiosa");

                } else if (unis.get(ascend).getNivel().equals("publica prestigiosa")) {
                    //unis.get(ascend).setNivel("nacional");
                    boolean nacional=false;
                    int posnacional=0;
                    for (int i = 0; i < unis.size(); i++) {
                        if (unis.get(i).getNivel().equals("nacional")) {
                            nacional =true;
                            posnacional = unis.indexOf(i);
                        }
                    }
                    if(nacional==true){
                        unis.get(posnacional).setNivel("publica prestigiosa");
                        unis.get(ascend).setNivel("nacional");
                    }

                } else if (unis.get(ascend).getNivel().equals("privada prestigiosa")) {
                    System.out.println("Las privadas no pueden pasar a nacionales");

                } else if ((unis.get(ascend).getNivel().equals("nacional"))) {
                    System.out.println("Esta universidad ya es nacional");
                } else {
                    System.out.println("error");
                }
                break;
            case 5:
                for (int i = 0; i < unis.size(); i++) {
                    System.out.println("" + unis.indexOf(i) + "- " + unis.get(i).getNombre() + " " + unis.get(i).getSucursal());
                }
                break;
            case 6:
                System.out.println("Ingrese que universidad quiere moodificar:");
                for (int i = 0; i < unis.size(); i++) {
                    System.out.println("" + unis.indexOf(i) + " " + unis.get(i).getNombre());
                }
                int pos = zelda.nextInt();
                System.out.println("Ingrese que quiere modificar de esa universidad");
                System.out.println("1.- nombre");
                System.out.println("2.- sucursal");
                System.out.println("3.- nombre del rector");
                System.out.println("4.- fecha de creacion ");
                System.out.println("5- cantidad de maestros ");
                System.out.println("6.- cantidad de estudiantes");
                int modify = zelda.nextInt();
                switch (modify) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        zelda.nextLine();
                        String nuevonom = zelda.nextLine();
                        unis.get(pos).setNombre(nuevonom);
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva sucursal:");
                        zelda.nextLine();
                        String nuevasuc = zelda.nextLine();
                        unis.get(pos).setSucursal(nuevasuc);
                        validacionsuc = true;
                        
                        //segunda validacion de sucursales
                        for (int i = 0; i < unis.size(); i++) {
                            if (unis.get(i).getSucursal().equals(nuevasuc)) {
                                validacionsuc = false;
                            }
                        }
                        while (validacionsuc == false) {
                            System.out.println("Ingrese la nueva sucursal");
                            zelda.nextLine();
                            sucursal = zelda.nextLine();
                            validacionsuc = true;
                            for (int i = 0; i < unis.size(); i++) {
                                if (unis.get(i).getSucursal().equals(nuevasuc)) {
                                    validacionsuc = false;
                                }
                            }

                        }
                        // find de la validacion
                        
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo nombre del rector:");
                        zelda.nextLine();
                        String nuevorec =zelda.nextLine();
                        unis.get(pos).setRecnombre(nuevorec);
                        break;
                    case 4:
                        // checka aca
                        System.out.println("Ingrese la nueva fecha(dia/mes/año): ");
                        //System.out.println("Ingrese la fecha de creacion: (dia/fecha/año)");
                        fecha = zelda.nextLine();
                        date = sf.parse(fecha);
                         unis.get(pos).setCreacion(date);
                         //por cualquier cosa
                        break;
                    case 5:
                        System.out.println("Ingrese la nueva cantidad:");
                        int nuevosmaes =zelda.nextInt();
                        unis.get(pos).setNummaestro(nuevosmaes);
                        break;
                    case 6:
                         
                        System.out.println("Ingrese la nueva cantidad:");
                        int nuevosest =zelda.nextInt();
                        unis.get(pos).setNumestu(nuevosest);
                        break;

                }
                break;
            case 7:
                System.out.println("Ingrese que universidad quiere descender ");
                for (int i = 0; i < unis.size(); i++) {
                    System.out.println("" + unis.indexOf(i) + " " + unis.get(i).getNombre());
                }
                 int descend = zelda.nextInt();

                //descenso de las universidades
                if (unis.get(descend).getNivel().equals("publica")) {
                    unis.remove(descend);

                } else if (unis.get(descend).getNivel().equals("privada")) {
                    unis.remove(descend);

                } else if (unis.get(descend).getNivel().equals("publica prestigiosa")) {
                    unis.get(descend).setNivel("publica");

                } else if (unis.get(descend).getNivel().equals("privada prestigiosa")) {
                    unis.get(descend).setNivel("privada");

                } else if ((unis.get(descend).getNivel().equals("nacional"))) {
                    unis.get(descend).setNivel("publica prestigiosa");
                } else {
                    System.out.println("error");
                }
                
                break;
            case 8:
                
                break;
        }
    }
    }

}
