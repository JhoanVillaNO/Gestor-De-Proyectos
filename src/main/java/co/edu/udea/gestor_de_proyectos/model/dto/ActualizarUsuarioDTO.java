package co.edu.udea.gestor_de_proyectos.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.villa
 * @version Id: <b>gestor-de-proyectos</b> 12/11/2024, 2:55 p. m.
 **/
@Data
public class ActualizarUsuarioDTO {

    private String nombre;
    private String apellidos;
    private int edad;
    private int estrato;
    private LocalDateTime fechaModificacion;
    private String ciudad;
    private String rol;
}
