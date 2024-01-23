package phi.fjpiedade.placeservice.web;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import phi.fjpiedade.placeservice.api.PlaceRequest;
import phi.fjpiedade.placeservice.api.PlaceResponse;
import phi.fjpiedade.placeservice.domain.PlaceService;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/places")
public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @PostMapping
    public ResponseEntity<Mono<PlaceResponse>> create(@Valid @RequestBody PlaceRequest placeRequest) {
        var placeResponse = placeService.create(placeRequest).map(PlaceMapper::fromPlaceToResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
    }
    
    
}
