package net.blacklab.lib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings({"ALL", "unused"})
@Mod(
		modid = "net.blacklab.lib",
		name="EBLib",
		version=EBLib.VERSION,
		acceptedMinecraftVersions="[1.12.2]",
		updateJSON = "http://mc.el-blacklab.net/eblib-version.json")
public class EBLib {

	public static final String VERSION="6.1.6.9";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}

}
