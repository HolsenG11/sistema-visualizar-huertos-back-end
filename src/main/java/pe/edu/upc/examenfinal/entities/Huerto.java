package pe.edu.upc.examenfinal.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Huerto")
public class Huerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fhzgIdHuerto;
    @Column(name = "fhzgNombre", nullable = false, length = 25)
    private String fhzgNombre;
    @Column(name = "fhzgTipo", nullable = false, length = 25)
    private String fhzgTipo;
    @Column(name = "fhzgFecha", length = 25)
    private LocalDate fhzgFecha;
    @Column(name = "fhzgExtension", length = 25)
    private Double fhzgExtension;

    @ManyToOne
    @JoinColumn(name = "id")
    private Users fhzgUser;

    public Huerto() {
    }

    public Huerto(int fhzgIdHuerto, String fhzgNombre, String fhzgTipo, LocalDate fhzgFecha, Double fhzgExtension, Users fhzgUser) {
        this.fhzgIdHuerto = fhzgIdHuerto;
        this.fhzgNombre = fhzgNombre;
        this.fhzgTipo = fhzgTipo;
        this.fhzgFecha = fhzgFecha;
        this.fhzgExtension = fhzgExtension;
        this.fhzgUser = fhzgUser;
    }

    public int getFhzgIdHuerto() {
        return fhzgIdHuerto;
    }

    public void setFhzgIdHuerto(int fhzgIdHuerto) {
        this.fhzgIdHuerto = fhzgIdHuerto;
    }

    public String getFhzgNombre() {
        return fhzgNombre;
    }

    public void setFhzgNombre(String fhzgNombre) {
        this.fhzgNombre = fhzgNombre;
    }

    public String getFhzgTipo() {
        return fhzgTipo;
    }

    public void setFhzgTipo(String fhzgTipo) {
        this.fhzgTipo = fhzgTipo;
    }

    public LocalDate getFhzgFecha() {
        return fhzgFecha;
    }

    public void setFhzgFecha(LocalDate fhzgFecha) {
        this.fhzgFecha = fhzgFecha;
    }

    public Double getFhzgExtension() {
        return fhzgExtension;
    }

    public void setFhzgExtension(Double fhzgExtension) {
        this.fhzgExtension = fhzgExtension;
    }

    public Users getFhzgUser() {
        return fhzgUser;
    }

    public void setFhzgUser(Users fhzgUser) {
        this.fhzgUser = fhzgUser;
    }
}
