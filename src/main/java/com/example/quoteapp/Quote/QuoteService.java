package com.example.quoteapp.Quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public QuoteDTO getRandomQuote(){
        return new QuoteDTO(quoteRepository.getRandomQuote());
    }
}
