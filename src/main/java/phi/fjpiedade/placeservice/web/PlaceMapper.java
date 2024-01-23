package phi.fjpiedade.placeservice.web;

import phi.fjpiedade.placeservice.api.PlaceResponse;
import phi.fjpiedade.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place. slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
