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

@Entity @Table(name = "notifications") @Data @NoArgsConstructor @AllArgsConstructor
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long notificationId;
    String description;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "notificationTypeID" , nullable = false)
    private NotificationType notificationType;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "userInfoID" , nullable = false)
    private UserInfo userInfo;
}