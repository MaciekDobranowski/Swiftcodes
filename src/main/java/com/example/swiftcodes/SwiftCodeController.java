package com.example.swiftcodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/swift-codes")
public class SwiftCodeController {

    @Autowired
    private SwiftCodeRepository repository;

    // GET /swift-codes/{swiftCode}
    @GetMapping("/{swiftCode}")
    public SwiftCodeEntry getByCode(@PathVariable String swiftCode) {
        return repository.findById(swiftCode)
                .orElseThrow(() -> new ResourceNotFoundException("Swift code '" + swiftCode + "' not found"));
    }

    // GET /swift-codes/country/{iso2}
    @GetMapping("/country/{iso2}")
    public List<SwiftCodeEntry> getByCountry(@PathVariable String iso2) {
        return repository.findByCountryIso2(iso2.toUpperCase());
    }

    // POST /swift-codes
    @PostMapping
    public SwiftCodeEntry addEntry(@RequestBody SwiftCodeEntry entry) {
        return repository.save(entry);
    }

    // DELETE /swift-codes/{swiftCode}
    @DeleteMapping("/{swiftCode}")
    public void deleteByCode(@PathVariable String swiftCode) {
        repository.deleteById(swiftCode);
    }

    // DEBUG endpoint - lista krajów
    @GetMapping("/debug/countries")
    public List<String> getCountries() {
        return repository.findAll().stream()
                .map(SwiftCodeEntry::getCountryIso2)
                .distinct()
                .toList();
    }

    // DEBUG endpoint - wszystkie rekordy
    @GetMapping("/debug/all")
    public List<SwiftCodeEntry> getAll() {
        return repository.findAll();
    }
}
