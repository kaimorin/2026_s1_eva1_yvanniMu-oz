package cl.duoc.YvanniMunoz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.YvanniMunoz.model.Solicitud;
import cl.duoc.YvanniMunoz.service.SoliService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

;


@RestController
@RequestMapping("/api/v1/solicitud")
public class SoliController {
    @Autowired
    private SoliService soliService;

    
    @GetMapping
    public ArrayList<Solicitud> listarsolicitudes(){
        return soliService.getAllSolicituds();
        
    }
    @PostMapping
    public Solicitud Agregarsoli(@RequestBody Solicitud soli){
        return soliService.addsoli(soli);
    }
    



}
