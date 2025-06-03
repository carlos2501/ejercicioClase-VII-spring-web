package org.cplcursos.ejercicioclaseviispringweb.controladores;

import org.cplcursos.ejercicioclaseviispringweb.DTOs.OficinaDTOLista;
import org.cplcursos.ejercicioclaseviispringweb.servicios.JardineriaSrvc;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class OficinaCtrl {

    private final JardineriaSrvc jardineriaSrvc;
    private final Scanner scanner = new Scanner(System.in);

    public OficinaCtrl(JardineriaSrvc jardineriaSrvc) {
        this.jardineriaSrvc = jardineriaSrvc;
    }

    public void mostrarListadoOficinas() {
        System.out.println("\n=== LISTADO DE OFICINAS ===");
        List<OficinaDTOLista> oficinas = jardineriaSrvc.listarOficinas();

        System.out.printf("%-15s %-20s %-30s %-15s%n",
                "CÓDIGO", "CIUDAD", "DIRECCIÓN", "TELÉFONO");
        System.out.println("-".repeat(80));

        for (OficinaDTOLista oficina : oficinas) {
            System.out.printf("%-15s %-20s %-30s %-15s%n",
                    oficina.getCodigoOficina(),
                    oficina.getCiudad(),
                    oficina.getLineaDireccion1(),
                    oficina.getTelefono());
        }

        esperarEnter();
    }

    private void esperarEnter() {
        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
    }
}
