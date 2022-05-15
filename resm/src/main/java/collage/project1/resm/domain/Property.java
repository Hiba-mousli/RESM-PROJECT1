package collage.project1.resm.domain;

import java.util.Date;

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

@Entity @Table(name = "properties") @Data @NoArgsConstructor @AllArgsConstructor
public class Property {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long propertyId;
    String description;
    Integer numBathrooms;
    Integer numStoreys;
    Integer numRooms;
    Float space;
    Float price;
    Date dateAdded;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "userInfoID" , nullable = false)
    private UserInfo userInfo; 
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "propertyCategoryID" , nullable = false)
    private PropertyCategory propertyCategory;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "propertyStatusID" , nullable = false)
    private PropertyStatus propertyStatus;
}
