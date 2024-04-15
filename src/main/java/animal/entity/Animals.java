package animal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animals {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id;
    private String name;

    public Animals(){

    }
    public Animals(String name) {
        this.name = name;
    }

    public Animals(Long id, String name) {
        this.id = id;
        this.name = name;
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


    @Override
    public String toString(){
        return name;
    }
}

