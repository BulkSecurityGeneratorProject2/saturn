package com.saturn.repository;

import com.saturn.domain.User;

import java.time.ZonedDateTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findOneByActivationKey(String activationKey);

	List<User> findAllByActivatedIsFalseAndCreatedDateBefore(ZonedDateTime dateTime);

	Optional<User> findOneByResetKey(String resetKey);

	Optional<User> findOneByEmail(String email);

	Optional<User> findOneByLogin(String login);
}
