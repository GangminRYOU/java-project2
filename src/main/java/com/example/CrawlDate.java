package com.example;

import java.time.LocalDateTime;

public class CrawlDate {
    public LocalDateTime localDateTime;
    public CrawlDate(LocalDateTime lastCrawlDateTime){
        this.localDateTime = lastCrawlDateTime;
    }
}
