package phi.fjpiedade.placeservice.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record PlaceRequest(
        @NotNull
        @NotEmpty
        @NotBlank
        String name,
        // String slug,
        @NotNull
        @NotEmpty
        @NotBlank
        String state
        // LocalDateTime createdAt,
        // LocalDateTime updatedAt
        ) {

}
