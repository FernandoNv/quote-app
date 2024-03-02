package com.example.quoteapp.Quote;

import jakarta.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String poster;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String quote;
    @Column(nullable = false)
    private String character;

    public Quote() {}

    public Quote(String poster, String title, String quote, String character) {
        this.poster = poster;
        this.title = title;
        this.quote = quote;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
