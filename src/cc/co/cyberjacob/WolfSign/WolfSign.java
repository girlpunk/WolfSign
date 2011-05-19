package cc.co.cyberjacob.WolfSign;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

import static org.bukkit.event.Event.Priority.Normal;
import static org.bukkit.event.Event.Type.SIGN_CHANGE;

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
        //record that the plugin has been stopped
        log.info("WolfSign has been disabled.");
    }

    public void onEnable()
    {
        //To change body of implemented methods use File | Settings | File Templates.
        //record that the plugin has been started
        log.info("WolfSign has been enabled.");
        //register the pluginmanager
        PluginManager pm = this.getServer().getPluginManager();
        //register for sign_change
        //TODO: fix SignListner
        pm.registerEvent(SIGN_CHANGE, SignListener, Normal, this);
    }

    private final WolfSignSignListener SignLstener = new WolfSignSignListener(this);
}
