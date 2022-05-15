package collage.project1.resm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "images") @Data @NoArgsConstructor @AllArgsConstructor
public class Image {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long imageId;
    String url;
    Date dateAdded;
    
}
