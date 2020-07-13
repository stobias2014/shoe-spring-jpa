package com.tobias.saul.shoespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tobias.saul.shoespringjpa.model.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {

}
