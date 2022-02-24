package tech.codeblack.codeblacktech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.codeblack.codeblacktech.models.Lead;

import java.util.List;

public interface LeadRepository extends JpaRepository<Lead, String> {
    Lead findLeadById(long id);
    List findLeadsByBudget(long budget);
}
