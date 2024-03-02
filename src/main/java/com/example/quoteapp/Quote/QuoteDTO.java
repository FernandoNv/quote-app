package com.example.quoteapp.Quote;

public record QuoteDTO(
        String poster,
        String titulo,
        String frase,
        String personagem
) {
    public QuoteDTO(Quote quote){
        this(
                quote.getPoster(),
                quote.getTitle(),
                quote.getQuote(),
                quote.getCharacter()
        );
    }
}
