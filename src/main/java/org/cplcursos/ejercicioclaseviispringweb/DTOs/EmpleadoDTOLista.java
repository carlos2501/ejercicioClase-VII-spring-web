package org.cplcursos.ejercicioclaseviispringweb.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTOLista {
    private int codigoEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String ciudadOficina;
    private String puesto;
}
