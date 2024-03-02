package com.example.quoteapp.Quote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query(value = "SELECT q FROM Quote q ORDER BY RANDOM() LIMIT 1")
    Quote getRandomQuote();
}
