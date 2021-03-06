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

@Entity @Table(name = "notificationsType") @Data @NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class NotificationType {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long notificationType;
    String type;
}
