public class CitaMedica  {

    private String codigo;
    private String fecha;
    private String hora;
    private String motivo;
    private String estado;
    private String paciente;
    private String medico;

    // Constructor
    public CitaMedica(String codigo, String fecha, String hora, String motivo,String estado,
                      String paciente, String medico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
    }

    // Getter y Setter para fecha
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null && !fecha.trim().isEmpty()) {
            this.fecha = fecha;
        } else {
            System.out.println("La fecha no puede estar vacía.");
        }
    }

    // Getter y Setter para hora
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora != null && !hora.trim().isEmpty()) {
            this.hora = hora;
        } else {
            System.out.println("La hora no puede estar vacía.");
        }
        this.hora = hora;
    }

    // Getter y Setter para motivo
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        if (motivo != null && !motivo.trim().isEmpty()) {
            this.motivo = motivo;
        } else {
            System.out.println("El motivo no puede estar vacío.");
        }
    }

    // Getter y Setter para paciente
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        if (paciente != null && !paciente.trim().isEmpty()) {
            this.paciente = paciente;
        } else {
            System.out.println("El paciente no puede estar vacío.");
        }
    }

    // Getter y Setter para medico
    public String getMedico() {
        return medico;
    }
    
    public void setMedico(String medico) {
        if (medico != null && !medico.trim().isEmpty()) {
            this.medico = medico;
        } else {
            System.out.println("El médico no puede estar vacío.");
        }
    }

    // Getter y Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado;
        } else {
            System.out.println("El estado no puede estar vacío.");
        }
    }

         // Método 1
    public void confirmarCita() {
        if (estado.equals("Programada")) {
            estado = "Confirmada";
            System.out.println("La cita fue confirmada.");
        } else {
            System.out.println("La cita no puede ser confirmada.");
        }
    }

    // Método 2
    public void cancelarCita() {
        if (!estado.equals("Atendida")) {
            estado = "Cancelada";
            System.out.println("La cita fue cancelada.");
        } else {
            System.out.println("Una cita atendida no puede cancelarse.");
        }
    }

    // Método 3
    public void atenderCita() {
        if (estado.equals("Confirmada")) {
            estado = "Atendida";
            System.out.println("La cita fue atendida.");
        } else {
            System.out.println(
                "La cita debe estar confirmada para poder atenderla."
            );
        }
    }

    // Método adicional
    public void mostrarInformacion() {
        System.out.println("CITA MÉDICA");
        System.out.println("Código: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);
        System.out.println("Estado: " + estado);
        System.out.println("Paciente: " + paciente);
        System.out.println("Médico: " + medico);
        System.out.println("Especialidad: " + medico);
    }

    // toString
    @Override
    public String toString() {
        return "CitaMedica [" + "codigo: " + codigo + ", fecha: " + fecha + ", hora: " + hora + ", motivo: " + motivo +
        ", estado: " + estado + ", paciente: " + paciente + ", medico: " + medico + "estado: " + estado + "]";
            
    }
}
