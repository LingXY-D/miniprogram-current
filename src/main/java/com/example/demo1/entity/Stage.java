package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
public class Stage {
    private int id;
    private int contest_id;
    private int index;
    private int time_limit;
    private LocalTime last_time;
    private LocalDateTime start_time;
    private int score;
}