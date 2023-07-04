package com.example.retaileroffer.controller;

import com.example.retaileroffer.model.RewardPoints;
import com.example.retaileroffer.model.Transaction;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reward-points")
public class RewardPointsController {
    @PostMapping
    public RewardPoints calculateRewardPoints(@RequestBody List<Transaction> transactions) {
        RewardPoints rewardPoints = new RewardPoints();
        rewardPoints.calculateRewardPoints(transactions);
        return rewardPoints;
    }
}
