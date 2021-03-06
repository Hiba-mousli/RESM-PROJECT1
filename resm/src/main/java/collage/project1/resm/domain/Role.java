package collage.project1.resm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name  = "permissions") @Data @NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long permissionId;
    private String permissionTitle;
}
