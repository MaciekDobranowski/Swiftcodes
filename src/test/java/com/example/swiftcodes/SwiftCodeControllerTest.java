package com.example.swiftcodes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SwiftCodeController.class)
public class SwiftCodeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SwiftCodeRepository repository;

    @Test
    public void shouldReturnOkWhenRequestingAll() throws Exception {
        when(repository.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/swift-codes/debug/all"))
                .andExpect(status().isOk());
    }
}
