package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = Hero.setUpNewHero();
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("Skylar",newHero.getName());
    }
    @Test
    public void newHero_getAge_Int() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals(25,newHero.getAge());
    }
    @Test
    public void newHero_getPower_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("Levitation",newHero.getPower());
    }
    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("Full Moon",newHero.getWeakness());
    }
    @Test
    public void newHero_getAllInstances_true() {
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        assertTrue(Hero.getAllInstances().contains(newHero));
        assertTrue(Hero.getAllInstances().contains(another));
    }
    @Test
    public void newHero_getId_Int() {
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        Hero another1 = Hero.setUpNewHero();
        assertEquals(3,another1.getId());
    }
    @Test
    public void newHero_findById_id() {
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        assertEquals(2,Hero.findById(another.getId()).getId());
    }
}