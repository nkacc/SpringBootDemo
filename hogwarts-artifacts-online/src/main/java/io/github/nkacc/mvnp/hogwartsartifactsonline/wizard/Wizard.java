package io.github.nkacc.mvnp.hogwartsartifactsonline.wizard;

import io.github.nkacc.mvnp.hogwartsartifactsonline.artifact.Artifact;

import java.io.Serializable;
import java.util.List;

public class Wizard implements Serializable {

    private Integer id;
    private String name;

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
