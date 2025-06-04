package org.cplcursos.ejercicioclaseviispringweb.controladores;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.OficinaDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.servicios.JardineriaSrvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/oficinas")
public class OficinaCtrl {

    private final JardineriaSrvc jardineriaSrvc;

    public OficinaCtrl(JardineriaSrvc jardineriaSrvc) {
        this.jardineriaSrvc = jardineriaSrvc;
    }

    @GetMapping({"", "/"})
    public String mostrarListaOficinas(Model modelo) {
        List<OficinaDTOLista> listaOfcinas = jardineriaSrvc.listarOficinas();
        List<String> cabeceras = List.of("Código", "Ciudad", "Dirección 1", "Dirección 2", "Teléfono");
        modelo.addAttribute("cabeceras", cabeceras);
        modelo.addAttribute("filas", listaOfcinas);
        return "vistaLista";
    }

    @GetMapping("/5")
    public String fichaOficina(Model modelo) {

        return null;
    }

}
