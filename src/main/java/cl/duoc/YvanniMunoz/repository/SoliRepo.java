package cl.duoc.YvanniMunoz.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cl.duoc.YvanniMunoz.model.Solicitud;

@Repository

public class SoliRepo {
    private ArrayList<Solicitud> listaSolicitudes= new ArrayList<>();

    public ArrayList<Solicitud> obtenerlistaSoli(){
        return listaSolicitudes;
    }
    public Solicitud encontrar_por_id(long id ){
        try {
            for(Solicitud sol: listaSolicitudes){
                if(sol.getId_pas()==id){
                    return sol;
                }
            
            }
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return null;

    }
    public Solicitud agregarSolicitud(Solicitud soli){
        if(soli!=null){
            listaSolicitudes.add(soli);
            return soli;
        }else{
            return null;
        }
        

    }
    public Solicitud editSolicitud(long id,String estado,int prio,String atencion){
        Solicitud abc = encontrar_por_id(id);
        if (abc!=null){
            abc.setEstado_soli(estado);
            abc.setNivelprioridad(prio);
            abc.setTipo_de_atencion(atencion);
            return abc;
        }else{
            return null;
        }
    }
    public Solicitud editDatospaciente(long id, String nom, String ape, int edad){
        Solicitud defg = encontrar_por_id(id);
        if (defg!=null){
            defg.setApe_com(ape);
            defg.setNom_com(nom);
            defg.setEdad(edad);
            return defg;


        }else{
            System.out.println("Solicitud no encontrado");
            return null;
        }


    }
    public String eliminar(long id){
        Solicitud ali =encontrar_por_id(id);
        if (ali!= null){
            listaSolicitudes.remove(ali);
            return "Solicitud eliminada con exito";
        }else{
            return "Solicitud no existente";
        }
    }


}
