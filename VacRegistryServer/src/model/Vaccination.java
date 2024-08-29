package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "vaccination")
public class Vaccination implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vacid;
    @Temporal(TemporalType.DATE)
    private Date vacdate;
    @Enumerated(EnumType.STRING)
    private VaccineBrand brand;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "citizen")
    private Citizen citizen;

    public Vaccination() {
    }

    public Vaccination(Date vacdate, VaccineBrand brand, Citizen citizen) {
        this.vacdate = vacdate;
        this.brand = brand;
        this.citizen = citizen;
    }

    public int getVacid() {
        return vacid;
    }

    public void setVacid(int vacid) {
        this.vacid = vacid;
    }

    public Date getVacdate() {
        return vacdate;
    }

    public void setVacdate(Date vacdate) {
        this.vacdate = vacdate;
    }

    public VaccineBrand getBrand() {
        return brand;
    }

    public void setBrand(VaccineBrand brand) {
        this.brand = brand;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

}
