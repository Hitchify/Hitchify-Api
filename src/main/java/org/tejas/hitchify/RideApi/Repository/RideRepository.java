package org.tejas.hitchify.RideApi.Repository;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.Query;
import org.tejas.hitchify.RideApi.Entities.RideData;
import org.tejas.hitchify.RideApi.Model.postRideRequest;
import org.tejas.hitchify.RideApi.Model.postRideResponse;

import java.util.List;


public interface RideRepository  {


    List<RideData> findAll();

    postRideResponse save(postRideRequest ride);

    postRideResponse findById(String id);

     List<postRideResponse> findByQueryParams(GeoJsonPoint startGeoPoint, GeoJsonPoint endGeoPoint);

//     @Query("{ $and: [ { startGeoPoint: { $geoWithin: { $centerSphere: [ [ ?0, ?1 ], ?2 ] } } }, { endGeoPoint: { $geoWithin: { $centerSphere: [ [ ?3, ?4 ], ?5 ] } } } ] }")
//    List<postRideResponse> findByQueryParams(double startLongitude, double startLatitude, double startRadius, double endLongitude, double endLatitude, double endRadius);
}
