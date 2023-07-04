package com.example.retaileroffer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RewardPoints {
    private int totalPoints;
    private Map<String, Integer> monthlyPoints;

    public void calculateRewardPoints(List<Transaction> transactions) {
        totalPoints = 0;
        monthlyPoints = new HashMap<>();

        for (Transaction transaction : transactions) {
            int points = transaction.calculateRewardPoints();
            totalPoints += points;

            String month = transaction.getMonth();

            int monthlyPoints = this.monthlyPoints.getOrDefault(month, 0);
            this.monthlyPoints.put(month, monthlyPoints + points);
        }
    }
}
