# WebAPI Developer

## Question:
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent between $50 and $100 in each transaction.
(e.g., a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three-month period, calculate the reward points earned for
each customer per month and total.

## Solution:
The com.example.retaileroffer have two packages 1. model, 2. controller.
1. Model package have 2 java classes RewardPoints and Transaction. RewardPoint tracks the total and monthly
transaction while Transaction tracks the date and amount for each transaction made by the customers.
2. Controller have a PostMapping method that takes in amount and date, calculates RewardPoints and returns it in JSON.

## Postmap test:
POST method
localhost:8080/reward-points 
Use: Body, Raw, JSON

Sample input: 
[
    {
        "amount": 100,
        "date": "2023-06-15"
    },
    {
        "amount": 200,
        "date": "2023-06-25"
    },
    {
        "amount": 80,
        "date": "2023-07-15"
    },
    {
        "amount": 200,
        "date": "2023-08-05"
    }
]


Sample output:
{
    "totalPoints": 580,
    "monthlyPoints": {
        "06": 300,
        "07": 30,
        "08": 250
    }
}
