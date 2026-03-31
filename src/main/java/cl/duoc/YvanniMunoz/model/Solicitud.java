package cl.duoc.YvanniMunoz.model;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    @NotBlank(message = "El nombre o apellido no puede estar vacio")
    private String  nom_com,ape_com;
    @NotNull(message = "La edad no puede estar vacia ")
    private int edad;
    @NotNull(message = "El id o rut no puede ser nulo")
    private long rut,id_pas;
    @NotBlank(message = "El tipo de atencion y estado de solicitud no puede estar vacio")
    private String tipo_de_atencion,estado_soli;
    @NotNull(message = "El nivel de prioridad no puede estar vacio ")
    private int nivelprioridad;
    @NotNull(message = "La fecha de ingreso es obligatoria")
    private Date fecha_ingre;
}   
