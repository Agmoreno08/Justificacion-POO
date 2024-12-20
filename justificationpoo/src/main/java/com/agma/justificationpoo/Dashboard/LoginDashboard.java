 package com.agma.justificationpoo.Dashboard;

import java.util.*;

import org.openxava.annotations.*;
import org.openxava.jpa.*;

@View(members = 
        "estadisticas[" +
        "totalEstudiantes, totalProfesores; detalleEstudiantesPorClase" +
        "]"
)
public class LoginDashboard {
 
   
    @LargeDisplay(icon = "account")
    @Stereotype("LINK")
    public String getTotalEstudiantes() {
        Long totalEstudiantes = (Long) XPersistence.getManager()
                .createQuery("select count(*) from Student")
                .getSingleResult(); 
        return "<strong>Total de <a href='Student' style='text-decoration:none;'>Estudiantes</a>: </strong>" + totalEstudiantes;
    }

    
    @LargeDisplay(icon = "folder")
    @Stereotype("LINK")
    public String getTotalProfesores() {
        Long totalProfesores = (Long) XPersistence.getManager()
                .createQuery("select count(*) from Teacher")
                .getSingleResult();
        return "<strong>Total de <a href='Teacher' style='text-decoration:none;'>Profesores</a>: </strong>" + totalProfesores;
    }

    
    @Stereotype("HTML_TEXT")
    public String getDetalleEstudiantesPorClase() {
        List<Object[]> resultados = XPersistence.getManager()
                .createQuery("select s.classSchedule, count(s) from Student s group by s.classSchedule", Object[].class)
                .getResultList();

        StringBuilder tabla = new StringBuilder("<table style='width:100%;border-collapse:collapse;'>");
        tabla.append("<tr style='background-color:#f4f4f4;'><th style='text-align:left;padding:8px;'>Clase</th><th style='text-align:right;padding:8px;'>Total Estudiantes</th></tr>");

        for (Object[] fila : resultados) {
            String clase = (String) fila[0];
            Long totalEstudiantes = (Long) fila[1];
            tabla.append("<tr>")
                    .append("<td style='padding:8px;'>").append(clase != null ? clase : "Sin clase asignada").append("</td>")
                    .append("<td style='text-align:right;padding:8px;'>").append(totalEstudiantes).append("</td>")
                    .append("</tr>");
        }
        tabla.append("</table>");
        return tabla.toString();
    }
}
