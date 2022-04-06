package com.legacygpu;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LegacyGpuPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LegacyGpuPlugin.class);
		RuneLite.main(args);
	}
}