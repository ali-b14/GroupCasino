package com.github.zipcodewilmington.GameTests.BlackJackTests;

import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackPlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.CardGamePlayer;
import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Hand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//+ handleAce(): int
//+ hit(): returns Card
//+ isBusted(): bool
//+ has21(): bool
public class BlackJackPlayerTest {
    BlackJackPlayer player;
    @Before
    public void setup(){
        player = new BlackJackPlayer();
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(player instanceof CardGamePlayer);
    }

}
