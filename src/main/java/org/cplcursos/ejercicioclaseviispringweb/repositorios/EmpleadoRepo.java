package org.cplcursos.ejercicioclaseviispringweb.repositorios;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.EmpleadoDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.DTOs.VentasEmpleadoDTO;

import java.util.List;

public interface EmpleadoRepo {
    List<EmpleadoDTOLista> findAll();
    List<VentasEmpleadoDTO> findAllVentas();
}
