package co.edu.udea.gestor_de_proyectos.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tgl. Jhoan Villa.
 * Email: jhoan.villa
 * @version Id: <b>gestor-de-proyectos</b> 5/11/2024, 10:17 a. m.
 **/
@Data
@Document("usuario")
public class Usuario {
    @Id
    private String id;
    private String nombre;
}
