package com.sucy.skill.dynamic.trigger;

import org.bukkit.event.player.PlayerFishEvent;

import com.sucy.skill.api.Settings;

public class FishingGrabTrigger extends FishingTrigger{

	/** {@inheritDoc} */
	@Override
	public String getKey() {
		return "FISHING_GRAB";
	}

	/** {@inheritDoc} */
	@Override
	public boolean shouldTrigger(PlayerFishEvent event, int level, Settings settings) {
		
		if(event.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
			return true;
		}
		return false;
	}
	
	

}
