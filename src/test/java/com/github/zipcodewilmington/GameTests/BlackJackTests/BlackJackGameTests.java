package com.github.zipcodewilmington.GameTests.BlackJackTests;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackGame;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlackJackGameTests {
    BlackJackGame bjg;

    @Before
    public void setup(){
        bjg = new BlackJackGame();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(bjg instanceof CardGame);
        Assert.assertTrue(bjg instanceof GameInterface);
    }
    @Test
    public void printRulesTest(){
        String expect = "Goal: Get as close to 21 as possible without going over.\n" +
                "Betting: Before the round begins, each player places a bet using their chips.\n" +
                "Cards: The dealer gives each player one card face up, then themselves, then another face up," +
                " and finally takes their second card face down.\n" +
                "Values: Jacks, Queens, and Kings are worth 10, while Aces can be counted as 1 or 11." +
                " The remaining cards are worth face value.\n" +
                "Hand values: The player wins if their hand is higher than the dealer's without going bust." +
                " Going bust, or over 21, is an automatic loss.\n" +
                "Natural blackjack: If the player's first two cards total 21, they have a natural or blackjack.\n" +
                "Push: If the dealer's first two cards total 21, " +
                "the hand is a push and the player neither wins nor loses.";

        String actual = bjg.printRules();
        Assert.assertEquals(expect, actual);
    }

}
