package com.example.swiftcodes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SwiftCodeRepository extends JpaRepository<SwiftCodeEntry, String> {
    List<SwiftCodeEntry> findByCountryIso2(String iso2);
}
