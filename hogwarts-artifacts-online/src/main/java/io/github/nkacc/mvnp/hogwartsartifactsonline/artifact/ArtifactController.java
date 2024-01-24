package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtifactController {

    private final ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

}