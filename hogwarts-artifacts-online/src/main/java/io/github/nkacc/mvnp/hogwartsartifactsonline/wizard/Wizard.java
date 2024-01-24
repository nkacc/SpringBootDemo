package io.github.nkacc.mvnp.hogwartsartifactsonline.wizard;

import io.github.nkacc.mvnp.hogwartsartifactsonline.artifact.Artifact;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Wizard implements Serializable {

    @Id
    private Integer id;
    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "owner")
    // A bidirectional association via a foreign key
    private List<Artifact> artifacts;
    // multivalued_attribute for a derived attribute(numberOfArtifacts)

    public Wizard() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

}
