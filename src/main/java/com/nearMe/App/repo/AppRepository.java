package com.nearMe.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nearMe.App.entities.LocationInfo;

@Repository
public interface AppRepository extends JpaRepository<LocationInfo, String> {

	@Query("from LocationInfo u where u.location=:location")
	public LocationInfo findByLocation(@Param("location") String location);
}
