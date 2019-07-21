package com.finetech.testbackend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "role")
public class Role  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Enumerated(EnumType.STRING)
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "permission_role", joinColumns = {
            @JoinColumn(name = "role_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "permission_id", referencedColumnName = "id")})
    private List<Permission> permissions;

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

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
