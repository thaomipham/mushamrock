// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bomb extends Actor
{

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Mushroom.class)) {
            explosion pham =  new explosion();
            getWorld().addObject(pham, getX(), getY());
            removeTouching(Mushroom.class);
        }
        if (isTouching(Shamrock.class)) {
            explosion pham =  new explosion();
            getWorld().addObject(pham, getX(), getY());
            removeTouching(Shamrock.class);
        }
    }
}
