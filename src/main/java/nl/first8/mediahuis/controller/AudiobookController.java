package nl.first8.mediahuis.controller;

import nl.first8.mediahuis.domain.Audiobook;
import nl.first8.mediahuis.repository.AudiobookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AudiobookController {

    private final AudiobookRepository audiobookRepository;

    public AudiobookController(AudiobookRepository audiobookRepository) {
        this.audiobookRepository = audiobookRepository;
    }

    @GetMapping("/books")
    public List<Audiobook> getAll() {
        return audiobookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Audiobook> getById(@PathVariable(value = "id") Long id) {
        Audiobook book = null; //TODO implement
        return ResponseEntity.ok(book);
    }

    @PostMapping("/books")
    public Audiobook add(@RequestBody Audiobook book) {
        return null;
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Audiobook> update(@PathVariable(value = "id") Long id, @RequestBody Audiobook book) {
        //TODO
        Audiobook updatedAudiobook = null;
        return ResponseEntity.ok(updatedAudiobook);
    }

    @DeleteMapping("/books/{isbn}")
    public Map<String, Boolean> delete(@PathVariable( value = "isbn") String isbn) {
        //TODO
        Map<String, Boolean> map = null;
        return map;
    }

}
