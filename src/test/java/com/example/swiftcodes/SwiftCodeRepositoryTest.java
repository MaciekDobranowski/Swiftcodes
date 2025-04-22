package com.example.swiftcodes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class SwiftCodeRepositoryTest {

    @Autowired
    private SwiftCodeRepository repository;

    @Test
    public void testFindByCountryISO2() {
        List<SwiftCodeEntry> results = repository.findByCountryIso2("PL");
        assertThat(results).isNotEmpty();
    }
}
