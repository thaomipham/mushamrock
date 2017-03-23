// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        populateWorld();
    }

    /**
     * 
     */
    public void populateWorld()
    {
        Mushroom m =  new  Mushroom();
        addObject(m, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Shamrock s =  new  Shamrock();
        addObject(s, 300, 300);
        
        Bomb bob0 =  new  Bomb();
        addObject(bob0, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Bomb bob1 =  new  Bomb();
        addObject(bob1, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        
        Ball balliball =  new  Ball();
        addObject(balliball, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Ball ball =  new  Ball();
        addObject(ball, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Ball ballroll =  new  Ball();
        addObject(ballroll, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Ball thelastball =  new  Ball();
        addObject(thelastball, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
    }
}
