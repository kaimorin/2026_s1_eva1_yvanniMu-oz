package cl.duoc.YvanniMunoz.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.YvanniMunoz.model.Solicitud;
import cl.duoc.YvanniMunoz.repository.SoliRepo;

@Service
public class SoliService {
    @Autowired
    private SoliRepo soliRepo;

    public ArrayList<Solicitud> getAllSolicituds(){
        return soliRepo.obtenerlistaSoli();
    }
    public Solicitud findbyId(long id){
        return soliRepo.encontrar_por_id(id);
    }
    public Solicitud addsoli(Solicitud soli){
        return soliRepo.agregarSolicitud(soli);
    }
    public Solicitud editSoli(long id,String estado,int prio,String atencion){
        return soliRepo.editSolicitud(id, estado, prio, atencion);
    }
    public Solicitud editpaciente(long id, String nom, String ape, int edad){
        return soliRepo.editDatospaciente(id, nom, ape, edad);
    }
    public String deletesoli(long id ){
        return soliRepo.eliminar(id);
    }

}
