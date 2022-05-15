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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "cities") @Data @NoArgsConstructor @AllArgsConstructor
public class City {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long cityId;
    String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "countryID" , nullable = false)
    private Country country;
}
