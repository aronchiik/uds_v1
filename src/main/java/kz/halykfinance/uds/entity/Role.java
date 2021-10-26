package kz.halykfinance.uds.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = "t_role")
public class Role implements GrantedAuthority {

//    @Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//@Column(name ="name", nullable = false)
    private String name;
//    @Transient
//    @ManyToMany(mappedBy = "roles")
    private Set<Clients> users;
    public Role() {
    }

    public Role(Long id, String name, Set<Clients> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

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

    public Set<Clients> getUsers() {
        return users;
    }

    public void setUsers(Set<Clients> users) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}
