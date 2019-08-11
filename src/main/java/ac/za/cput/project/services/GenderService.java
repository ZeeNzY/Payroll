package ac.za.cput.project.services;

import ac.za.cput.project.domain.Gender;

import java.util.Set;

public interface GenderService extends MainService<Gender, String>{

    Set<Gender> getAll();
}
