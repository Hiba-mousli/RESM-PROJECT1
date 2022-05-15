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

@Entity @Table(name = "regions") @Data @NoArgsConstructor @AllArgsConstructor
public class Region {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long regionId;
    String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cityID", nullable = false)
    private City city;
}
