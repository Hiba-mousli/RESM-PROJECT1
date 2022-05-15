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

@Entity @Table(name = "tags") @Data @NoArgsConstructor @AllArgsConstructor
public class Tag {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long tagId;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "taggerUserinfoID" , nullable = false)
    private UserInfo taggerUserinfo;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "taggedUserinfoID" , nullable = false)
    private UserInfo taggedUserinfo;
}