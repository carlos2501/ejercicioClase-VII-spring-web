package org.cplcursos.ejercicioclaseviispringweb.mapeadores;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.EmpleadoDTOLista;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class EmpleadoMapper {

    public EmpleadoDTOLista toDTO(ResultSet rs, int rowNum) throws SQLException {
        EmpleadoDTOLista empleDTO = new EmpleadoDTOLista();
        empleDTO.setCodigoEmpleado(rs.getInt("codigo_empleado"));
        empleDTO.setNombre(rs.getString("nombre"));
        empleDTO.setApellido1(rs.getString("apellido1"));
        empleDTO.setApellido2(rs.getString("apellido2"));
        empleDTO.setEmail(rs.getString("email"));
        empleDTO.setPuesto(rs.getString("puesto"));
        // necesitamos obtener la ciudad de su oficina
        empleDTO.setCiudadOficina(rs.getString("ciudad_oficina"));
        return empleDTO;

    }
}
