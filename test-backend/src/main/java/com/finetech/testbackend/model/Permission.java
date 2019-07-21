package com.finetech.testbackend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permission")
public class Permission  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "code", unique = true)
    private String code;
    @Version
    @Column(name = "version")
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
