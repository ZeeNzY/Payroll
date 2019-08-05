package ac.za.cput.project.repository;

public interface MainRepository<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
