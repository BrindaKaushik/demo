package com.example.repository;

import com.example.domain.Branch;
import com.example.domain.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by brindank on 3/28/2017.
 */
@Repository
public interface BranchRepository extends CrudRepository<Branch,Long> {
}
