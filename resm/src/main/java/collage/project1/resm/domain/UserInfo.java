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

@Entity @Table(name = "usersInfo") @Data @NoArgsConstructor @AllArgsConstructor
public class UserInfo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long userInfoId;
    String phoneNumber;
    String firstName;
    String lastName;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "addressID" , nullable = false)
    private Address address;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "userID" , nullable = false)
    private User user;
}