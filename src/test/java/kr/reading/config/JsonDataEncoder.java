package kr.reading.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class JsonDataEncoder {
    private final ObjectMapper mapper;

    public JsonDataEncoder(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public String encode(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }
}
