package cc.co.cyberjacob.WolfSign;

import org.bukkit.event.player.PlayerListener;

/**
 * Created by IntelliJ IDEA.
 * User: Jacob Mansfield
 * Date: 19/05/11
 * Time: 01:13
 * Package: cc.co.cyberjacob.WolfSign
 * Copyright (c) 2007-2011 Jacob Mansfield. All rights reserved.
 */
public class WolfSignSignListener extends PlayerListener
{
    public static WolfSign plugin;

    public WolfSignSignListener(WolfSign instance)
    {
        plugin = instance;
    }
}
