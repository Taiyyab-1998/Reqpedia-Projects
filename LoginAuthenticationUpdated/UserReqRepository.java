package com.NewProject.RestWebServices.Restful_webServices;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReqRepository extends MongoRepository<UserReq, String> {

    // Case-insensitive email lookup
    @Query("{ 'email': { $regex: ?0, $options: 'i' } }")
    UserReq findByEmailIgnoreCase(String email);
}

