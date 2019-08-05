package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Gender;

import java.util.Map;
import java.util.Set;

public interface GenderRepository extends MainRepository<Gender, String> {

    Set<Gender> getAll();
}
