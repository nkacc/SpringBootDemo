package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

import io.github.nkacc.mvnp.hogwartsartifactsonline.system.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtifactController {

    private final ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping("/api/v1/artifacts/{artifactId}")
    public Result getArtifactById(@PathVariable String artifactId){
        return null;
    }

}
