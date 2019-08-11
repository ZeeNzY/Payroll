package ac.za.cput.project.repository.imp;

import ac.za.cput.project.domain.Employee;
import ac.za.cput.project.domain.Gender;
import ac.za.cput.project.repository.GenderRepository;

import java.util.*;

public class GenderRepoImp implements GenderRepository {

    private static GenderRepoImp repository = null;
    private Map<String, Gender> gender;

    private GenderRepoImp(){
        this.gender = new HashMap<>();
    }

    public static GenderRepository getRepository(){
        if (repository == null) repository = new GenderRepoImp();
        return repository;
    }


    @Override
    public Set<Gender> getAll() {
        Collection<Gender> genders = this.gender.values();
        Set<Gender> set = new HashSet<>();
        set.addAll(genders);
        return set;
    }

    @Override
    public Gender create(Gender gender) {
        this.gender.put(gender.getGender(),gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        this.gender.replace(gender.getGender(),gender);
        return this.gender.get(gender.getGender());
    }

    @Override
    public void delete(String s) {
        this.gender.remove(s);
    }

    @Override
    public Gender read(String s) {
        return this.gender.get(s);
    }

}
