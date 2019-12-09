package deloof.wouter.thymeleaf_basic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int studentennummer;
    private String voornaam, achternaam, specialistatie;
    private LocalDate geboortedatum;

    public Student() {
    }

    public int getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(int studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getSpecialistatie() {
        return specialistatie;
    }

    public void setSpecialistatie(String specialistatie) {
        this.specialistatie = specialistatie;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }
}
