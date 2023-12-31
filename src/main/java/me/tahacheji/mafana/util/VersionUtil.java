package me.tahacheji.mafana.util;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.utility.MinecraftVersion;

public class VersionUtil {

    private VersionUtil() {
    }

    private static final MinecraftVersion tablistBreakingChange = MinecraftVersion.fromServerVersion("3632-Spigot-d90018e-d67777f (MC: 1.19.3)");

    public static boolean isNewTabList() {
        return ProtocolLibrary.getProtocolManager().getMinecraftVersion().isAtLeast(tablistBreakingChange);
    }


}
