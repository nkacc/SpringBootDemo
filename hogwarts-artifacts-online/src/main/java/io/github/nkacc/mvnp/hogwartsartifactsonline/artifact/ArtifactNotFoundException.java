package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

public class ArtifactNotFoundException extends RuntimeException{

    public ArtifactNotFoundException(String artifactId) {
        super("Could not find Artifact with Id:"+artifactId+" :(");
    }

}
