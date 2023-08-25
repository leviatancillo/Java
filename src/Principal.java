/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class Principal {
    public static void main(String[] args) {
        //CREAR CANCION
        Cancion cancion1 = new Cancion ();
        Cancion cancion2= new Cancion ("SUAVEMENTE", "MARC", 180, true, 'N');
        
        //MODIFICAR CANCION
        cancion1.setTitulo("Madafaca");
        cancion1.setArtista("bad bunny");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        
        System.out.println(cancion1.getTitulo()+"Se adelanto.."+ cancion1.adelantarCancion(15,30)+ "segundos");
    }
}
