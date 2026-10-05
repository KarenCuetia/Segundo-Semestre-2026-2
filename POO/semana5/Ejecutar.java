public class Ejecutar {

    public static void  main (String[] args) {

        // =========================
        // CREAR PACIENTES
        // =========================

        Paciente paciente1 = new Paciente("1001", "Juan Pérez", 25, "3001112233", "juan@gmail.com" );

        Paciente paciente2 = new Paciente("1002", "María López", 17, "3002223344", "maria@gmail.com" );
               
        Paciente paciente3 = new Paciente( "1003",  "Carlos Gómez",  40, "3003334455","carlos@gmail.com" );


        // =========================
        // CREAR MÉDICOS
        // =========================

        Medico medico1 = new Medico(
                "M001",
                "Ana Rodríguez",
                "Cardiología",
                "3105556677",
                "101"
        );

        Medico medico2 = new Medico(
                "M002",
                "Luis Martínez",
                "Medicina General",
                "3106667788",
                "202"
        );


        // =========================
        // MOSTRAR PACIENTES
        // =========================

        System.out.println("===== PACIENTES =====");

        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);


        // =========================
        // MOSTRAR MÉDICOS
        // =========================

        System.out.println("\n===== MÉDICOS =====");

        System.out.println(medico1);
        System.out.println(medico2);


        // =========================
        // CREAR CITAS
        // =========================

        CitaMedica cita1 = new CitaMedica(
                "C001",
                "10/10/2026",
                "09:00",
                "Dolor en el pecho",
                paciente1,
                medico1
        );

        CitaMedica cita2 = new CitaMedica(
                "C002",
                "11/10/2026",
                "10:00",
                "Consulta general",
                paciente2,
                medico2
        );

        CitaMedica cita3 = new CitaMedica(
                "C003",
                "12/10/2026",
                "14:00",
                "Control médico",
                paciente3,
                medico2
        );


        // =========================
        // MOSTRAR CITAS
        // =========================

        System.out.println("\n===== CITAS =====");

        cita1.mostrarInformacion();

        System.out.println();

        cita2.mostrarInformacion();

        System.out.println();

        cita3.mostrarInformacion();


        // =========================
        // CONFIRMAR CITA
        // =========================

        System.out.println("\n===== CONFIRMACIÓN =====");

        cita1.confirmarCita();


        // =========================
        // ATENDER CITA
        // =========================

        System.out.println("\n===== ATENCIÓN =====");

        cita1.atenderCita();


        // =========================
        // COMPROBAR EDAD
        // =========================

        System.out.println("\n===== VALIDACIÓN DE EDAD =====");

        if (paciente1.esMayorDeEdad()) {
            System.out.println(
                    paciente1.getNombre() +
                    " es mayor de edad."
            );
        } else {
            System.out.println(
                    paciente1.getNombre() +
                    " es menor de edad."
            );
        }


        // =========================
        // MODIFICAR DATOS
        // =========================

        System.out.println("\n===== MODIFICACIÓN =====");

        paciente1.actualizarTelefono("3009998877");

        medico2.cambiarConsultorio("305");


        // =========================
        // PRUEBAS DE VALIDACIÓN
        // =========================

        System.out.println("\n===== PRUEBAS DE VALIDACIÓN =====");

        paciente1.setEdad(-5);

        paciente1.setNombre("");

        cita2.setMotivo("");


        // =========================
        // CANCELAR CITA
        // =========================

        System.out.println("\n===== CANCELACIÓN =====");

        cita2.cancelarCita();

        System.out.println("\n===== ESTADO FINAL =====");

        System.out.println(cita1);
        System.out.println(cita2);
        System.out.println(cita3);
    }
}