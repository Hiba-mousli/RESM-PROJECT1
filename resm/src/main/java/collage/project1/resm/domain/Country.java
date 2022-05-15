package collage.project1.resm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "countries") @Data @NoArgsConstructor @AllArgsConstructor
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long countryId;
    String name;
}
