package org.cplcursos.ejercicioclaseviispringweb.controladores;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.EmpleadoDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.servicios.JardineriaSrvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/empleados")
public class EmpleadoCtrl {

    private final JardineriaSrvc jardineriaSrvc;

    public EmpleadoCtrl(JardineriaSrvc jardineriaSrvc) {
        this.jardineriaSrvc = jardineriaSrvc;
    }

    @GetMapping({"", "/"})
    public String mostrarEmpleadosPorOficina(Model modelo) {
        List<EmpleadoDTOLista> listaEmpleados = jardineriaSrvc.listarEmpleados();
        // Procesamos la lista de empleados para rellenar el Map
        // Convertimos cada EmpleadoDTO... de la lista a un Map<> Siendo la clave el nombre de la propiedad
        // (tipo String) y su valor el valor de dicha propiedad para el EmpleadoDTO... tratado; como no sabemos la clase
        // de esa propiedad, utilizamos un objeto genérico de la clase Object
        List<Map<String, Object>> datosTabla =listaEmpleados.stream()






        List<String> cabeceras = List.of("Código", "Nombre", "Apellidos", "Correo", "Ciudad", "Puesto");
        listaEmpleados.get(1);
        modelo.addAttribute("cabeceras", cabeceras);
        modelo.addAttribute("filas", listaEmpleados);

        // Procesamos la lista de empleados para rellenar el Map
        /*Map<String, List<EmpleadoDTOLista>> mapEmpleados = listaEmpleados.stream()
                .collect(Collectors.groupingBy(EmpleadoDTOLista::getCiudadOficina)
                );*/

        return "vistaLista";
    }

    public void mostrarVentasPorEmpleado() {

    }

    private void imprimirEmpleado(EmpleadoDTOLista empleado) {
        System.out.printf("  - %s %s %s (%s) - %s%n",
                empleado.getNombre(),
                empleado.getApellido1(),
                empleado.getApellido2() != null ? empleado.getApellido2() : "",
                empleado.getPuesto(),
                empleado.getEmail());
    }

}
