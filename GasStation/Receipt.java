import java.nio.channels.GatheringByteChannel;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Screen implements IDisplayComponent
{

    private World world;
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Receipt(World world) {


        this.world = world;


    }

    public void act() 
    {



    }

    @Override
    public void display() {
    	

//        world.addObject((Actor) this, 550, 50);

        
        this.generateReceipt();


    }



    public void generateReceipt() {



        GreenfootSound reciptSound = new GreenfootSound("printer.wav");
        reciptSound.play();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reciptSound.stop();
        
        String message = "Welcome to OUR PETROL PUMP!\n1 WASHINGTON STREET\nSAN JOSE\nCA 95112";
        GreenfootImage txt = new GreenfootImage(900,60);
        txt.setColor(Color.RED);
        txt.fill();
        txt.drawString(message, 550, 60);
        setImage(txt);
        
        List<GasStation> gs = this.world.getObjects(GasStation.class);
        GasStation g = gs.get(0);
        g.ok = false;




    }    
}
