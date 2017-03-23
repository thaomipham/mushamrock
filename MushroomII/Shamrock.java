// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Shamrock extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the Shamrock wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(1);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-1);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(5);
        }
        
        eat();
        
        explode();
    }

    /**
     * 
     */
    public void explode()
    {
        if (getOneIntersectingObject(Bomb.class) != null) {
        }
    }

    /**
     * 
     */
    public void eat()
    {
        if (isTouching(Ball.class)) {
            removeTouching(Ball.class);
            score = score + 1;
            getWorld().showText("score:" + score, 450, 50);
            respawnball();
        }
    }

    /**
     * 
     */
    public void respawnball()
    {
        Ball balliball =  new  Ball();
        getWorld().addObject(balliball, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
    }
}
