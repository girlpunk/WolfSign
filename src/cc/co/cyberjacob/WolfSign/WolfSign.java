package cc.co.cyberjacob.WolfSign;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Jacob Mansfield
 * Date: 19/05/11
 * Time: 00:39
 * Package: cc.co.cyberjacob.WolfSign
 * Copyright (c) 2007-2011 Jacob Mansfield. All rights reserved.
 */
public class WolfSign extends JavaPlugin
{

    Logger log = Logger.getLogger("Minecraft");

    public void onDisable()
    {
        //To change body of implemented methods use File | Settings | File Templates.
        log.info("WolfSign has been disabled.");
    }

    public void onEnable()
    {
        //To change body of implemented methods use File | Settings | File Templates.
        log.info("WolfSign has been enabled.");
        PluginManager pm = this.getServer().getPluginManager();
    }
}
