package com.example.traintricketbookingapp.repository.mvc;

import com.example.traintricketbookingapp.beans.UserProfile;
import org.springframework.data.repository.CrudRepository;

/**
 * IUserProfileRepository interface.
 * 
 * This interface extends the CrudRepository interface provided by Spring Data.
 * It allows performing CRUD operations on the UserProfile entity.
 *
 */
public interface IUserProfileRepository extends CrudRepository<UserProfile, Integer> {
}
