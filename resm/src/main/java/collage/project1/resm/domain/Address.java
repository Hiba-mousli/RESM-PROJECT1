package collage.project1.resm.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "addresses") @NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long addressId;
    String addressDescription;
    Float longitutde;
    Float lattitude;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "regionID", nullable = false)
    private Region region;
}
