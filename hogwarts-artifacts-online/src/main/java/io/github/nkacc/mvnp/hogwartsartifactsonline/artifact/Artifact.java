package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

import io.github.nkacc.mvnp.hogwartsartifactsonline.wizard.Wizard;

import java.io.Serializable;

public class Artifact implements Serializable {

    private String id;
    private String name;
    private String description;
    private String imageUrl;

    private Wizard owner;

    public Artifact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Wizard getOwner() {
        return owner;
    }

    public void setOwner(Wizard owner) {
        this.owner = owner;
    }

}