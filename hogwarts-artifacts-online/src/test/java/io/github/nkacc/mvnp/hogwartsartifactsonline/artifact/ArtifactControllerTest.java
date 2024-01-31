package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class ArtifactControllerTest {

    @MockBean
    ArtifactService artifactService;
    // @MockBean allows to add Mockito mocks in a Spring ApplicationContext.
    // So no need to insert mocks (@InjectMocks) to the objects(to test here).

    // Also, don't need to declare Controller here, we can use MockMvc (better).

    @Autowired
    MockMvc mockMvc;
    // Spring's MockMVC, start the in-memory servlet container
    // & check that the right controller methods are invoked
    // & then the right responses have been coming out.
    // Instead, of Just testing method's logic only.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findArtifactById() {
    }

}