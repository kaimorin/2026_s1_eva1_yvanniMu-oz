package cl.duoc.YvanniMunoz.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    private String  nom_com,ape_com;
    private int edad;
    private long rut,id_pas;
    private String tipo_de_atencion,estado_soli;
    private int nivelprioridad;
    private Date fecha;
}   
