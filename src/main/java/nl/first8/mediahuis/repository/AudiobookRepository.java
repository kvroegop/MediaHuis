package nl.first8.mediahuis.repository;

import nl.first8.mediahuis.domain.Audiobook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AudiobookRepository extends JpaRepository<Audiobook, Long> {

    @Transactional
    void deleteByIsbn(String isbn);

}
