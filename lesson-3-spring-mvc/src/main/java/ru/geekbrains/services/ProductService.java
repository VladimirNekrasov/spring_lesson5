package ru.geekbrains.services;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import ru.geekbrains.persist.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    Page<Product> findWithFilter(Optional<String> nameFilter,
                                 Integer minPrice,
                                 Integer maxPrice,
                                 Optional<Integer> page,
                                 Optional<Integer> size);

    List<Product> findAll(Specification<Product> spec);

    Optional<Product> findById(Long id);

    void save(Product product);

    void deleteById(Long id);
}
