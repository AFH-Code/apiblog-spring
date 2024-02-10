package com.afhunt.apiblog.repository;

import com.afhunt.apiblog.domaine.Tags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends CrudRepository<Tags, Long> {
}
