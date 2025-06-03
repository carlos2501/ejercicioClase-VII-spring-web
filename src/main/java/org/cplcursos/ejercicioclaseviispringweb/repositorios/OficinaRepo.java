package org.cplcursos.ejercicioclaseviispringweb.repositorios;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.OficinaDTOLista;

import java.util.List;

/**
 * Esta interfaz publica los métodos que se usarán
 */
public interface OficinaRepo {
    List<OficinaDTOLista> listaOficinas();
    String ciudadOficina(String codigoOficina);

}
