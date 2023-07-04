package com.example.retaileroffer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private double amount;
    private Date date;

    public int calculateRewardPoints() {
        int points = 0;

        if (amount > 100) {
            points += 2 * (amount - 100) + 50;
        }

        if (amount >= 50 && amount <= 100) {
            points += amount - 50;
        }

        return points;
    }

    public String getMonth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
        return dateFormat.format(date);
    }
}
