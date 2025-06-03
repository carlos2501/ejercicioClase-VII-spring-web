package org.cplcursos.ejercicioclaseviispringweb.repositorios;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.OficinaDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.mapeadores.OficinaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OficinaRepoImpl implements OficinaRepo {

    private final JdbcTemplate jdbcTemplate;
    private final OficinaMapper oficinaMapper;

    @Autowired
    public OficinaRepoImpl(JdbcTemplate jdbcTemplate, OficinaMapper oficinaMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.oficinaMapper = oficinaMapper;
    }

    @Override
    public List<OficinaDTOLista> listaOficinas() {
        String qry = """
            SELECT codigo_oficina, ciudad, linea_direccion1, 
                   linea_direccion2, telefono 
            FROM oficina
            ORDER BY codigo_oficina
            """;
        return jdbcTemplate.query(qry, oficinaMapper::toDTO);

    }

    @Override
    public String ciudadOficina(String codigoOficina) {
        String qry = """
                SELECT ciudad
                FROM oficina
                WHERE codigo_oficina = ?
                """;
        return jdbcTemplate.queryForObject(qry, String.class, codigoOficina);

    }
}
