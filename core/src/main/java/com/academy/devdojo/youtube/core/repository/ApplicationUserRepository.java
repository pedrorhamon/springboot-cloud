package com.academy.devdojo.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.academy.devdojo.youtube.core.model.ApplicationUser;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

	ApplicationUser findByUsername(String username);

}