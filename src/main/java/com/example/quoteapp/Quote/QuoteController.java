package com.example.quoteapp.Quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping(value = "/series/frases")
    public ResponseEntity<QuoteDTO> getQuote(){
        var quote = quoteService.getRandomQuote();
        return ResponseEntity.ok(quote);
    }
}
