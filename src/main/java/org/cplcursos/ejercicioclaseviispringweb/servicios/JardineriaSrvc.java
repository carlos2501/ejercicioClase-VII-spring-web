package org.cplcursos.ejercicioclaseviispringweb.servicios;


import org.cplcursos.ejercicioclaseviispringweb.DTOs.EmpleadoDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.DTOs.OficinaDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.DTOs.VentasEmpleadoDTO;
import org.cplcursos.ejercicioclaseviispringweb.repositorios.EmpleadoRepo;
import org.cplcursos.ejercicioclaseviispringweb.repositorios.OficinaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JardineriaSrvc {

    private final OficinaRepo oficinaRepo;
    private final EmpleadoRepo empleadoRepo;

    public JardineriaSrvc(OficinaRepo oficinaRepo, EmpleadoRepo empleadoRepo) {
        this.oficinaRepo = oficinaRepo;
        this.empleadoRepo = empleadoRepo;
    }

    public List<EmpleadoDTOLista> listarEmpleados() {
        return empleadoRepo.findAll();
    }

    public List<OficinaDTOLista> listarOficinas() {
        return oficinaRepo.listaOficinas();
    }

    public List<VentasEmpleadoDTO> listarVentasEmpleados() {
        return empleadoRepo.findAllVentas();
    }
}
