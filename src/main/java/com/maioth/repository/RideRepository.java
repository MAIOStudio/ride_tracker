package com.maioth.repository;

import java.util.List;

import com.maioth.model.Ride;

public interface RideRepository {

	Ride createRide(Ride ride);
	
	List<Ride> getRides();
	
	Ride getRide(Integer id);

	Ride updateRide(Ride ride);

	void updateRide(List<Object[]> pairs);

	void deleteRide(Integer id);

}