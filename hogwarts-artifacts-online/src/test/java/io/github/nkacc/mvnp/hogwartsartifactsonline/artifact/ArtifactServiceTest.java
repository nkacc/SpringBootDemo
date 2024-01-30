package io.github.nkacc.mvnp.hogwartsartifactsonline.artifact;

import io.github.nkacc.mvnp.hogwartsartifactsonline.wizard.Wizard;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArtifactServiceTest {

    @Mock // Mock this object, don't use real class.
    ArtifactRepository artifactRepository;

    @InjectMocks
    ArtifactService artifactService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByIdSuccess() {
        // Given: this section sets up the initial state of the system, including any required dependencies or data.
        /// Fake data
        /*  "data": {
                "id": "1250808601744904192",
                "name": "Invisibility Cloak",
                "description": "An invisibility cloak is used to make the wearer invisible.",
                "imageUrl": "ImageUrl",
                "owner": {
                  "id": 2,
                  "name": "Harry Potter",
                  "numberOfArtifacts": 2
                }
            } */
        Artifact fakeArtifact = new Artifact();
        fakeArtifact.setId("1250808601744904192");
        fakeArtifact.setName("Invisibility Cloak");
        fakeArtifact.setDescription("An invisibility cloak is used to make the wearer invisible.");
        fakeArtifact.setImageUrl("ImageUrl");

        Wizard fackWizard = new Wizard();
        fackWizard.setId(2);
        fackWizard.setName("Harry Potter");

        fakeArtifact.setOwner(fackWizard);

        /// Mock methods
        /* https://stackoverflow.com/questions/33546124/mockito-given-versus-when
        The problem is that current stubbing api with canonical role of `when` word does not integrate nicely with
        //given //when //then comments. It's because stubbing belongs to //given component of the test and not to
        the //when component of the test. Hence, BDDMockito class introduces an alias so that you stub method calls
        with BDDMockito.given(Object) method. Now it really nicely integrates with the given component of a BDD style test!
        But I use the `when` anyway, for understandability. */
        when(artifactRepository.findById(fakeArtifact.getId()))
                .thenReturn(Optional.of(fakeArtifact));

        // When: this section triggers the action or behavior that we want to test.
        /// Testing the required method, by calling it (while mocks injected).
        Artifact returnedArtifact = artifactService.findById(fakeArtifact.getId());

        // Then: this section asserts that the expected outcome has occurred.
        /// Asserting & Verifying, the output & behaviour of that method.
        assertEquals(returnedArtifact.getId(), fakeArtifact.getId());
        assertEquals(returnedArtifact.getName(), fakeArtifact.getName());
        assertEquals(returnedArtifact.getDescription(), fakeArtifact.getDescription());
        assertEquals(returnedArtifact.getImageUrl(), fakeArtifact.getImageUrl());
        //// Verify artifactRepository.findById() is called exactly once with "1250808601744904192".
        verify(artifactRepository, times(1))
                .findById(fakeArtifact.getId());

    }

    @Test
    void findByIdFailure() {
        // Given
        /// Fake not needed
        /// Mock
        when(artifactRepository.findById(any(String.class))).thenReturn(Optional.empty());

        // When & Then
        /// Call & Assert
        /* // exception assertion, standard style ...
           assertThatThrownBy(() -> { throw new Exception("boom!"); }).hasMessage("boom!");
           // ... or BDD style
           Throwable thrown = catchThrowable(() -> { throw new Exception("boom!"); });
           assertThat(thrown).hasMessageContaining("boom");
        I like `assertThatThrownBy` better */
        assertThatThrownBy(
                () -> artifactService.findById("1250808601744904192")
        ).isInstanceOf(ArtifactNotFoundException.class)
                .hasMessage("Could not find Artifact with Id:1250808601744904192 :(");
        /// Verify
        verify(artifactRepository, times(1))
                .findById("1250808601744904192");

    }

}