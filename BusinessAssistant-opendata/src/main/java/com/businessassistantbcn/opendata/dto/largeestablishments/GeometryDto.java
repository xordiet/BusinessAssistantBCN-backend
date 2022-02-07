package com.businessassistantbcn.opendata.dto.largeestablishments;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component("LargeEstablishmentsGeometryDto")
@JsonIgnoreProperties({"type"})

public class GeometryDto {
    @JsonUnwrapped
    private List<Double> coordinates;

    private CoordinateDto coordinateDto;

    @JsonGetter("coordinates")
    public CoordinateDto getCoordinates() {

        coordinateDto = new CoordinateDto();
        if(coordinates.size()>1){
            coordinateDto.setX(coordinates.get(0));
            coordinateDto.setY(coordinates.get(1));
        }
        return coordinateDto;
    }

}